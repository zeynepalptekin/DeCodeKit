package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

@TargetApi(16)
/* loaded from: classes.dex */
public final class sj2 extends nm2 implements aq2 {
    private final zi2 V;
    private final ej2 W;
    private boolean X;
    private boolean Y;
    private MediaFormat Z;
    private int a0;
    private int b0;
    private long c0;
    private boolean d0;

    public sj2(pm2 pm2Var) {
        this(pm2Var, null, true);
    }

    private sj2(pm2 pm2Var, jk2<lk2> jk2Var, boolean z) {
        this(pm2Var, null, true, null, null);
    }

    private sj2(pm2 pm2Var, jk2<lk2> jk2Var, boolean z, Handler handler, wi2 wi2Var) {
        this(pm2Var, null, true, null, null, null, new ui2[0]);
    }

    private sj2(pm2 pm2Var, jk2<lk2> jk2Var, boolean z, Handler handler, wi2 wi2Var, vi2 vi2Var, ui2... ui2VarArr) {
        super(1, pm2Var, jk2Var, z);
        this.W = new ej2(null, ui2VarArr, new uj2(this));
        this.V = new zi2(null, null);
    }

    protected static void M(int r0, long j, long j2) {
    }

    static /* synthetic */ boolean N(sj2 sj2Var, boolean z) {
        sj2Var.d0 = true;
        return true;
    }

    private final boolean O(String str) {
        return this.W.j(str);
    }

    protected static void P() {
    }

    protected static void Q(int r0) {
    }

