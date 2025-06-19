package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class jx implements Runnable {
    private final /* synthetic */ hx d;

    jx(hx hxVar) {
        this.d = hxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        super/*android.webkit.WebView*/.destroy();
    }
}
