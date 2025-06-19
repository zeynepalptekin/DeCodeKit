package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public class pd extends Exception {
    private final fz2 d;
    private long e;

    public pd() {
        this.d = null;
    }

    public pd(fz2 fz2Var) {
        this.d = fz2Var;
    }

    public pd(String str) {
        super(str);
        this.d = null;
    }

    public pd(Throwable th) {
        super(th);
        this.d = null;
    }

    final void a(long j) {
        this.e = j;
    }
}
