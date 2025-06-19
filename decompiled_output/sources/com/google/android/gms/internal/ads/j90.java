package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class j90 implements pe2<ch0<hd0>> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<rd0> f3928a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Executor> f3929b;

    private j90(ze2<rd0> ze2Var, ze2<Executor> ze2Var2) {
        this.f3928a = ze2Var;
        this.f3929b = ze2Var2;
    }

    public static j90 a(ze2<rd0> ze2Var, ze2<Executor> ze2Var2) {
        return new j90(ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (ch0) we2.b(new ch0(this.f3928a.get(), this.f3929b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
