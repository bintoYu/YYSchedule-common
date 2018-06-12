#
# 提供给nodemanager使用的接口
#

include "Container.thrift"
include "Exception.thrift"
include "Job.thrift"
include "Node.thrift"

namespace java com.binto.YYSchedule.common.rpc.service.node
namespace php com.binto.YYSchedule.common.rpc.service.node
namespace py rpc.service.node

# VERSION = "0.1.0"
# AUTHOR = yubingtao

# service api
#

/** nodemanager作为服务端，taskmanager远程rpc调用 */
service TaskCallNodeService{
	
	/** 
	 * execute context
	 * @param	context
	 * @return	succeed or not
	 */
	i32 submitContext	(
		1:	required	Container.Context		context
	)	throws	(
		1:	Exception.InvalidRequestException	ire,
		2:	Exception.UnavailableException		ue,
		3:	Exception.TimeoutException			te
	),
					
	/**
	 * terminate specific context
	 * @param	jobId
	 * @return	succeed or not
	 */
	i32	terminateContext	(
		1:	required	string					taskId
	)	throws	(
		1:	Exception.InvalidRequestException	ire,
		2:	Exception.UnavailableException		ue,
		3:	Exception.NotFoundException			nfe,
		4:	Exception.TimeoutException			te
	),
	
	/**
	 * update program
	 * @param	program name
	 * @return	succeed or not
	 */		
	i32	updateProgram	(
		1:	required	string					programName
	)	throws	(
		1:	Exception.InvalidRequestException	ire,
		2:	Exception.UnavailableException		ue,
		3:	Exception.NotFoundException			nfe,
		4:	Exception.TimeoutException			te
	),
					
	/**
	 * update node config and status
	 * @param
	 * @return Node.Node
	 */
	Node.NodeInfo	updateNodeInfo	(
	)	throws	(
		1:	Exception.UnavailableException		ue,
		2:	Exception.TimeoutException			te
	),
	
	/** 
	 * obtaining queue information
	 * @param
	 * @return queue information in json
	 */
	string obtainQueueInfo(
	)	throws	(
		1:	Exception.UnavailableException		ue,
		2:	Exception.TimeoutException			te
	),
}

/** nodemanager作为服务端，等待引擎通过rpc调用 */
service EngineCallNodeService {

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