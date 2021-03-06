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
	DYNAMIC,
	CUCKOO,
	VIRUSTOTAL,
}

/** task status enumeration */
enum TaskStatus {

	COMMITTED,
	DISTRIBUTE_FAILED,
	DISTRIBUTED,
	COLLECTD,
	ACCEPT_FAILED,
	ACCEPTED,
	WAITING,
	RUNNING,
	INTERRUPTED,
	KILLED,
	TIMEOUT,
	FAILURE,
	FINISHED,
}
