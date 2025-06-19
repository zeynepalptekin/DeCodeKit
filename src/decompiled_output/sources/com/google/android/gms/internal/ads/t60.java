package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class t60 implements tb0, nc0 {
    private final Context d;

    @androidx.annotation.i0
    private final rw e;
    private final km1 f;
    private final as g;

    @androidx.annotation.i0
    @GuardedBy("this")
    private c.a.b.b.e.c h;

    @GuardedBy("this")
    private boolean i;

    public t60(Context context, @androidx.annotation.i0 rw rwVar, km1 km1Var, as asVar) {
        this.d = context;
        this.e = rwVar;
        this.f = km1Var;
        this.g = asVar;
    }

    private final synchronized void a() {
        if (this.f.N) {
            if (this.e == null) {
                return;
            }
            if (com.google.android.gms.ads.internal.p.r().h(this.d)) {
                int r0 = this.g.e;
                int r1 = this.g.f;
                StringBuilder sb = new StringBuilder(23);
                sb.append(r0);
                sb.append(".");
                sb.append(r1);
                this.h = com.google.android.gms.ads.internal.p.r().b(sb.toString(), this.e.getWebView(), "", "javascript", this.f.P.b());
                View view = this.e.getView();
                if (this.h != null && view != null) {
                    com.google.android.gms.ads.internal.p.r().d(this.h, view);
                    this.e.N(this.h);
                    com.google.android.gms.ads.internal.p.r().e(this.h);
                    this.i = true;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.tb0
    public final synchronized void U() {
        if (!this.i) {
            a();
        }
        if (this.f.N && this.h != null && this.e != null) {
            this.e.M("onSdkImpression", new b.f.a());
        }
    }

    @Override // com.google.android.gms.internal.ads.nc0
    public final synchronized void u() {
        if (this.i) {
            return;
        }
        a();
    }
}
