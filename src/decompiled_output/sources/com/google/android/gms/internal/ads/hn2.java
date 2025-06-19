package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import java.io.IOException;

/* loaded from: classes.dex */
final class hn2 implements ok2, rn2, eo2, sp2<on2> {
    private ko2 A;
    private long B;
    private boolean[] C;
    private boolean[] D;
    private boolean E;
    private long G;
    private int I;
    private boolean J;
    private boolean K;
    private final Uri d;
    private final ip2 e;
    private final int f;
    private final Handler g;
    private final sn2 h;
    private final xn2 i;
    private final gp2 j;
    private final String k;
    private final long l;
    private final nn2 n;
    private vn2 t;
    private wk2 u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private int z;
    private final pp2 m = new pp2("Loader:ExtractorMediaPeriod");
    private final yp2 o = new yp2();
    private final Runnable p = new kn2(this);
    private final Runnable q = new jn2(this);
    private final Handler r = new Handler();
    private long H = -9223372036854775807L;
    private final SparseArray<co2> s = new SparseArray<>();
    private long F = -1;

    public hn2(Uri uri, ip2 ip2Var, mk2[] mk2VarArr, int r4, Handler handler, sn2 sn2Var, xn2 xn2Var, gp2 gp2Var, String str, int r10) {
        this.d = uri;
        this.e = ip2Var;
        this.f = r4;
        this.g = handler;
        this.h = sn2Var;
        this.i = xn2Var;
        this.j = gp2Var;
        this.k = str;
        this.l = r10;
        this.n = new nn2(mk2VarArr, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G() {
        if (this.K || this.w || this.u == null || !this.v) {
            return;
        }
        int size = this.s.size();
        for (int r2 = 0; r2 < size; r2++) {
            if (this.s.valueAt(r2).p() == null) {
                return;
            }
        }
        this.o.c();
        lo2[] lo2VarArr = new lo2[size];
        this.D = new boolean[size];
        this.C = new boolean[size];
        this.B = this.u.g();
        int r3 = 0;
        while (true) {
            boolean z = true;
            if (r3 >= size) {
                this.A = new ko2(lo2VarArr);
                this.w = true;
                this.i.d(new io2(this.B, this.u.c()), null);
                this.t.c(this);
                return;
            }
            di2 di2VarP = this.s.valueAt(r3).p();
            lo2VarArr[r3] = new lo2(di2VarP);
            String str = di2VarP.i;
            if (!dq2.b(str) && !dq2.a(str)) {
                z = false;
            }
            this.D[r3] = z;
            this.E = z | this.E;
            r3++;
        }
    }

    private final int H() {
        int size = this.s.size();
        int r2 = 0;
        for (int r1 = 0; r1 < size; r1++) {
            r2 += this.s.valueAt(r1).n();
        }
        return r2;
    }

    private final long I() {
        int size = this.s.size();
        long jMax = Long.MIN_VALUE;
        for (int r3 = 0; r3 < size; r3++) {
            jMax = Math.max(jMax, this.s.valueAt(r3).l());
        }
        return jMax;
    }

    private final boolean J() {
        return this.H != -9223372036854775807L;
    }

    private final void s() {
        wk2 wk2Var;
        on2 on2Var = new on2(this, this.d, this.e, this.n, this.o);
        if (this.w) {
            vp2.e(J());
            long j = this.B;
            if (j != -9223372036854775807L && this.H >= j) {
                this.J = true;
                this.H = -9223372036854775807L;
                return;
            } else {
                on2Var.e(this.u.b(this.H), this.H);
                this.H = -9223372036854775807L;
            }
        }
        this.I = H();
        int r0 = this.f;
        if (r0 == -1) {
            r0 = (this.w && this.F == -1 && ((wk2Var = this.u) == null || wk2Var.g() == -9223372036854775807L)) ? 6 : 3;
        }
        this.m.b(on2Var, this, r0);
    }

    private final void v(on2 on2Var) {
        if (this.F == -1) {
            this.F = on2Var.i;
        }
    }

    final void A(int r4, long j) {
        co2 co2VarValueAt = this.s.valueAt(r4);
        if (!this.J || j <= co2VarValueAt.l()) {
            co2VarValueAt.j(j, true);
        } else {
            co2VarValueAt.q();
        }
    }

    final void F() throws IOException {
        this.m.h(Integer.MIN_VALUE);
    }

    @Override // com.google.android.gms.internal.ads.rn2, com.google.android.gms.internal.ads.go2
    public final long a() {
        if (this.z == 0) {
            return Long.MIN_VALUE;
        }
        return n();
    }

    @Override // com.google.android.gms.internal.ads.rn2, com.google.android.gms.internal.ads.go2
    public final boolean b(long j) {
        if (this.J) {
            return false;
        }
        if (this.w && this.z == 0) {
            return false;
        }
        boolean zB = this.o.b();
        if (this.m.a()) {
            return zB;
        }
        s();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.sp2
    public final /* synthetic */ int c(up2 up2Var, long j, long j2, IOException iOException) {
        wk2 wk2Var;
        on2 on2Var = (on2) up2Var;
        v(on2Var);
        Handler handler = this.g;
        if (handler != null && this.h != null) {
            handler.post(new ln2(this, iOException));
        }
        if (iOException instanceof no2) {
            return 3;
        }
        boolean z = H() > this.I;
        if (this.F == -1 && ((wk2Var = this.u) == null || wk2Var.g() == -9223372036854775807L)) {
            this.G = 0L;
            this.y = this.w;
            int size = this.s.size();
            for (int r10 = 0; r10 < size; r10++) {
                this.s.valueAt(r10).t(!this.w || this.C[r10]);
            }
            on2Var.e(0L, 0L);
        }
        this.I = H();
        return z ? 1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.rn2
    public final void d(vn2 vn2Var, long j) {
        this.t = vn2Var;
        this.o.b();
        s();
    }

    @Override // com.google.android.gms.internal.ads.rn2
    public final void e(long j) {
    }

    @Override // com.google.android.gms.internal.ads.eo2
    public final void f(di2 di2Var) {
        this.r.post(this.p);
    }

    @Override // com.google.android.gms.internal.ads.rn2
    public final long g(xo2[] xo2VarArr, boolean[] zArr, ho2[] ho2VarArr, boolean[] zArr2, long j) {
        vp2.e(this.w);
        for (int r1 = 0; r1 < xo2VarArr.length; r1++) {
            if (ho2VarArr[r1] != null && (xo2VarArr[r1] == null || !zArr[r1])) {
                int r2 = ((qn2) ho2VarArr[r1]).f5041a;
                vp2.e(this.C[r2]);
                this.z--;
                this.C[r2] = false;
                this.s.valueAt(r2).e();
                ho2VarArr[r1] = null;
            }
        }
        boolean z = false;
        for (int r7 = 0; r7 < xo2VarArr.length; r7++) {
            if (ho2VarArr[r7] == null && xo2VarArr[r7] != null) {
                xo2 xo2Var = xo2VarArr[r7];
                vp2.e(xo2Var.length() == 1);
                vp2.e(xo2Var.c(0) == 0);
                int r12 = this.A.a(xo2Var.a());
                vp2.e(!this.C[r12]);
                this.z++;
                this.C[r12] = true;
                ho2VarArr[r7] = new qn2(this, r12);
                zArr2[r7] = true;
                z = true;
            }
        }
        if (!this.x) {
            int size = this.s.size();
            for (int r72 = 0; r72 < size; r72++) {
                if (!this.C[r72]) {
                    this.s.valueAt(r72).e();
                }
            }
        }
        if (this.z == 0) {
            this.y = false;
            if (this.m.a()) {
                this.m.i();
            }
        } else if (!this.x ? j != 0 : z) {
            j = o(j);
            for (int r0 = 0; r0 < ho2VarArr.length; r0++) {
                if (ho2VarArr[r0] != null) {
                    zArr2[r0] = true;
                }
            }
        }
        this.x = true;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.rn2
    public final long h() {
        if (!this.y) {
            return -9223372036854775807L;
        }
        this.y = false;
        return this.G;
    }

    @Override // com.google.android.gms.internal.ads.sp2
    public final /* synthetic */ void i(up2 up2Var, long j, long j2, boolean z) {
        v((on2) up2Var);
        if (z || this.z <= 0) {
            return;
        }
        int size = this.s.size();
        for (int r2 = 0; r2 < size; r2++) {
            this.s.valueAt(r2).t(this.C[r2]);
        }
        this.t.f(this);
    }

    @Override // com.google.android.gms.internal.ads.rn2
    public final void j() throws IOException {
        this.m.h(Integer.MIN_VALUE);
    }

    @Override // com.google.android.gms.internal.ads.ok2
    public final yk2 k(int r2, int r3) {
        co2 co2Var = this.s.get(r2);
        if (co2Var != null) {
            return co2Var;
        }
        co2 co2Var2 = new co2(this.j);
        co2Var2.h(this);
        this.s.put(r2, co2Var2);
        return co2Var2;
    }

    @Override // com.google.android.gms.internal.ads.ok2
    public final void l(wk2 wk2Var) {
        this.u = wk2Var;
        this.r.post(this.p);
    }

    @Override // com.google.android.gms.internal.ads.ok2
    public final void m() {
        this.v = true;
        this.r.post(this.p);
    }

    @Override // com.google.android.gms.internal.ads.rn2
    public final long n() {
        long jI;
        if (this.J) {
            return Long.MIN_VALUE;
        }
        if (J()) {
            return this.H;
        }
        if (this.E) {
            jI = Long.MAX_VALUE;
            int size = this.s.size();
            for (int r5 = 0; r5 < size; r5++) {
                if (this.D[r5]) {
                    jI = Math.min(jI, this.s.valueAt(r5).l());
                }
            }
        } else {
            jI = I();
        }
        return jI == Long.MIN_VALUE ? this.G : jI;
    }

    @Override // com.google.android.gms.internal.ads.rn2
    public final long o(long j) {
        if (!this.u.c()) {
            j = 0;
        }
        this.G = j;
        int size = this.s.size();
        boolean zJ = !J();
        for (int r3 = 0; zJ && r3 < size; r3++) {
            if (this.C[r3]) {
                zJ = this.s.valueAt(r3).j(j, false);
            }
        }
        if (!zJ) {
            this.H = j;
            this.J = false;
            if (this.m.a()) {
                this.m.i();
            } else {
                for (int r1 = 0; r1 < size; r1++) {
                    this.s.valueAt(r1).t(this.C[r1]);
                }
            }
        }
        this.y = false;
        return j;
    }

    @Override // com.google.android.gms.internal.ads.sp2
    public final /* synthetic */ void p(up2 up2Var, long j, long j2) {
        v((on2) up2Var);
        this.J = true;
        if (this.B == -9223372036854775807L) {
            long jI = I();
            this.B = jI == Long.MIN_VALUE ? 0L : jI + 10000;
            this.i.d(new io2(this.B, this.u.c()), null);
        }
        this.t.f(this);
    }

    @Override // com.google.android.gms.internal.ads.rn2
    public final ko2 q() {
        return this.A;
    }

    public final void r() {
        this.m.f(new mn2(this, this.n));
        this.r.removeCallbacksAndMessages(null);
        this.K = true;
    }

    final int t(int r8, fi2 fi2Var, bk2 bk2Var, boolean z) {
        if (this.y || J()) {
            return -3;
        }
        return this.s.valueAt(r8).f(fi2Var, bk2Var, z, this.J, this.G);
    }

    final boolean x(int r2) {
        if (this.J) {
            return true;
        }
        return !J() && this.s.valueAt(r2).o();
    }
}
