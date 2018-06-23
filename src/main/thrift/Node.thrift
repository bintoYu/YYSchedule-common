#
# Data structures for resource node
#

namespace java com.YYSchedule.common.rpc.domain.node
namespace php com.YYSchedule.common.rpc.domain.node
namespace py rpc.node

enum ClusterType {
	
	DEDICATED,
	GENERAL,
}

enum NodeCommand {
	START=1,
	STOP,
	RESTART
}

struct NodeRuntime {

	1:	required i32				cpuCount,
	2:	required i32				cpuCores,
	3:	required i32				cpuMhz,
	4:	required double				cpuUsedPerc,
	5:	required i64				freeMem,
	6:	required i64				jvmFreeMem,
}

struct NodePayload {

	1:	required string				nodeId,
	
	2:	required NodeRuntime		nodeRuntime,
	
	3:	required i32 				queueLimit,
	4:	required i32 				queueNum,
	5:	required i64 				expectedDelay,
	6:	required list<i32> 			preferredProgramTypeList,
	7:	required list<i64> 			preferredProgramIdList,
	8: optional list<string>       functionNameList,
}

/** node info */
struct NodeInfo {
	
	1:	required string				nodeId,

	# hardware
	2:	required string 			cpuVendor,
	3:	required string 			cpuModel,
	4:	required i32 				memSize,
	5:	required string 			fsName,
	6:	required string 			fsType,
	7:	required string 			fsFormat,
	8:	required i32 				fsSize,
	
	# software
	9:	required string 			osArch,
	10:	required string 			osName,
	11:	required string 			osDesc,
	12:	required string 			osVersion,
	13:	required string 			jvmName,
	14:	required string 			jvmVersion,
	15:	required i32 				jvmMaxMem,
	16:	required i32	 			nodeType,

	# network
	17:	required string 			domain,
	18:	required string 			macAddress,
	19:	required i32 				internetConnectivity,
	20:	required string 			ipAddress,
	21:	required i32 				rpcPort,
	
	# process
	22:	optional i32 				pid,
	23:	optional string 			user,
	24:	optional string 			startTime,
	25:	optional string 			procName,
	
	# payload
	26:	optional double 			cpuPerc,
	27:	optional i32 				memUsed,
	28:	optional i32 				jvmAllocMem,
	29:	optional i32 				fsAvail,
	30:	optional i32 				fsUsed,
	31:	optional double 			fsUsedPerc,
	32: required NodePayload		nodePayload


	# validation
	33:	required i64 				configUpdated,
	34:	required i64 				payloadUpdated,
	35: required i32				valid,
}