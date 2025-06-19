package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public class uv0 extends Exception {
    private final xn1 d;

    public uv0(xn1 xn1Var) {
        this.d = xn1Var;
    }

    public uv0(xn1 xn1Var, String str) {
        super(str);
        this.d = xn1Var;
    }

    public uv0(xn1 xn1Var, String str, Throwable th) {
        super(str, th);
        this.d = xn1Var;
    }

    public final xn1 a() {
        return this.d;
    }
}
