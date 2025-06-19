package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class b0 implements Runnable {
    private final /* synthetic */ String d;
    private final /* synthetic */ long e;
    private final /* synthetic */ a f;

    b0(a aVar, String str, long j) {
        this.f = aVar;
        this.d = str;
        this.e = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.E(this.d, this.e);
    }
}
