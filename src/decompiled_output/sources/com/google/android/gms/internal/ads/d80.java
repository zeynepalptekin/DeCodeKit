package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class d80 implements pe2<ch0<xc0>> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<cd0> f3089a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Executor> f3090b;

    private d80(ze2<cd0> ze2Var, ze2<Executor> ze2Var2) {
        this.f3089a = ze2Var;
        this.f3090b = ze2Var2;
    }

    public static d80 a(ze2<cd0> ze2Var, ze2<Executor> ze2Var2) {
        return new d80(ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (ch0) we2.b(new ch0(this.f3089a.get(), this.f3090b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
