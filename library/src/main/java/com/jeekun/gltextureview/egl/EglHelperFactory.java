package com.jeekun.gltextureview.egl;

import android.os.Build;

import com.jeekun.gltextureview.GLThread;
import com.jeekun.gltextureview.IEglHelper;


/**
 * Created by jeekun on 2017/8/28.
 */

public class EglHelperFactory {

    public static IEglHelper create(GLThread.EGLConfigChooser configChooser, GLThread.EGLContextFactory eglContextFactory
            , GLThread.EGLWindowSurfaceFactory eglWindowSurfaceFactory) {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            return new EglHelperAPI17(configChooser, eglContextFactory, eglWindowSurfaceFactory);
        } else {
            return new EglHelper(configChooser, eglContextFactory, eglWindowSurfaceFactory);
        }
    }

}
