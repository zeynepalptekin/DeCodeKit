package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes.dex */
final class j41<T> implements rx1<T> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ long f3913a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f3914b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ km1 f3915c;
    private final /* synthetic */ lm1 d;
    private final /* synthetic */ g41 e;

    j41(g41 g41Var, long j, String str, km1 km1Var, lm1 lm1Var) {
        this.e = g41Var;
        this.f3913a = j;
        this.f3914b = str;
        this.f3915c = km1Var;
        this.d = lm1Var;
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final void a(Throwable th) {
        dw2 dw2Var;
        long jC = this.e.f3495a.c() - this.f3913a;
        int r2 = th instanceof TimeoutException ? 2 : th instanceof v31 ? 3 : th instanceof CancellationException ? 4 : th instanceof in1 ? 5 : ((th instanceof uv0) && vn1.d(th).d == 3) ? 1 : 6;
        this.e.d(this.f3914b, r2, jC, this.f3915c.b0);
        if (this.e.d) {
            this.e.f3496b.a(this.d, this.f3915c, r2, th instanceof y01 ? (y01) th : null, jC);
        }
        if (((Boolean) qx2.e().c(e0.x5)).booleanValue()) {
            dw2 dw2VarD = vn1.d(th);
            int r22 = dw2VarD.d;
            if ((r22 == 3 || r22 == 0) && (dw2Var = dw2VarD.g) != null && !dw2Var.f.equals(com.google.android.gms.ads.q.f2483a)) {
                dw2VarD = vn1.d(new y01(xn1.MEDIATION_NO_FILL, dw2VarD.g));
            }
            this.e.e.b(this.f3915c, jC, dw2VarD);
        }
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final void b(T t) {
        long jC = this.e.f3495a.c() - this.f3913a;
        this.e.d(this.f3914b, 0, jC, this.f3915c.b0);
        if (this.e.d) {
            this.e.f3496b.a(this.d, this.f3915c, 0, null, jC);
        }
        if (((Boolean) qx2.e().c(e0.x5)).booleanValue()) {
            this.e.e.b(this.f3915c, jC, null);
        }
    }
}
