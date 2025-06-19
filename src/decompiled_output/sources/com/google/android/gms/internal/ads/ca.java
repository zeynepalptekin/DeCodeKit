package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class ca implements Runnable {
    private final /* synthetic */ String d;
    private final /* synthetic */ w9 e;

    ca(w9 w9Var, String str) {
        this.e = w9Var;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.d.loadUrl(this.d);
    }
}
