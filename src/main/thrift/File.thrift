#
# Data structures for File
#

namespace java com.softsec.tase.common.domain.file
namespace php com.softsec.tase.common.rpc.domain.user
namespace py rpc.user

 /** User Info */
struct User {

	1:	required	i64				userId,
	2:	required	string			username,
	3:	optional	string			password,
	4:	optional 	string 			authToken,
	5:	optional 	i64 			appCount,
	6:  optional	i32				userCount
}
