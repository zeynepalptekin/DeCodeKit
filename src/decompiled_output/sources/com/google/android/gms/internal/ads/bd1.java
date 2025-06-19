package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class bd1 implements cf1<Bundle> {

    /* renamed from: a, reason: collision with root package name */
    private final im1 f2824a;

    public bd1(im1 im1Var) {
        this.f2824a = im1Var;
    }

    @Override // com.google.android.gms.internal.ads.cf1
    public final /* synthetic */ void b(Bundle bundle) {
        Bundle bundle2 = bundle;
        im1 im1Var = this.f2824a;
        if (im1Var != null) {
            bundle2.putBoolean("render_in_browser", im1Var.b());
            bundle2.putBoolean("disable_ml", this.f2824a.c());
        }
    }
}
