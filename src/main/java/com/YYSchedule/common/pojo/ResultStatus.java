/**
 * 
 */
package com.YYSchedule.common.pojo;

import com.YYSchedule.common.rpc.domain.task.TaskStatus;
import com.alibaba.fastjson.JSONObject;

/**
 * @author ybt
 *
 * @date 2018年8月13日  
 * @version 1.0  
 */
public class ResultStatus implements Comparable<ResultStatus>
{
	private long taskId;
	
	private String nodeId;
	
	private boolean isSuccess;
	
	private long time;
	
	public ResultStatus(long time)
	{
		this.time = time;
	}
	
	public ResultStatus(Result result)
	{
		this.taskId = result.getTaskId();
		this.time = result.getFinishedTime();
		this.nodeId = result.getNodeId();
		
		TaskStatus taskStatus = result.getTaskStatus();
		if(taskStatus == TaskStatus.FINISHED)
			this.isSuccess = true;
		else 
			this.isSuccess = false;
	}

	public long getTaskId()
	{
		return taskId;
	}

	public void setTaskId(long taskId)
	{
		this.taskId = taskId;
	}

	public boolean isSuccess()
	{
		return isSuccess;
	}

	public void setSuccess(boolean isSuccess)
	{
		this.isSuccess = isSuccess;
	}

	public long getTime()
	{
		return time;
	}

	public void setTime(long time)
	{
		this.time = time;
	}


	public String getNodeId()
	{
		return nodeId;
	}

	public void setNodeId(String nodeId)
	{
		this.nodeId = nodeId;
	}

	@Override
	public int compareTo(ResultStatus resultStatus)
	{
		return Long.valueOf(time).compareTo(resultStatus.getTime());
		
	}

	@Override
	public String toString()
	{
		return JSONObject.toJSONString(this);
	}
	
	
}
