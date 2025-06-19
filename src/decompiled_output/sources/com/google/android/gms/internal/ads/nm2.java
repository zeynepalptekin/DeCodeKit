package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

@androidx.annotation.m0(19)
@TargetApi(19)
/* loaded from: classes.dex */
public abstract class nm2 extends qh2 {
    private static final byte[] U = nq2.m("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private ByteBuffer[] E;
    private ByteBuffer[] F;
    private long G;
    private int H;
    private int I;
    private boolean J;
    private boolean K;
    private int L;
    private int M;
    private boolean N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private boolean S;
    protected ck2 T;
    private final pm2 i;
    private final jk2<lk2> j;
    private final boolean k;
    private final bk2 l;
    private final bk2 m;
    private final fi2 n;
    private final List<Long> o;
    private final MediaCodec.BufferInfo p;
    private di2 q;
    private hk2<lk2> r;
    private hk2<lk2> s;
    private MediaCodec t;
    private km2 u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    public nm2(int r3, pm2 pm2Var, jk2<lk2> jk2Var, boolean z) {
        super(r3);
        vp2.e(nq2.f4592a >= 16);
        this.i = (pm2) vp2.d(pm2Var);
        this.j = jk2Var;
        this.k = z;
        this.l = new bk2(0);
        this.m = new bk2(0);
        this.n = new fi2();
        this.o = new ArrayList();
        this.p = new MediaCodec.BufferInfo();
        this.L = 0;
        this.M = 0;
    }

    private final boolean D(long j, long j2) throws sh2 {
        boolean zY;
        boolean z;
        if (this.I < 0) {
            if (this.A && this.O) {
                try {
                    this.I = this.t.dequeueOutputBuffer(this.p, 0L);
                } catch (IllegalStateException unused) {
                    K();
                    if (this.Q) {
                        I();
                    }
                    return false;
                }
            } else {
                this.I = this.t.dequeueOutputBuffer(this.p, 0L);
            }
            int r0 = this.I;
            if (r0 < 0) {
                if (r0 != -2) {
                    if (r0 == -3) {
                        this.F = this.t.getOutputBuffers();
                        return true;
                    }
                    if (this.y && (this.P || this.M == 2)) {
                        K();
                    }
                    return false;
                }
                MediaFormat outputFormat = this.t.getOutputFormat();
                if (this.x && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                    this.D = true;
                } else {
                    if (this.B) {
                        outputFormat.setInteger("channel-count", 1);
                    }
                    s(this.t, outputFormat);
                }
                return true;
            }
            if (this.D) {
                this.D = false;
                this.t.releaseOutputBuffer(r0, false);
                this.I = -1;
                return true;
            }
            MediaCodec.BufferInfo bufferInfo = this.p;
            if ((bufferInfo.flags & 4) != 0) {
                K();
                this.I = -1;
                return false;
            }
            ByteBuffer byteBuffer = this.F[r0];
            if (byteBuffer != null) {
                byteBuffer.position(bufferInfo.offset);
                MediaCodec.BufferInfo bufferInfo2 = this.p;
                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            long j3 = this.p.presentationTimeUs;
            int size = this.o.size();
            int r3 = 0;
            while (true) {
                if (r3 >= size) {
                    z = false;
                    break;
                }
                if (this.o.get(r3).longValue() == j3) {
                    this.o.remove(r3);
                    z = true;
                    break;
                }
                r3++;
            }
            this.J = z;
        }
        if (this.A && this.O) {
            try {
                zY = y(j, j2, this.t, this.F[this.I], this.I, this.p.flags, this.p.presentationTimeUs, this.J);
            } catch (IllegalStateException unused2) {
                K();
                if (this.Q) {
                    I();
                }
                return false;
            }
        } else {
            MediaCodec mediaCodec = this.t;
            ByteBuffer[] byteBufferArr = this.F;
            int r7 = this.I;
            ByteBuffer byteBuffer2 = byteBufferArr[r7];
            MediaCodec.BufferInfo bufferInfo3 = this.p;
            zY = y(j, j2, mediaCodec, byteBuffer2, r7, bufferInfo3.flags, bufferInfo3.presentationTimeUs, this.J);
        }
        if (!zY) {
            return false;
        }
        long j4 = this.p.presentationTimeUs;
        this.I = -1;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean J() throws android.media.MediaCodec.CryptoException, com.google.android.gms.internal.ads.sh2 {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nm2.J():boolean");
    }

    private final void K() throws sh2 {
        if (this.M == 2) {
            I();
            F();
        } else {
            this.Q = true;
            E();
        }
    }

    private final void x(mm2 mm2Var) throws sh2 {
        throw sh2.b(mm2Var, g());
    }

    protected boolean A(km2 km2Var) {
        return true;
    }

    protected void B(String str, long j, long j2) {
    }

    @Override // com.google.android.gms.internal.ads.mi2
    public final void B0(long j, long j2) throws sh2 {
        if (this.Q) {
            E();
            return;
        }
        if (this.q == null) {
            this.m.a();
            int r0 = j(this.n, this.m, true);
            if (r0 != -5) {
                if (r0 == -4) {
                    vp2.e(this.m.f());
                    this.P = true;
                    K();
                    return;
                }
                return;
            }
            C(this.n.f3412a);
        }
        F();
        if (this.t != null) {
            kq2.a("drainAndFeed");
            while (D(j, j2)) {
            }
            while (J()) {
            }
            kq2.b();
        } else {
            n(j);
            this.m.a();
            int r6 = j(this.n, this.m, false);
            if (r6 == -5) {
                C(this.n.f3412a);
            } else if (r6 == -4) {
                vp2.e(this.m.f());
                this.P = true;
                K();
            }
        }
        this.T.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void C(com.google.android.gms.internal.ads.di2 r5) throws com.google.android.gms.internal.ads.sh2 {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.di2 r0 = r4.q
            r4.q = r5
            com.google.android.gms.internal.ads.ek2 r5 = r5.l
            r1 = 0
            if (r0 != 0) goto Lb
            r2 = r1
            goto Ld
        Lb:
            com.google.android.gms.internal.ads.ek2 r2 = r0.l
        Ld:
            boolean r5 = com.google.android.gms.internal.ads.nq2.g(r5, r2)
            r2 = 1
            r5 = r5 ^ r2
            if (r5 == 0) goto L49
            com.google.android.gms.internal.ads.di2 r5 = r4.q
            com.google.android.gms.internal.ads.ek2 r5 = r5.l
            if (r5 == 0) goto L47
            com.google.android.gms.internal.ads.jk2<com.google.android.gms.internal.ads.lk2> r5 = r4.j
            if (r5 == 0) goto L37
            android.os.Looper r1 = android.os.Looper.myLooper()
            com.google.android.gms.internal.ads.di2 r3 = r4.q
            com.google.android.gms.internal.ads.ek2 r3 = r3.l
            com.google.android.gms.internal.ads.hk2 r5 = r5.a(r1, r3)
            r4.s = r5
            com.google.android.gms.internal.ads.hk2<com.google.android.gms.internal.ads.lk2> r1 = r4.r
            if (r5 != r1) goto L49
            com.google.android.gms.internal.ads.jk2<com.google.android.gms.internal.ads.lk2> r1 = r4.j
            r1.b(r5)
            goto L49
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Media requires a DrmSessionManager"
            r5.<init>(r0)
            int r0 = r4.g()
            com.google.android.gms.internal.ads.sh2 r5 = com.google.android.gms.internal.ads.sh2.b(r5, r0)
            throw r5
        L47:
            r4.s = r1
        L49:
            com.google.android.gms.internal.ads.hk2<com.google.android.gms.internal.ads.lk2> r5 = r4.s
            com.google.android.gms.internal.ads.hk2<com.google.android.gms.internal.ads.lk2> r1 = r4.r
            if (r5 != r1) goto L7a
            android.media.MediaCodec r5 = r4.t
            if (r5 == 0) goto L7a
            com.google.android.gms.internal.ads.km2 r1 = r4.u
            boolean r1 = r1.f4115b
            com.google.android.gms.internal.ads.di2 r3 = r4.q
            boolean r5 = r4.z(r5, r1, r0, r3)
            if (r5 == 0) goto L7a
            r4.K = r2
            r4.L = r2
            boolean r5 = r4.x
            if (r5 == 0) goto L76
            com.google.android.gms.internal.ads.di2 r5 = r4.q
            int r1 = r5.m
            int r3 = r0.m
            if (r1 != r3) goto L76
            int r5 = r5.n
            int r0 = r0.n
            if (r5 != r0) goto L76
            goto L77
        L76:
            r2 = 0
        L77:
            r4.C = r2
            return
        L7a:
            boolean r5 = r4.N
            if (r5 == 0) goto L81
            r4.M = r2
            return
        L81:
            r4.I()
            r4.F()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nm2.C(com.google.android.gms.internal.ads.di2):void");
    }

    protected void E() throws sh2 {
    }

    protected final void F() throws sh2 {
        di2 di2Var;
        if (this.t != null || (di2Var = this.q) == null) {
            return;
        }
        hk2<lk2> hk2Var = this.s;
        this.r = hk2Var;
        String str = di2Var.i;
        if (hk2Var != null) {
            int state = hk2Var.getState();
            if (state == 0) {
                throw sh2.b(this.r.b(), g());
            }
            if (state == 3 || state == 4) {
                throw new NoSuchMethodError();
            }
            return;
        }
        if (this.u == null) {
            try {
                this.u = u(this.i, di2Var, false);
            } catch (sm2 e) {
                x(new mm2(this.q, (Throwable) e, false, -49998));
            }
            if (this.u == null) {
                x(new mm2(this.q, (Throwable) null, false, -49999));
            }
        }
        if (A(this.u)) {
            String str2 = this.u.f4114a;
            this.v = nq2.f4592a < 21 && this.q.k.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str2);
            int r1 = nq2.f4592a;
            this.w = r1 < 18 || (r1 == 18 && ("OMX.SEC.avc.dec".equals(str2) || "OMX.SEC.avc.dec.secure".equals(str2))) || (nq2.f4592a == 19 && nq2.d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str2) || "OMX.Exynos.avc.dec.secure".equals(str2)));
            this.x = nq2.f4592a < 24 && ("OMX.Nvidia.h264.decode".equals(str2) || "OMX.Nvidia.h264.decode.secure".equals(str2)) && ("flounder".equals(nq2.f4593b) || "flounder_lte".equals(nq2.f4593b) || "grouper".equals(nq2.f4593b) || "tilapia".equals(nq2.f4593b));
            this.y = nq2.f4592a <= 17 && ("OMX.rk.video_decoder.avc".equals(str2) || "OMX.allwinner.video.decoder.avc".equals(str2));
            this.z = (nq2.f4592a <= 23 && "OMX.google.vorbis.decoder".equals(str2)) || (nq2.f4592a <= 19 && "hb2000".equals(nq2.f4593b) && ("OMX.amlogic.avc.decoder.awesome".equals(str2) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str2)));
            this.A = nq2.f4592a == 21 && "OMX.google.aac.decoder".equals(str2);
            this.B = nq2.f4592a <= 18 && this.q.u == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str2);
            try {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                String strValueOf = String.valueOf(str2);
                kq2.a(strValueOf.length() != 0 ? "createCodec:".concat(strValueOf) : new String("createCodec:"));
                this.t = MediaCodec.createByCodecName(str2);
                kq2.b();
                kq2.a("configureCodec");
                w(this.u, this.t, this.q, null);
                kq2.b();
                kq2.a("startCodec");
                this.t.start();
                kq2.b();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                B(str2, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
                this.E = this.t.getInputBuffers();
                this.F = this.t.getOutputBuffers();
            } catch (Exception e2) {
                x(new mm2(this.q, (Throwable) e2, false, str2));
            }
            this.G = getState() == 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
            this.H = -1;
            this.I = -1;
            this.S = true;
            this.T.f2985a++;
        }
    }

