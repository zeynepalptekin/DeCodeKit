package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;

@com.google.android.gms.common.util.d0
/* loaded from: classes.dex */
public final class g6 {

    /* renamed from: a, reason: collision with root package name */
    final Context f6397a;

    /* renamed from: b, reason: collision with root package name */
    String f6398b;

    /* renamed from: c, reason: collision with root package name */
    String f6399c;
    String d;
    Boolean e;
    long f;
    c.a.b.b.g.c.f g;
    boolean h;
    Long i;

    @com.google.android.gms.common.util.d0
    public g6(Context context, c.a.b.b.g.c.f fVar, Long l) {
        this.h = true;
        com.google.android.gms.common.internal.r.k(context);
        Context applicationContext = context.getApplicationContext();
        com.google.android.gms.common.internal.r.k(applicationContext);
        this.f6397a = applicationContext;
        this.i = l;
        if (fVar != null) {
            this.g = fVar;
            this.f6398b = fVar.i;
            this.f6399c = fVar.h;
            this.d = fVar.g;
            this.h = fVar.f;
            this.f = fVar.e;
            Bundle bundle = fVar.j;
            if (bundle != null) {
                this.e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
