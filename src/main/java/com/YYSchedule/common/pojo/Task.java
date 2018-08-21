package com.YYSchedule.common.pojo;

import java.io.Serializable;

import com.YYSchedule.common.rpc.domain.job.JobPriority;
import com.YYSchedule.common.rpc.domain.parameter.JobParameter;
import com.YYSchedule.common.rpc.domain.task.TaskPhase;
import com.YYSchedule.common.rpc.domain.task.TaskStatus;
import com.alibaba.fastjson.JSONObject;

/**
 * Task.java
 * @author ybt
 * @date 2018-6-25 
 * @description
 */
public class Task implements Comparable<Task>,Serializable{

	private Long taskId;
	
	private JobPriority taskPriority;
	
	private TaskPhase taskPhase;
	
	private String fileName;
	
	private JobParameter jobParameter;
	
	private TaskStatus taskStatus;
	
	private long loadedTime;
	
	private int schedulingTime;
	
	private long timeout;
	
	private String executorId;
	
	public Task() {
	}
	

	@Override
	public int compareTo(Task task) {
		if (task != null && task.getTaskId() != 0L && task.getTaskId().equals(taskId)) {
			return 0;
		}
		if (taskPriority.getValue() == task.getTaskPriority().getValue()) {
			return -(Long.valueOf(loadedTime).compareTo(task.getLoadedTime()));
		}
		return -(Integer.valueOf(taskPriority.getValue()).compareTo(task.getTaskPriority().getValue()));
	}

	
	public String getFileName()
	{
		return fileName;
	}

	public void setFileName(String fileName)
	{
		this.fileName = fileName;
	}

	public void setJobParameter(JobParameter jobParameter)
	{
		this.jobParameter = jobParameter;
	}

	public Long getTaskId()
	{
		return taskId;
	}

	public void setTaskId(Long taskId)
	{
		this.taskId = taskId;
	}

	public JobPriority getTaskPriority()
	{
		return taskPriority;
	}

	public void setTaskPriority(JobPriority taskPriority)
	{
		this.taskPriority = taskPriority;
	}

	public TaskPhase getTaskPhase()
	{
		return taskPhase;
	}

	public void setTaskPhase(TaskPhase taskPhase)
	{
		this.taskPhase = taskPhase;
	}

	public JobParameter getJobParameter()
	{
		return jobParameter;
	}

	public void setTaskParameter(JobParameter jobParameter)
	{
		this.jobParameter = jobParameter;
	}

	public TaskStatus getTaskStatus()
	{
		return taskStatus;
	}

	public void setTaskStatus(TaskStatus taskStatus)
	{
		this.taskStatus = taskStatus;
	}

	public long getLoadedTime()
	{
		return loadedTime;
	}

	public void setLoadedTime(long loadedTime)
	{
		this.loadedTime = loadedTime;
	}

	public int getSchedulingTime()
	{
		return schedulingTime;
	}

	public void setSchedulingTime(int schedulingTime)
	{
		this.schedulingTime = schedulingTime;
	}

	public long getTimeout()
	{
		return timeout;
	}

	public void setTimeout(long timeout)
	{
		this.timeout = timeout;
	}

	public String getExecutorId()
	{
		return executorId;
	}


	public void setExecutorId(String executorId)
	{
		this.executorId = executorId;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (taskId % 2 ^ (taskId % 2 >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		if (!taskId.equals(other.taskId))
			return false;
		return true;
	}

	@Override
	public String toString()
	{
		return JSONObject.toJSONString(this);
	}





	
}
