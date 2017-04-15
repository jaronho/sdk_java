package com.jaronho.sdk.third.okhttpwrap.callback;

import com.jaronho.sdk.third.okhttpwrap.HttpInfo;

import java.io.IOException;

/**
 * 异步请求回调接口
 */

public interface CallbackOk {
    /**
     * 该回调方法已切换到UI线程
     */
    void onResponse(HttpInfo info) throws IOException;
}
