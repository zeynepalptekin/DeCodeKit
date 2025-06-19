package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class ba0 implements pe2<w90> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<ob0> f2806a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<km1> f2807b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<ScheduledExecutorService> f2808c;
    private final ze2<Executor> d;

    private ba0(ze2<ob0> ze2Var, ze2<km1> ze2Var2, ze2<ScheduledExecutorService> ze2Var3, ze2<Executor> ze2Var4) {
        this.f2806a = ze2Var;
        this.f2807b = ze2Var2;
        this.f2808c = ze2Var3;
        this.d = ze2Var4;
    }

    public static ba0 a(ze2<ob0> ze2Var, ze2<km1> ze2Var2, ze2<ScheduledExecutorService> ze2Var3, ze2<Executor> ze2Var4) {
        return new ba0(ze2Var, ze2Var2, ze2Var3, ze2Var4);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new w90(this.f2806a.get(), this.f2807b.get(), this.f2808c.get(), this.d.get());
    }
}
