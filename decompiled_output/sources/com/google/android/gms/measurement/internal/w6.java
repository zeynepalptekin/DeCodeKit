package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class w6 implements Runnable {
    private final /* synthetic */ AtomicReference d;
    private final /* synthetic */ String e;
    private final /* synthetic */ String f;
    private final /* synthetic */ String g;
    private final /* synthetic */ boolean h;
    private final /* synthetic */ f6 i;

    w6(f6 f6Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.i = f6Var;
        this.d = atomicReference;
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = z;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.i.f6543a.P().T(this.d, this.e, this.f, this.g, this.h);
    }
}
