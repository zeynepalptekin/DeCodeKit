package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
final class p6 implements Runnable {
    private final /* synthetic */ String d;
    private final /* synthetic */ String e;
    private final /* synthetic */ long f;
    private final /* synthetic */ Bundle g;
    private final /* synthetic */ boolean h;
    private final /* synthetic */ boolean i;
    private final /* synthetic */ boolean j;
    private final /* synthetic */ String k;
    private final /* synthetic */ f6 l;

    p6(f6 f6Var, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.l = f6Var;
        this.d = str;
        this.e = str2;
        this.f = j;
        this.g = bundle;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = str3;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.l.X(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
    }
}
