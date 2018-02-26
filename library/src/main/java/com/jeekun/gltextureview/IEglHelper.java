package com.jeekun.gltextureview;


import com.jeekun.gltextureview.egl.EglContextWrapper;

/**
 * Created by jeekun on 2017/8/28.
 */

public interface IEglHelper {

    EglContextWrapper start(EglContextWrapper eglContext);

    boolean createSurface(Object surface);

    int swap();

    void destroySurface();

    void finish();

    void setPresentationTime(long nsecs);
}