
package com.luo.umengshare.share.commom;

import android.content.Context;

import com.luo.umengshare.share.core.ShareParams;
import com.luo.umengshare.share.util.ShareImageUtil;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.controller.UMSocialService;
import com.umeng.socialize.controller.listener.SocializeListeners.SnsPostListener;
import com.umeng.socialize.media.SinaShareContent;
import com.umeng.socialize.media.UMImage;
import com.umeng.socialize.sso.SinaSsoHandler;

/**
 * @author owen
 *         新浪分享操作类
 */
public class SinaCommom {

    private Context mContext;

    public SinaCommom(Context context) {
        mContext = context;
    }

    /**
     * sina分享
     */
    public void sendToSina(final UMSocialService mController, ShareParams params, SnsPostListener callBack) {
        SinaSsoHandler sinahandler = new SinaSsoHandler();
        sinahandler.addToSocialSDK();
        SinaShareContent sina = new SinaShareContent();
        sina.setShareContent(params.getTitle() + " " + params.getContent() + " " + params.getShareUrl());
        UMImage image = new UMImage(mContext, ShareImageUtil.getNetWorkBitmap(mContext,
                params.getImageUrl()));
        sina.setShareImage(image);

        mController.setShareMedia(sina);
        mController.postShare(mContext, SHARE_MEDIA.SINA, callBack);
    }

}
