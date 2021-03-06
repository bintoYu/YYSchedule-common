package com.YYSchedule.common.pojo;

import java.util.List;

import com.YYSchedule.common.rpc.domain.engine.EngineLogger;
import com.YYSchedule.common.rpc.domain.node.NodePayload;
import com.YYSchedule.common.rpc.domain.task.TaskPhase;
import com.alibaba.fastjson.JSONObject;

/**
 * NodeItem.java
 * 
 * @description 记录心跳信息
 */
public class NodeItem implements Comparable<NodeItem> {

	private String nodeId;
	
	private boolean isBroken;

	private double cpuUsedPerc;

	private long freeMem;
	
	private long jvmFreeMem;

	private int queueLimit;

	private int queueLength;

	private long expectedDelay;

	private int grade;

	private long updatedTime;
	
	private int consumerThreadNum;
	
	private TaskPhase taskPhase;
	
	private List<EngineLogger> engineLoggerList;

	public NodeItem(int grade) {
		this.grade = grade;
	}

	public NodeItem(String nodeId) {
		this.nodeId = nodeId;
	}

	public NodeItem(NodePayload nodePayload) {

		this.nodeId = nodePayload.getNodeId();
		
		this.isBroken = false;
		this.cpuUsedPerc = nodePayload.getNodeRuntime().getCpuUsedPerc();
		this.freeMem = nodePayload.getNodeRuntime().getFreeMem();
		this.jvmFreeMem = nodePayload.getNodeRuntime().getJvmFreeMem();

		this.queueLimit = nodePayload.getQueueLimit();
		this.queueLength = nodePayload.getQueueLength();
		this.taskPhase = nodePayload.getTaskPhase();
		this.engineLoggerList = nodePayload.getEngineLoggerList();
		
		this.updatedTime = System.currentTimeMillis();
		

		getGrade(this.cpuUsedPerc,this.queueLength);
	}
	
	/**
	 * node performance evaluate equation
	 * 
	 * @param cpuUsedPerc
	 * @param queueNum
	 */
	private void getGrade(double cpuUsedPercint,int queueLength) {

		if(cpuUsedPerc/100 > 0.8)
		{
			this.grade = Integer.MAX_VALUE;
		}
		else
		{
			this.grade = queueLength;
		}
	}

	/**
	 * update node performance grade
	 */
	public void updateGrade() {
		getGrade( this.cpuUsedPerc, this.queueLength);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(NodeItem nodeItem) {
		if (nodeItem != null && nodeItem.getNodeId() != null && nodeItem.getNodeId().equals(nodeId)) {
			return 0;
		} else if(grade == nodeItem.getGrade()) {
			return 1;
		}
		return Integer.valueOf(grade).compareTo(nodeItem.getGrade());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nodeId == null) ? 0 : nodeId.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NodeItem other = (NodeItem) obj;
		if (nodeId == null) {
			if (other.nodeId != null)
				return false;
		} else if (!nodeId.equals(other.nodeId))
			return false;
		return true;
	}

	public String getNodeId() {
		return nodeId;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}


	public int getQueueLimit() {
		return queueLimit;
	}

	public void setQueueLimit(int queueLimit) {
		this.queueLimit = queueLimit;
	}

	public long getJvmFreeMem()
	{
		return jvmFreeMem;
	}

	public void setJvmFreeMem(long jvmFreeMem)
	{
		this.jvmFreeMem = jvmFreeMem;
	}

	public int getConsumerThreadNum()
	{
		return consumerThreadNum;
	}

	public void setConsumerThreadNum(int consumerThreadNum)
	{
		this.consumerThreadNum = consumerThreadNum;
	}

	public double getCpuUsedPerc() {
		return cpuUsedPerc;
	}

	public void setCpuUsedPerc(double cpuUsedPerc) {
		this.cpuUsedPerc = cpuUsedPerc;
	}

	public long getFreeMem() {
		return freeMem;
	}

	public void setFreeMem(long freeMem) {
		this.freeMem = freeMem;
	}

	public int getQueueLength() {
		return queueLength;
	}

	public void setQueueLength(int queueNum) {
		this.queueLength = queueNum;
	}

	public long getExpectedDelay() {
		return expectedDelay;
	}

	public void setExpectedDelay(long expectedDelay) {
		this.expectedDelay = expectedDelay;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public long getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(long updatedTime) {
		this.updatedTime = updatedTime;
	}

	public TaskPhase getTaskPhase()
	{
		return taskPhase;
	}

	public void setTaskPhase(TaskPhase taskPhase)
	{
		this.taskPhase = taskPhase;
	}

	public void setEngineLoggerList(List<EngineLogger> engineLoggerList)
	{
		this.engineLoggerList = engineLoggerList;
	}

	public List<EngineLogger> getEngineLoggerList()
	{
		return engineLoggerList;
	}

	public boolean isBroken()
	{
		return isBroken;
	}

	public void setBroken(boolean isBroken)
	{
		this.isBroken = isBroken;
	}

	@Override
	public String toString() {
		return JSONObject.toJSONString(this);
	}
	
}
