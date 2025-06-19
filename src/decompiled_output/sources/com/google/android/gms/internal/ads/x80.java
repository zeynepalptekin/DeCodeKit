package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class x80 implements pe2<ch0<nc0>> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<t20> f5946a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Executor> f5947b;

    private x80(ze2<t20> ze2Var, ze2<Executor> ze2Var2) {
        this.f5946a = ze2Var;
        this.f5947b = ze2Var2;
    }

    public static ch0<nc0> a(t20 t20Var, Executor executor) {
        return (ch0) we2.b(new ch0(t20Var, executor), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static x80 b(ze2<t20> ze2Var, ze2<Executor> ze2Var2) {
        return new x80(ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return a(this.f5946a.get(), this.f5947b.get());
    }
}
