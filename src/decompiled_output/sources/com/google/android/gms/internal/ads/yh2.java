package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
final class yh2 implements rh2 {

    /* renamed from: a, reason: collision with root package name */
    private final mi2[] f6140a;

    /* renamed from: b, reason: collision with root package name */
    private final cp2 f6141b;

    /* renamed from: c, reason: collision with root package name */
    private final zo2 f6142c;
    private final Handler d;
    private final ai2 e;
    private final CopyOnWriteArraySet<uh2> f;
    private final ti2 g;
    private final qi2 h;
    private boolean i;
    private boolean j;
    private int k;
    private int l;
    private int m;
    private int n;
    private boolean o;
    private ni2 p;
    private Object q;
    private ko2 r;
    private zo2 s;
    private ji2 t;
    private ci2 u;
    private int v;
    private int w;
    private long x;

    @SuppressLint({"HandlerLeak"})
    public yh2(mi2[] mi2VarArr, cp2 cp2Var, hi2 hi2Var) {
        String str = nq2.e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26);
        sb.append("Init ExoPlayerLib/2.4.2 [");
        sb.append(str);
        sb.append("]");
        Log.i("ExoPlayerImpl", sb.toString());
        vp2.e(mi2VarArr.length > 0);
        this.f6140a = (mi2[]) vp2.d(mi2VarArr);
        this.f6141b = (cp2) vp2.d(cp2Var);
        this.j = false;
        this.k = 0;
        this.l = 1;
        this.f = new CopyOnWriteArraySet<>();
        this.f6142c = new zo2(new xo2[mi2VarArr.length]);
        this.p = ni2.f4547a;
        this.g = new ti2();
        this.h = new qi2();
        this.r = ko2.d;
        this.s = this.f6142c;
        this.t = ji2.d;
        this.d = new xh2(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        ci2 ci2Var = new ci2(0, 0L);
        this.u = ci2Var;
        this.e = new ai2(mi2VarArr, cp2Var, hi2Var, this.j, 0, this.d, ci2Var, this);
    }

