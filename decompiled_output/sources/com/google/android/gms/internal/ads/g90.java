package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class g90 implements pe2<ch0<fb0>> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<vt0> f3508a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Executor> f3509b;

    private g90(ze2<vt0> ze2Var, ze2<Executor> ze2Var2) {
        this.f3508a = ze2Var;
        this.f3509b = ze2Var2;
    }

    public static g90 a(ze2<vt0> ze2Var, ze2<Executor> ze2Var2) {
        return new g90(ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (ch0) we2.b(new ch0(this.f3508a.get(), this.f3509b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
