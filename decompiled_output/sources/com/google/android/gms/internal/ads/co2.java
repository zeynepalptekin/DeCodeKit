package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class co2 implements yk2 {

    /* renamed from: a, reason: collision with root package name */
    private final gp2 f3007a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3008b;

    /* renamed from: c, reason: collision with root package name */
    private final ao2 f3009c = new ao2();
    private final do2 d = new do2();
    private final hq2 e = new hq2(32);
    private final AtomicInteger f = new AtomicInteger();
    private fo2 g;
    private fo2 h;
    private di2 i;
    private boolean j;
    private di2 k;
    private long l;
    private int m;
    private eo2 n;

    public co2(gp2 gp2Var) {
        this.f3007a = gp2Var;
        this.f3008b = gp2Var.a();
        int r4 = this.f3008b;
        this.m = r4;
        fo2 fo2Var = new fo2(0L, r4);
        this.g = fo2Var;
        this.h = fo2Var;
    }

    private final void g(long j, byte[] bArr, int r10) {
        k(j);
        int r0 = 0;
        while (r0 < r10) {
            int r2 = (int) (j - this.g.f3428a);
            int r1 = Math.min(r10 - r0, this.f3008b - r2);
            dp2 dp2Var = this.g.d;
            System.arraycopy(dp2Var.f3159a, dp2Var.a(r2), bArr, r0, r1);
            j += r1;
            r0 += r1;
            if (j == this.g.f3429b) {
                this.f3007a.b(dp2Var);
                this.g = this.g.a();
            }
        }
    }

    private final int i(int r7) {
        if (this.m == this.f3008b) {
            this.m = 0;
            fo2 fo2Var = this.h;
            if (fo2Var.f3430c) {
                this.h = fo2Var.e;
            }
            fo2 fo2Var2 = this.h;
            dp2 dp2VarD = this.f3007a.d();
            fo2 fo2Var3 = new fo2(this.h.f3429b, this.f3008b);
            fo2Var2.d = dp2VarD;
            fo2Var2.e = fo2Var3;
            fo2Var2.f3430c = true;
        }
        return Math.min(r7, this.f3008b - this.m);
    }

    private final void k(long j) {
        while (true) {
            fo2 fo2Var = this.g;
            if (j < fo2Var.f3429b) {
                return;
            }
            this.f3007a.b(fo2Var.d);
            this.g = this.g.a();
        }
    }

    private final void m() {
        this.f3009c.g();
        fo2 fo2VarA = this.g;
        if (fo2VarA.f3430c) {
            fo2 fo2Var = this.h;
            boolean z = fo2Var.f3430c;
            int r2 = (z ? 1 : 0) + (((int) (fo2Var.f3428a - fo2VarA.f3428a)) / this.f3008b);
            dp2[] dp2VarArr = new dp2[r2];
            for (int r3 = 0; r3 < r2; r3++) {
                dp2VarArr[r3] = fo2VarA.d;
                fo2VarA = fo2VarA.a();
            }
            this.f3007a.c(dp2VarArr);
        }
        fo2 fo2Var2 = new fo2(0L, this.f3008b);
        this.g = fo2Var2;
        this.h = fo2Var2;
        this.l = 0L;
        this.m = this.f3008b;
        this.f3007a.I();
    }

    private final boolean r() {
        return this.f.compareAndSet(0, 1);
    }

    private final void s() {
        if (this.f.compareAndSet(1, 0)) {
            return;
        }
        m();
    }

    @Override // com.google.android.gms.internal.ads.yk2
    public final int a(pk2 pk2Var, int r5, boolean z) throws InterruptedException, IOException {
        if (!r()) {
            int r4 = pk2Var.b(r5);
            if (r4 != -1) {
                return r4;
            }
            throw new EOFException();
        }
        try {
            int i = i(r5);
            dp2 dp2Var = this.h.d;
            int r42 = pk2Var.read(dp2Var.f3159a, dp2Var.a(this.m), i);
            if (r42 == -1) {
                throw new EOFException();
            }
            this.m += r42;
            this.l += r42;
            return r42;
        } finally {
            s();
        }
    }

    @Override // com.google.android.gms.internal.ads.yk2
    public final void b(long j, int r13, int r14, int r15, xk2 xk2Var) {
        if (!r()) {
            this.f3009c.d(j);
            return;
        }
        try {
            this.f3009c.b(j, r13, (this.l - r14) - r15, r14, xk2Var);
        } finally {
            s();
        }
    }

    @Override // com.google.android.gms.internal.ads.yk2
    public final void c(hq2 hq2Var, int r7) {
        if (!r()) {
            hq2Var.m(r7);
            return;
        }
        while (r7 > 0) {
            int i = i(r7);
            dp2 dp2Var = this.h.d;
            hq2Var.p(dp2Var.f3159a, dp2Var.a(this.m), i);
            this.m += i;
            this.l += i;
            r7 -= i;
        }
        s();
    }

    @Override // com.google.android.gms.internal.ads.yk2
    public final void d(di2 di2Var) {
        di2 di2Var2 = di2Var == null ? null : di2Var;
        boolean zE = this.f3009c.e(di2Var2);
        this.k = di2Var;
        this.j = false;
        eo2 eo2Var = this.n;
        if (eo2Var == null || !zE) {
            return;
        }
        eo2Var.f(di2Var2);
    }

    public final void e() {
        if (this.f.getAndSet(2) == 0) {
            m();
        }
    }

    public final int f(fi2 fi2Var, bk2 bk2Var, boolean z, boolean z2, long j) throws IllegalStateException {
        int r11;
        int r1 = this.f3009c.a(fi2Var, bk2Var, z, z2, this.i, this.d);
        if (r1 == -5) {
            this.i = fi2Var.f3412a;
            return -5;
        }
        if (r1 != -4) {
            if (r1 == -3) {
                return -3;
            }
            throw new IllegalStateException();
        }
        if (!bk2Var.f()) {
            if (bk2Var.d < j) {
                bk2Var.c(Integer.MIN_VALUE);
            }
            if (bk2Var.h()) {
                do2 do2Var = this.d;
                long j2 = do2Var.f3153b;
                this.e.j(1);
                g(j2, this.e.f3710a, 1);
                long j3 = j2 + 1;
                byte b2 = this.e.f3710a[0];
                boolean z3 = (b2 & 128) != 0;
                int r5 = b2 & Byte.MAX_VALUE;
                xj2 xj2Var = bk2Var.f2843b;
                if (xj2Var.f5984a == null) {
                    xj2Var.f5984a = new byte[16];
                }
                g(j3, bk2Var.f2843b.f5984a, r5);
                long j4 = j3 + r5;
                if (z3) {
                    this.e.j(2);
                    g(j4, this.e.f3710a, 2);
                    j4 += 2;
                    r11 = this.e.h();
                } else {
                    r11 = 1;
                }
                int[] r52 = bk2Var.f2843b.d;
                if (r52 == null || r52.length < r11) {
                    r52 = new int[r11];
                }
                int[] r12 = r52;
                int[] r53 = bk2Var.f2843b.e;
                if (r53 == null || r53.length < r11) {
                    r53 = new int[r11];
                }
                int[] r13 = r53;
                if (z3) {
                    int r54 = r11 * 6;
                    this.e.j(r54);
                    g(j4, this.e.f3710a, r54);
                    j4 += r54;
                    this.e.l(0);
                    for (int r7 = 0; r7 < r11; r7++) {
                        r12[r7] = this.e.h();
                        r13[r7] = this.e.v();
                    }
                } else {
                    r12[0] = 0;
                    r13[0] = do2Var.f3152a - ((int) (j4 - do2Var.f3153b));
                }
                xk2 xk2Var = do2Var.d;
                xj2 xj2Var2 = bk2Var.f2843b;
                xj2Var2.a(r11, r12, r13, xk2Var.f5993b, xj2Var2.f5984a, xk2Var.f5992a);
                long j5 = do2Var.f3153b;
                int r4 = (int) (j4 - j5);
                do2Var.f3153b = j5 + r4;
                do2Var.f3152a -= r4;
            }
            bk2Var.i(this.d.f3152a);
            do2 do2Var2 = this.d;
            long j6 = do2Var2.f3153b;
            ByteBuffer byteBuffer = bk2Var.f2844c;
            int r14 = do2Var2.f3152a;
            k(j6);
            while (r14 > 0) {
                int r72 = (int) (j6 - this.g.f3428a);
                int r6 = Math.min(r14, this.f3008b - r72);
                dp2 dp2Var = this.g.d;
                byteBuffer.put(dp2Var.f3159a, dp2Var.a(r72), r6);
                j6 += r6;
                r14 -= r6;
                if (j6 == this.g.f3429b) {
                    this.f3007a.b(dp2Var);
                    this.g = this.g.a();
                }
            }
            k(this.d.f3154c);
        }
        return -4;
    }

    public final void h(eo2 eo2Var) {
        this.n = eo2Var;
    }

    public final boolean j(long j, boolean z) {
        long jC = this.f3009c.c(j, z);
        if (jC == -1) {
            return false;
        }
        k(jC);
        return true;
    }

    public final long l() {
        return this.f3009c.f();
    }

    public final int n() {
        return this.f3009c.i();
    }

    public final boolean o() {
        return this.f3009c.j();
    }

    public final di2 p() {
        return this.f3009c.k();
    }

    public final void q() {
        long jL = this.f3009c.l();
        if (jL != -1) {
            k(jL);
        }
    }

    public final void t(boolean z) {
        int andSet = this.f.getAndSet(z ? 0 : 2);
        m();
        this.f3009c.h();
        if (andSet == 2) {
            this.i = null;
        }
    }
}
