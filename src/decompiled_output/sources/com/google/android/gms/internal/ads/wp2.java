package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class wp2 implements Runnable {
    private final /* synthetic */ b d;
    private final /* synthetic */ tm2 e;

    wp2(tm2 tm2Var, b bVar) {
        this.e = tm2Var;
        this.d = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        try {
            this.e.e.put(this.d);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
