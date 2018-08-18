#
# 提供给nodemanager使用的接口
#

include "Exception.thrift"
include "Job.thrift"
include "Node.thrift"

namespace java com.YYSchedule.common.rpc.service.node
namespace php com.YYSchedule.common.rpc.service.node
namespace py rpc.service.node

# VERSION = "0.1.0"
# AUTHOR = yubingtao

# service api
#

/** nodemanager作为服务端，taskmanager远程rpc调用 */
service TaskCallNodeService{				
	
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
	 * @param	fileName
	 * @param	result
	 * @param	logger
	 * @return	succeed or not
	 */
	i32 transferResult (
		1:	required	i64 								taskId,
		2:	required	string 								file,
		3:	optional	string 								result,
		4:	required	string 								logger,
		5:	required	bool								isSuccess,
	)	throws	(
		1:	Exception.InvalidRequestException				ire,
		2:	Exception.UnavailableException					ue,
		3:	Exception.TimeoutException						te
	),
	
	/**
	 * 提交引擎执行过程中产生的日志信息
	 * @param	taskId
	 * @param	content
	 * @return	succeed or not
	 */
	i32 submitExecutionLogger (
		1:	required	i64 								taskId,
		2:	required	string 								file,
		3:	required	string 								content
	)	throws	(
		1:	Exception.InvalidRequestException				ire,
		2:	Exception.UnavailableException					ue,
		3:	Exception.TimeoutException						te
	),
}