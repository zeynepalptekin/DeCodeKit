package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class j21 implements pe2<e21> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Context> f3905a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Executor> f3906b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<hj0> f3907c;
    private final ze2<im1> d;

    public j21(ze2<Context> ze2Var, ze2<Executor> ze2Var2, ze2<hj0> ze2Var3, ze2<im1> ze2Var4) {
        this.f3905a = ze2Var;
        this.f3906b = ze2Var2;
        this.f3907c = ze2Var3;
        this.d = ze2Var4;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new e21(this.f3905a.get(), this.f3906b.get(), this.f3907c.get(), this.d.get());
    }
}
