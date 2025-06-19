package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class ex implements Runnable {
    private final /* synthetic */ cx d;

    ex(cx cxVar) {
        this.d = cxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.d.destroy();
    }
}
