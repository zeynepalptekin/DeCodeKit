package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

/* loaded from: classes.dex */
public final class a61 implements u01<e50> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f2634a;

    /* renamed from: b, reason: collision with root package name */
    private final b60 f2635b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.i0
    private final b1 f2636c;
    private final cy1 d;
    private final cr1 e;

    public a61(Context context, b60 b60Var, cr1 cr1Var, cy1 cy1Var, @androidx.annotation.i0 b1 b1Var) {
        this.f2634a = context;
        this.f2635b = b60Var;
        this.e = cr1Var;
        this.d = cy1Var;
        this.f2636c = b1Var;
    }

    @Override // com.google.android.gms.internal.ads.u01
    public final boolean a(wm1 wm1Var, km1 km1Var) {
        nm1 nm1Var;
        return (this.f2636c == null || (nm1Var = km1Var.r) == null || nm1Var.f4569a == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.u01
    public final dy1<e50> b(wm1 wm1Var, km1 km1Var) {
        d50 d50VarA = this.f2635b.a(new v70(wm1Var, km1Var, null), new f61(this, new View(this.f2634a), null, d61.f3075a, km1Var.t.get(0)));
        e61 e61VarK = d50VarA.k();
        nm1 nm1Var = km1Var.r;
        final u0 u0Var = new u0(e61VarK, nm1Var.f4570b, nm1Var.f4569a);
        return this.e.g(zq1.CUSTOM_RENDER_SYN).a(new lq1(this, u0Var) { // from class: com.google.android.gms.internal.ads.c61

            /* renamed from: a, reason: collision with root package name */
            private final a61 f2932a;

            /* renamed from: b, reason: collision with root package name */
            private final u0 f2933b;

            {
                this.f2932a = this;
                this.f2933b = u0Var;
            }

            @Override // com.google.android.gms.internal.ads.lq1
            public final void run() throws Exception {
                this.f2932a.c(this.f2933b);
            }
        }, this.d).j(zq1.CUSTOM_RENDER_ACK).h(qx1.g(d50VarA.i())).f();
    }

    final /* synthetic */ void c(u0 u0Var) throws Exception {
        this.f2636c.V4(u0Var);
    }
}
