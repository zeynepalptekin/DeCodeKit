package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class lr extends Thread {
    private final /* synthetic */ String d;

    lr(mr mrVar, String str) {
        this.d = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        new xr().a(this.d);
    }
}
