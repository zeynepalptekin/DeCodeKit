package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class u80 implements pe2<ch0<lh0>> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<kh0> f5487a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Executor> f5488b;

    private u80(ze2<kh0> ze2Var, ze2<Executor> ze2Var2) {
        this.f5487a = ze2Var;
        this.f5488b = ze2Var2;
    }

    public static u80 a(ze2<kh0> ze2Var, ze2<Executor> ze2Var2) {
        return new u80(ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (ch0) we2.b(new ch0(this.f5487a.get(), this.f5488b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
