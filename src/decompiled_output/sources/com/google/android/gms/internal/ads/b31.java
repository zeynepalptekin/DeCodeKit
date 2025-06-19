package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class b31 implements pe2<z21> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Context> f2786a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<as> f2787b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<hj0> f2788c;
    private final ze2<Executor> d;

    public b31(ze2<Context> ze2Var, ze2<as> ze2Var2, ze2<hj0> ze2Var3, ze2<Executor> ze2Var4) {
        this.f2786a = ze2Var;
        this.f2787b = ze2Var2;
        this.f2788c = ze2Var3;
        this.d = ze2Var4;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new z21(this.f2786a.get(), this.f2787b.get(), this.f2788c.get(), this.d.get());
    }
}
