package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class kz0 implements pe2<ch0<nc0>> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<tz0> f4162a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Executor> f4163b;

    private kz0(ze2<tz0> ze2Var, ze2<Executor> ze2Var2) {
        this.f4162a = ze2Var;
        this.f4163b = ze2Var2;
    }

    public static kz0 a(ze2<tz0> ze2Var, ze2<Executor> ze2Var2) {
        return new kz0(ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (ch0) we2.b(new ch0(this.f4162a.get(), this.f4163b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
