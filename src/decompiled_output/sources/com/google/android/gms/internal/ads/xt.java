package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

@TargetApi(14)
/* loaded from: classes.dex */
public final class xt extends Thread implements SurfaceTexture.OnFrameAvailableListener, yt {
    private static final float[] E = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};
    private EGLContext A;
    private EGLSurface B;
    private volatile boolean C;
    private volatile boolean D;
    private final wt d;
    private final float[] e;
    private final float[] f;
    private final float[] g;
    private final float[] h;
    private final float[] i;
    private final float[] j;
    private final float[] k;
    private float l;
    private float m;
    private float n;
    private int o;
    private int p;
    private SurfaceTexture q;
    private SurfaceTexture r;
    private int s;
    private int t;
    private int u;
    private FloatBuffer v;
    private final CountDownLatch w;
    private final Object x;
    private EGL10 y;
    private EGLDisplay z;

    public xt(Context context) {
        super("SphericalVideoProcessor");
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(E.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.v = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(E).position(0);
        this.e = new float[9];
        this.f = new float[9];
        this.g = new float[9];
        this.h = new float[9];
        this.i = new float[9];
        this.j = new float[9];
        this.k = new float[9];
        this.l = Float.NaN;
        wt wtVar = new wt(context);
        this.d = wtVar;
        wtVar.c(this);
        this.w = new CountDownLatch(1);
        this.x = new Object();
    }

    private static void c(float[] fArr, float f) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d = f;
        fArr[4] = (float) Math.cos(d);
        fArr[5] = (float) (-Math.sin(d));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d);
        fArr[8] = (float) Math.cos(d);
    }

    private static void d(float[] fArr, float[] fArr2, float[] fArr3) {
        fArr[0] = (fArr2[0] * fArr3[0]) + (fArr2[1] * fArr3[3]) + (fArr2[2] * fArr3[6]);
        fArr[1] = (fArr2[0] * fArr3[1]) + (fArr2[1] * fArr3[4]) + (fArr2[2] * fArr3[7]);
        fArr[2] = (fArr2[0] * fArr3[2]) + (fArr2[1] * fArr3[5]) + (fArr2[2] * fArr3[8]);
        fArr[3] = (fArr2[3] * fArr3[0]) + (fArr2[4] * fArr3[3]) + (fArr2[5] * fArr3[6]);
        fArr[4] = (fArr2[3] * fArr3[1]) + (fArr2[4] * fArr3[4]) + (fArr2[5] * fArr3[7]);
        fArr[5] = (fArr2[3] * fArr3[2]) + (fArr2[4] * fArr3[5]) + (fArr2[5] * fArr3[8]);
        fArr[6] = (fArr2[6] * fArr3[0]) + (fArr2[7] * fArr3[3]) + (fArr2[8] * fArr3[6]);
        fArr[7] = (fArr2[6] * fArr3[1]) + (fArr2[7] * fArr3[4]) + (fArr2[8] * fArr3[7]);
        fArr[8] = (fArr2[6] * fArr3[2]) + (fArr2[7] * fArr3[5]) + (fArr2[8] * fArr3[8]);
    }

    private static void f(float[] fArr, float f) {
        double d = f;
        fArr[0] = (float) Math.cos(d);
        fArr[1] = (float) (-Math.sin(d));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d);
        fArr[4] = (float) Math.cos(d);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    private static int g(int r3, String str) {
        int r0 = GLES20.glCreateShader(r3);
        h("createShader");
        if (r0 == 0) {
            return r0;
        }
        GLES20.glShaderSource(r0, str);
        h("shaderSource");
        GLES20.glCompileShader(r0);
        h("compileShader");
        int[] r4 = new int[1];
        GLES20.glGetShaderiv(r0, 35713, r4, 0);
        h("getShaderiv");
        if (r4[0] != 0) {
            return r0;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Could not compile shader ");
        sb.append(r3);
        sb.append(":");
        Log.e("SphericalVideoRenderer", sb.toString());
        Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(r0));
        GLES20.glDeleteShader(r0);
        h("deleteShader");
        return 0;
    }

    private static void h(String str) {
        int r0 = GLES20.glGetError();
        if (r0 != 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21);
            sb.append(str);
            sb.append(": glError ");
            sb.append(r0);
            Log.e("SphericalVideoRenderer", sb.toString());
        }
    }

    @com.google.android.gms.common.util.d0
    private final boolean l() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.B;
        boolean zEglDestroyContext = false;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            zEglDestroyContext = this.y.eglDestroySurface(this.z, this.B) | this.y.eglMakeCurrent(this.z, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT) | false;
            this.B = null;
        }
        EGLContext eGLContext = this.A;
        if (eGLContext != null) {
            zEglDestroyContext |= this.y.eglDestroyContext(this.z, eGLContext);
            this.A = null;
        }
        EGLDisplay eGLDisplay = this.z;
        if (eGLDisplay == null) {
            return zEglDestroyContext;
        }
        boolean zEglTerminate = zEglDestroyContext | this.y.eglTerminate(eGLDisplay);
        this.z = null;
        return zEglTerminate;
    }

    @Override // com.google.android.gms.internal.ads.yt
    public final void a() {
        synchronized (this.x) {
            this.x.notifyAll();
        }
    }

    public final void b(SurfaceTexture surfaceTexture, int r2, int r3) {
        this.p = r2;
        this.o = r3;
        this.r = surfaceTexture;
    }

    public final void e(float f, float f2) {
        float f3;
        float f4;
        float f5;
        int r0 = this.p;
        int r1 = this.o;
        float f6 = f * 1.7453293f;
        if (r0 > r1) {
            f3 = f6 / r0;
            f4 = f2 * 1.7453293f;
            f5 = r0;
        } else {
            f3 = f6 / r1;
            f4 = f2 * 1.7453293f;
            f5 = r1;
        }
        this.m -= f3;
        float f7 = this.n - (f4 / f5);
        this.n = f7;
        if (f7 < -1.5707964f) {
            this.n = -1.5707964f;
        }
        if (this.n > 1.5707964f) {
            this.n = 1.5707964f;
        }
    }

    public final void i(int r2, int r3) {
        synchronized (this.x) {
            this.p = r2;
            this.o = r3;
            this.C = true;
            this.x.notifyAll();
        }
    }

    public final void j() {
        synchronized (this.x) {
            this.D = true;
            this.r = null;
            this.x.notifyAll();
        }
    }

    public final SurfaceTexture k() throws InterruptedException {
        if (this.r == null) {
            return null;
        }
        try {
            this.w.await();
        } catch (InterruptedException unused) {
        }
        return this.q;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.u++;
        synchronized (this.x) {
            this.x.notifyAll();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1024
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xt.run():void");
    }
}
