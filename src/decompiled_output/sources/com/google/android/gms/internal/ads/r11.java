package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final /* synthetic */ class r11 implements Runnable {
    private final rw d;

    private r11(rw rwVar) {
        this.d = rwVar;
    }

    static Runnable a(rw rwVar) {
        return new r11(rwVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.C();
    }
}
