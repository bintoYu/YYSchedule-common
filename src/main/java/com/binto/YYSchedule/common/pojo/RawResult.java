/**
 * 
 */
package com.binto.YYSchedule.common.pojo;

import java.io.Serializable;

import com.binto.YYSchedule.common.rpc.domain.task.TaskPhase;

/**
 * RawResult.java
 * @author yanwei
 * @date 2013-3-28 下午4:59:46
 * @description
 */
public class RawResult implements Serializable {

	private long taskId;
	
	private String functionName;
	
	private int resultType;
	
	private byte[] content;


	public long getTaskId() {
		return taskId;
	}

	public void setTaskId(long taskId) {
		this.taskId = taskId;
	}
    
	public String getFunctionName() {
		return functionName;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}
	
	
	public TaskPhase getTransferedResultType() {
		return TaskPhase.findByValue(resultType);
	}
	
	public void setTransferedResultType(TaskPhase resultType) {
		this.resultType = resultType.getValue();
	}


	public int getResultType() {
		return resultType;
	}

	public void setResultType(int resultType) {
		this.resultType = resultType;
	}

	public byte[] getContentByte() {
		return content;
	}
	
	public String getContent() {
		return content.toString();
	}


	public void setContent(String content) {
		if(content != null) {
			this.content = content.getBytes();
		}
	}
	
	public void setContent(byte[] content) {
		this.content = content;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RawResult [taskId=" + taskId
				+ ", resultType="
				+ resultType + ", content=" + content.toString() + "]";
	}
	
}
