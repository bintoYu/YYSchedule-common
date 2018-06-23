/**
 * 
 */
package com.YYSchedule.common.pojo;

import java.util.Date;
import java.util.List;

import com.YYSchedule.common.rpc.domain.job.JobDistributionMode;
import com.YYSchedule.common.rpc.domain.job.JobOperationRequirement;
import com.YYSchedule.common.rpc.domain.job.JobPriority;
import com.YYSchedule.common.rpc.domain.job.JobResourceRequirement;
import com.YYSchedule.common.rpc.domain.parameter.JobParameter;

/**
 * 任务类
 * @author yanwei
 * @date 2012-12-25 下午3:12:26
 * 
 */
public class Job implements Comparable<Job> {

	private int submitterId;
	
	private long jobId;
	
	private List<String> fileList;
	
	private JobDistributionMode jobDistributionMode;
	
	private JobPriority jobPriority;
	
	private List<JobOperationRequirement> jobOperationRequirementList;
	
	private List<JobResourceRequirement> jobResourceRequirementList;
	
	private List<JobParameter> jobParameterList;
	
	private int jobStatus;
	
//	private long impatienceTime;
	
	private Date committedTime;
	
	private int missionId;
	
	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Job job) {
		if (jobPriority.getValue() == job.getJobPriority().getValue()) {
			return committedTime.toString().compareTo(job.getCommittedTime().toString());
		}
		return Integer.valueOf(jobPriority.getValue()).compareTo(job.getJobPriority().getValue());
	}

	public int getSubmitterId() {
		return submitterId;
	}

	public void setSubmitterId(int submitterId) {
		this.submitterId = submitterId;
	}

	public long getJobId() {
		return jobId;
	}

	public void setJobId(long jobId) {
		this.jobId = jobId;
	}
	
	public JobDistributionMode getJobDistributionMode() {
		return jobDistributionMode;
	}

	public void setJobDistributionMode(JobDistributionMode jobDistributionMode) {
		this.jobDistributionMode = jobDistributionMode;
	}

	public JobPriority getJobPriority() {
		return jobPriority;
	}

	public void setJobPriority(JobPriority jobPriority) {
		this.jobPriority = jobPriority;
	}

	public List<JobOperationRequirement> getJobOperationRequirementList() {
		return jobOperationRequirementList;
	}

	public void setJobOperationRequirementList(
			List<JobOperationRequirement> jobOperationRequirementList) {
		this.jobOperationRequirementList = jobOperationRequirementList;
	}

	public List<JobResourceRequirement> getJobResourceRequirementList() {
		return jobResourceRequirementList;
	}

	public void setJobResourceRequirementList(
			List<JobResourceRequirement> jobResourceRequirementList) {
		this.jobResourceRequirementList = jobResourceRequirementList;
	}

	public List<JobParameter> getJobParameterList() {
		return jobParameterList;
	}

	public void setJobParameterList(List<JobParameter> jobParameterList) {
		this.jobParameterList = jobParameterList;
	}

	public int getJobStatus() {
		return jobStatus;
	}

	public void setJobStatus(int jobStatus) {
		this.jobStatus = jobStatus;
	}

//	public long getImpatienceTime() {
//		return impatienceTime;
//	}
//
//	public void setImpatienceTime(long impatienceTime) {
//		this.impatienceTime = impatienceTime;
//	}

	public Date getCommittedTime()
	{
		return committedTime;
	}

	public void setCommittedTime(Date committedTime)
	{
		this.committedTime = committedTime;
	}


	public int getMissionId()
	{
		return missionId;
	}

	public void setMissionId(int missionId)
	{
		this.missionId = missionId;
	}

	@Override
	public String toString() {
		return "Job [submitterId=" + submitterId + ", jobId=" + jobId + ", jobDistributionMode=" + jobDistributionMode + ", jobPriority=" + jobPriority + ", jobOperationRequirementList="
				+ jobOperationRequirementList + ", jobResourceRequirementList=" + jobResourceRequirementList + ", jobParameterList=" + jobParameterList + ", jobStatus=" + jobStatus
				+ ", committedTime=" + committedTime.toString() + ", missionId=" + missionId + "]";
	}
	
	
	
	
}
