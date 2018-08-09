/**
 * 
 */
package com.YYSchedule.common.pojo;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Arrays;

import com.YYSchedule.common.rpc.domain.task.TaskPhase;

/**
 * 
 * @author ybt
 *
 * @date 2018年8月8日  
 * @version 1.0
 */
public class Result implements Serializable {
	

	private long taskId;
	
	private TaskPhase resultType;
	
	private String result;
	
	private String fileName;

	public long getTaskId()
	{
		return taskId;
	}

	public void setTaskId(long taskId)
	{
		this.taskId = taskId;
	}

	public TaskPhase getResultType()
	{
		return resultType;
	}

	public void setResultType(TaskPhase resultType)
	{
		this.resultType = resultType;
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
}
