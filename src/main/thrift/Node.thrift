#
# Data structures for resource node
#
include "Task.thrift"
include "Engine.thrift"

namespace java com.YYSchedule.common.rpc.domain.node
namespace php com.YYSchedule.common.rpc.domain.node
namespace py rpc.node

enum NodeCommand {
	START=1,
	STOP,
	RESTART
}

struct NodeRuntime {
	1:	required double				cpuUsedPerc,
	2:	required i64				freeMem,
	3:	required i64				jvmFreeMem,
}

/**
* nodeRuntime:运行时参数
* queueLimit:单条队列最大长度
* queueLength:单条队列现在长度
* consumerThreadNum:线程个数
*/
struct NodePayload {

	1:	required string				nodeId,
	2:	required NodeRuntime		nodeRuntime,
	3:	required i32 				queueLimit,
	4:	required i32 				queueLength,
	5:	required i32 				consumerThreadNum,
	6:	required Task.TaskPhase		taskPhase,
	7:	optional list<Engine.EngineLogger> engineLoggerList,
}