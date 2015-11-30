package com.luo.umengshare.share;

import android.content.Context;

import com.luo.umengshare.share.core.ShareDisplayer;
import com.luo.umengshare.share.core.ShareFactory;
import com.luo.umengshare.share.core.ShareParams;
import com.luo.umengshare.share.util.ShareUtil;
import com.umeng.socialize.controller.listener.SocializeListeners.SnsPostListener;

/**
 * @author owen
 *         分享控制类
 */
public class ShareContorller {

    private static ShareDisplayer shareDisplayer;

    public static void shareWx(Context mContext, ShareParams params) {
        initShareDisplayer();
        shareDisplayer.shareWx(mContext, params);
    }

    public static void shareWxCircle(Context mContext, ShareParams params) {
        initShareDisplayer();
        shareDisplayer.shareWxCircle(mContext, params);
    }

    public static void shareQq(Context mContext, ShareParams params, SnsPostListener callBack) {
        initShareDisplayer();
        shareDisplayer.shareQq(mContext, params, callBack);
    }

    public static void shareQzone(Context mContext, ShareParams params, SnsPostListener callBack) {
        initShareDisplayer();
        shareDisplayer.shareQzone(mContext, params, callBack);
    }

    public static void shareSina(Context mContext, ShareParams params, SnsPostListener callBack) {
        initShareDisplayer();
        shareDisplayer.shareSina(mContext, params, callBack);
    }

    public static void shareSms(Context mContext, ShareParams params, SnsPostListener callBack) {
        initShareDisplayer();
        shareDisplayer.shareSms(mContext, params, callBack);
    }


    private static void initShareDisplayer() {
        try {
            shareDisplayer = ShareFactory.getShareDisplayer(ShareUtil.class);
        } catch (Exception e) {
            e.printStackTrace();
            shareDisplayer = new ShareUtil();
        }
    }

}
