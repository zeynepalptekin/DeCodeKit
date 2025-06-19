package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;

/* loaded from: classes.dex */
final class sq2 extends HandlerThread implements SurfaceTexture.OnFrameAvailableListener, Handler.Callback {
    private final int[] d;
    private Handler e;
    private SurfaceTexture f;
    private Error g;
    private RuntimeException h;
    private qq2 i;

    public sq2() {
        super("dummySurface");
        this.d = new int[1];
    }

    public final void a() {
        this.e.sendEmptyMessage(3);
    }

    public final qq2 b(boolean z) {
        boolean z2;
        start();
        this.e = new Handler(getLooper(), this);
        synchronized (this) {
            z2 = false;
            this.e.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
            while (this.i == null && this.h == null && this.g == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.h;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = this.g;
        if (error == null) {
            return this.i;
        }
        throw error;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int r2 = message.what;
        try {
            if (r2 != 1) {
                if (r2 == 2) {
                    this.f.updateTexImage();
                    return true;
                }
                if (r2 != 3) {
                    return true;
                }
                try {
                    try {
                        this.f.release();
                        this.i = null;
                        this.f = null;
                        GLES20.glDeleteTextures(1, this.d, 0);
                    } catch (Throwable th) {
                        this.i = null;
                        this.f = null;
                        GLES20.glDeleteTextures(1, this.d, 0);
                        throw th;
                    }
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                return true;
            }
            try {
                try {
                    boolean z = message.arg1 != 0;
                    EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
                    vp2.f(eGLDisplayEglGetDisplay != null, "eglGetDisplay failed");
                    int[] r8 = new int[2];
                    vp2.f(EGL14.eglInitialize(eGLDisplayEglGetDisplay, r8, 0, r8, 1), "eglInitialize failed");
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    int[] r12 = new int[1];
                    vp2.f(EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344}, 0, eGLConfigArr, 0, 1, r12, 0) && r12[0] > 0 && eGLConfigArr[0] != null, "eglChooseConfig failed");
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplayEglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, z ? new int[]{12440, 2, 12992, 1, 12344} : new int[]{12440, 2, 12344}, 0);
                    vp2.f(eGLContextEglCreateContext != null, "eglCreateContext failed");
                    EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplayEglGetDisplay, eGLConfig, z ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                    vp2.f(eGLSurfaceEglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
                    vp2.f(EGL14.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext), "eglMakeCurrent failed");
                    GLES20.glGenTextures(1, this.d, 0);
                    SurfaceTexture surfaceTexture = new SurfaceTexture(this.d[0]);
                    this.f = surfaceTexture;
                    surfaceTexture.setOnFrameAvailableListener(this);
                    this.i = new qq2(this, this.f, z);
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e) {
                    Log.e("DummySurface", "Failed to initialize dummy surface", e);
                    this.h = e;
                    synchronized (this) {
                        notify();
                    }
                }
            } catch (Error e2) {
                Log.e("DummySurface", "Failed to initialize dummy surface", e2);
                this.g = e2;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.e.sendEmptyMessage(2);
    }
}