    protected final MediaCodec G() {
        return this.t;
    }

    protected final km2 H() {
        return this.u;
    }

    protected void I() {
        this.G = -9223372036854775807L;
        this.H = -1;
        this.I = -1;
        this.R = false;
        this.J = false;
        this.o.clear();
        this.E = null;
        this.F = null;
        this.u = null;
        this.K = false;
        this.N = false;
        this.v = false;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = false;
        this.B = false;
        this.C = false;
        this.D = false;
        this.O = false;
        this.L = 0;
        this.M = 0;
        this.l.f2844c = null;
        MediaCodec mediaCodec = this.t;
        if (mediaCodec != null) {
            this.T.f2986b++;
            try {
                mediaCodec.stop();
                try {
                    this.t.release();
                    this.t = null;
                    hk2<lk2> hk2Var = this.r;
                    if (hk2Var == null || this.s == hk2Var) {
                        return;
                    }
                    try {
                        this.j.b(hk2Var);
                    } finally {
                    }
                } catch (Throwable th) {
                    this.t = null;
                    hk2<lk2> hk2Var2 = this.r;
                    if (hk2Var2 != null && this.s != hk2Var2) {
                        try {
                            this.j.b(hk2Var2);
                        } finally {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    this.t.release();
                    this.t = null;
                    hk2<lk2> hk2Var3 = this.r;
                    if (hk2Var3 != null && this.s != hk2Var3) {
                        try {
                            this.j.b(hk2Var3);
                        } finally {
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    this.t = null;
                    hk2<lk2> hk2Var4 = this.r;
                    if (hk2Var4 != null && this.s != hk2Var4) {
                        try {
                            this.j.b(hk2Var4);
                        } finally {
                        }
                    }
                    throw th3;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.qh2, com.google.android.gms.internal.ads.li2
    public final int c() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.li2
    public final int d(di2 di2Var) throws sh2 {
        try {
            return t(this.i, di2Var);
        } catch (sm2 e) {
            throw sh2.b(e, g());
        }
    }

    @Override // com.google.android.gms.internal.ads.qh2
    protected void h() {
    }

    @Override // com.google.android.gms.internal.ads.qh2
    protected void i() {
    }

    @Override // com.google.android.gms.internal.ads.qh2
    protected void k(long j, boolean z) throws sh2 {
        this.P = false;
        this.Q = false;
        if (this.t != null) {
            this.G = -9223372036854775807L;
            this.H = -1;
            this.I = -1;
            this.S = true;
            this.R = false;
            this.J = false;
            this.o.clear();
            this.C = false;
            this.D = false;
            if (this.w || ((this.z && this.O) || this.M != 0)) {
                I();
                F();
            } else {
                this.t.flush();
                this.N = false;
            }
            if (!this.K || this.q == null) {
                return;
            }
            this.L = 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.qh2
    protected void o(boolean z) throws sh2 {
        this.T = new ck2();
    }

    @Override // com.google.android.gms.internal.ads.qh2
    protected void p() {
        this.q = null;
        try {
            I();
            try {
                if (this.r != null) {
                    this.j.b(this.r);
                }
                try {
                    if (this.s != null && this.s != this.r) {
                        this.j.b(this.s);
                    }
                } finally {
                }
            } catch (Throwable th) {
                try {
                    if (this.s != null && this.s != this.r) {
                        this.j.b(this.s);
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th2) {
            try {
                if (this.r != null) {
                    this.j.b(this.r);
                }
                try {
                    if (this.s != null && this.s != this.r) {
                        this.j.b(this.s);
                    }
                    throw th2;
                } finally {
                }
            } catch (Throwable th3) {
                try {
                    if (this.s != null && this.s != this.r) {
                        this.j.b(this.s);
                    }
                    throw th3;
                } finally {
                }
            }
        }
    }

    protected void s(MediaCodec mediaCodec, MediaFormat mediaFormat) throws sh2 {
    }

    protected abstract int t(pm2 pm2Var, di2 di2Var) throws sm2;

    @Override // com.google.android.gms.internal.ads.mi2
    public boolean t0() {
        if (this.q == null || this.R) {
            return false;
        }
        if (r() || this.I >= 0) {
            return true;
        }
        return this.G != -9223372036854775807L && SystemClock.elapsedRealtime() < this.G;
    }

    protected km2 u(pm2 pm2Var, di2 di2Var, boolean z) throws sm2 {
        return pm2Var.a(di2Var.i, z);
    }

    @Override // com.google.android.gms.internal.ads.mi2
    public boolean u0() {
        return this.Q;
    }

    protected void v(bk2 bk2Var) {
    }

    protected abstract void w(km2 km2Var, MediaCodec mediaCodec, di2 di2Var, MediaCrypto mediaCrypto) throws sm2;

    protected abstract boolean y(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int r7, int r8, long j3, boolean z) throws sh2;

    protected boolean z(MediaCodec mediaCodec, boolean z, di2 di2Var, di2 di2Var2) {
        return false;
    }
}
