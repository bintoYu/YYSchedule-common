# Interface definition for Node Listen
#

include	"Node.thrift"

namespace java com.YYSchedule.common.rpc.service.notify
namespace py rpc

# AUTHOR = yubingtao

service NodeListenService {
	
	/** 
	 * execute nodeCommand
	 * @param	nodeCommand
	 * @return	succeed or false
	 */
	i32 managerNode	(
		1: required		Node.NodeCommand	nodeCommand,
	),

}