package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class y80 implements pe2<ch0<tb0>> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<t20> f6099a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Executor> f6100b;

    private y80(ze2<t20> ze2Var, ze2<Executor> ze2Var2) {
        this.f6099a = ze2Var;
        this.f6100b = ze2Var2;
    }

    public static y80 a(ze2<t20> ze2Var, ze2<Executor> ze2Var2) {
        return new y80(ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (ch0) we2.b(new ch0(this.f6099a.get(), this.f6100b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
