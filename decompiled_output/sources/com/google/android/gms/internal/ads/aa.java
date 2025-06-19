package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class aa implements Runnable {
    private final /* synthetic */ String d;
    private final /* synthetic */ w9 e;

    aa(w9 w9Var, String str) {
        this.e = w9Var;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.d.loadData(this.d, "text/html", "UTF-8");
    }
}
