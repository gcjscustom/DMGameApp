package com.stx.xhb.dmgameapp.config;

/**
 * Author：xiaohaibin
 * Time：2017/9/9
 * Emil：xhb_199409@163.com
 * Github：https://github.com/xiaohaibin/
 * Describe：
 */

public class API {

    /**
     * 请求：POST
     * 参数：appid：1   2为视频
     *       page  1   页码
     *       key
     *       id
     */
    public static final String NEWS_CHANNEL_DATA="http://m.3dmgame.com/y3wap/ajaxappchannel.php";

    /**
     * 用户登录、注册、论坛相关接口
     */
    public static final String USER_API="http://bbs.3dmgame.com/api/3dmapp/index.php";
    /**
     * 获取文章频道列表
     * 方式：GET
     */
    public static final String GET_NEWS_CHANNEL="http://m.3dmgame.com/y3wap/ajaxappchannels.php";

    /**
     * 获取游戏频道列表
     * 方式：GET
     */
    public static final String GET_GAME_CHANNEL="http://m.3dmgame.com/y3wap/appgamechannels.php";

    /**
     * 获取热门搜索关键词
     * 方式:POST
     */
    public static final String GET_SERACH_HOT_KEYWORD="http://m.3dmgame.com/y3wap/ajaxappsearch.php";

    /**
     * 获取游戏各个频道数据
     * 方式：POST
     * 参数：{"page":"1","appid":"1"}
     */
    public static final String GET_GAME_CHANNEL_DATA="http://m.3dmgame.com/y3wap/appgamechannel.php";

    /**
     * 获取游戏详情
     * 方式：post
     * 参数：{"appid":"1","page":"1","id":"3505044","key":"南方公园：完整破碎","type":"1"}
     */
    public static final String GET_GAME_DETAILS="http://m.3dmgame.com/y3wap/appgamesmsearch.php";

    /**
     * web论坛链接
     */
    public static final String GET_3DM_WEB_FORUM="http://bbs.3dmgame.com/forum.php?mod=viewthread&tid=%s&page=1&mobile=3dmapp";

    /**
     * 获取评论列表
     */
    public static final String GET_COMMENT_LIST="http://changyan.sohu.com/api/2/topic/load?client_id=cy2x2lUJoEMz&depth=2&page_size=20&topic_source_id=%s&topic_url=20&sub_size=20&hot_size=0&order_by=floor";

    /**
     * 提交评论
     * 方式：post
     * 参数：client_id 畅言appid
     *       topic_id  文章的id
     *       content  评论内容
     *       reply_id 回复的评论id
     *       access_token 采用OAuth授权方式为必填参数
     */
    public static final String POST_COMMENT="http://changyan.sohu.com/api/2/comment/submit";

    /**
     * 获取畅言的AccessToken
     * 方式：post
     *
     */
    public static final String GET_CHANG_YAN_AccessToken="http://changyan.sohu.com/api/oauth2/sso/token";

    /**
     * 获取畅言用户信息
     * 方式：get
     * access_token
     * client_id
     */
    public static final String GET_CHANG_YAN_USER_INFO="http://changyan.sohu.com/api/2/user/info";
}
