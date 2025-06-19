package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
final class r7 implements Runnable {
    private final /* synthetic */ Bundle d;
    private final /* synthetic */ p7 e;
    private final /* synthetic */ p7 f;
    private final /* synthetic */ long g;
    private final /* synthetic */ s7 h;

    r7(s7 s7Var, Bundle bundle, p7 p7Var, p7 p7Var2, long j) {
        this.h = s7Var;
        this.d = bundle;
        this.e = p7Var;
        this.f = p7Var2;
        this.g = j;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.h.K(this.d, this.e, this.f, this.g);
    }
}
