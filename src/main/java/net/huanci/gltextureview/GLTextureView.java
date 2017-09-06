package net.huanci.gltextureview;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;

/**
 * Created by jeekun on 2017/8/28.
 */

public class GLTextureView extends BaseGLTextureView {

    public GLTextureView(Context context) {
        super(context);
    }

    public GLTextureView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void onSurfaceTextureAvailable(SurfaceTexture surface, int width, int height) {
        super.onSurfaceTextureAvailable(surface, width, height);
        if (mGLThread == null) {
            createGLThread();
        }
    }
}
