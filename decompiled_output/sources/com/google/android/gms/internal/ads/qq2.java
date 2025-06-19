package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

@TargetApi(17)
/* loaded from: classes.dex */
public final class qq2 extends Surface {
    private static boolean g;
    private static boolean h;
    private final boolean d;
    private final sq2 e;
    private boolean f;

    private qq2(sq2 sq2Var, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.e = sq2Var;
        this.d = z;
    }

    public static qq2 a(Context context, boolean z) {
        if (nq2.f4592a < 17) {
            throw new UnsupportedOperationException("Unsupported prior to API level 17");
        }
        vp2.e(!z || b(context));
        return new sq2().b(z);
    }

    public static synchronized boolean b(Context context) {
        if (!h) {
            if (nq2.f4592a >= 17) {
                boolean z = false;
                String strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                if (strEglQueryString != null && strEglQueryString.contains("EGL_EXT_protected_content")) {
                    if (!(nq2.f4592a == 24 && (nq2.d.startsWith("SM-G950") || nq2.d.startsWith("SM-G955")) && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance"))) {
                        z = true;
                    }
                }
                g = z;
            }
            h = true;
        }
        return g;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.e) {
            if (!this.f) {
                this.e.a();
                this.f = true;
            }
        }
    }
}
