package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class gt implements Runnable {
    private final /* synthetic */ ws d;

    gt(ws wsVar) {
        this.d = wsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d.t != null) {
            this.d.t.f();
            this.d.t.i();
        }
    }
}
