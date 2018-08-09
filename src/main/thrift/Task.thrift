#
# Data structures for task
#

namespace java com.YYSchedule.common.rpc.domain.task
namespace php com.YYSchedule.common.rpc.domain.task
namespace py rpc.task

/** task type enumeration */
enum TaskPhase {
    COMMON,
	STATIC,
}

/** task status enumeration */
enum TaskStatus {

	COMMITTED,
	DISTRIBUTE_FAILED,
	DISTRIBUTED,
	COLLECTD,
	ACCEPT_FAILED,
	ACCEPTED,
	RUNNING,
	INTERRUPTED,
	KILLED,
	TIMEOUT,
	FAILURE,
	FINISHED,
}
