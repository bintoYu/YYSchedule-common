/**
 * 
 */
package com.YYSchedule.common.pojo;

import java.io.Serializable;

import com.YYSchedule.common.rpc.domain.task.TaskPhase;
import com.YYSchedule.common.rpc.domain.task.TaskStatus;

/**
 * 
 * @author ybt
 *
 * @date 2018年8月8日  
 * @version 1.0
 */
public class Result implements Serializable {

	private long taskId;
	
	private TaskPhase taskPhase;
	
	private TaskStatus taskStatus;
	
	private String result;
	
	private String fileName;
	
	private String logger;
	
	private String nodeId;
	
	private long finishedTime;
	
	public long getTaskId()
	{
		return taskId;
	}

	public void setTaskId(long taskId)
	{
		this.taskId = taskId;
	}

	public TaskPhase getTaskPhase()
	{
		return taskPhase;
	}

	public void setTaskPhase(TaskPhase taskPhase)
	{
		this.taskPhase = taskPhase;
	}

	public String getResult()
	{
		return result;
	}

	public void setResult(String result)
	{
		this.result = result;
	}

	public String getFileName()
	{
		return fileName;
	}

	public void setFileName(String fileName)
	{
		this.fileName = fileName;
	}

	public String getLogger()
	{
		return logger;
	}

	public void setLogger(String logger)
	{
		this.logger = logger;
	}

	public String getNodeId()
	{
		return nodeId;
	}

	public void setNodeId(String nodeId)
	{
		this.nodeId = nodeId;
	}
	
	public TaskStatus getTaskStatus()
	{
		return taskStatus;
	}
	
	public void setTaskStatus(TaskStatus taskStatus)
	{
		this.taskStatus = taskStatus;
	}

	public long getFinishedTime()
	{
		return finishedTime;
	}

	public void setFinishedTime(long finishedTime)
	{
		this.finishedTime = finishedTime;
	}
	
	
}
