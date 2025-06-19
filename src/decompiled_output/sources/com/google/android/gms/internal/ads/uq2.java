package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;

@TargetApi(16)
/* loaded from: classes.dex */
public final class uq2 extends nm2 {
    private static final int[] B0 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private int A0;
    private final Context V;
    private final zq2 W;
    private final er2 X;
    private final long Y;
    private final int Z;
    private final boolean a0;
    private final long[] b0;
    private di2[] c0;
    private wq2 d0;
    private Surface e0;
    private Surface f0;
    private int g0;
    private boolean h0;
    private long i0;
    private long j0;
    private int k0;
    private int l0;
    private int m0;
    private float n0;
    private int o0;
    private int p0;
    private int q0;
    private float r0;
    private int s0;
    private int t0;
    private int u0;
    private float v0;
    private boolean w0;
    private int x0;
    ar2 y0;
    private long z0;

    public uq2(Context context, pm2 pm2Var, long j, Handler handler, br2 br2Var, int r17) {
        this(context, pm2Var, 0L, null, false, handler, br2Var, -1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private uq2(Context context, pm2 pm2Var, long j, jk2<lk2> jk2Var, boolean z, Handler handler, br2 br2Var, int r9) {
        super(2, pm2Var, null, false);
        boolean z2 = false;
        this.Y = 0L;
        this.Z = -1;
        this.V = context.getApplicationContext();
        this.W = new zq2(context);
        this.X = new er2(handler, br2Var);
        if (nq2.f4592a <= 22 && "foster".equals(nq2.f4593b) && "NVIDIA".equals(nq2.f4594c)) {
            z2 = true;
        }
        this.a0 = z2;
        this.b0 = new long[10];
        this.z0 = -9223372036854775807L;
        this.i0 = -9223372036854775807L;
        this.o0 = -1;
        this.p0 = -1;
        this.r0 = -1.0f;
        this.n0 = -1.0f;
        this.g0 = 1;
        W();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int L(java.lang.String r7, int r8, int r9) {
        /*
            r0 = -1
            if (r8 == r0) goto L86
            if (r9 != r0) goto L7
            goto L86
        L7:
            int r1 = r7.hashCode()
            r2 = 5
            r3 = 1
            r4 = 3
            r5 = 4
            r6 = 2
            switch(r1) {
                case -1664118616: goto L46;
                case -1662541442: goto L3c;
                case 1187890754: goto L32;
                case 1331836730: goto L28;
                case 1599127256: goto L1e;
                case 1599127257: goto L14;
                default: goto L13;
            }
        L13:
            goto L50
        L14:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L50
            r7 = 5
            goto L51
        L1e:
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L50
            r7 = 3
            goto L51
        L28:
            java.lang.String r1 = "video/avc"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L50
            r7 = 2
            goto L51
        L32:
            java.lang.String r1 = "video/mp4v-es"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L50
            r7 = 1
            goto L51
        L3c:
            java.lang.String r1 = "video/hevc"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L50
            r7 = 4
            goto L51
        L46:
            java.lang.String r1 = "video/3gpp"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L50
            r7 = 0
            goto L51
        L50:
            r7 = -1
        L51:
            if (r7 == 0) goto L7d
            if (r7 == r3) goto L7d
            if (r7 == r6) goto L61
            if (r7 == r4) goto L7d
            if (r7 == r5) goto L5e
            if (r7 == r2) goto L5e
            return r0
        L5e:
            int r8 = r8 * r9
            goto L80
        L61:
            java.lang.String r7 = com.google.android.gms.internal.ads.nq2.d
            java.lang.String r1 = "BRAVIA 4K 2015"
            boolean r7 = r1.equals(r7)
            if (r7 == 0) goto L6c
            return r0
        L6c:
            r7 = 16
            int r8 = com.google.android.gms.internal.ads.nq2.q(r8, r7)
            int r7 = com.google.android.gms.internal.ads.nq2.q(r9, r7)
            int r8 = r8 * r7
            int r7 = r8 << 4
            int r8 = r7 << 4
            goto L7f
        L7d:
            int r8 = r8 * r9
        L7f:
            r5 = 2
        L80:
            int r8 = r8 * 3
            int r5 = r5 * 2
            int r8 = r8 / r5
            return r8
        L86:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.uq2.L(java.lang.String, int, int):int");
    }

    private final void M(MediaCodec mediaCodec, int r2, long j) {
        kq2.a("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(r2, false);
        kq2.b();
        this.T.e++;
    }

    @TargetApi(21)
    private final void N(MediaCodec mediaCodec, int r2, long j, long j2) {
        X();
        kq2.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(r2, j2);
        kq2.b();
        this.T.d++;
        this.l0 = 0;
        V();
    }

    private static boolean O(boolean z, di2 di2Var, di2 di2Var2) {
        if (!di2Var.i.equals(di2Var2.i) || S(di2Var) != S(di2Var2)) {
            return false;
        }
        if (z) {
            return true;
        }
        return di2Var.m == di2Var2.m && di2Var.n == di2Var2.n;
    }

    private final void P(MediaCodec mediaCodec, int r2, long j) {
        X();
        kq2.a("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(r2, true);
        kq2.b();
        this.T.d++;
        this.l0 = 0;
        V();
    }

    private static boolean Q(long j) {
        return j < -30000;
    }

    private static int R(di2 di2Var) {
        int r0 = di2Var.j;
        return r0 != -1 ? r0 : L(di2Var.i, di2Var.m, di2Var.n);
    }

    private static int S(di2 di2Var) {
        int r1 = di2Var.p;
        if (r1 == -1) {
            return 0;
        }
        return r1;
    }

    private final void T() {
        this.i0 = this.Y > 0 ? SystemClock.elapsedRealtime() + this.Y : -9223372036854775807L;
    }

    private final void U() {
        MediaCodec mediaCodecG;
        this.h0 = false;
        if (nq2.f4592a < 23 || !this.w0 || (mediaCodecG = G()) == null) {
            return;
        }
        this.y0 = new ar2(this, mediaCodecG);
    }

    private final void W() {
        this.s0 = -1;
        this.t0 = -1;
        this.v0 = -1.0f;
        this.u0 = -1;
    }

    private final void X() {
        if (this.s0 == this.o0 && this.t0 == this.p0 && this.u0 == this.q0 && this.v0 == this.r0) {
            return;
        }
        this.X.b(this.o0, this.p0, this.q0, this.r0);
        this.s0 = this.o0;
        this.t0 = this.p0;
        this.u0 = this.q0;
        this.v0 = this.r0;
    }

    private final void Y() {
        if (this.s0 == -1 && this.t0 == -1) {
            return;
        }
        this.X.b(this.o0, this.p0, this.q0, this.r0);
    }

    private final void Z() {
        if (this.k0 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.X.h(this.k0, jElapsedRealtime - this.j0);
            this.k0 = 0;
            this.j0 = jElapsedRealtime;
        }
    }

    private final boolean a0(boolean z) {
        if (nq2.f4592a < 23 || this.w0) {
            return false;
        }
        return !z || qq2.b(this.V);
    }

    @Override // com.google.android.gms.internal.ads.nm2
    protected final boolean A(km2 km2Var) {
        return this.e0 != null || a0(km2Var.d);
    }

    @Override // com.google.android.gms.internal.ads.nm2
    protected final void B(String str, long j, long j2) {
        this.X.d(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.nm2
    protected final void C(di2 di2Var) throws sh2 {
        super.C(di2Var);
        this.X.e(di2Var);
        float f = di2Var.q;
        if (f == -1.0f) {
            f = 1.0f;
        }
        this.n0 = f;
        this.m0 = S(di2Var);
    }

    @Override // com.google.android.gms.internal.ads.nm2
    protected final void I() {
        try {
            super.I();
        } finally {
            Surface surface = this.f0;
            if (surface != null) {
                if (this.e0 == surface) {
                    this.e0 = null;
                }
                this.f0.release();
                this.f0 = null;
            }
        }
    }

    final void V() {
        if (this.h0) {
            return;
        }
        this.h0 = true;
        this.X.c(this.e0);
    }

    @Override // com.google.android.gms.internal.ads.nm2, com.google.android.gms.internal.ads.qh2
    protected final void h() {
        super.h();
        this.k0 = 0;
        this.j0 = SystemClock.elapsedRealtime();
        this.i0 = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.nm2, com.google.android.gms.internal.ads.qh2
    protected final void i() {
        Z();
        super.i();
    }

    @Override // com.google.android.gms.internal.ads.nm2, com.google.android.gms.internal.ads.qh2
    protected final void k(long j, boolean z) throws sh2 {
        super.k(j, z);
        U();
        this.l0 = 0;
        int r5 = this.A0;
        if (r5 != 0) {
            this.z0 = this.b0[r5 - 1];
            this.A0 = 0;
        }
        if (z) {
            T();
        } else {
            this.i0 = -9223372036854775807L;
        }
    }

    @Override // com.google.android.gms.internal.ads.qh2
    protected final void l(di2[] di2VarArr, long j) throws sh2 {
        this.c0 = di2VarArr;
        if (this.z0 == -9223372036854775807L) {
            this.z0 = j;
        } else {
            int r0 = this.A0;
            long[] jArr = this.b0;
            if (r0 == jArr.length) {
                long j2 = jArr[r0 - 1];
                StringBuilder sb = new StringBuilder(65);
                sb.append("Too many stream changes, so dropping offset: ");
                sb.append(j2);
                Log.w("MediaCodecVideoRenderer", sb.toString());
            } else {
                this.A0 = r0 + 1;
            }
            this.b0[this.A0 - 1] = j;
        }
        super.l(di2VarArr, j);
    }

    @Override // com.google.android.gms.internal.ads.qh2, com.google.android.gms.internal.ads.th2
    public final void m(int r5, Object obj) throws sh2 {
        if (r5 != 1) {
            if (r5 != 4) {
                super.m(r5, obj);
                return;
            }
            this.g0 = ((Integer) obj).intValue();
            MediaCodec mediaCodecG = G();
            if (mediaCodecG != null) {
                mediaCodecG.setVideoScalingMode(this.g0);
                return;
            }
            return;
        }
        Surface surfaceA = (Surface) obj;
        if (surfaceA == null) {
            Surface surface = this.f0;
            if (surface != null) {
                surfaceA = surface;
            } else {
                km2 km2VarH = H();
                if (km2VarH != null && a0(km2VarH.d)) {
                    surfaceA = qq2.a(this.V, km2VarH.d);
                    this.f0 = surfaceA;
                }
            }
        }
        if (this.e0 == surfaceA) {
            if (surfaceA == null || surfaceA == this.f0) {
                return;
            }
            Y();
            if (this.h0) {
                this.X.c(this.e0);
                return;
            }
            return;
        }
        this.e0 = surfaceA;
        int state = getState();
        if (state == 1 || state == 2) {
            MediaCodec mediaCodecG2 = G();
            if (nq2.f4592a < 23 || mediaCodecG2 == null || surfaceA == null) {
                I();
                F();
            } else {
                mediaCodecG2.setOutputSurface(surfaceA);
            }
        }
        if (surfaceA == null || surfaceA == this.f0) {
            W();
            U();
            return;
        }
        Y();
        U();
        if (state == 2) {
            T();
        }
    }

    @Override // com.google.android.gms.internal.ads.nm2, com.google.android.gms.internal.ads.qh2
    protected final void o(boolean z) throws sh2 {
        super.o(z);
        int r2 = q().f4700a;
        this.x0 = r2;
        this.w0 = r2 != 0;
        this.X.f(this.T);
        this.W.b();
    }

    @Override // com.google.android.gms.internal.ads.nm2, com.google.android.gms.internal.ads.qh2
    protected final void p() {
        this.o0 = -1;
        this.p0 = -1;
        this.r0 = -1.0f;
        this.n0 = -1.0f;
        this.z0 = -9223372036854775807L;
        this.A0 = 0;
        W();
        U();
        this.W.a();
        this.y0 = null;
        this.w0 = false;
        try {
            super.p();
        } finally {
            this.T.a();
            this.X.g(this.T);
        }
    }

    @Override // com.google.android.gms.internal.ads.nm2
    protected final void s(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        this.o0 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        this.p0 = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        this.r0 = this.n0;
        if (nq2.f4592a >= 21) {
            int r8 = this.m0;
            if (r8 == 90 || r8 == 270) {
                int r82 = this.o0;
                this.o0 = this.p0;
                this.p0 = r82;
                this.r0 = 1.0f / this.r0;
            }
        } else {
            this.q0 = this.m0;
        }
        mediaCodec.setVideoScalingMode(this.g0);
    }

    @Override // com.google.android.gms.internal.ads.nm2
    protected final int t(pm2 pm2Var, di2 di2Var) throws sm2 {
        boolean z;
        int r3;
        int r4;
        String str = di2Var.i;
        if (!dq2.b(str)) {
            return 0;
        }
        ek2 ek2Var = di2Var.l;
        if (ek2Var != null) {
            z = false;
            for (int r32 = 0; r32 < ek2Var.f; r32++) {
                z |= ek2Var.a(r32).h;
            }
        } else {
            z = false;
        }
        km2 km2VarA = pm2Var.a(str, z);
        if (km2VarA == null) {
            return 1;
        }
        boolean zG = km2VarA.g(di2Var.f);
        if (zG && (r3 = di2Var.m) > 0 && (r4 = di2Var.n) > 0) {
            if (nq2.f4592a >= 21) {
                zG = km2VarA.b(r3, r4, di2Var.o);
            } else {
                boolean z2 = r3 * r4 <= rm2.g();
                if (!z2) {
                    int r1 = di2Var.m;
                    int r8 = di2Var.n;
                    String str2 = nq2.e;
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 56);
                    sb.append("FalseCheck [legacyFrameSize, ");
                    sb.append(r1);
                    sb.append("x");
                    sb.append(r8);
                    sb.append("] [");
                    sb.append(str2);
                    sb.append("]");
                    Log.d("MediaCodecVideoRenderer", sb.toString());
                }
                zG = z2;
            }
        }
        return (zG ? 3 : 2) | (km2VarA.f4115b ? 8 : 4) | (km2VarA.f4116c ? 16 : 0);
    }

    @Override // com.google.android.gms.internal.ads.nm2, com.google.android.gms.internal.ads.mi2
    public final boolean t0() {
        Surface surface;
        if (super.t0() && (this.h0 || (((surface = this.f0) != null && this.e0 == surface) || G() == null))) {
            this.i0 = -9223372036854775807L;
            return true;
        }
        if (this.i0 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.i0) {
            return true;
        }
        this.i0 = -9223372036854775807L;
        return false;
    }

    @Override // com.google.android.gms.internal.ads.nm2
    protected final void v(bk2 bk2Var) {
        if (nq2.f4592a >= 23 || !this.w0) {
            return;
        }
        V();
    }

    @Override // com.google.android.gms.internal.ads.nm2
    protected final void w(km2 km2Var, MediaCodec mediaCodec, di2 di2Var, MediaCrypto mediaCrypto) throws sm2 {
        wq2 wq2Var;
        Point point;
        di2[] di2VarArr = this.c0;
        int r5 = di2Var.m;
        int r6 = di2Var.n;
        int r7 = R(di2Var);
        if (di2VarArr.length == 1) {
            wq2Var = new wq2(r5, r6, r7);
        } else {
            boolean z = false;
            for (di2 di2Var2 : di2VarArr) {
                if (O(km2Var.f4115b, di2Var, di2Var2)) {
                    z |= di2Var2.m == -1 || di2Var2.n == -1;
                    r5 = Math.max(r5, di2Var2.m);
                    r6 = Math.max(r6, di2Var2.n);
                    r7 = Math.max(r7, R(di2Var2));
                }
            }
            if (z) {
                StringBuilder sb = new StringBuilder(66);
                sb.append("Resolutions unknown. Codec max resolution: ");
                sb.append(r5);
                sb.append("x");
                sb.append(r6);
                Log.w("MediaCodecVideoRenderer", sb.toString());
                boolean z2 = di2Var.n > di2Var.m;
                int r13 = z2 ? di2Var.n : di2Var.m;
                int r14 = z2 ? di2Var.m : di2Var.n;
                float f = r14 / r13;
                int[] r11 = B0;
                int length = r11.length;
                int r9 = 0;
                while (r9 < length) {
                    int r16 = length;
                    int r12 = r11[r9];
                    int[] r17 = r11;
                    int r112 = (int) (r12 * f);
                    if (r12 <= r13 || r112 <= r14) {
                        break;
                    }
                    int r18 = r13;
                    int r19 = r14;
                    if (nq2.f4592a >= 21) {
                        int r132 = z2 ? r112 : r12;
                        if (!z2) {
                            r12 = r112;
                        }
                        Point pointI = km2Var.i(r132, r12);
                        if (km2Var.b(pointI.x, pointI.y, di2Var.o)) {
                            point = pointI;
                            break;
                        }
                        r9++;
                        length = r16;
                        r11 = r17;
                        r13 = r18;
                        r14 = r19;
                    } else {
                        int r122 = nq2.q(r12, 16) << 4;
                        int r113 = nq2.q(r112, 16) << 4;
                        if (r122 * r113 <= rm2.g()) {
                            int r133 = z2 ? r113 : r122;
                            if (!z2) {
                                r122 = r113;
                            }
                            point = new Point(r133, r122);
                        } else {
                            r9++;
                            length = r16;
                            r11 = r17;
                            r13 = r18;
                            r14 = r19;
                        }
                    }
                }
                point = null;
                if (point != null) {
                    r5 = Math.max(r5, point.x);
                    r6 = Math.max(r6, point.y);
                    r7 = Math.max(r7, L(di2Var.i, r5, r6));
                    StringBuilder sb2 = new StringBuilder(57);
                    sb2.append("Codec max resolution adjusted to: ");
                    sb2.append(r5);
                    sb2.append("x");
                    sb2.append(r6);
                    Log.w("MediaCodecVideoRenderer", sb2.toString());
                }
            }
            wq2Var = new wq2(r5, r6, r7);
        }
        this.d0 = wq2Var;
        boolean z3 = this.a0;
        int r62 = this.x0;
        MediaFormat mediaFormatQ = di2Var.q();
        mediaFormatQ.setInteger("max-width", wq2Var.f5878a);
        mediaFormatQ.setInteger("max-height", wq2Var.f5879b);
        int r4 = wq2Var.f5880c;
        if (r4 != -1) {
            mediaFormatQ.setInteger("max-input-size", r4);
        }
        if (z3) {
            mediaFormatQ.setInteger("auto-frc", 0);
        }
        if (r62 != 0) {
            mediaFormatQ.setFeatureEnabled("tunneled-playback", true);
            mediaFormatQ.setInteger("audio-session-id", r62);
        }
        if (this.e0 == null) {
            vp2.e(a0(km2Var.d));
            if (this.f0 == null) {
                this.f0 = qq2.a(this.V, km2Var.d);
            }
            this.e0 = this.f0;
        }
        mediaCodec.configure(mediaFormatQ, this.e0, (MediaCrypto) null, 0);
        if (nq2.f4592a < 23 || !this.w0) {
            return;
        }
        this.y0 = new ar2(this, mediaCodec);
    }

    @Override // com.google.android.gms.internal.ads.nm2
    protected final boolean y(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int r24, int r25, long j3, boolean z) throws InterruptedException {
        while (true) {
            int r0 = this.A0;
            if (r0 == 0) {
                break;
            }
            long[] jArr = this.b0;
            if (j3 < jArr[0]) {
                break;
            }
            this.z0 = jArr[0];
            int r02 = r0 - 1;
            this.A0 = r02;
            System.arraycopy(jArr, 1, jArr, 0, r02);
        }
        long j4 = j3 - this.z0;
        if (z) {
            M(mediaCodec, r24, j4);
            return true;
        }
        long j5 = j3 - j;
        if (this.e0 == this.f0) {
            if (!Q(j5)) {
                return false;
            }
            M(mediaCodec, r24, j4);
            return true;
        }
        if (!this.h0) {
            if (nq2.f4592a >= 21) {
                N(mediaCodec, r24, j4, System.nanoTime());
            } else {
                P(mediaCodec, r24, j4);
            }
            return true;
        }
        if (getState() != 2) {
            return false;
        }
        long jElapsedRealtime = j5 - ((SystemClock.elapsedRealtime() * 1000) - j2);
        long jNanoTime = System.nanoTime();
        long jC = this.W.c(j3, (jElapsedRealtime * 1000) + jNanoTime);
        long j6 = (jC - jNanoTime) / 1000;
        if (!Q(j6)) {
            if (nq2.f4592a >= 21) {
                if (j6 < 50000) {
                    N(mediaCodec, r24, j4, jC);
                    return true;
                }
            } else if (j6 < 30000) {
                if (j6 > 11000) {
                    try {
                        Thread.sleep((j6 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                P(mediaCodec, r24, j4);
                return true;
            }
            return false;
        }
        kq2.a("dropVideoBuffer");
        mediaCodec.releaseOutputBuffer(r24, false);
        kq2.b();
        ck2 ck2Var = this.T;
        ck2Var.f++;
        this.k0++;
        int r1 = this.l0 + 1;
        this.l0 = r1;
        ck2Var.g = Math.max(r1, ck2Var.g);
        if (this.k0 == this.Z) {
            Z();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.nm2
    protected final boolean z(MediaCodec mediaCodec, boolean z, di2 di2Var, di2 di2Var2) {
        if (!O(z, di2Var, di2Var2)) {
            return false;
        }
        int r1 = di2Var2.m;
        wq2 wq2Var = this.d0;
        return r1 <= wq2Var.f5878a && di2Var2.n <= wq2Var.f5879b && di2Var2.j <= wq2Var.f5880c;
    }
}
