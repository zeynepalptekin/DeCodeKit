package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class ra1 implements cf1<Bundle> {

    /* renamed from: a, reason: collision with root package name */
    private final vw2 f5119a;

    /* renamed from: b, reason: collision with root package name */
    private final as f5120b;

    public ra1(vw2 vw2Var, as asVar) {
        this.f5119a = vw2Var;
        this.f5120b = asVar;
    }

    @Override // com.google.android.gms.internal.ads.cf1
    public final /* synthetic */ void b(Bundle bundle) {
        Bundle bundle2 = bundle;
        int r0 = ((Integer) qx2.e().c(e0.t3)).intValue();
        as asVar = this.f5120b;
        if (asVar != null && asVar.f >= r0) {
            bundle2.putString("app_open_version", "2");
        }
        vw2 vw2Var = this.f5119a;
        if (vw2Var != null) {
            int r02 = vw2Var.d;
            if (r02 == 1) {
                bundle2.putString("avo", "p");
            } else if (r02 == 2) {
                bundle2.putString("avo", "l");
            }
        }
    }
}
