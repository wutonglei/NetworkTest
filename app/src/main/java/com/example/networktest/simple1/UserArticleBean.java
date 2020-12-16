package com.example.networktest.simple1;

import java.util.List;

public class UserArticleBean {
    @Override
    public String toString() {
        return "UserArticleBean{" +
                "data=" + data +
                ", errorCode=" + errorCode +
                ", errorMsg='" + errorMsg + '\'' +
                '}';
    }

    /**
     * data : {"curPage":2,"datas":[{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":16451,"link":"https://juejin.cn/post/6905668599453581320","niceDate":"2天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1607851857000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1607851857000,"shareUser":"彭旭锐","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"图形学 | 蓄势待发！说一说图片相关的那些概念","type":0,"userId":30587,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":16421,"link":"https://iluhcm.com/2018/02/27/design-an-elegant-and-powerful-android-webview-part-two/","niceDate":"2天前","niceShareDate":"2020-12-11 01:13","origin":"","prefix":"","projectLink":"","publishTime":1607847362000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1607620439000,"shareUser":"HCong","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"如何设计一个优雅健壮的Android WebView？（下）","type":0,"userId":81437,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":16414,"link":"https://iluhcm.com/2017/12/10/design-an-elegant-and-powerful-android-webview-part-one/","niceDate":"2天前","niceShareDate":"2020-12-11 00:51","origin":"","prefix":"","projectLink":"","publishTime":1607847351000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1607619068000,"shareUser":"HCong","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"如何设计一个优雅健壮的Android WebView？（上）","type":0,"userId":81437,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":16433,"link":"https://iluhcm.com/2018/11/30/project-architecture-optimization-of-resource-management-system/","niceDate":"2020-12-13 15:33","niceShareDate":"2020-12-11 23:39","origin":"","prefix":"","projectLink":"","publishTime":1607844837000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1607701197000,"shareUser":"HCong","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"移动端工程架构与后端工程架构的思想摩擦之旅","type":0,"userId":81437,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":16445,"link":"https://juejin.cn/post/6905235580334899208","niceDate":"2020-12-13 09:25","niceShareDate":"2020-12-13 09:25","origin":"","prefix":"","projectLink":"","publishTime":1607822745000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1607822745000,"shareUser":"goweii","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"来一份Flutter渲染原理分析","type":0,"userId":20382,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":16444,"link":"https://juejin.cn/post/6903290882095579143","niceDate":"2020-12-13 00:17","niceShareDate":"2020-12-13 00:17","origin":"","prefix":"","projectLink":"","publishTime":1607789837000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1607789837000,"shareUser":"鸿洋","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"RecyclerView 面试题 | 滚动时表项是如何被填充或回收的？","type":0,"userId":2,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":16443,"link":"https://mp.weixin.qq.com/s/3SpByn-tmtah5L7i5haBPA","niceDate":"2020-12-13 00:16","niceShareDate":"2020-12-13 00:16","origin":"","prefix":"","projectLink":"","publishTime":1607789782000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1607789782000,"shareUser":"鸿洋","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"扒一扒，幕后的类加载","type":0,"userId":2,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":16442,"link":"https://www.jianshu.com/p/20f7611685ad","niceDate":"2020-12-12 21:03","niceShareDate":"2020-12-12 21:03","origin":"","prefix":"","projectLink":"","publishTime":1607778184000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1607778184000,"shareUser":"深红骑士","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"面试官：说说为什么 Activity.finish() 之后 10s 才 onDestroy ？","type":0,"userId":29303,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":16440,"link":"https://juejin.cn/post/6902331428072390663","niceDate":"2020-12-12 15:50","niceShareDate":"2020-12-12 15:50","origin":"","prefix":"","projectLink":"","publishTime":1607759419000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1607759419000,"shareUser":"鸿洋","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"一种更优雅的Flutter Dialog解决方案","type":0,"userId":2,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":16439,"link":"https://blog.csdn.net/rainshine1190/article/details/111032233","niceDate":"2020-12-12 12:06","niceShareDate":"2020-12-12 12:06","origin":"","prefix":"","projectLink":"","publishTime":1607745980000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1607745980000,"shareUser":"liangchao","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"liangchao test","type":0,"userId":17180,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":16432,"link":"https://zhuanlan.zhihu.com/p/331822163","niceDate":"2020-12-11 21:15","niceShareDate":"2020-12-11 21:15","origin":"","prefix":"","projectLink":"","publishTime":1607692511000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1607692511000,"shareUser":"深红骑士","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"开始切换到 Kotlin: 谷歌工程师给初学者的知识点总结","type":0,"userId":29303,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":16430,"link":"https://juejin.cn/post/6844903713006419975","niceDate":"2020-12-11 16:15","niceShareDate":"2020-12-11 16:15","origin":"","prefix":"","projectLink":"","publishTime":1607674510000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1607674510000,"shareUser":"玩王者的代码侠","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"IdleHandler，页面启动优化神器","type":0,"userId":82232,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":16429,"link":"https://juejin.cn/post/6904269772158926855","niceDate":"2020-12-11 16:13","niceShareDate":"2020-12-11 16:13","origin":"","prefix":"","projectLink":"","publishTime":1607674410000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1607674410000,"shareUser":"玩王者的代码侠","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"[Flutter] floor 数据库你不知道的那些事","type":0,"userId":82232,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":16425,"link":"https://www.jianshu.com/p/2a5c98f0efec","niceDate":"2020-12-11 09:18","niceShareDate":"2020-12-11 09:18","origin":"","prefix":"","projectLink":"","publishTime":1607649502000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1607649502000,"shareUser":"AprilEyon","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Flutter UI - Container 容器","type":0,"userId":3559,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":16424,"link":"https://mp.weixin.qq.com/s/sk78ufBnk1pp49-XXO00eQ","niceDate":"2020-12-11 08:39","niceShareDate":"2020-12-11 08:39","origin":"","prefix":"","projectLink":"","publishTime":1607647180000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1607647180000,"shareUser":"goweii","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"规范你的Android应用通知渠道","type":0,"userId":20382,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":16415,"link":"https://mp.weixin.qq.com/s/Q6tqd5sPhTEaVTfNCuJO3Q","niceDate":"2020-12-11 00:52","niceShareDate":"2020-12-11 00:52","origin":"","prefix":"","projectLink":"","publishTime":1607619165000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1607619165000,"shareUser":"HCong","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"写给 Android 应用工程师的 Binder 原理剖析！","type":0,"userId":81437,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":16412,"link":"https://mp.weixin.qq.com/s/uT91PMGEarCKt-Z6L1jWnA","niceDate":"2020-12-11 00:46","niceShareDate":"2020-12-11 00:46","origin":"","prefix":"","projectLink":"","publishTime":1607618813000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1607618813000,"shareUser":"HCong","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"浅谈APP的回收和重启机制","type":0,"userId":81437,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":16411,"link":"https://www.jianshu.com/p/fb057953131e","niceDate":"2020-12-10 20:11","niceShareDate":"2020-12-10 20:11","origin":"","prefix":"","projectLink":"","publishTime":1607602265000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1607602265000,"shareUser":"深红骑士","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android程序设计探索：MVP与模块化","type":0,"userId":29303,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":16409,"link":"https://www.jianshu.com/p/f3aacd9d70e1","niceDate":"2020-12-10 14:59","niceShareDate":"2020-12-10 14:59","origin":"","prefix":"","projectLink":"","publishTime":1607583551000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1607583551000,"shareUser":"刘胖胖","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"如何正确中断线程?","type":0,"userId":73657,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":16408,"link":"https://mp.weixin.qq.com/s/Xuc034VlR7TqjTaoaSuI2A","niceDate":"2020-12-10 13:57","niceShareDate":"2020-12-10 13:57","origin":"","prefix":"","projectLink":"","publishTime":1607579862000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1607579862000,"shareUser":"HCong","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"强大！ASM 插桩实现 Android 端无埋点性能监控！","type":0,"userId":81437,"visible":0,"zan":0}],"offset":20,"over":false,"pageCount":118,"size":20,"total":2342}
     * errorCode : 0
     * errorMsg :
     */

