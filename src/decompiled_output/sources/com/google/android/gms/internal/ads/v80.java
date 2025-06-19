package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class v80 implements pe2<ch0<pb0>> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<t20> f5643a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Executor> f5644b;

    private v80(ze2<t20> ze2Var, ze2<Executor> ze2Var2) {
        this.f5643a = ze2Var;
        this.f5644b = ze2Var2;
    }

    public static v80 a(ze2<t20> ze2Var, ze2<Executor> ze2Var2) {
        return new v80(ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (ch0) we2.b(new ch0(this.f5643a.get(), this.f5644b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
