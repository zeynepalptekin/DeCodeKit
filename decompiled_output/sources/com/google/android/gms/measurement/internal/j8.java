package com.google.android.gms.measurement.internal;

import c.a.b.b.g.c.pf;

/* loaded from: classes.dex */
final class j8 implements Runnable {
    private final /* synthetic */ pf d;
    private final /* synthetic */ s e;
    private final /* synthetic */ String f;
    private final /* synthetic */ AppMeasurementDynamiteService g;

    j8(AppMeasurementDynamiteService appMeasurementDynamiteService, pf pfVar, s sVar, String str) {
        this.g = appMeasurementDynamiteService;
        this.d = pfVar;
        this.e = sVar;
        this.f = str;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.g.e.P().G(this.d, this.e, this.f);
    }
}
