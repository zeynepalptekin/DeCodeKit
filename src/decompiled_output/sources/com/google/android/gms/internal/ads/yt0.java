package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class yt0 implements pe2<ch0<cb0>> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<xt0> f6171a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Executor> f6172b;

    private yt0(ze2<xt0> ze2Var, ze2<Executor> ze2Var2) {
        this.f6171a = ze2Var;
        this.f6172b = ze2Var2;
    }

    public static yt0 a(ze2<xt0> ze2Var, ze2<Executor> ze2Var2) {
        return new yt0(ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (ch0) we2.b(new ch0(this.f6171a.get(), this.f6172b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
