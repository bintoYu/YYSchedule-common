#
# Data structures for engine
#

namespace java com.YYSchedule.common.rpc.domain.engine
namespace php com.YYSchedule.common.rpc.domain.engine
namespace py rpc.engine

 /** Engine Info */
struct EngineLogger {

	1:	required	i64				taskId,
	2:	required	string			fileName,
	3:	required	string			content,
}
