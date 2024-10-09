<template>
  <div class="job-list-container">
    <h1 class="header">Job List</h1>
    <div class="job-list">
      <div
        v-for="(job, index) in jobs"
        :key="job.jobId"
        class="job-card"
        @click="toggleDetails(index)"
      >
        <div class="job-name">
          <strong>{{ job.jobName }}</strong>
        </div>
        <div v-if="job.showDetails" class="job-details">
          <p><strong>Job ID:</strong> {{ job.jobId }}</p>
          <p><strong>Status:</strong> {{ job.jobStatus }}</p>
          <p><strong>Created At:</strong> {{ formatDate(job.seconds) }}</p>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  name: 'JobList',
  data() {
    return {
      jobs: []
    };
  },
  mounted() {
    this.fetchJobs();
  },
  methods: {
    async fetchJobs() {
      try {
        const response = await axios.get('http://localhost:8081/list-all-jobs');
        this.jobs = this.parseProtobufText(response.data);
        console.log(this.jobs);
      } catch (error) {
        console.error('Error fetching jobs:', error);
      }
    },
    parseProtobufText(text) {
      const jobsData = text.split('jobs {').slice(1);
      return jobsData.map(jobText => {
        const job = {};
        jobText.split('\n').forEach(line => {
          const [key, ...valueParts] = line.trim().split(':').map(s => s.trim());
          const value = valueParts.join(':').trim();
          if (key && value) {
            if (key === 'createdAt') {
              const seconds = value.match(/seconds: (\d+)/);
              job.createdAt = seconds ? { seconds: parseInt(seconds[1]) } : null;
            } else {
              job[key] = value.replace(/"/g, '');
            }
          }
        });
        return job;
      });
    },
    formatDate(seconds) {
      if (seconds) {
        return new Date(seconds * 1000).toLocaleString();
      }
      return 'N/A';
    },
    toggleDetails(index) {
      this.jobs[index].showDetails = !this.jobs[index].showDetails;
    },
  }
}
</script>

<style scoped>
.job-list-container {
  max-width: 800px;
  margin: 20px auto;
  padding: 20px;
  border: 1px solid #ddd;
  border-radius: 8px;
  box-shadow: 0 2px 8px rgba(0, 0, 0, 0.1);
}

.header {
  text-align: center;
  margin-bottom: 20px;
  font-size: 2rem;
  color: #333;
}

.job-list {
  display: flex;
  flex-direction: column;
  gap: 10px;
}

.job-card {
  background-color: #f9f9f9;
  border: 1px solid #ccc;
  border-radius: 6px;
  padding: 15px;
  transition: background-color 0.3s, transform 0.3s;
  cursor: pointer;
  position: relative;
}

.job-card:hover {
  background-color: #e7f3ff;
  transform: translateY(-2px);
}

.job-name {
  font-size: 1.2rem;
  font-weight: bold;
}

.job-details {
  margin-top: 10px;
  font-size: 0.9rem;
  color: #666;
}
</style>