package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class m21 implements pe2<i21> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<b60> f4333a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<n11> f4334b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<ab0> f4335c;
    private final ze2<ScheduledExecutorService> d;
    private final ze2<cy1> e;

    public m21(ze2<b60> ze2Var, ze2<n11> ze2Var2, ze2<ab0> ze2Var3, ze2<ScheduledExecutorService> ze2Var4, ze2<cy1> ze2Var5) {
        this.f4333a = ze2Var;
        this.f4334b = ze2Var2;
        this.f4335c = ze2Var3;
        this.d = ze2Var4;
        this.e = ze2Var5;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new i21(this.f4333a.get(), this.f4334b.get(), this.f4335c.get(), this.d.get(), this.e.get());
    }
}
