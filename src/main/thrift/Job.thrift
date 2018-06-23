#
# Data structures for job
#

include "Task.thrift"
include "Node.thrift"

namespace java com.YYSchedule.common.rpc.domain.job
namespace php com.YYSchedule.common.rpc.domain.job
namespace py rpc.job

/** job distribution mode enumeration */
enum JobDistributionMode {

	SERIAL,
	PARALLEL,
}

 /**
   *job priority
   * HIGHER 
   * HIGH
   * MEDIUM
   * LOW
   * LOWER
   */
 enum JobPriority {
	HIGHER=9,
	HIGH=6,
	MEDIUM=4,
	LOW=2,
	LOWER=0
}
/** job operation requirement */
struct JobOperationRequirement {

	1:	required 	Task.TaskPhase 		taskPhase,
	2:	optional	i64 				timeout,
	3:  optional	i64					complexity,
}

/** job resource requirement */
struct JobResourceRequirement {

	1:	required 	Task.TaskPhase 		taskPhase,
	2:	optional	i64 				programId,
	3:	optional	string 				executorId,
}
