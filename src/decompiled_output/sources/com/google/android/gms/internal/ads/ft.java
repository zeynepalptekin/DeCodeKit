package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class ft implements Runnable {
    private final /* synthetic */ ws d;

    ft(ws wsVar) {
        this.d = wsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d.t != null) {
            this.d.t.e();
        }
    }
}
