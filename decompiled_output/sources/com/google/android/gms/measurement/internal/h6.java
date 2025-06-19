package com.google.android.gms.measurement.internal;

import c.a.b.b.g.c.pf;

/* loaded from: classes.dex */
final class h6 implements Runnable {
    private final /* synthetic */ pf d;
    private final /* synthetic */ AppMeasurementDynamiteService e;

    h6(AppMeasurementDynamiteService appMeasurementDynamiteService, pf pfVar) {
        this.e = appMeasurementDynamiteService;
        this.d = pfVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.e.e.P().E(this.d);
    }
}
