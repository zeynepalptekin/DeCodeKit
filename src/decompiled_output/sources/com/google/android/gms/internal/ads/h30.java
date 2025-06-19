package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class h30 implements pe2<g30> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<yb> f3622a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<e30> f3623b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<Executor> f3624c;
    private final ze2<x20> d;
    private final ze2<com.google.android.gms.common.util.g> e;

    private h30(ze2<yb> ze2Var, ze2<e30> ze2Var2, ze2<Executor> ze2Var3, ze2<x20> ze2Var4, ze2<com.google.android.gms.common.util.g> ze2Var5) {
        this.f3622a = ze2Var;
        this.f3623b = ze2Var2;
        this.f3624c = ze2Var3;
        this.d = ze2Var4;
        this.e = ze2Var5;
    }

    public static h30 a(ze2<yb> ze2Var, ze2<e30> ze2Var2, ze2<Executor> ze2Var3, ze2<x20> ze2Var4, ze2<com.google.android.gms.common.util.g> ze2Var5) {
        return new h30(ze2Var, ze2Var2, ze2Var3, ze2Var4, ze2Var5);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new g30(this.f3622a.get(), this.f3623b.get(), this.f3624c.get(), this.d.get(), this.e.get());
    }
}
