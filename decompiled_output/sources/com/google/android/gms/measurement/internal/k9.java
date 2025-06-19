package com.google.android.gms.measurement.internal;

import c.a.b.b.g.c.pf;

/* loaded from: classes.dex */
final class k9 implements Runnable {
    private final /* synthetic */ pf d;
    private final /* synthetic */ AppMeasurementDynamiteService e;

    k9(AppMeasurementDynamiteService appMeasurementDynamiteService, pf pfVar) {
        this.e = appMeasurementDynamiteService;
        this.d = pfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.e.G().T(this.d, this.e.e.T());
    }
}
