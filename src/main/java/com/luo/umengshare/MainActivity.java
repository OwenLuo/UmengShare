package com.luo.umengshare;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.luo.umengshare.share.ShareContorller;
import com.luo.umengshare.share.core.ShareParams;

/**
 * Created by owen on 2015/11/30
 */
public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.weixin:
                shareWeixin();
                break;
            case R.id.weixin_circer:
                shareWeixinCircer();
                break;
            case R.id.qq:
                shareQQ();
                break;
            case R.id.qq_zone:
                shareQzone();
                break;
            case R.id.sina_weibo:
                shareSina();
                break;
            case R.id.tenxun_weibo:
                Toast.makeText(MainActivity.this, "未开通", Toast.LENGTH_SHORT).show();
                break;
            case R.id.email:
                Toast.makeText(MainActivity.this, "未开通", Toast.LENGTH_SHORT).show();
                break;
            case R.id.sms:
                shareSms();
                break;
        }
    }

    private void shareWeixin() {
        ShareParams params = new ShareParams();
        params.setTitle("标题");
        params.setContent("内容");
        params.setImageUrl("http://edealdeal.com/upload/images/2015_10_10/17_54_05.jpg");
        params.setShareUrl("www.baidu.com");
        ShareContorller.shareWx(this, params);
    }

    private void shareWeixinCircer() {
        ShareParams params = new ShareParams();
        params.setTitle("标题");
        params.setContent("内容");
        params.setImageUrl("http://edealdeal.com/upload/images/2015_10_10/17_54_05.jpg");
        params.setShareUrl("www.baidu.com");
        ShareContorller.shareWxCircle(this, params);
    }

    private void shareQQ() {
        ShareParams params = new ShareParams();
        params.setTitle("标题");
        params.setContent("内容");
        params.setImageUrl("http://edealdeal.com/upload/images/2015_10_10/17_54_05.jpg");
        params.setShareUrl("www.baidu.com");
        ShareContorller.shareQq(this, params, null);
    }

    private void shareQzone() {
        ShareParams params = new ShareParams();
        params.setTitle("标题");
        params.setContent("内容");
        params.setImageUrl("http://edealdeal.com/upload/images/2015_10_10/17_54_05.jpg");
        params.setShareUrl("www.baidu.com");
        ShareContorller.shareQq(this, params, null);
    }

    private void shareSina() {
        ShareParams params = new ShareParams();
        params.setTitle("标题");
        params.setContent("内容");
        params.setImageUrl("http://edealdeal.com/upload/images/2015_10_10/17_54_05.jpg");
        params.setShareUrl("www.baidu.com");
        ShareContorller.shareSina(this, params, null);
    }

    private void shareSms() {
        ShareParams params = new ShareParams();
        params.setTitle("标题");
        params.setContent("内容");
        params.setImageUrl("http://edealdeal.com/upload/images/2015_10_10/17_54_05.jpg");
        params.setShareUrl("www.baidu.com");
        ShareContorller.shareSms(this, params, null);
    }
}