    private DataBean data;
    private int errorCode;
    private String errorMsg;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public static class DataBean {
        @Override
        public String toString() {
            return "DataBean{" +
                    "curPage=" + curPage +
                    ", offset=" + offset +
                    ", over=" + over +
                    ", pageCount=" + pageCount +
                    ", size=" + size +
                    ", total=" + total +
                    ", datas=" + datas +
                    '}';
        }

        /**
         * curPage : 2
         * datas : [{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":16451,"link":"https://juejin.cn/post/6905668599453581320","niceDate":"2天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1607851857000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1607851857000,"shareUser":"彭旭锐","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"图形学 | 蓄势待发！说一说图片相关的那些概念","type":0,"userId":30587,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":16421,"link":"https://iluhcm.com/2018/02/27/design-an-elegant-and-powerful-android-webview-part-two/","niceDate":"2天前","niceShareDate":"2020-12-11 01:13","origin":"","prefix":"","projectLink":"","publishTime":1607847362000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1607620439000,"shareUser":"HCong","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"如何设计一个优雅健壮的Android WebView？（下）","type":0,"userId":81437,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":16414,"link":"https://iluhcm.com/2017/12/10/design-an-elegant-and-powerful-android-webview-part-one/","niceDate":"2天前","niceShareDate":"2020-12-11 00:51","origin":"","prefix":"","projectLink":"","publishTime":1607847351000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1607619068000,"shareUser":"HCong","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"如何设计一个优雅健壮的Android WebView？（上）","type":0,"userId":81437,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":16433,"link":"https://iluhcm.com/2018/11/30/project-architecture-optimization-of-resource-management-system/","niceDate":"2020-12-13 15:33","niceShareDate":"2020-12-11 23:39","origin":"","prefix":"","projectLink":"","publishTime":1607844837000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1607701197000,"shareUser":"HCong","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"移动端工程架构与后端工程架构的思想摩擦之旅","type":0,"userId":81437,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":16445,"link":"https://juejin.cn/post/6905235580334899208","niceDate":"2020-12-13 09:25","niceShareDate":"2020-12-13 09:25","origin":"","prefix":"","projectLink":"","publishTime":1607822745000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1607822745000,"shareUser":"goweii","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"来一份Flutter渲染原理分析","type":0,"userId":20382,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":16444,"link":"https://juejin.cn/post/6903290882095579143","niceDate":"2020-12-13 00:17","niceShareDate":"2020-12-13 00:17","origin":"","prefix":"","projectLink":"","publishTime":1607789837000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1607789837000,"shareUser":"鸿洋","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"RecyclerView 面试题 | 滚动时表项是如何被填充或回收的？","type":0,"userId":2,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":16443,"link":"https://mp.weixin.qq.com/s/3SpByn-tmtah5L7i5haBPA","niceDate":"2020-12-13 00:16","niceShareDate":"2020-12-13 00:16","origin":"","prefix":"","projectLink":"","publishTime":1607789782000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1607789782000,"shareUser":"鸿洋","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"扒一扒，幕后的类加载","type":0,"userId":2,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":16442,"link":"https://www.jianshu.com/p/20f7611685ad","niceDate":"2020-12-12 21:03","niceShareDate":"2020-12-12 21:03","origin":"","prefix":"","projectLink":"","publishTime":1607778184000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1607778184000,"shareUser":"深红骑士","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"面试官：说说为什么 Activity.finish() 之后 10s 才 onDestroy ？","type":0,"userId":29303,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":16440,"link":"https://juejin.cn/post/6902331428072390663","niceDate":"2020-12-12 15:50","niceShareDate":"2020-12-12 15:50","origin":"","prefix":"","projectLink":"","publishTime":1607759419000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1607759419000,"shareUser":"鸿洋","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"一种更优雅的Flutter Dialog解决方案","type":0,"userId":2,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":16439,"link":"https://blog.csdn.net/rainshine1190/article/details/111032233","niceDate":"2020-12-12 12:06","niceShareDate":"2020-12-12 12:06","origin":"","prefix":"","projectLink":"","publishTime":1607745980000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1607745980000,"shareUser":"liangchao","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"liangchao test","type":0,"userId":17180,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":16432,"link":"https://zhuanlan.zhihu.com/p/331822163","niceDate":"2020-12-11 21:15","niceShareDate":"2020-12-11 21:15","origin":"","prefix":"","projectLink":"","publishTime":1607692511000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1607692511000,"shareUser":"深红骑士","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"开始切换到 Kotlin: 谷歌工程师给初学者的知识点总结","type":0,"userId":29303,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":16430,"link":"https://juejin.cn/post/6844903713006419975","niceDate":"2020-12-11 16:15","niceShareDate":"2020-12-11 16:15","origin":"","prefix":"","projectLink":"","publishTime":1607674510000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1607674510000,"shareUser":"玩王者的代码侠","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"IdleHandler，页面启动优化神器","type":0,"userId":82232,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":16429,"link":"https://juejin.cn/post/6904269772158926855","niceDate":"2020-12-11 16:13","niceShareDate":"2020-12-11 16:13","origin":"","prefix":"","projectLink":"","publishTime":1607674410000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1607674410000,"shareUser":"玩王者的代码侠","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"[Flutter] floor 数据库你不知道的那些事","type":0,"userId":82232,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":16425,"link":"https://www.jianshu.com/p/2a5c98f0efec","niceDate":"2020-12-11 09:18","niceShareDate":"2020-12-11 09:18","origin":"","prefix":"","projectLink":"","publishTime":1607649502000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1607649502000,"shareUser":"AprilEyon","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Flutter UI - Container 容器","type":0,"userId":3559,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":16424,"link":"https://mp.weixin.qq.com/s/sk78ufBnk1pp49-XXO00eQ","niceDate":"2020-12-11 08:39","niceShareDate":"2020-12-11 08:39","origin":"","prefix":"","projectLink":"","publishTime":1607647180000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1607647180000,"shareUser":"goweii","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"规范你的Android应用通知渠道","type":0,"userId":20382,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":16415,"link":"https://mp.weixin.qq.com/s/Q6tqd5sPhTEaVTfNCuJO3Q","niceDate":"2020-12-11 00:52","niceShareDate":"2020-12-11 00:52","origin":"","prefix":"","projectLink":"","publishTime":1607619165000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1607619165000,"shareUser":"HCong","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"写给 Android 应用工程师的 Binder 原理剖析！","type":0,"userId":81437,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":16412,"link":"https://mp.weixin.qq.com/s/uT91PMGEarCKt-Z6L1jWnA","niceDate":"2020-12-11 00:46","niceShareDate":"2020-12-11 00:46","origin":"","prefix":"","projectLink":"","publishTime":1607618813000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1607618813000,"shareUser":"HCong","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"浅谈APP的回收和重启机制","type":0,"userId":81437,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":16411,"link":"https://www.jianshu.com/p/fb057953131e","niceDate":"2020-12-10 20:11","niceShareDate":"2020-12-10 20:11","origin":"","prefix":"","projectLink":"","publishTime":1607602265000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1607602265000,"shareUser":"深红骑士","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android程序设计探索：MVP与模块化","type":0,"userId":29303,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":16409,"link":"https://www.jianshu.com/p/f3aacd9d70e1","niceDate":"2020-12-10 14:59","niceShareDate":"2020-12-10 14:59","origin":"","prefix":"","projectLink":"","publishTime":1607583551000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1607583551000,"shareUser":"刘胖胖","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"如何正确中断线程?","type":0,"userId":73657,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":16408,"link":"https://mp.weixin.qq.com/s/Xuc034VlR7TqjTaoaSuI2A","niceDate":"2020-12-10 13:57","niceShareDate":"2020-12-10 13:57","origin":"","prefix":"","projectLink":"","publishTime":1607579862000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1607579862000,"shareUser":"HCong","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"强大！ASM 插桩实现 Android 端无埋点性能监控！","type":0,"userId":81437,"visible":0,"zan":0}]
         * offset : 20
         * over : false
         * pageCount : 118
         * size : 20
         * total : 2342
         */

        private int curPage;
        private int offset;
        private boolean over;
        private int pageCount;
        private int size;
        private int total;
        private List<DatasBean> datas;

        public int getCurPage() {
            return curPage;
        }

        public void setCurPage(int curPage) {
            this.curPage = curPage;
        }

        public int getOffset() {
            return offset;
        }

        public void setOffset(int offset) {
            this.offset = offset;
        }

        public boolean isOver() {
            return over;
        }

        public void setOver(boolean over) {
            this.over = over;
        }

        public int getPageCount() {
            return pageCount;
        }

        public void setPageCount(int pageCount) {
            this.pageCount = pageCount;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<DatasBean> getDatas() {
            return datas;
        }

        public void setDatas(List<DatasBean> datas) {
            this.datas = datas;
        }

        public static class DatasBean {
            /**
             * apkLink :
             * audit : 1
             * author :
             * canEdit : false
             * chapterId : 494
             * chapterName : 广场
             * collect : false
             * courseId : 13
             * desc :
             * descMd :
             * envelopePic :
             * fresh : false
             * id : 16451
             * link : https://juejin.cn/post/6905668599453581320
             * niceDate : 2天前
             * niceShareDate : 2天前
             * origin :
             * prefix :
             * projectLink :
             * publishTime : 1607851857000
             * realSuperChapterId : 493
             * selfVisible : 0
             * shareDate : 1607851857000
             * shareUser : 彭旭锐
             * superChapterId : 494
             * superChapterName : 广场Tab
             * tags : []
             * title : 图形学 | 蓄势待发！说一说图片相关的那些概念
             * type : 0
             * userId : 30587
             * visible : 0
             * zan : 0
             */

            private String apkLink;
            private int audit;
            private String author;
            private boolean canEdit;
            private int chapterId;
            private String chapterName;
            private boolean collect;
            private int courseId;
            private String desc;
            private String descMd;
            private String envelopePic;
            private boolean fresh;
            private int id;
            private String link;
            private String niceDate;
            private String niceShareDate;
            private String origin;
            private String prefix;
            private String projectLink;
            private long publishTime;
            private int realSuperChapterId;
            private int selfVisible;
            private long shareDate;
            private String shareUser;
            private int superChapterId;
            private String superChapterName;
            private String title;
            private int type;
            private int userId;
            private int visible;
            private int zan;
            private List<?> tags;

            public String getApkLink() {
                return apkLink;
            }

            public void setApkLink(String apkLink) {
                this.apkLink = apkLink;
            }

            public int getAudit() {
                return audit;
            }

            public void setAudit(int audit) {
                this.audit = audit;
            }

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public boolean isCanEdit() {
                return canEdit;
            }

            public void setCanEdit(boolean canEdit) {
                this.canEdit = canEdit;
            }

            public int getChapterId() {
                return chapterId;
            }

            public void setChapterId(int chapterId) {
                this.chapterId = chapterId;
            }

            public String getChapterName() {
                return chapterName;
            }

            public void setChapterName(String chapterName) {
                this.chapterName = chapterName;
            }

            public boolean isCollect() {
                return collect;
            }

            public void setCollect(boolean collect) {
                this.collect = collect;
            }

            public int getCourseId() {
                return courseId;
            }

            public void setCourseId(int courseId) {
                this.courseId = courseId;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getDescMd() {
                return descMd;
            }

            public void setDescMd(String descMd) {
                this.descMd = descMd;
            }

            public String getEnvelopePic() {
                return envelopePic;
            }

            public void setEnvelopePic(String envelopePic) {
                this.envelopePic = envelopePic;
            }

            public boolean isFresh() {
                return fresh;
            }

            public void setFresh(boolean fresh) {
                this.fresh = fresh;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getNiceDate() {
                return niceDate;
            }

            public void setNiceDate(String niceDate) {
                this.niceDate = niceDate;
            }

            public String getNiceShareDate() {
                return niceShareDate;
            }

            public void setNiceShareDate(String niceShareDate) {
                this.niceShareDate = niceShareDate;
            }

            public String getOrigin() {
                return origin;
            }

            public void setOrigin(String origin) {
                this.origin = origin;
            }

            public String getPrefix() {
                return prefix;
            }

            public void setPrefix(String prefix) {
                this.prefix = prefix;
            }

            public String getProjectLink() {
                return projectLink;
            }

            public void setProjectLink(String projectLink) {
                this.projectLink = projectLink;
            }

            public long getPublishTime() {
                return publishTime;
            }

            public void setPublishTime(long publishTime) {
                this.publishTime = publishTime;
            }

            public int getRealSuperChapterId() {
                return realSuperChapterId;
            }

            public void setRealSuperChapterId(int realSuperChapterId) {
                this.realSuperChapterId = realSuperChapterId;
            }

            public int getSelfVisible() {
                return selfVisible;
            }

            public void setSelfVisible(int selfVisible) {
                this.selfVisible = selfVisible;
            }

            public long getShareDate() {
                return shareDate;
            }

            public void setShareDate(long shareDate) {
                this.shareDate = shareDate;
            }

            public String getShareUser() {
                return shareUser;
            }

            public void setShareUser(String shareUser) {
                this.shareUser = shareUser;
            }

            public int getSuperChapterId() {
                return superChapterId;
            }

            public void setSuperChapterId(int superChapterId) {
                this.superChapterId = superChapterId;
            }

            public String getSuperChapterName() {
                return superChapterName;
            }

            public void setSuperChapterName(String superChapterName) {
                this.superChapterName = superChapterName;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getUserId() {
                return userId;
            }

            public void setUserId(int userId) {
                this.userId = userId;
            }

            public int getVisible() {
                return visible;
            }

            public void setVisible(int visible) {
                this.visible = visible;
            }

            public int getZan() {
                return zan;
            }

            public void setZan(int zan) {
                this.zan = zan;
            }

            public List<?> getTags() {
                return tags;
            }

            public void setTags(List<?> tags) {
                this.tags = tags;
            }
        }
    }
}
