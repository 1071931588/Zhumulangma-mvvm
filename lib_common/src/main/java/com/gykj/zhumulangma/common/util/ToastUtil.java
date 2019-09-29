package com.gykj.zhumulangma.common.util;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.gykj.zhumulangma.common.App;
import com.gykj.zhumulangma.common.R;
import com.hjq.toast.ToastUtils;

/**
 * Author: Thomas.
 * Date: 2019/8/14 13:41
 * Email: 1071931588@qq.com
 * Description:Toast
 */
public class ToastUtil {

    public  static  final int LEVEL_W=0;
    public  static  final int LEVEL_E=1;
    public static void showToast(String message) {
        TextView tvTip = ToastUtils.getView().findViewById(R.id.tv_tip);
        ToastUtils.getView().findViewById(R.id.iv_icon).setVisibility(View.GONE);
        tvTip.setText(message);
        ToastUtils.show(message);
    }
    public static void showToast(int level,String message) {
       ImageView ivIcon= ToastUtils.getView().findViewById(R.id.iv_icon);
       ivIcon.setVisibility(View.VISIBLE);
        switch (level){
            case LEVEL_W:
                ivIcon.setImageResource(R.drawable.ic_common_warnning);
                break;
            case LEVEL_E:
                ivIcon.setImageResource(R.drawable.ic_common_update_close);
                break;
        }
        TextView tvTip = ToastUtils.getView().findViewById(R.id.tv_tip);
        tvTip.setText(message);
        ToastUtils.show(message);
    }
    public static void showToast(int resid) {
        TextView tvTip = ToastUtils.getView().findViewById(R.id.tv_tip);
        ToastUtils.getView().findViewById(R.id.iv_icon).setVisibility(View.GONE);
        tvTip.setText(App.getInstance().getString(resid));
        ToastUtils.show(resid);
    }
    public static void showToast(int level,int resid) {
        ImageView ivIcon= ToastUtils.getView().findViewById(R.id.iv_icon);
        ivIcon.setVisibility(View.VISIBLE);
        switch (level){
            case LEVEL_W:
                ivIcon.setImageResource(R.drawable.ic_common_warnning);
                break;
            case LEVEL_E:
                ivIcon.setImageResource(R.drawable.ic_common_update_close);
                break;
        }
        TextView tvTip = ToastUtils.getView().findViewById(R.id.tv_tip);
        tvTip.setText(App.getInstance().getString(resid));
        ToastUtils.show(resid);
    }
}