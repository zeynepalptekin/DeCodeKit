package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class cy0 {

    /* renamed from: a, reason: collision with root package name */
    private final cy1 f3046a;

    /* renamed from: b, reason: collision with root package name */
    private final tx0 f3047b;

    /* renamed from: c, reason: collision with root package name */
    private final je2<my0> f3048c;

    public cy0(cy1 cy1Var, tx0 tx0Var, je2<my0> je2Var) {
        this.f3046a = cy1Var;
        this.f3047b = tx0Var;
        this.f3048c = je2Var;
    }

    private final <RetT> dy1<RetT> a(final wi wiVar, ny0<InputStream> ny0Var, final ny0<InputStream> ny0Var2, final ax1<InputStream, RetT> ax1Var) {
        String str = wiVar.g;
        com.google.android.gms.ads.internal.p.c();
        return lx1.H(to.Z(str) ? qx1.a(new dy0(xn1.INTERNAL_ERROR)) : qx1.k(ny0Var.a(wiVar), ExecutionException.class, fy0.f3474a, this.f3046a)).G(ax1Var, this.f3046a).F(dy0.class, new ax1(this, ny0Var2, wiVar, ax1Var) { // from class: com.google.android.gms.internal.ads.ey0

            /* renamed from: a, reason: collision with root package name */
            private final cy0 f3339a;

            /* renamed from: b, reason: collision with root package name */
            private final ny0 f3340b;

            /* renamed from: c, reason: collision with root package name */
            private final wi f3341c;
            private final ax1 d;

            {
                this.f3339a = this;
                this.f3340b = ny0Var2;
                this.f3341c = wiVar;
                this.d = ax1Var;
            }

            @Override // com.google.android.gms.internal.ads.ax1
            public final dy1 a(Object obj) {
                return this.f3339a.b(this.f3340b, this.f3341c, this.d, (dy0) obj);
            }
        }, this.f3046a);
    }

    final /* synthetic */ dy1 b(ny0 ny0Var, wi wiVar, ax1 ax1Var, dy0 dy0Var) throws Exception {
        return qx1.j(ny0Var.a(wiVar), ax1Var, this.f3046a);
    }

    public final dy1<wi> c(final wi wiVar) {
        ax1 ax1Var = new ax1(wiVar) { // from class: com.google.android.gms.internal.ads.hy0

            /* renamed from: a, reason: collision with root package name */
            private final wi f3734a;

            {
                this.f3734a = wiVar;
            }

            @Override // com.google.android.gms.internal.ads.ax1
            public final dy1 a(Object obj) {
                wi wiVar2 = this.f3734a;
                wiVar2.n = new String(hw1.a((InputStream) obj), pu1.f4893c);
                return qx1.g(wiVar2);
            }
        };
        tx0 tx0Var = this.f3047b;
        tx0Var.getClass();
        return a(wiVar, gy0.b(tx0Var), new ny0(this) { // from class: com.google.android.gms.internal.ads.jy0

            /* renamed from: a, reason: collision with root package name */
            private final cy0 f4023a;

            {
                this.f4023a = this;
            }

            @Override // com.google.android.gms.internal.ads.ny0
            public final dy1 a(wi wiVar2) {
                return this.f4023a.g(wiVar2);
            }
        }, ax1Var);
    }

    public final dy1<Void> d(wi wiVar) {
        if (tf2.f(wiVar.n)) {
            return qx1.a(new uv0(xn1.INVALID_REQUEST, "Pool key missing from removeUrl call."));
        }
        return a(wiVar, new ny0(this) { // from class: com.google.android.gms.internal.ads.ly0

            /* renamed from: a, reason: collision with root package name */
            private final cy0 f4317a;

            {
                this.f4317a = this;
            }

            @Override // com.google.android.gms.internal.ads.ny0
            public final dy1 a(wi wiVar2) {
                return this.f4317a.f(wiVar2);
            }
        }, new ny0(this) { // from class: com.google.android.gms.internal.ads.ky0

            /* renamed from: a, reason: collision with root package name */
            private final cy0 f4160a;

            {
                this.f4160a = this;
            }

            @Override // com.google.android.gms.internal.ads.ny0
            public final dy1 a(wi wiVar2) {
                return this.f4160a.e(wiVar2);
            }
        }, iy0.f3885a);
    }

    final /* synthetic */ dy1 e(wi wiVar) {
        return this.f3048c.get().G8(wiVar.n);
    }

    final /* synthetic */ dy1 f(wi wiVar) {
        return this.f3047b.e(wiVar.n);
    }

    final /* synthetic */ dy1 g(wi wiVar) {
        return this.f3048c.get().E8(wiVar, Binder.getCallingUid());
    }
}
