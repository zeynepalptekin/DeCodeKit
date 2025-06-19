package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final /* synthetic */ class lt implements Runnable {
    private final kt d;

    private lt(kt ktVar) {
        this.d = ktVar;
    }

    static Runnable a(kt ktVar) {
        return new lt(ktVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.i();
    }
}
