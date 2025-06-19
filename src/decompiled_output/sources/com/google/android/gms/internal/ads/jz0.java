package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class jz0 implements pe2<ch0<ir1>> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<wz0> f4030a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Executor> f4031b;

    private jz0(ze2<wz0> ze2Var, ze2<Executor> ze2Var2) {
        this.f4030a = ze2Var;
        this.f4031b = ze2Var2;
    }

    public static jz0 a(ze2<wz0> ze2Var, ze2<Executor> ze2Var2) {
        return new jz0(ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (ch0) we2.b(new ch0(this.f4030a.get(), this.f4031b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
