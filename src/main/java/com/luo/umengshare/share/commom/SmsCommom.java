
package com.luo.umengshare.share.commom;

import android.content.Context;

import com.luo.umengshare.share.core.ShareParams;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.controller.UMSocialService;
import com.umeng.socialize.controller.listener.SocializeListeners.SnsPostListener;
import com.umeng.socialize.media.SmsShareContent;
import com.umeng.socialize.sso.SmsHandler;

/**
 * @author owen
 *         短信分享操作类
 */
public class SmsCommom {

    private Context mContext;

    public SmsCommom(Context context) {
        mContext = context;
    }

    /**
     * sms分享
     */
    public void sendToSms(final UMSocialService mController, ShareParams params, SnsPostListener callBack) {
        SmsHandler smsHandler = new SmsHandler();
        smsHandler.addToSocialSDK();
        SmsShareContent sms = new SmsShareContent();
        sms.setShareContent(params.getTitle() + " " + params.getContent() + " " + params.getShareUrl());

        mController.setShareMedia(sms);
        mController.postShare(mContext, SHARE_MEDIA.SMS, callBack);
    }

}
