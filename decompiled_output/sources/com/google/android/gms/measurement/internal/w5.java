package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class w5 implements Runnable {
    private final /* synthetic */ String d;
    private final /* synthetic */ String e;
    private final /* synthetic */ String f;
    private final /* synthetic */ long g;
    private final /* synthetic */ c5 h;

    w5(c5 c5Var, String str, String str2, String str3, long j) {
        this.h = c5Var;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.d;
        if (str == null) {
            this.h.e.m0().O().R(this.e, null);
        } else {
            this.h.e.m0().O().R(this.e, new p7(this.f, str, this.g));
        }
    }
}
