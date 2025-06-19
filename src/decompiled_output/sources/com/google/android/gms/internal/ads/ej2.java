package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class ej2 {
    private static boolean e0 = false;
    private static boolean f0 = false;
    private long A;
    private long B;
    private boolean C;
    private long D;
    private Method E;
    private int F;
    private long G;
    private long H;
    private int I;
    private long J;
    private long K;
    private int L;
    private int M;
    private long N;
    private long O;
    private long P;
    private float Q;
    private ui2[] R;
    private ByteBuffer[] S;
    private ByteBuffer T;
    private ByteBuffer U;
    private byte[] V;
    private int W;
    private int X;
    private boolean Y;
    private boolean Z;
    private int a0;

    /* renamed from: b, reason: collision with root package name */
    private final pj2 f3284b;
    private boolean b0;

    /* renamed from: c, reason: collision with root package name */
    private final vj2 f3285c;
    private boolean c0;
    private final ui2[] d;
    private long d0;
    private final kj2 e;
    private final long[] g;
    private final gj2 h;
    private final LinkedList<nj2> i;
    private AudioTrack j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private int q;
    private long r;
    private ji2 s;
    private ji2 t;
    private long u;
    private long v;
    private ByteBuffer w;
    private int x;
    private int y;
    private int z;

    /* renamed from: a, reason: collision with root package name */
    private final vi2 f3283a = null;
    private final ConditionVariable f = new ConditionVariable(true);

    public ej2(vi2 vi2Var, ui2[] ui2VarArr, kj2 kj2Var) {
        hj2 hj2Var = null;
        this.e = kj2Var;
        if (nq2.f4592a >= 18) {
            try {
                this.E = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (nq2.f4592a >= 19) {
            this.h = new jj2();
        } else {
            this.h = new gj2(hj2Var);
        }
        this.f3284b = new pj2();
        this.f3285c = new vj2();
        ui2[] ui2VarArr2 = new ui2[ui2VarArr.length + 3];
        this.d = ui2VarArr2;
        ui2VarArr2[0] = new tj2();
        ui2[] ui2VarArr3 = this.d;
        ui2VarArr3[1] = this.f3284b;
        System.arraycopy(ui2VarArr, 0, ui2VarArr3, 2, ui2VarArr.length);
        this.d[ui2VarArr.length + 2] = this.f3285c;
        this.g = new long[10];
        this.Q = 1.0f;
        this.M = 0;
        this.o = 3;
        this.a0 = 0;
        this.t = ji2.d;
        this.X = -1;
        this.R = new ui2[0];
        this.S = new ByteBuffer[0];
        this.i = new LinkedList<>();
    }

    private final long A() {
        return this.p ? this.K : this.J / this.I;
    }

    private final void B() {
        this.A = 0L;
        this.z = 0;
        this.y = 0;
        this.B = 0L;
        this.C = false;
        this.D = 0L;
    }

    private final boolean C() {
        if (nq2.f4592a >= 23) {
            return false;
        }
        int r0 = this.n;
        return r0 == 5 || r0 == 6;
    }

    private final boolean a() {
        return this.j != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int k(java.lang.String r5) {
        /*
            int r0 = r5.hashCode()
            r1 = 0
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -1095064472: goto L2a;
                case 187078296: goto L20;
                case 1504578661: goto L16;
                case 1505942594: goto Lc;
                default: goto Lb;
            }
        Lb:
            goto L34
        Lc:
            java.lang.String r0 = "audio/vnd.dts.hd"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L34
            r5 = 3
            goto L35
        L16:
            java.lang.String r0 = "audio/eac3"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L34
            r5 = 1
            goto L35
        L20:
            java.lang.String r0 = "audio/ac3"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L34
            r5 = 0
            goto L35
        L2a:
            java.lang.String r0 = "audio/vnd.dts"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L34
            r5 = 2
            goto L35
        L34:
            r5 = -1
        L35:
            if (r5 == 0) goto L45
            if (r5 == r4) goto L43
            if (r5 == r3) goto L41
            if (r5 == r2) goto L3e
            return r1
        L3e:
            r5 = 8
            return r5
        L41:
            r5 = 7
            return r5
        L43:
            r5 = 6
            return r5
        L45:
            r5 = 5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ej2.k(java.lang.String):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean n(java.nio.ByteBuffer r9, long r10) throws com.google.android.gms.internal.ads.mj2 {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ej2.n(java.nio.ByteBuffer, long):boolean");
    }

    private final void o(long j) throws mj2 {
        ByteBuffer byteBuffer;
        int length = this.R.length;
        int r1 = length;
        while (r1 >= 0) {
            if (r1 > 0) {
                byteBuffer = this.S[r1 - 1];
            } else {
                byteBuffer = this.T;
                if (byteBuffer == null) {
                    byteBuffer = ui2.f5525a;
                }
            }
            if (r1 == length) {
                n(byteBuffer, j);
            } else {
                ui2 ui2Var = this.R[r1];
                ui2Var.g(byteBuffer);
                ByteBuffer byteBufferH = ui2Var.h();
                this.S[r1] = byteBufferH;
                if (byteBufferH.hasRemaining()) {
                    r1++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                r1--;
            }
        }
    }

    private final long p(long j) {
        return (j * 1000000) / this.k;
    }

    private final long q(long j) {
        return (j * this.k) / 1000000;
    }

    private final void s() {
        ArrayList arrayList = new ArrayList();
        for (ui2 ui2Var : this.d) {
            if (ui2Var.d()) {
                arrayList.add(ui2Var);
            } else {
                ui2Var.flush();
            }
        }
        int size = arrayList.size();
        this.R = (ui2[]) arrayList.toArray(new ui2[size]);
        this.S = new ByteBuffer[size];
        for (int r3 = 0; r3 < size; r3++) {
            ui2 ui2Var2 = this.R[r3];
            ui2Var2.flush();
            this.S[r3] = ui2Var2.h();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0032 -> B:8:0x0010). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean v() throws com.google.android.gms.internal.ads.mj2 {
        /*
            r9 = this;
            int r0 = r9.X
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L14
            boolean r0 = r9.p
            if (r0 == 0) goto Lf
            com.google.android.gms.internal.ads.ui2[] r0 = r9.R
            int r0 = r0.length
            goto L10
        Lf:
            r0 = 0
        L10:
            r9.X = r0
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            int r4 = r9.X
            com.google.android.gms.internal.ads.ui2[] r5 = r9.R
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L36
            r4 = r5[r4]
            if (r0 == 0) goto L28
            r4.f()
        L28:
            r9.o(r7)
            boolean r0 = r4.u0()
            if (r0 != 0) goto L32
            return r3
        L32:
            int r0 = r9.X
            int r0 = r0 + r2
            goto L10
        L36:
            java.nio.ByteBuffer r0 = r9.U
            if (r0 == 0) goto L42
            r9.n(r0, r7)
            java.nio.ByteBuffer r0 = r9.U
            if (r0 == 0) goto L42
            return r3
        L42:
            r9.X = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ej2.v():boolean");
    }

    private final void z() {
        if (a()) {
            if (nq2.f4592a >= 21) {
                this.j.setVolume(this.Q);
                return;
            }
            AudioTrack audioTrack = this.j;
            float f = this.Q;
            audioTrack.setStereoVolume(f, f);
        }
    }

    public final long D(boolean z) {
        long jE;
        long j;
        long jC;
        long j2;
        StringBuilder sb;
        String str;
        if (!(a() && this.M != 0)) {
            return Long.MIN_VALUE;
        }
        if (this.j.getPlayState() == 3) {
            long jE2 = this.h.e();
            if (jE2 != 0) {
                long jNanoTime = System.nanoTime() / 1000;
                if (jNanoTime - this.B >= 30000) {
                    long[] jArr = this.g;
                    int r4 = this.y;
                    jArr[r4] = jE2 - jNanoTime;
                    this.y = (r4 + 1) % 10;
                    int r42 = this.z;
                    if (r42 < 10) {
                        this.z = r42 + 1;
                    }
                    this.B = jNanoTime;
                    this.A = 0L;
                    int r1 = 0;
                    while (true) {
                        int r2 = this.z;
                        if (r1 >= r2) {
                            break;
                        }
                        this.A += this.g[r1] / r2;
                        r1++;
                    }
                }
                if (!C() && jNanoTime - this.D >= 500000) {
                    boolean zF = this.h.f();
                    this.C = zF;
                    if (zF) {
                        long jG = this.h.g() / 1000;
                        long jH = this.h.h();
                        if (jG >= this.O) {
                            if (Math.abs(jG - jNanoTime) > 5000000) {
                                sb = new StringBuilder(136);
                                str = "Spurious audio timestamp (system clock mismatch): ";
                            } else if (Math.abs(p(jH) - jE2) > 5000000) {
                                sb = new StringBuilder(138);
                                str = "Spurious audio timestamp (frame position mismatch): ";
                            }
                            sb.append(str);
                            sb.append(jH);
                            sb.append(", ");
                            sb.append(jG);
                            sb.append(", ");
                            sb.append(jNanoTime);
                            sb.append(", ");
                            sb.append(jE2);
                            Log.w("AudioTrack", sb.toString());
                            this.C = false;
                        } else {
                            this.C = false;
                        }
                    }
                    if (this.E != null && !this.p) {
                        try {
                            long jIntValue = (((Integer) r1.invoke(this.j, null)).intValue() * 1000) - this.r;
                            this.P = jIntValue;
                            long jMax = Math.max(jIntValue, 0L);
                            this.P = jMax;
                            if (jMax > 5000000) {
                                StringBuilder sb2 = new StringBuilder(61);
                                sb2.append("Ignoring impossibly large audio latency: ");
                                sb2.append(jMax);
                                Log.w("AudioTrack", sb2.toString());
                                this.P = 0L;
                            }
                        } catch (Exception unused) {
                            this.E = null;
                        }
                    }
                    this.D = jNanoTime;
                }
            }
        }
        long jNanoTime2 = System.nanoTime() / 1000;
        if (this.C) {
            jE = p(this.h.h() + q(jNanoTime2 - (this.h.g() / 1000)));
        } else {
            jE = this.z == 0 ? this.h.e() : jNanoTime2 + this.A;
            if (!z) {
                jE -= this.P;
            }
        }
        long j3 = this.N;
        while (!this.i.isEmpty() && jE >= this.i.getFirst().f4553c) {
            nj2 nj2VarRemove = this.i.remove();
            this.t = nj2VarRemove.f4551a;
            this.v = nj2VarRemove.f4553c;
            this.u = nj2VarRemove.f4552b - this.N;
        }
        if (this.t.f3968a == 1.0f) {
            j2 = (jE + this.u) - this.v;
        } else {
            if (!this.i.isEmpty() || this.f3285c.l() < 1024) {
                j = this.u;
                jC = (long) (this.t.f3968a * (jE - this.v));
            } else {
                j = this.u;
                jC = nq2.c(jE - this.v, this.f3285c.k(), this.f3285c.l());
            }
            j2 = jC + j;
        }
        return j3 + j2;
    }

    public final void E(int r4) throws IllegalStateException {
        vp2.e(nq2.f4592a >= 21);
        if (this.b0 && this.a0 == r4) {
            return;
        }
        this.b0 = true;
        this.a0 = r4;
        e();
    }

    public final void b() {
        this.Z = false;
        if (a()) {
            B();
            this.h.a();
        }
    }

    public final void c() throws IllegalStateException {
        this.Z = true;
        if (a()) {
            this.O = System.nanoTime() / 1000;
            this.j.play();
        }
    }

    public final void d() throws IllegalStateException {
        e();
        for (ui2 ui2Var : this.d) {
            ui2Var.a();
        }
        this.a0 = 0;
        this.Z = false;
    }

    public final void e() throws IllegalStateException {
        if (a()) {
            this.G = 0L;
            this.H = 0L;
            this.J = 0L;
            this.K = 0L;
            this.L = 0;
            ji2 ji2Var = this.s;
            if (ji2Var != null) {
                this.t = ji2Var;
                this.s = null;
            } else if (!this.i.isEmpty()) {
                this.t = this.i.getLast().f4551a;
            }
            this.i.clear();
            this.u = 0L;
            this.v = 0L;
            this.T = null;
            this.U = null;
            int r3 = 0;
            while (true) {
                ui2[] ui2VarArr = this.R;
                if (r3 >= ui2VarArr.length) {
                    break;
                }
                ui2 ui2Var = ui2VarArr[r3];
                ui2Var.flush();
                this.S[r3] = ui2Var.h();
                r3++;
            }
            this.Y = false;
            this.X = -1;
            this.w = null;
            this.x = 0;
            this.M = 0;
            this.P = 0L;
            B();
            if (this.j.getPlayState() == 3) {
                this.j.pause();
            }
            AudioTrack audioTrack = this.j;
            this.j = null;
            this.h.b(null, false);
            this.f.close();
            new hj2(this, audioTrack).start();
        }
    }

    public final void f(int r2) throws IllegalStateException {
        if (this.o == r2) {
            return;
        }
        this.o = r2;
        if (this.b0) {
            return;
        }
        e();
        this.a0 = 0;
    }

    public final void g(float f) {
        if (this.Q != f) {
            this.Q = f;
            z();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.String r8, int r9, int r10, int r11, int r12, int[] r13) throws java.lang.IllegalStateException, com.google.android.gms.internal.ads.ij2 {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ej2.i(java.lang.String, int, int, int, int, int[]):void");
    }

    public final boolean j(String str) {
        vi2 vi2Var = this.f3283a;
        return vi2Var != null && vi2Var.a(k(str));
    }

    public final ji2 l(ji2 ji2Var) {
        if (this.p) {
            ji2 ji2Var2 = ji2.d;
            this.t = ji2Var2;
            return ji2Var2;
        }
        ji2 ji2Var3 = new ji2(this.f3285c.i(ji2Var.f3968a), this.f3285c.j(ji2Var.f3969b));
        ji2 ji2Var4 = this.s;
        if (ji2Var4 == null) {
            ji2Var4 = !this.i.isEmpty() ? this.i.getLast().f4551a : this.t;
        }
        if (!ji2Var3.equals(ji2Var4)) {
            if (a()) {
                this.s = ji2Var3;
            } else {
                this.t = ji2Var3;
            }
        }
        return this.t;
    }

    public final boolean m(ByteBuffer byteBuffer, long j) throws IllegalStateException, lj2, mj2 {
        int r8;
        int r4;
        AudioTrack audioTrack;
        ByteBuffer byteBuffer2 = this.T;
        vp2.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (!a()) {
            this.f.block();
            if (this.b0) {
                audioTrack = new AudioTrack(new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(16).build(), new AudioFormat.Builder().setChannelMask(this.l).setEncoding(this.n).setSampleRate(this.k).build(), this.q, 1, this.a0);
            } else {
                audioTrack = this.a0 == 0 ? new AudioTrack(this.o, this.k, this.l, this.n, this.q, 1) : new AudioTrack(this.o, this.k, this.l, this.n, this.q, 1, this.a0);
            }
            this.j = audioTrack;
            int state = this.j.getState();
            if (state != 1) {
                try {
                    this.j.release();
                } catch (Exception unused) {
                } catch (Throwable th) {
                    this.j = null;
                    throw th;
                }
                this.j = null;
                throw new lj2(state, this.k, this.l, this.q);
            }
            int audioSessionId = this.j.getAudioSessionId();
            if (this.a0 != audioSessionId) {
                this.a0 = audioSessionId;
                this.e.a(audioSessionId);
            }
            this.h.b(this.j, C());
            z();
            this.c0 = false;
            if (this.Z) {
                c();
            }
        }
        if (C()) {
            if (this.j.getPlayState() == 2) {
                this.c0 = false;
                return false;
            }
            if (this.j.getPlayState() == 1 && this.h.d() != 0) {
                return false;
            }
        }
        boolean z = this.c0;
        boolean zW = w();
        this.c0 = zW;
        if (z && !zW && this.j.getPlayState() != 1) {
            this.e.c(this.q, ph2.a(this.r), SystemClock.elapsedRealtime() - this.d0);
        }
        if (this.T == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.p && this.L == 0) {
                int r42 = this.n;
                if (r42 == 7 || r42 == 8) {
                    r4 = oj2.a(byteBuffer);
                } else if (r42 == 5) {
                    r4 = si2.c();
                } else {
                    if (r42 != 6) {
                        StringBuilder sb = new StringBuilder(38);
                        sb.append("Unexpected audio encoding: ");
                        sb.append(r42);
                        throw new IllegalStateException(sb.toString());
                    }
                    r4 = si2.d(byteBuffer);
                }
                this.L = r4;
            }
            if (this.s != null) {
                if (!v()) {
                    return false;
                }
                this.i.add(new nj2(this.s, Math.max(0L, j), p(A()), null));
                this.s = null;
                s();
            }
            if (this.M == 0) {
                this.N = Math.max(0L, j);
                this.M = 1;
            } else {
                long jP = this.N + p(this.p ? this.H : this.G / this.F);
                if (this.M != 1 || Math.abs(jP - j) <= 200000) {
                    r8 = 2;
                } else {
                    StringBuilder sb2 = new StringBuilder(80);
                    sb2.append("Discontinuity detected [expected ");
                    sb2.append(jP);
                    sb2.append(", got ");
                    sb2.append(j);
                    sb2.append("]");
                    Log.e("AudioTrack", sb2.toString());
                    r8 = 2;
                    this.M = 2;
                }
                if (this.M == r8) {
                    this.N += j - jP;
                    this.M = 1;
                    this.e.b();
                }
            }
            if (this.p) {
                this.H += this.L;
            } else {
                this.G += byteBuffer.remaining();
            }
            this.T = byteBuffer;
        }
        if (this.p) {
            n(this.T, j);
        } else {
            o(j);
        }
        if (this.T.hasRemaining()) {
            return false;
        }
        this.T = null;
        return true;
    }

    public final boolean r() {
        if (a()) {
            return this.Y && !w();
        }
        return true;
    }

    public final void t() {
        if (this.M == 1) {
            this.M = 2;
        }
    }

    public final void u() throws mj2 {
        if (!this.Y && a() && v()) {
            this.h.c(A());
            this.x = 0;
            this.Y = true;
        }
    }

    public final boolean w() {
        if (a()) {
            if (A() <= this.h.d()) {
                if (C() && this.j.getPlayState() == 2 && this.j.getPlaybackHeadPosition() == 0) {
                }
            }
            return true;
        }
        return false;
    }

    public final ji2 x() {
        return this.t;
    }

    public final void y() throws IllegalStateException {
        if (this.b0) {
            this.b0 = false;
            this.a0 = 0;
            e();
        }
    }
}
