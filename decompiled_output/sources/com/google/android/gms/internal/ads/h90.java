package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class h90 implements pe2<ch0<xc0>> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<rd0> f3640a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Executor> f3641b;

    private h90(ze2<rd0> ze2Var, ze2<Executor> ze2Var2) {
        this.f3640a = ze2Var;
        this.f3641b = ze2Var2;
    }

    public static h90 a(ze2<rd0> ze2Var, ze2<Executor> ze2Var2) {
        return new h90(ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (ch0) we2.b(new ch0(this.f3640a.get(), this.f3641b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
