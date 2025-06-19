package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class qv implements Runnable {
    private final /* synthetic */ nv d;

    qv(nv nvVar) {
        this.d = nvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.p.y().h(this.d);
    }
}
