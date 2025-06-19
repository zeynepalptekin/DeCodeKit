package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class r60 implements pe2<l60> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<d70> f5103a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<f5> f5104b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<Runnable> f5105c;
    private final ze2<Executor> d;

    public r60(ze2<d70> ze2Var, ze2<f5> ze2Var2, ze2<Runnable> ze2Var3, ze2<Executor> ze2Var4) {
        this.f5103a = ze2Var;
        this.f5104b = ze2Var2;
        this.f5105c = ze2Var3;
        this.d = ze2Var4;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new l60(this.f5103a.get(), this.f5104b.get(), this.f5105c.get(), this.d.get());
    }
}
