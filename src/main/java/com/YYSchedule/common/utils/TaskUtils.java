/**
 * 
 */
package com.YYSchedule.common.utils;

import java.util.ArrayList;
import java.util.List;

import com.YYSchedule.common.rpc.domain.task.TaskPhase;
import com.YYSchedule.common.rpc.domain.task.TaskStatus;

/**
 * TaskUtils
 * <p> </p>
 * @author yubingtao
 * @since 2018-6-12 
 * @version
 */
public class TaskUtils {

	/**
	 * get task type from task id
	 * @param taskId
	 * @return
	 */
	public static int getTaskType(long taskId) {
		return (int)(taskId / 100000000);
	}
	
	/**
	 * check if a member of task phase
	 * 
	 * @param taskStatus
	 * @return
	 */
	public static boolean isTaskPhaseMember(TaskPhase taskPhase) {
		TaskPhase[] taskPhases = TaskPhase.values();
		for (TaskPhase phase : taskPhases) {
			if (phase.equals(taskPhase)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * check if a member of task status
	 * 
	 * @param taskStatus
	 * @return
	 */
	public static boolean isTaskStatusMember(TaskStatus taskStatus) {
		TaskStatus[] taskStatuses = TaskStatus.values();
		for (TaskStatus status : taskStatuses) {
			if (status.equals(taskStatus)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * get task phase code from task phase list
	 * 
	 * @param taskPhaseList
	 * @return
	 */
	public static int getTaskPhaseCode(List<TaskPhase> taskPhaseList) {
		int taskPhaseCode = 0;
		int initiateCode = 1;
		for (TaskPhase taskPhase : taskPhaseList) {
			if (taskPhase.getValue() > 0) {
				taskPhaseCode += initiateCode << (taskPhase.getValue() - 1);
			}
		}
		return taskPhaseCode;
	}
	
	/**
	 * get task phase code from task phase
	 * 
	 * @param taskPhase
	 * @return
	 */
	public static int getTaskPhaseCode(TaskPhase taskPhase) {
		if (taskPhase.getValue() == 0) {
			return 0;
		}
		int initiateCode = 1;
		return initiateCode << (taskPhase.getValue() - 1);
	}

	/**
	 * get first task phase from task phase code
	 * 
	 * @param taskPhaseCode
	 * @return
	 */
	public static TaskPhase getFirstTaskPhase(int taskPhaseCode) {
		for (TaskPhase taskPhase : TaskPhase.values()) {
			if ((taskPhaseCode & taskPhase.getValue()) == taskPhase.getValue()) {
				return taskPhase;
			}
		}
		return null;
	}

	/**
	 * get next task phase
	 * 
	 * @param taskId
	 * @param currentTaskPhase
	 * @return
	 */
	public static TaskPhase getNextTaskPhase(long taskId, TaskPhase currentTaskPhase) {
		List<TaskPhase> taskPhaseList = getTaskPhaseList(taskId);
		if (taskPhaseList.indexOf(currentTaskPhase) >= taskPhaseList.size() - 1) {
			return null;
		} else {
			return taskPhaseList.get(taskPhaseList.indexOf(currentTaskPhase) + 1);
		}
	}
	
	/**
	 * get task phase list from task id
	 * 
	 * @param taskId
	 * @return
	 */
	public static List<TaskPhase> getTaskPhaseList(long taskId) {
		List<TaskPhase> taskPhaseList = new ArrayList<TaskPhase>();
		int taskPhaseCode = Integer.parseInt(String.format("%016d", taskId).substring(2, 8));
		for (TaskPhase taskPhase : TaskPhase.values()) {
			if (taskPhase.getValue() > 0) {
				int taskPhaseValue = 1 << (taskPhase.getValue() - 1);
				if ((taskPhaseCode & taskPhaseValue) == taskPhaseValue) {
					taskPhaseList.add(taskPhase);
				}
			} else {
				int taskPhaseValue = 0;
				if ((taskPhaseCode & taskPhaseValue) == taskPhaseValue) {
					taskPhaseList.add(taskPhase);
				}
			}
		}
		return taskPhaseList;
	}
	
	/**
	 * get task status code by task phase and task status
	 * 
	 * @param taskPhase
	 * @param taskStatus
	 * @return
	 */
	public static int getTaskStatusCode(TaskPhase taskPhase, TaskStatus taskStatus) {
		return (taskPhase.getValue() * 100) + taskStatus.getValue();
	}

	/**
	 * get task phase by task status code
	 * 
	 * @param taskStatusCode
	 * @return
	 */
	public static TaskPhase getTaskPhase(int taskStatusCode) {
		return TaskPhase.findByValue(taskStatusCode / 100);
	}

	/**
	 * get task status by task status code
	 * 
	 * @param taskStatusCode
	 * @return
	 */
	public static TaskStatus getTaskStatus(int taskStatusCode) {
		return TaskStatus.findByValue(taskStatusCode % 100);
	}
	
	
	/**
	 * check if the taskPhase is the last phase
	 * @param currentTaskPhase
	 * @param taskId
	 * @return
	 */
	public static boolean isLastTaskPhase(TaskPhase currentTaskPhase, long taskId) {
		List<TaskPhase> taskPhaseList = TaskUtils.getTaskPhaseList(taskId);
		if (taskPhaseList != null && !taskPhaseList.isEmpty()) {
			if (currentTaskPhase != null && currentTaskPhase.equals(taskPhaseList.get(taskPhaseList.size() - 1))) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
