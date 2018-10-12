#
# Data structures for Mission
#
include "Job.thrift"
include "Task.thrift"
include "Parameter.thrift"

namespace java com.YYSchedule.common.rpc.domain.mission
namespace php com.YYSchedule.common.rpc.domain.mission
namespace py rpc.job

/**  mission */
struct Mission {

	1:	required 	i32 					userId,
	2:	required	string					missionName,
	3:  optional    i32						missionId,
	4:	required	list<Job.Job>			jobList,
	5:	optional	i64						impatienceTime
}
