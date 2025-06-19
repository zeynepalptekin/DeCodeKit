package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ep2 {

    /* renamed from: a, reason: collision with root package name */
    public final ko2 f3304a;

    /* renamed from: b, reason: collision with root package name */
    public final zo2 f3305b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3306c;
    public final oi2[] d;

    public ep2(ko2 ko2Var, zo2 zo2Var, Object obj, oi2[] oi2VarArr) {
        this.f3304a = ko2Var;
        this.f3305b = zo2Var;
        this.f3306c = obj;
        this.d = oi2VarArr;
    }

    public final boolean a(ep2 ep2Var, int r5) {
        return ep2Var != null && nq2.g(this.f3305b.a(r5), ep2Var.f3305b.a(r5)) && nq2.g(this.d[r5], ep2Var.d[r5]);
    }
}
