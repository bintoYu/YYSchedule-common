#
# Data structures for container and program
#

include "Task.thrift"
include "Job.thrift"
include "Node.thrift"
include "Parameter.thrift"

namespace java com.binto.YYSchedule.common.rpc.domain.container
namespace php com.binto.YYSchedule.common.rpc.domain.container
namespace py rpc.container


/** programme data */
struct Programme {

	# TODO authority
	1:	required	string					committer,
	2:	required	string					programmeName,
	3:	required	Task.TaskPhase			taskPhase,
	
	4:	required	string					scriptName,
	5:	required	binary					script,
	6:	required	string					scriptMd5,
	7:	required	string					executableName,
	8:	required	binary					executable,
	9:	required	string					executableMd5,
	# "key1=value1,key2=value2"
	10:	optional	string					envVariables,
	
	11:	optional	string					description,
	12:	optional	i32						minMem,
	13:	optional	i32						minFs,
}

/** container context info */
struct Context {

	1:	required	i64						taskId,
	2:	required	Job.JobPriority			priority,
	3:	required	Task.TaskPhase			taskPhase,
	4:	optional	i64						timeout,
	5:  optional	i64						complexity,
	
	6:	required	i64						programId,
	7:	required	string					programName,
	8:	required	string					scriptName,
	9:	required	string					scriptPath,
	10:	required	string					scriptMd5,
	11:	required	string					executableName,
	12:	required 	string 					executablePath,
	13:	required 	string 					executableMd5,
	14:	optional	string 					envVariables,
	
	15:	optional 	Parameter.JobParameter	 	parameter,
	16:	optional 	string 					resultAddress,
	17: optional    string                  functionName,
}
