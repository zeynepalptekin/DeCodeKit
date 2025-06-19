package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zt1 extends Exception {
    private final int d;

    public zt1(int r1, String str) {
        super(str);
        this.d = r1;
    }

    public zt1(int r1, Throwable th) {
        super(th);
        this.d = r1;
    }

    public final int a() {
        return this.d;
    }
}
