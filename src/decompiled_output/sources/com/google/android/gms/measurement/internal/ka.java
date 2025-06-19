package com.google.android.gms.measurement.internal;

import c.a.b.b.g.c.pf;

/* loaded from: classes.dex */
final class ka implements Runnable {
    private final /* synthetic */ pf d;
    private final /* synthetic */ String e;
    private final /* synthetic */ String f;
    private final /* synthetic */ AppMeasurementDynamiteService g;

    ka(AppMeasurementDynamiteService appMeasurementDynamiteService, pf pfVar, String str, String str2) {
        this.g = appMeasurementDynamiteService;
        this.d = pfVar;
        this.e = str;
        this.f = str2;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.g.e.P().H(this.d, this.e, this.f);
    }
}
