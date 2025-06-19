package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class hz0 implements pe2<ch0<cb0>> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<tz0> f3735a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Executor> f3736b;

    private hz0(ze2<tz0> ze2Var, ze2<Executor> ze2Var2) {
        this.f3735a = ze2Var;
        this.f3736b = ze2Var2;
    }

    public static hz0 a(ze2<tz0> ze2Var, ze2<Executor> ze2Var2) {
        return new hz0(ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (ch0) we2.b(new ch0(this.f3735a.get(), this.f3736b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
