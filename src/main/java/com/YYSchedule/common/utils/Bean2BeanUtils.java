package com.YYSchedule.common.utils;

import java.util.ArrayList;
import java.util.List;

import com.YYSchedule.common.mybatis.pojo.JobBasic;
import com.YYSchedule.common.mybatis.pojo.JobStatus;
import com.YYSchedule.common.mybatis.pojo.MissionBasic;
import com.YYSchedule.common.mybatis.pojo.TaskBasic;
import com.YYSchedule.common.mybatis.pojo.TaskFile;
import com.YYSchedule.common.pojo.NodeItem;
import com.YYSchedule.common.pojo.Task;
import com.YYSchedule.common.rpc.domain.job.Job;
import com.YYSchedule.common.rpc.domain.mission.Mission;
import com.YYSchedule.common.rpc.domain.node.NodePayload;
import com.YYSchedule.common.rpc.domain.node.NodeRuntime;

public class Bean2BeanUtils
{
	public static MissionBasic Mission2MissionBasic(Mission mission)
	{
		MissionBasic missionBasic = new MissionBasic();
	
		missionBasic.setMissionId(mission.getMissionId());
		missionBasic.setMissionName(mission.getMissionName());
		missionBasic.setUserId(mission.getUserId());
		missionBasic.setMissionStartTime(System.currentTimeMillis());
		
		return missionBasic;
	}
	
	public static JobBasic Job2JobBasic(Job job)
	{
		JobBasic jobBasic = new JobBasic();
		
		jobBasic.setJobId(job.getJobId());
		jobBasic.setJobPriority(job.getJobPriority().toString());
		jobBasic.setTaskPhase(job.getTaskPhase().toString());
		
		return jobBasic;
	}
	
	public static JobStatus Job2JobStatus(Job job)
	{
		JobStatus jobStatus = new JobStatus();
		
		jobStatus.setJobId(job.getJobId());
		jobStatus.setJobStatus(0.0);
		jobStatus.setCommittedTime(System.currentTimeMillis());
		
		return jobStatus;
	}
	
	public static List<TaskBasic> taskList2TaskBasicList(List<Task> taskList)
	{
		List<TaskBasic> taskBasicList = new ArrayList<>();
		for(Task task : taskList)
		{
			TaskBasic taskBasic = new TaskBasic();
			taskBasic.setTaskId(task.getTaskId());
			taskBasic.setTaskPhase(task.getTaskPhase().toString());
			taskBasic.setTaskStatus(task.getTaskStatus().toString());
			taskBasic.setLoadedTime(task.getLoadedTime());
			
			taskBasicList.add(taskBasic);
		}
		
		return taskBasicList;
	}
	
	public static List<TaskFile> taskList2TaskFileList(List<Task> taskList)
	{
		List<TaskFile> taskFileList = new ArrayList<>();
		for(Task task : taskList)
		{
			TaskFile taskFile = new TaskFile();
			taskFile.setTaskId(task.getTaskId());
			taskFile.setFileName(task.getFileName());
			
			taskFileList.add(taskFile);
		}
		
		return taskFileList;
	}
	
	public static NodePayload nodeItem2NodePayload(NodeItem nodeItem)
	{
		NodePayload nodePayload = new NodePayload();
		nodePayload.setNodeId(nodeItem.getNodeId());
		nodePayload.setQueueLimit(nodeItem.getQueueLimit());
		nodePayload.setQueueLength(nodeItem.getQueueLength());
		nodePayload.setExpectedDelay(nodeItem.getExpectedDelay());
		nodePayload.setTaskPhase(nodeItem.getTaskPhase());
		
		NodeRuntime nodeRuntime = new NodeRuntime();
		nodeRuntime.setCpuCount(nodeItem.getCpuCount());
		nodeRuntime.setCpuCores(nodeItem.getCpuCores());
		nodeRuntime.setCpuMhz(nodeItem.getCpuMhz());
		nodeRuntime.setCpuUsedPerc(nodeItem.getCpuUsedPerc());
		nodeRuntime.setFreeMem(nodeItem.getFreeMem());
		nodeRuntime.setJvmFreeMem(nodeItem.getJvmFreeMem());
		
		nodePayload.setNodeRuntime(nodeRuntime);
		return nodePayload;
		
	}
}
