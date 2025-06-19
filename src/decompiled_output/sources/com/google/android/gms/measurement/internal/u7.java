package com.google.android.gms.measurement.internal;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
final class u7 implements Runnable {
    private final /* synthetic */ p7 d;
    private final /* synthetic */ p7 e;
    private final /* synthetic */ long f;
    private final /* synthetic */ boolean g;
    private final /* synthetic */ s7 h;

    u7(s7 s7Var, p7 p7Var, p7 p7Var2, long j, boolean z) {
        this.h = s7Var;
        this.d = p7Var;
        this.e = p7Var2;
        this.f = j;
        this.g = z;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.h.M(this.d, this.e, this.f, this.g, null);
    }
}
