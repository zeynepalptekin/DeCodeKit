package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class m90 implements pe2<ch0<af0>> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<vt0> f4366a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Executor> f4367b;

    private m90(ze2<vt0> ze2Var, ze2<Executor> ze2Var2) {
        this.f4366a = ze2Var;
        this.f4367b = ze2Var2;
    }

    public static m90 a(ze2<vt0> ze2Var, ze2<Executor> ze2Var2) {
        return new m90(ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (ch0) we2.b(new ch0(this.f4366a.get(), this.f4367b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
