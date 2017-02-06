package com.lqr;

import android.app.Application;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

/**
 * @创建者 CSDN_LQR
 * @描述 自定义Application类
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initUniversalImageLoader();
    }

    private void initUniversalImageLoader() {
        //初始化ImageLoader
        ImageLoader.getInstance().init(
                ImageLoaderConfiguration.createDefault(getApplicationContext()));
    }

    public static DisplayImageOptions options = new DisplayImageOptions.Builder()//
            .showImageOnLoading(R.mipmap.ic_holding)         //设置图片在下载期间显示的图片
            .showImageForEmptyUri(R.mipmap.ic_error)       //设置图片Uri为空或是错误的时候显示的图片
            .showImageOnFail(R.mipmap.ic_error)            //设置图片加载/解码过程中错误时候显示的图片
            .cacheInMemory(true)                                //设置下载的图片是否缓存在内存中
            .cacheOnDisk(true)                                  //设置下载的图片是否缓存在SD卡中
            .build();                                           //构建完成

}
