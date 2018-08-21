package com.YYSchedule.common.utils;

import java.util.ArrayList;
import java.util.List;

import com.YYSchedule.common.mybatis.pojo.JobBasic;
import com.YYSchedule.common.mybatis.pojo.MissionBasic;
import com.YYSchedule.common.mybatis.pojo.TaskBasic;
import com.YYSchedule.common.mybatis.pojo.TaskFile;
import com.YYSchedule.common.mybatis.pojo.TaskResult;
import com.YYSchedule.common.mybatis.pojo.TaskTemp;
import com.YYSchedule.common.mybatis.pojo.TaskTimestamp;
import com.YYSchedule.common.pojo.NodeItem;
import com.YYSchedule.common.pojo.Result;
import com.YYSchedule.common.pojo.Task;
import com.YYSchedule.common.rpc.domain.engine.EngineLogger;
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
	
	public static JobBasic Job2JobBasic(Job job,int taskNum)
	{
		JobBasic jobBasic = new JobBasic();
		
		jobBasic.setJobId(job.getJobId());
		jobBasic.setJobPriority(job.getJobPriority().toString());
		jobBasic.setTaskPhase(job.getTaskPhase().toString());
		jobBasic.setTaskNum(taskNum);
		jobBasic.setCommittedTime(System.currentTimeMillis());
		
		return jobBasic;
	}
	
	
	public static TaskBasic task2TaskBasic(Task task)
	{
		TaskBasic taskBasic = new TaskBasic();
		taskBasic.setTaskId(task.getTaskId());
		taskBasic.setTaskPhase(task.getTaskPhase().toString());
		taskBasic.setTaskStatus(task.getTaskStatus().toString());
		taskBasic.setLoadedTime(task.getLoadedTime());
		
		
		return taskBasic;
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
			taskFile.setFilePath(task.getFileName());
			
			taskFileList.add(taskFile);
		}
		
		return taskFileList;
	}
	
	public static List<TaskTimestamp> taskList2TaskTimestampList(List<Task> taskList)
	{
		List<TaskTimestamp> taskTimestampList= new ArrayList<>();
		for(Task task : taskList)
		{
			TaskTimestamp taskTimestamp = new TaskTimestamp();
			taskTimestamp.setTaskId(task.getTaskId());
			taskTimestamp.setLoadedTime(task.getLoadedTime());
			
			taskTimestampList.add(taskTimestamp);
		}
		
		return taskTimestampList;
	}
	
	public static List<TaskTemp> taskList2TaskTempList(List<Task> taskList)
	{
		List<TaskTemp> taskTempList= new ArrayList<>();
		for(Task task : taskList)
		{
			TaskTemp taskTemp = new TaskTemp();
			taskTemp.setTaskId(task.getTaskId());
			taskTemp.setTask(task.toString());
			taskTempList.add(taskTemp);
		}
		
		return taskTempList;
	}
	
	public static NodePayload nodeItem2NodePayload(NodeItem nodeItem)
	{
		NodePayload nodePayload = new NodePayload();
		nodePayload.setNodeId(nodeItem.getNodeId());
		nodePayload.setQueueLimit(nodeItem.getQueueLimit());
		nodePayload.setQueueLength(nodeItem.getQueueLength());
		nodePayload.setTaskPhase(nodeItem.getTaskPhase());
		nodePayload.setEngineLoggerList(nodeItem.getEngineLoggerList());
		
		NodeRuntime nodeRuntime = new NodeRuntime();
		nodeRuntime.setCpuUsedPerc(nodeItem.getCpuUsedPerc());
		nodeRuntime.setFreeMem(nodeItem.getFreeMem());
		nodeRuntime.setJvmFreeMem(nodeItem.getJvmFreeMem());
		
		nodePayload.setNodeRuntime(nodeRuntime);
		return nodePayload;
		
	}
	
	/**
	 * @param engineLoggers
	 * @return
	 */
	public static List<TaskResult> engineLoggerList2TaskResultList(List<EngineLogger> engineLoggers)
	{
		List<TaskResult> taskResultList = new ArrayList<>();
		for(EngineLogger engineLogger : engineLoggers)
		{
			TaskResult taskResult = new TaskResult();
			taskResult.setTaskId(engineLogger.getTaskId());
			taskResult.setLogger(engineLogger.getContent());
			
			taskResultList.add(taskResult);
		}
		
		return taskResultList;
	}
	
	public static TaskResult result2TaskResult(Result result)
	{
		TaskResult taskResult = new TaskResult();
		taskResult.setTaskId(result.getTaskId());
		taskResult.setResult(result.getResult());
		taskResult.setFileName(result.getFileName());
		taskResult.setLogger(result.getLogger());
		
		return taskResult;
	}
	

}
