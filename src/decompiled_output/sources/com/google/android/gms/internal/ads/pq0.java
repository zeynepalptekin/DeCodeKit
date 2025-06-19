package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final /* synthetic */ class pq0 implements Runnable {
    private final rw d;

    private pq0(rw rwVar) {
        this.d = rwVar;
    }

    static Runnable a(rw rwVar) {
        return new pq0(rwVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.destroy();
    }
}
