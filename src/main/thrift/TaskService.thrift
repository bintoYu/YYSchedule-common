#
# 提供给taskmanager使用的接口
#

include "Mission.thrift"
include "Container.thrift"
include "Exception.thrift"
include "Task.thrift"
include "Job.thrift"
include "Node.thrift"
include "Parameter.thrift"

namespace java com.YYSchedule.common.rpc.service.task
namespace php com.YYSchedule.common.rpc.service.task
namespace py rpc.service.task

# API version (NOT the product version)
# VERSION = "0.1.0"
# AUTHOR = yubingtao

#
# service api
#

/** taskmanager作为服务端,User远程rpc调用 */
service UserCallTaskService {

	/** check network connectivity manually */
	string ping(
	)	throws	(
			1:Exception.UnavailableException ue,
			2:Exception.TimeoutException te
	),


	/**
	 * mission submit
	 * @param	userId
	 * @param	taskPhaseList
	 * @param	jobDistributionMode
	 * @param	jobPriority
	 * @param	jobOperationRequirementList
	 * @param	jobResourceRequirementList
	 * @param	parameterList
	 * @param	impatienceTime
	 * @return	missionId
	 */
	i64 submitMission	(
		1:	required Mission.Mission						mission
	)	throws	(
		1:	Exception.InvalidRequestException 				ire,
		2:	Exception.UnavailableException 					ue,
		3:	Exception.TimeoutException 						te
	),
	
	/** 
	 * job termination
	 * @param	jobIdList
	 * @return	succeed or not
	 */
	i32 terminateMission	(
			1:required i32							missionId
	)	throws	(
		1:	Exception.InvalidRequestException				ire,
		2:	Exception.UnavailableException 					ue,
		3:	Exception.NotFoundException 					nfe,
		4:	Exception.TimeoutException 						te
	),
	
	/** 
	 * obtaining queue information
	 * @return queue information in json
	 */
	string obtainQueueInfo(
	)	throws	(
		1:Exception.UnavailableException					ue,
		2:Exception.TimeoutException						te
	),
	
	/** 
	 * obtaining nodePayload from taskmanager
	 * @return node information
	 */
	list<Node.NodePayload> obtainAllNode(
	)	throws	(
		1:Exception.UnavailableException					ue,
		2:Exception.TimeoutException						te
	),
	
}

/** User Service response for RPCs from user */
service UserService {

	/**
	 * check network connectivity manually
	 */
	string ping(
	)	throws	(
		1:	Exception.UnavailableException					ue,
		2:	Exception.TimeoutException						te
	),
					
	/**
	 * check program 's duplication
	 * @param	scriptMd5
	 * @param	executableMd5
	 * @return	programId
	 */
	i64 checkProgramDuplication(
		1:	required	string 								scriptMd5,
		2:	required	string 								executableMd5
	)	throws	(
		1:	Exception.InvalidRequestException 				ire,
		2:	Exception.UnavailableException 					ue,
		3:	Exception.TimeoutException 						te
	),

	/** 
	 * refreshing node list
	 * @param	nodeIdList
	 * @return	node list in json
	 */
	string refreshNodeList	(
		1:	optional	list<string> 						nodeIdList
	)	throws	(
		1:	Exception.UnavailableException 					ue,
		2:	Exception.TimeoutException 						te
	),
	
	/** 
	 * @param	command
	 * @param	isAllNodeManagered
	 * @param	nodeIdList
	 * @param	clusterType
	 * @param	nodeTypeList
	 * @param	preferredProgramTypeList
	 * @param	preferredProgramIdList
	 * @return	success or not
	 */
	i32 managerNode	(
		1:	required	Node.NodeCommand 					command,
		2:	required	bool								isAllNodeManagered,
		3:	optional	list<string>						nodeIdList,
		4:	optional 	list<i32> 							preferredProgramTypeList,
		5:	optional 	list<i64> 							preferredProgramIdList
	)	throws	(
		1:	Exception.UnavailableException 					ue,
		2:	Exception.TimeoutException 						te
	),

	
	/** 
	 * refreshing queue config
	 * @param
	 * @return queue config in json 
	 */
	string refreshQueueConfig(
	)	throws	(
		1:	Exception.UnavailableException					ue,
		2:	Exception.TimeoutException						te
	),
}



/** Node Tracker Service response for RPCs from all nodes */
service NodeCallTaskService {
	
	/** 
	 * registration of new node
	 * @param	nodeInfo
	 * @return	succeed or not
	 */
	i32 registerNode(
		1:	required	Node.NodePayload					nodePayload
	)	throws	(
		1:	Exception.InvalidRequestException 				ire,
		2:	Exception.UnavailableException 					ue,
		3:	Exception.TimeoutException 						te
	),
	
	/** 
	 * report node heart beat
	 * @param nodePayload
	 * @return succeed or not 
	 */
	i32 reportHeartbeat	(
		1:	required	Node.NodePayload					nodePayload
	)	throws	(
		1:	Exception.InvalidRequestException 				ire,
		2:	Exception.UnavailableException 					ue,
		3:	Exception.TimeoutException 						te
	),

	/**
	 * report task execution status
	 * @param	taskId
	 * @param	taskPhase 
	 * @param	taskStatus
	 * @return	succeed or not
	 */
	i32 reportTaskExecutionStatus (
		1:	required	string								nodeId,
		2:	required	i64 								taskId,
		3:	required	Task.TaskPhase						taskPhase,
		4:	required	Task.TaskStatus						taskStatus
	)	throws	(
		1:	Exception.InvalidRequestException 				ire,
		2:	Exception.UnavailableException 					ue,
		3:	Exception.TimeoutException 						te
	),
	
	/**
	 * receive result
	 * @param	taskId
	 * @param	content
	 * @param	name
	 * @return	succeed or not
	 */
	i32 submitResult (
		1:	required	i64 								taskId,
		2:	required	string 								name,
		3:	required	binary 								content
	)	throws	(
		1:	Exception.InvalidRequestException				ire,
		2:	Exception.UnavailableException					ue,
		3:	Exception.TimeoutException						te
	),
}