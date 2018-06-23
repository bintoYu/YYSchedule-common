/**
 * 
 */
package com.YYSchedule.common.pojo;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Arrays;

import com.YYSchedule.common.rpc.domain.task.TaskPhase;

/**
 * Result
 * @author yanwei
 * @date 2013-1-17 下午3:27:05
 * 
 */
public class Result implements Serializable {
	
	/**
	 * 
	 */

	private long taskId;
	
	private TaskPhase resultType;
	
	private ByteBuffer content;
	
	private byte[] contentByte;
	
	/**
	 * the md5 of byte array result
	 */
	private String md5;


	/**
	 * @return the taskId
	 */
	public long getTaskId() {
		return taskId;
	}

	/**
	 * @param taskId the taskId to set
	 */
	public void setTaskId(long taskId) {
		this.taskId = taskId;
	}


	/**
	 * @return the resultType
	 */
	public TaskPhase getResultType() {
		return resultType;
	}

	/**
	 * @param resultType the resultType to set
	 */
	public void setResultType(TaskPhase resultType) {
		this.resultType = resultType;
	}

	/**
	 * @return the content
	 */
	public ByteBuffer getContent() {
		return content;
	}

	/**
	 * @param content the content to set
	 */
	public void setContent(ByteBuffer content) {
		this.content = content;
	}

	/**
	 * @return the md5
	 */
	public String getMd5() {
		return md5;
	}

	/**
	 * @param md5 the md5 to set
	 */
	public void setMd5(String md5) {
		this.md5 = md5;
	}

	public byte[] getContentByte() {
		return contentByte;
	}

	public void setContentByte(byte[] contentByte) {
		this.contentByte = contentByte;
	}

	@Override
	public String toString() {
		return "Result [taskId=" + taskId +  ", resultType=" + resultType + ", content=" + content + ", contentByte="
				+ Arrays.toString(contentByte) + ", md5=" + md5 +  "]";
	}
	
	
}
