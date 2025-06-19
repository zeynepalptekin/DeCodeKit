package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class xv0 {

    /* renamed from: a, reason: collision with root package name */
    private final cy1 f6044a;

    /* renamed from: b, reason: collision with root package name */
    private final cy1 f6045b;

    /* renamed from: c, reason: collision with root package name */
    private final jx0 f6046c;
    private final je2<my0> d;

    public xv0(cy1 cy1Var, cy1 cy1Var2, jx0 jx0Var, je2<my0> je2Var) {
        this.f6044a = cy1Var;
        this.f6045b = cy1Var2;
        this.f6046c = jx0Var;
        this.d = je2Var;
    }

    final /* synthetic */ dy1 a(wi wiVar, int r2, dy0 dy0Var) throws Exception {
        return this.d.get().D8(wiVar, r2);
    }

    public final dy1<InputStream> b(final wi wiVar) {
        String str = wiVar.g;
        com.google.android.gms.ads.internal.p.c();
        dy1 dy1VarA = to.Z(str) ? qx1.a(new dy0(xn1.INTERNAL_ERROR)) : qx1.k(this.f6044a.submit(new Callable(this, wiVar) { // from class: com.google.android.gms.internal.ads.wv0

            /* renamed from: a, reason: collision with root package name */
            private final xv0 f5897a;

            /* renamed from: b, reason: collision with root package name */
            private final wi f5898b;

            {
                this.f5897a = this;
                this.f5898b = wiVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f5897a.c(this.f5898b);
            }
        }), ExecutionException.class, zv0.f6315a, this.f6045b);
        final int callingUid = Binder.getCallingUid();
        return qx1.k(dy1VarA, dy0.class, new ax1(this, wiVar, callingUid) { // from class: com.google.android.gms.internal.ads.yv0

            /* renamed from: a, reason: collision with root package name */
            private final xv0 f6184a;

            /* renamed from: b, reason: collision with root package name */
            private final wi f6185b;

            /* renamed from: c, reason: collision with root package name */
            private final int f6186c;

            {
                this.f6184a = this;
                this.f6185b = wiVar;
                this.f6186c = callingUid;
            }

            @Override // com.google.android.gms.internal.ads.ax1
            public final dy1 a(Object obj) {
                return this.f6184a.a(this.f6185b, this.f6186c, (dy0) obj);
            }
        }, this.f6045b);
    }

    final /* synthetic */ InputStream c(wi wiVar) throws Exception {
        return this.f6046c.e(wiVar).get(((Integer) qx2.e().c(e0.J3)).intValue(), TimeUnit.SECONDS);
    }
}