    private final int c() {
        if (this.p.a() || this.m > 0) {
            return this.v;
        }
        this.p.c(this.u.f2975a, this.h, false);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.rh2
    public final long M() {
        if (this.p.a()) {
            return -9223372036854775807L;
        }
        return ph2.a(this.p.d(c(), this.g, false).i);
    }

    @Override // com.google.android.gms.internal.ads.rh2
    public final int M0() {
        return this.l;
    }

    @Override // com.google.android.gms.internal.ads.rh2
    public final void N0(wh2... wh2VarArr) {
        this.e.x(wh2VarArr);
    }

    @Override // com.google.android.gms.internal.ads.rh2
    public final long O0() {
        if (this.p.a() || this.m > 0) {
            return this.x;
        }
        this.p.c(this.u.f2975a, this.h, false);
        return this.h.b() + ph2.a(this.u.d);
    }

    @Override // com.google.android.gms.internal.ads.rh2
    public final boolean P0() {
        return this.j;
    }

    @Override // com.google.android.gms.internal.ads.rh2
    public final void Q0(uh2 uh2Var) {
        this.f.remove(uh2Var);
    }

    @Override // com.google.android.gms.internal.ads.rh2
    public final void R0(wh2... wh2VarArr) {
        this.e.r(wh2VarArr);
    }

    @Override // com.google.android.gms.internal.ads.rh2
    public final int S0() {
        return this.f6140a.length;
    }

    @Override // com.google.android.gms.internal.ads.rh2
    public final void T0(tn2 tn2Var) {
        if (!this.p.a() || this.q != null) {
            this.p = ni2.f4547a;
            this.q = null;
            Iterator<uh2> it = this.f.iterator();
            while (it.hasNext()) {
                it.next().i(this.p, this.q);
            }
        }
        if (this.i) {
            this.i = false;
            this.r = ko2.d;
            this.s = this.f6142c;
            this.f6141b.d(null);
            Iterator<uh2> it2 = this.f.iterator();
            while (it2.hasNext()) {
                it2.next().g(this.r, this.s);
            }
        }
        this.n++;
        this.e.p(tn2Var, true);
    }

    @Override // com.google.android.gms.internal.ads.rh2
    public final void U0(boolean z) {
        if (this.j != z) {
            this.j = z;
            this.e.G(z);
            Iterator<uh2> it = this.f.iterator();
            while (it.hasNext()) {
                it.next().j(z, this.l);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.rh2
    public final void V0(uh2 uh2Var) {
        this.f.add(uh2Var);
    }

    @Override // com.google.android.gms.internal.ads.rh2
    public final long W0() {
        if (this.p.a() || this.m > 0) {
            return this.x;
        }
        this.p.c(this.u.f2975a, this.h, false);
        return this.h.b() + ph2.a(this.u.f2977c);
    }

    @Override // com.google.android.gms.internal.ads.rh2
    public final void X0(long j) {
        int r0 = c();
        if (r0 < 0 || (!this.p.a() && r0 >= this.p.g())) {
            throw new ii2(this.p, r0, j);
        }
        this.m++;
        this.v = r0;
        if (!this.p.a()) {
            this.p.d(r0, this.g, false);
            long jB = this.g.j + (j == -9223372036854775807L ? this.g.h : ph2.b(j));
            long j2 = this.p.c(0, this.h, false).d;
            if (j2 != -9223372036854775807L) {
                int r1 = (jB > j2 ? 1 : (jB == j2 ? 0 : -1));
            }
        }
        this.w = 0;
        if (j == -9223372036854775807L) {
            this.x = 0L;
            this.e.o(this.p, r0, -9223372036854775807L);
            return;
        }
        this.x = j;
        this.e.o(this.p, r0, ph2.b(j));
        Iterator<uh2> it = this.f.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    @Override // com.google.android.gms.internal.ads.rh2
    public final void a() {
        this.e.b();
        this.d.removeCallbacksAndMessages(null);
    }

    final void b(Message message) {
        switch (message.what) {
            case 0:
                this.n--;
                return;
            case 1:
                this.l = message.arg1;
                Iterator<uh2> it = this.f.iterator();
                while (it.hasNext()) {
                    it.next().j(this.j, this.l);
                }
                return;
            case 2:
                this.o = message.arg1 != 0;
                Iterator<uh2> it2 = this.f.iterator();
                while (it2.hasNext()) {
                    it2.next().h(this.o);
                }
                return;
            case 3:
                if (this.n == 0) {
                    ep2 ep2Var = (ep2) message.obj;
                    this.i = true;
                    this.r = ep2Var.f3304a;
                    this.s = ep2Var.f3305b;
                    this.f6141b.d(ep2Var.f3306c);
                    Iterator<uh2> it3 = this.f.iterator();
                    while (it3.hasNext()) {
                        it3.next().g(this.r, this.s);
                    }
                    return;
                }
                return;
            case 4:
                int r0 = this.m - 1;
                this.m = r0;
                if (r0 == 0) {
                    this.u = (ci2) message.obj;
                    if (message.arg1 != 0) {
                        Iterator<uh2> it4 = this.f.iterator();
                        while (it4.hasNext()) {
                            it4.next().b();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (this.m == 0) {
                    this.u = (ci2) message.obj;
                    Iterator<uh2> it5 = this.f.iterator();
                    while (it5.hasNext()) {
                        it5.next().b();
                    }
                    return;
                }
                return;
            case 6:
                ei2 ei2Var = (ei2) message.obj;
                this.m -= ei2Var.d;
                if (this.n == 0) {
                    this.p = ei2Var.f3274a;
                    this.q = ei2Var.f3275b;
                    this.u = ei2Var.f3276c;
                    Iterator<uh2> it6 = this.f.iterator();
                    while (it6.hasNext()) {
                        it6.next().i(this.p, this.q);
                    }
                    return;
                }
                return;
            case 7:
                ji2 ji2Var = (ji2) message.obj;
                if (this.t.equals(ji2Var)) {
                    return;
                }
                this.t = ji2Var;
                Iterator<uh2> it7 = this.f.iterator();
                while (it7.hasNext()) {
                    it7.next().c(ji2Var);
                }
                return;
            case 8:
                sh2 sh2Var = (sh2) message.obj;
                Iterator<uh2> it8 = this.f.iterator();
                while (it8.hasNext()) {
                    it8.next().e(sh2Var);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.google.android.gms.internal.ads.rh2
    public final void stop() {
        this.e.g();
    }
}
