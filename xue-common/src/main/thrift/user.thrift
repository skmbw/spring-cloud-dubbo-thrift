namespace java com.xueershangda.tianxun.user.model

// include "user.thrift" // 包含文件，service定义中，User要full package,同一个文件不需要

struct User {
	1: optional string id;
	2: optional string name;
	3: optional string nickName;
	4: optional string account;
	5: optional string email;
	6: optional string mobile;
	7: optional string password;
	8: optional i64 registerDate;
	9: optional i32 age;
	10: optional i64 lastLoginDate;
	11: optional i32 state;
	12: optional i32 level;
	13: optional i32 asker;
	14: optional i32 answer;
	15: optional string identityCard;
	16: optional i32 identityType;
	17: optional string alipay;
	18: optional string weixin;
	19: optional string qq;
	20: optional string address;
	21: optional string avatar;
	22: optional i64 birthday;
	23: optional string summary;
	24: optional string signature;
	25: optional string title;
	26: optional i64 focusNumber;
	27: optional i64 loveNumber;
	28: optional i32 page = 1;
	29: optional i32 pageSize = 20;
	
}