package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class e3 implements Runnable {
    private final /* synthetic */ long d;
    private final /* synthetic */ a e;

    e3(a aVar, long j) {
        this.e = aVar;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.y(this.d);
    }
}
