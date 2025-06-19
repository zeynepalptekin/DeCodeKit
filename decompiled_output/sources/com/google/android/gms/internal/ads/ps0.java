package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ps0 implements pe2<ch0<cb0>> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<zs0> f4882a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Executor> f4883b;

    private ps0(ze2<zs0> ze2Var, ze2<Executor> ze2Var2) {
        this.f4882a = ze2Var;
        this.f4883b = ze2Var2;
    }

    public static ps0 a(ze2<zs0> ze2Var, ze2<Executor> ze2Var2) {
        return new ps0(ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (ch0) we2.b(new ch0(this.f4882a.get(), this.f4883b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
