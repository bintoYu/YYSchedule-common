#
# Parameter
#

include "Task.thrift"

namespace java com.binto.YYSchedule.common.rpc.domain.parameter
namespace php com.binto.YYSchedule.common.rpc.domain.parameter
namespace py rpc.parameter


/** container context parameter */
struct ContextParameter {
	
	1:	required	i32						sequenceNum,
	2:	optional	string					opt,
	3:	optional	string					content,
	4:	required	bool					needDownload,
}

/** job parameter */
struct JobParameter {

	1:	required	Task.TaskPhase			taskPhase,
	2:	optional	i64						appId,
	3:	optional 	list<ContextParameter>	contextParameterList,
}