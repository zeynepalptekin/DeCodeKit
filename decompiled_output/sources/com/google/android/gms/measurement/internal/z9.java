package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* loaded from: classes.dex */
final class z9 implements Runnable {
    private final /* synthetic */ String d;
    private final /* synthetic */ Bundle e;
    private final /* synthetic */ aa f;

    z9(aa aaVar, String str, Bundle bundle) {
        this.f = aaVar;
        this.d = str;
        this.e = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.f.f6350a.n(this.f.f6350a.h0().E(this.d, "_err", this.e, "auto", this.f.f6350a.z().a(), false, false, false), this.d);
    }
}
