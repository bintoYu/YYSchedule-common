#
# Exception definition for rpc 
#
namespace java com.YYSchedule.common.rpc.exception
namespace php com.YYSchedule.common.rpc.exception
namespace py rpc.exception

/**  */
exception InvokeException {
	1:	required	string	why
}

/** client error such as invalid parameter etc. for client handling */
exception InvalidRequestException {
	1:	required	string	why
}

/** server or client error */
exception NotFoundException {
	1:	required	string	why
}

/** server error for server handling */
exception UnavailableException {
	1:	required	string	why
}

/** RPC timeout was exceeded. */
exception TimeoutException {
	1:	required	string	why
}

/** */
exception AuthenticationException {
	1:	required	string	why
}

/** */
exception AuthorizationException {
	1:	required	string	why
}