package qzhenghao.cn.i_today.network;

/**
 * Created by 365rili on 16/5/4.
 */
public class Urls {
//    http://img.blog.csdn.net/20161223204711048?watermark/2/text/aHR0cDovL2Jsb2cuY3Nkbi5uZXQvbGFveWFuZzM2MA==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70/gravity/SouthEast

    //    public final static String BASE_URL = "http://localhost:8080/recreation-1.0";
    public final static String BASE_URL = "http://60.205.223.7:8080/recreation-1.0";

    //获取更新接口
    public final static String GET_NEW_VERSION = BASE_URL + "/version/hasNewVersion";

    //获取视频接口
    public final static String GET_VIDEO_LIST = BASE_URL + "/videos/findVideoByPage?page=";

    //获取启动信息接口
    public final static String GET_START_INFO = BASE_URL + "/start/getStartInfo";

    public final static String GET_NEW_APK = "http://60.205.223.7:8080/Recreation/app-release.apk";

    //分享group 加id
    public final static String SHARE_GROUP = "http://m.neihanshequ.com/share/group/";

    //获取用户评论
    public final static String GET_USER_DETAIL_START = "http://lf.snssdk.com/neihan/comments/?";
//    group_id=54484601117&item_id=54484601117&count=20&offset=0" +

    public final static String GET_USER_DETAIL_END = "&iid=7164180604&device_id=34822199408&ac=wifi&channel=baidu&aid=7&app_name=joke_essay&version_code=590&version_name=5.9.0&device_platform=android&ssmix=a&device_type=Nexus+5&device_brand=google&os_api=25&os_version=7.1&uuid=359250050588035&openudid=12645e537a2f0f25&manifest_version_code=590&resolution=1080*1776&dpi=480&update_version_code=5903";

    public final static String YINYUETAI = "http://mapiv2.yinyuetai.com/component/prefecture.json?&type=1";
    //    http://119.29.47.97/article/list/suggest?page=1&type=refresh&count=30&readarticles=[117917136,117916583]&rqcnt=13&r=519baad91478488978667
    //    http://m2.qiushibaike.com/article/list/suggest?page=1&type=refresh&count=30&readarticles=[117921665,117916048]&rqcnt=23&r=519baad91478488541893
    //    糗事百科的base url
    public final static String QIUBAI_BASE_URL = "http://m2.qiushibaike.com";
    //    糗百首页url
    public final static String ARTICLE_LIST = QIUBAI_BASE_URL + "/article/list/video?page=1&count=30&rqcnt=8";

    //    糗百首页刷新url
    public final static String ARTICLE_LIST_REFRESH = QIUBAI_BASE_URL + "/article/list/suggest?page=1&type=refresh&count=30";

    //    糗百加载更多
    public final static String ARTICLE_LIST_LOAD_MORE = QIUBAI_BASE_URL + "/article/list/suggest?";

    //获取内涵段子数据
    public final static String GET_ARTICLE_LIST = "http://is.snssdk.com/neihan/stream/mix/v1/?mpic=1&webp=1&essence=1&content_type=-101&message_cursor=-1&longitude=116.4121485&latitude=39.9365054&am_longitude=116.41828&am_latitude=39.937848&am_city=%E5%8C%97%E4%BA%AC%E5%B8%82&am_loc_time=1483686438786&count=30&min_time=";

    public final static String GET_ARTICLE_LIST_END = "&screen_width=1080&iid=7164180604&device_id=34822199408&ac=wifi&channel=baidu&aid=7&app_name=joke_essay&version_code=590&version_name=5.9.0&device_platform=android&ssmix=a&device_type=Nexus+5&device_brand=google&os_api=25&os_version=7.1&uuid=359250050588035&openudid=12645e537a2f0f25&manifest_version_code=590&resolution=1080*1776&dpi=480&update_version_code=5903";
    //    page=2&type=list&count=30&readarticles=[117944813,117938343,117944189,117944845,117938296,117937612,117938940,117937720]&rqcnt=22&r=519baad91478745407257";
    //    图片url
    public final static String PICTURE_ITEM = "http://pic.qiushibaike.com/system/pictures/";
//    11793/117936574/medium/";

    //    音悦台打榜
    public final static String GET_TOP_VIDEO_LIST = "http://mapiv2.yinyuetai.com/vchart/trend.json?&area=ML&offset=0&size=20";

}
