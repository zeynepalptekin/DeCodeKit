package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class ng1 implements pe2<ig1> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<vn> f4535a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Integer> f4536b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<Context> f4537c;
    private final ze2<ao> d;
    private final ze2<ScheduledExecutorService> e;
    private final ze2<Executor> f;

    public ng1(ze2<vn> ze2Var, ze2<Integer> ze2Var2, ze2<Context> ze2Var3, ze2<ao> ze2Var4, ze2<ScheduledExecutorService> ze2Var5, ze2<Executor> ze2Var6) {
        this.f4535a = ze2Var;
        this.f4536b = ze2Var2;
        this.f4537c = ze2Var3;
        this.d = ze2Var4;
        this.e = ze2Var5;
        this.f = ze2Var6;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new ig1(this.f4535a.get(), this.f4536b.get().intValue(), this.f4537c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
