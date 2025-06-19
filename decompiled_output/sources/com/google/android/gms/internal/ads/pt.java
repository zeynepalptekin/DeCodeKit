package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class pt implements Runnable {
    private final /* synthetic */ boolean d;
    private final /* synthetic */ mt e;

    pt(mt mtVar, boolean z) {
        this.e = mtVar;
        this.d = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.v("windowVisibilityChanged", "isVisible", String.valueOf(this.d));
    }
}
