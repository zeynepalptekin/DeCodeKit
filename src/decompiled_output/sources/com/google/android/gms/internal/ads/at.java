package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class at implements Runnable {
    private final /* synthetic */ String d;
    private final /* synthetic */ String e;
    private final /* synthetic */ ws f;

    at(ws wsVar, String str, String str2) {
        this.f = wsVar;
        this.d = str;
        this.e = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f.t != null) {
            this.f.t.d(this.d, this.e);
        }
    }
}
