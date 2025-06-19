package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class aj0 implements pe2<ch0<we0>> {

    /* renamed from: a, reason: collision with root package name */
    private final hi0 f2698a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Executor> f2699b;

    private aj0(hi0 hi0Var, ze2<Executor> ze2Var) {
        this.f2698a = hi0Var;
        this.f2699b = ze2Var;
    }

    public static aj0 a(hi0 hi0Var, ze2<Executor> ze2Var) {
        return new aj0(hi0Var, ze2Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (ch0) we2.b(this.f2698a.e(this.f2699b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