    @Override // com.google.android.gms.internal.ads.nm2
    protected final void B(String str, long j, long j2) {
        this.V.c(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.nm2
    protected final void C(di2 di2Var) throws sh2 {
        super.C(di2Var);
        this.V.d(di2Var);
        this.a0 = "audio/raw".equals(di2Var.i) ? di2Var.w : 2;
        this.b0 = di2Var.u;
    }

    @Override // com.google.android.gms.internal.ads.qh2, com.google.android.gms.internal.ads.mi2
    public final aq2 C0() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.nm2
    protected final void E() throws sh2 {
        try {
            this.W.u();
        } catch (mj2 e) {
            throw sh2.b(e, g());
        }
    }

    @Override // com.google.android.gms.internal.ads.aq2
    public final ji2 b() {
        return this.W.x();
    }

    @Override // com.google.android.gms.internal.ads.aq2
    public final ji2 e(ji2 ji2Var) {
        return this.W.l(ji2Var);
    }

    @Override // com.google.android.gms.internal.ads.aq2
    public final long f() {
        long jD = this.W.D(u0());
        if (jD != Long.MIN_VALUE) {
            if (!this.d0) {
                jD = Math.max(this.c0, jD);
            }
            this.c0 = jD;
            this.d0 = false;
        }
        return this.c0;
    }

    @Override // com.google.android.gms.internal.ads.nm2, com.google.android.gms.internal.ads.qh2
    protected final void h() throws IllegalStateException {
        super.h();
        this.W.c();
    }

    @Override // com.google.android.gms.internal.ads.nm2, com.google.android.gms.internal.ads.qh2
    protected final void i() {
        this.W.b();
        super.i();
    }

    @Override // com.google.android.gms.internal.ads.nm2, com.google.android.gms.internal.ads.qh2
    protected final void k(long j, boolean z) throws IllegalStateException, sh2 {
        super.k(j, z);
        this.W.e();
        this.c0 = j;
        this.d0 = true;
    }

    @Override // com.google.android.gms.internal.ads.qh2, com.google.android.gms.internal.ads.th2
    public final void m(int r2, Object obj) throws IllegalStateException, sh2 {
        if (r2 == 2) {
            this.W.g(((Float) obj).floatValue());
        } else if (r2 != 3) {
            super.m(r2, obj);
        } else {
            this.W.f(((Integer) obj).intValue());
        }
    }

    @Override // com.google.android.gms.internal.ads.nm2, com.google.android.gms.internal.ads.qh2
    protected final void o(boolean z) throws IllegalStateException, sh2 {
        super.o(z);
        this.V.e(this.T);
        int r2 = q().f4700a;
        if (r2 != 0) {
            this.W.E(r2);
        } else {
            this.W.y();
        }
    }

    @Override // com.google.android.gms.internal.ads.nm2, com.google.android.gms.internal.ads.qh2
    protected final void p() {
        try {
            this.W.d();
            try {
                super.p();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.p();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.nm2
    protected final void s(MediaCodec mediaCodec, MediaFormat mediaFormat) throws IllegalStateException, sh2 {
        int[] r10;
        int r11;
        boolean z = this.Z != null;
        String string = z ? this.Z.getString("mime") : "audio/raw";
        if (z) {
            mediaFormat = this.Z;
        }
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (this.Y && integer == 6 && (r11 = this.b0) < 6) {
            r10 = new int[r11];
            for (int r0 = 0; r0 < this.b0; r0++) {
                r10[r0] = r0;
            }
        } else {
            r10 = null;
        }
        try {
            this.W.i(string, integer, integer2, this.a0, 0, r10);
        } catch (ij2 e) {
            throw sh2.b(e, g());
        }
    }

    @Override // com.google.android.gms.internal.ads.nm2
    protected final int t(pm2 pm2Var, di2 di2Var) throws sm2 {
        int r3;
        int r8;
        String str = di2Var.i;
        boolean z = false;
        if (!dq2.a(str)) {
            return 0;
        }
        int r1 = nq2.f4592a >= 21 ? 16 : 0;
        if (O(str) && pm2Var.b() != null) {
            return r1 | 4 | 3;
        }
        km2 km2VarA = pm2Var.a(str, false);
        if (km2VarA == null) {
            return 1;
        }
        if (nq2.f4592a < 21 || (((r3 = di2Var.v) == -1 || km2VarA.d(r3)) && ((r8 = di2Var.u) == -1 || km2VarA.e(r8)))) {
            z = true;
        }
        return r1 | 4 | (z ? 3 : 2);
    }

    @Override // com.google.android.gms.internal.ads.nm2, com.google.android.gms.internal.ads.mi2
    public final boolean t0() {
        return this.W.w() || super.t0();
    }

    @Override // com.google.android.gms.internal.ads.nm2
    protected final km2 u(pm2 pm2Var, di2 di2Var, boolean z) throws sm2 {
        km2 km2VarB;
        if (!O(di2Var.i) || (km2VarB = pm2Var.b()) == null) {
            this.X = false;
            return super.u(pm2Var, di2Var, z);
        }
        this.X = true;
        return km2VarB;
    }

    @Override // com.google.android.gms.internal.ads.nm2, com.google.android.gms.internal.ads.mi2
    public final boolean u0() {
        return super.u0() && this.W.r();
    }

    @Override // com.google.android.gms.internal.ads.nm2
    protected final void w(km2 km2Var, MediaCodec mediaCodec, di2 di2Var, MediaCrypto mediaCrypto) {
        this.Y = nq2.f4592a < 24 && "OMX.SEC.aac.dec".equals(km2Var.f4114a) && "samsung".equals(nq2.f4594c) && (nq2.f4593b.startsWith("zeroflte") || nq2.f4593b.startsWith("herolte") || nq2.f4593b.startsWith("heroqlte"));
        if (!this.X) {
            mediaCodec.configure(di2Var.q(), (Surface) null, (MediaCrypto) null, 0);
            this.Z = null;
            return;
        }
        MediaFormat mediaFormatQ = di2Var.q();
        this.Z = mediaFormatQ;
        mediaFormatQ.setString("mime", "audio/raw");
        mediaCodec.configure(this.Z, (Surface) null, (MediaCrypto) null, 0);
        this.Z.setString("mime", di2Var.i);
    }

    @Override // com.google.android.gms.internal.ads.nm2
    protected final boolean y(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int r7, int r8, long j3, boolean z) throws sh2 {
        if (this.X && (r8 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(r7, false);
            return true;
        }
        if (z) {
            mediaCodec.releaseOutputBuffer(r7, false);
            this.T.e++;
            this.W.t();
            return true;
        }
        try {
            if (!this.W.m(byteBuffer, j3)) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(r7, false);
            this.T.d++;
            return true;
        } catch (lj2 | mj2 e) {
            throw sh2.b(e, g());
        }
    }
}
