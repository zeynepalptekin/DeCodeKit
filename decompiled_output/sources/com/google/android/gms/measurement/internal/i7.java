package com.google.android.gms.measurement.internal;

import c.a.b.b.g.c.pf;

/* loaded from: classes.dex */
final class i7 implements Runnable {
    private final /* synthetic */ pf d;
    private final /* synthetic */ String e;
    private final /* synthetic */ String f;
    private final /* synthetic */ boolean g;
    private final /* synthetic */ AppMeasurementDynamiteService h;

    i7(AppMeasurementDynamiteService appMeasurementDynamiteService, pf pfVar, String str, String str2, boolean z) {
        this.h = appMeasurementDynamiteService;
        this.d = pfVar;
        this.e = str;
        this.f = str2;
        this.g = z;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.h.e.P().I(this.d, this.e, this.f, this.g);
    }
}
