#
# Data structures for task
#

include "Node.thrift"

namespace java com.binto.YYSchedule.common.rpc.domain.task
namespace php com.binto.YYSchedule.common.rpc.domain.task
namespace py rpc.task

/** task type enumeration */
enum TaskPhase {
    COMMON,
	STATIC,
}

/** task status enumeration */
enum TaskStatus {

	COMMITTED,
	SCHEDULING_FAILED,
	SCHEDULED,
	ISSUE_FAILED,
	ISSUED,
	ACCEPT_FAILED,
	ACCEPTED,
	RUNNING,
	INTERRUPTED,
	KILLED,
	TIMEOUT,
	FAILURE,
	FINISHED,
}
