package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class us0 implements pe2<ch0<nc0>> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<zs0> f5590a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Executor> f5591b;

    private us0(ze2<zs0> ze2Var, ze2<Executor> ze2Var2) {
        this.f5590a = ze2Var;
        this.f5591b = ze2Var2;
    }

    public static us0 a(ze2<zs0> ze2Var, ze2<Executor> ze2Var2) {
        return new us0(ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (ch0) we2.b(new ch0(this.f5590a.get(), this.f5591b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
