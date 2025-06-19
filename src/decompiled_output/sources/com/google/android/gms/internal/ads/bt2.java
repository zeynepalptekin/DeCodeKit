package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.b0.a;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class bt2 extends kt2 {
    private final WeakReference<a.AbstractC0159a> e;

    public bt2(a.AbstractC0159a abstractC0159a) {
        this.e = new WeakReference<>(abstractC0159a);
    }

    @Override // com.google.android.gms.internal.ads.ht2
    public final void Q2(dw2 dw2Var) {
        a.AbstractC0159a abstractC0159a = this.e.get();
        if (abstractC0159a != null) {
            abstractC0159a.b(dw2Var.i());
        }
    }

    @Override // com.google.android.gms.internal.ads.ht2
    public final void W3(gt2 gt2Var) {
        a.AbstractC0159a abstractC0159a = this.e.get();
        if (abstractC0159a != null) {
            abstractC0159a.c(new nt2(gt2Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.ht2
    public final void o3(int r2) {
        a.AbstractC0159a abstractC0159a = this.e.get();
        if (abstractC0159a != null) {
            abstractC0159a.a(r2);
        }
    }
}
