#
# Data structures for job
#

include "Task.thrift"
include "Parameter.thrift"

namespace java com.YYSchedule.common.rpc.domain.job
namespace php com.YYSchedule.common.rpc.domain.job
namespace py rpc.job

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

struct Job{
	1:	optional	i64					jobId,
	2:	required	JobPriority			jobPriority,
	3:	required	Task.TaskPhase		taskPhase,
	4:	optional	i64					timeout,
	5:	required	Parameter.JobParameter	jobParameter,
	6:	optional	double				jobStatus,	
}
