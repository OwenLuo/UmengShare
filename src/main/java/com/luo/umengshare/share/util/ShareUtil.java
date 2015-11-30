package com.luo.umengshare.share.util;

import android.content.Context;

import com.luo.umengshare.share.commom.QQCommom;
import com.luo.umengshare.share.commom.SinaCommom;
import com.luo.umengshare.share.commom.SmsCommom;
import com.luo.umengshare.share.commom.WXCommom;
import com.luo.umengshare.share.core.ShareDisplayer;
import com.luo.umengshare.share.core.ShareParams;
import com.umeng.socialize.bean.RequestType;
import com.umeng.socialize.controller.UMServiceFactory;
import com.umeng.socialize.controller.UMSocialService;
import com.umeng.socialize.controller.listener.SocializeListeners.SnsPostListener;

/**
 * Created by owen on 2015/7/17
 */
public class ShareUtil implements ShareDisplayer {

    private static UMSocialService mController = UMServiceFactory.getUMSocialService(
            "com.umeng.share", RequestType.SOCIAL);
    //mController.getConfig().closeToast();

    @Override
    public void shareWx(Context mContext, ShareParams params) {
        WXCommom wxCommom = new WXCommom(mContext);
        wxCommom.sendToWx(mController, params);
    }

    @Override
    public void shareWxCircle(Context mContext, ShareParams params) {
        WXCommom wxCommom = new WXCommom(mContext);
        wxCommom.sendToWxCircle(mController, params);
    }

    @Override
    public void shareQq(Context mContext, ShareParams params, SnsPostListener callBack) {
        QQCommom qqCommom = new QQCommom(mContext);
        qqCommom.sendToQq(mController, params, callBack);
    }

    @Override
    public void shareQzone(Context mContext, ShareParams params, SnsPostListener callBack) {
        QQCommom qzCommom = new QQCommom(mContext);
        qzCommom.sendToQz(mController, params, callBack);
    }

    @Override
    public void shareSina(Context mContext, ShareParams params, SnsPostListener callBack) {
        SinaCommom sinaCommom = new SinaCommom(mContext);
        sinaCommom.sendToSina(mController, params, callBack);
    }

    @Override
    public void shareSms(Context mContext, ShareParams params, SnsPostListener callBack) {
        SmsCommom smsCommom = new SmsCommom(mContext);
        smsCommom.sendToSms(mController, params, callBack);
    }

}
