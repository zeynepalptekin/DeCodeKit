package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class f90 implements pe2<ch0<pb0>> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<rd0> f3383a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Executor> f3384b;

    private f90(ze2<rd0> ze2Var, ze2<Executor> ze2Var2) {
        this.f3383a = ze2Var;
        this.f3384b = ze2Var2;
    }

    public static f90 a(ze2<rd0> ze2Var, ze2<Executor> ze2Var2) {
        return new f90(ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (ch0) we2.b(new ch0(this.f3383a.get(), this.f3384b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
