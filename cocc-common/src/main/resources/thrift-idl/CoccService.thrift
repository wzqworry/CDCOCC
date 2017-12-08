
namespace java com.biierg.cocc.common.service
namespace cpp com.biierg.cocc.common.service

/**
* 用户信息结构体
**/
struct User {
    1: string userId;   // 用户ID
    2: string passwd;   // 登录密码
    3: string realName;
    4: string tel;
    5: string orgId;
    6: i64 createTime;
    7: i64 updateTime;
    8: string createUser;
    9: string updateUser;
}

/**
* 用户服务
**/
service UserService {

    /**
    * 登录
    **/
    bool login(
        1: string userId, // 用户ID
        2: string userPwd // 登录密码
    );

    /**
    * 获取用户信息
    **/
    User getUser(1: string userId);

    /**
    * 修改登录密码
    **/
    bool updatePwd(
        1: string userId,   // 用户ID
        2: string passwd,   // 原始密码
        3: string newPasswd // 新密码
    );

    /**
    * 添加用户
    **/
    bool addUser(1: User user);
}

/**
* 移动端版本服务
**/
service VersionService {
    string getLatestVersionNo(
        1: string appNo,    // APP名称
        2: string platNo    // 平台名称
    );
}