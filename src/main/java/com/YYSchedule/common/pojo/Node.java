/**
 * 
 */
package com.YYSchedule.common.pojo;


/**
 * 
 * @author yanwei
 * @date 2013-1-7 下午2:58:22
 * 
 */
public class Node {

	private String nodeId;
	
	private float cpuUsedPerc;
	// memSize - memUsed
	private int memAvail;
	// fsSize - fsUsed
	private int fsAvail;

	private String osName;

	private String jvmVersion;
	
	private int residualQuota;
	
	private long configUpdated;
	
	private long payloadUpdated;
	
	private boolean isValid;
	
	public String getNodeId() {
		return nodeId;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

	public float getCpuUsedPerc() {
		return cpuUsedPerc;
	}

	public void setCpuUsedPerc(float cpuUsedPerc) {
		this.cpuUsedPerc = cpuUsedPerc;
	}

	public int getMemAvail() {
		return memAvail;
	}

	public void setMemAvail(int memAvail) {
		this.memAvail = memAvail;
	}

	public int getFsAvail() {
		return fsAvail;
	}

	public void setFsAvail(int fsAvail) {
		this.fsAvail = fsAvail;
	}

	public String getOsName() {
		return osName;
	}

	public void setOsName(String osName) {
		this.osName = osName;
	}

	public String getJvmVersion() {
		return jvmVersion;
	}

	public void setJvmVersion(String jvmVersion) {
		this.jvmVersion = jvmVersion;
	}

	public int getResidualQuota() {
		return residualQuota;
	}

	public void setResidualQuota(int residualQuota) {
		this.residualQuota = residualQuota;
	}

	public long getConfigUpdated() {
		return configUpdated;
	}

	public void setConfigUpdated(long configUpdated) {
		this.configUpdated = configUpdated;
	}

	public long getPayloadUpdated() {
		return payloadUpdated;
	}

	public void setPayloadUpdated(long payloadUpdated) {
		this.payloadUpdated = payloadUpdated;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}
}
