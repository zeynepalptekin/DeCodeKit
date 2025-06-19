package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class o6 implements Runnable {
    private final /* synthetic */ String d;
    private final /* synthetic */ String e;
    private final /* synthetic */ Object f;
    private final /* synthetic */ long g;
    private final /* synthetic */ f6 h;

    o6(f6 f6Var, String str, String str2, Object obj, long j) {
        this.h = f6Var;
        this.d = str;
        this.e = str2;
        this.f = obj;
        this.g = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.h.c0(this.d, this.e, this.f, this.g);
    }
}
