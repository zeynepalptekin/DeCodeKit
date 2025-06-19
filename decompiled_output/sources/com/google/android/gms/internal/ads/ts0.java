package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ts0 implements pe2<ch0<od0>> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<zs0> f5443a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Executor> f5444b;

    private ts0(ze2<zs0> ze2Var, ze2<Executor> ze2Var2) {
        this.f5443a = ze2Var;
        this.f5444b = ze2Var2;
    }

    public static ts0 a(ze2<zs0> ze2Var, ze2<Executor> ze2Var2) {
        return new ts0(ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (ch0) we2.b(new ch0(this.f5443a.get(), this.f5444b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
