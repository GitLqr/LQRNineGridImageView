package com.lqr.ninegridimageview;

import android.content.Context;
import android.widget.ImageView;

/**
 * CSDN_LQR
 * 九宫格图片控件适配器
 */
public abstract class LQRNineGridImageViewAdapter<T> {
    /**
     * 重写该方法，使用任意第三方图片加载工具加载图片
     */
    protected abstract void onDisplayImage(Context context, ImageView imageView, T t);

    /**
     * 重写该方法自定义生成ImageView方式，用于九宫格头像中的一个个图片控件，可以设置ScaleType等属性
     */
    protected ImageView generateImageView(Context context) {
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return imageView;
    }

}
