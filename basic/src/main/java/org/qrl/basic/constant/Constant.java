package org.qrl.basic.constant;

@SuppressWarnings("unused")
public interface Constant {

	/**
	 * 正常状态
	 */
    Integer STATUS_NORMAL = 0;

	/**
	 * 禁用状态
	 */
    Integer STATUS_DISABLE = -1;

	/**
	 * 删除标志
	 */
    Integer IS_DEL_1 = 1;

	/**
	 * 未删除
	 */
    Integer IS_DEL_0 = 0;

	/**
	 * 系统日志类型： 登录
	 */
    int LOG_TYPE_1 = 1;
	
	/**
	 * 系统日志类型： 操作
	 */
    int LOG_TYPE_2 = 2;

	/**
	 * 操作日志类型： 查询
	 */
    int OPERATE_TYPE_QUERY = 1;
	
	/**
	 * 操作日志类型： 添加
	 */
    int OPERATE_TYPE_ADD = 2;
	
	/**
	 * 操作日志类型： 更新
	 */
    int OPERATE_TYPE_UPDATE = 3;
	
	/**
	 * 操作日志类型： 删除
	 */
    int OPERATE_TYPE_REMOVE = 4;

    /**
     * 操作日志类型：新增或修改
     */
    int OPERATE_TYPE_SAVE_OR_UPDATE = 5;
	
	/**
	 * 操作日志类型： 倒入
	 */
    int OPERATE_TYPE_IMPORT = 6;
	
	/**
	 * 操作日志类型： 导出
	 */
    int OPERATE_TYPE_EXPORT = 7;
	
	
	/**
     * {@code 500 Server Error} (HTTP/1.0 - RFC 1945)
     * */
    Integer SC_INTERNAL_SERVER_ERROR_500 = 500;

    /**
     * {@code 200 OK} (HTTP/1.0 - RFC 1945)
     * */
    Integer SC_OK_200 = 200;
    
    /**访问权限认证未通过 510*/
    Integer SC_NO_AUTH =510;

    /**
     * 登录用户Shiro权限缓存KEY前缀
     * */
    String PREFIX_USER_SHIRO_CACHE  = "shiro:cache:ShiroRealm.authorizationCache:";

    /**
     * 登录用户Token令牌缓存KEY前缀
     * */
    String PREFIX_USER_TOKEN  = "prefix_user_token_";

    /**
     * Token缓存时间：3600s，即一小时
     * */
    int  TOKEN_EXPIRE_TIME  = 3600;
    
    /**通告对象类型（USER:指定用户，ALL:全体用户）*/
    String MSG_TYPE_USER = "USER";
    String MSG_TYPE_ALL  = "ALL";
    
    /**发布状态（0未发布，1已发布，2已撤销）*/
    String NO_SEND  = "0";
    String HAS_SEND  = "1";
    String HAS_CANCEL = "2";
    
    /**阅读状态（0未读，1已读）*/
    String HAS_READ_FLAG  = "1";
    String NO_READ_FLAG  = "0";
    
    /**优先级（L低，M中，H高）*/
    String PRIORITY_L  = "L";
    String PRIORITY_M  = "M";
    String PRIORITY_H  = "H";
    
    /**
     * 短信模板方式  0 .登录模板、1.注册模板、2.忘记密码模板
     */
    String SMS_TPL_TYPE_0  = "0";
    String SMS_TPL_TYPE_1  = "1";
    String SMS_TPL_TYPE_2  = "2";
    
    /**
     * 状态(0无效1有效)
     */
    String STATUS_0 = "0";
    String STATUS_1 = "1";
    
    /**
     * 同步工作流引擎1同步0不同步
     */
    Integer ACT_SYNC_1 = 1;
    Integer ACT_SYNC_0 = 0;

    /**
     * 消息类型1:通知公告2:系统消息
     */
    String MSG_CATEGORY_1 = "1";
    String MSG_CATEGORY_2 = "2";
    
    /**
     * 是否配置菜单的数据权限 1是0否
     */
    Integer RULE_FLAG_0 = 0;
    Integer RULE_FLAG_1 = 1;

    /**
     * 是否用户已被冻结 1正常(解冻) 2冻结
     */
    Integer USER_UNFREEZE = 1;
    Integer USER_FREEZE = 2;
    
    /**字典翻译文本后缀*/
    String DICT_TEXT_SUFFIX = "_dictText";

    /**
     * 文件上传类型（本地：local，阿里云：alioss）
     */
    String UPLOAD_TYPE_LOCAL = "local";
    String UPLOAD_TYPE_OSS = "alioss";

    /**
     * 文档上传自定义桶名称
     */
    String UPLOAD_CUSTOM_BUCKET = "eoa-file";
    /**
     * 文档上传自定义路径
     */
    String UPLOAD_CUSTOM_PATH = "eoa-file";
    /**
     * 文件外链接有效天数
     */
    Integer UPLOAD_EFFECTIVE_DAYS = 1;

    /**
     * 在线聊天 是否为默认分组
     */
    String IM_DEFAULT_GROUP = "1";
    /**
     * 在线聊天 图片文件保存路径
     */
    String IM_UPLOAD_CUSTOM_PATH = "imfile";
    /**
     * 在线聊天 用户状态
     */
    String IM_STATUS_ONLINE = "online";

    /**
     * 在线聊天 SOCKET消息类型
     */
    String IM_SOCKET_TYPE = "chatMessage";

    /**
     * 在线聊天 是否开启默认添加好友 1是 0否
     */
    String IM_DEFAULT_ADD_FRIEND = "1";

    /**
     * 在线聊天 用户好友缓存前缀
     */
    String IM_PREFIX_USER_FRIEND_CACHE = "sys:cache:im:im_prefix_user_friend_";

    /**
     * 考勤补卡业务状态 （1：同意  2：不同意）
     */
    String SIGN_PATCH_BIZ_STATUS_1 = "1";
    String SIGN_PATCH_BIZ_STATUS_2 = "2";

    /**
     * 公文文档上传自定义路径
     */
    String UPLOAD_CUSTOM_PATH_OFFICIAL = "official-doc";
     /**
     * 公文文档下载自定义路径
     */
     String DOWNLOAD_CUSTOM_PATH_OFFICIAL = "official-down";

    /**
     * WPS存储值类别(1 code文号 2 text（WPS模板还是公文发文模板）)
     */
    String WPS_TYPE_1="1";
    String WPS_TYPE_2="2";

    String X_ACCESS_TOKEN = "token";

    /** 系统通告消息状态：0=未发布 */
    String ANNOUNCEMENT_SEND_STATUS_0 = "0";
    /** 系统通告消息状态：1=已发布 */
    String ANNOUNCEMENT_SEND_STATUS_1 = "1";
    /** 系统通告消息状态：2=已撤销 */
    String ANNOUNCEMENT_SEND_STATUS_2 = "2";

}
