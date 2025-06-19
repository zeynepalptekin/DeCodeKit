package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class ct implements Runnable {
    private final /* synthetic */ int d;
    private final /* synthetic */ int e;
    private final /* synthetic */ ws f;

    ct(ws wsVar, int r2, int r3) {
        this.f = wsVar;
        this.d = r2;
        this.e = r3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f.t != null) {
            this.f.t.c(this.d, this.e);
        }
    }
}
