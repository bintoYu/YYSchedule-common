/**
 * 
 */
package com.YYSchedule.common.pojo;

import com.YYSchedule.common.rpc.domain.node.NodePayload;
import com.YYSchedule.common.rpc.domain.task.TaskPhase;

/**
 * NodeItem.java
 * 
 * @description node for scheduling
 */
public class NodeItem implements Comparable<NodeItem> {

	private String nodeId;
	
	private int cpuCount;

	private int cpuCores;

	private int cpuMhz;

	private double cpuUsedPerc;

	private long freeMem;

	private long jvmFreeMem;

	private int queueLimit;

	private int queueLength;

	private long expectedDelay;

	private int grade;

	private long updatedTime;
	
	private TaskPhase taskPhase;

	public NodeItem(int grade) {
		this.grade = grade;
	}

	public NodeItem(String nodeId) {
		this.nodeId = nodeId;
	}

	public NodeItem(NodePayload nodePayload) {

		this.nodeId = nodePayload.getNodeId();
		
		this.cpuCount = nodePayload.getNodeRuntime().getCpuCount();
		this.cpuCores = nodePayload.getNodeRuntime().getCpuCores();
		this.cpuMhz = nodePayload.getNodeRuntime().getCpuMhz();
		this.cpuUsedPerc = nodePayload.getNodeRuntime().getCpuUsedPerc();
		this.freeMem = nodePayload.getNodeRuntime().getFreeMem();
		this.jvmFreeMem = nodePayload.getNodeRuntime().getJvmFreeMem();

		this.queueLimit = nodePayload.getQueueLimit();
		this.queueLength = nodePayload.getQueueLength();
		this.expectedDelay = nodePayload.getExpectedDelay();
		this.taskPhase = nodePayload.getTaskPhase();
		
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

	public int getCpuCount()
	{
		return cpuCount;
	}

	public void setCpuCount(int cpuCount)
	{
		this.cpuCount = cpuCount;
	}

	public int getQueueLimit() {
		return queueLimit;
	}

	public void setQueueLimit(int queueLimit) {
		this.queueLimit = queueLimit;
	}

	public int getCpuCores() {
		return cpuCores;
	}

	public void setCpuCores(int cpuCores) {
		this.cpuCores = cpuCores;
	}

	public int getCpuMhz() {
		return cpuMhz;
	}

	public void setCpuMhz(int cpuMhz) {
		this.cpuMhz = cpuMhz;
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

	public long getJvmFreeMem() {
		return jvmFreeMem;
	}

	public void setJvmFreeMem(long jvmFreeMem) {
		this.jvmFreeMem = jvmFreeMem;
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

	@Override
	public String toString() {
		return "NodeItem [nodeId=" + nodeId + ", cpuMhz=" + cpuMhz + ", cpuUsedPerc=" + cpuUsedPerc + ", freeMem=" + freeMem + ", jvmFreeMem=" + jvmFreeMem + ", queueLimit="
				+ queueLimit + ", queueLength=" + queueLength + ", expectedDelay=" + expectedDelay  + ", grade=" + grade + ", updatedTime=" + updatedTime + "]";
	}

	
}
