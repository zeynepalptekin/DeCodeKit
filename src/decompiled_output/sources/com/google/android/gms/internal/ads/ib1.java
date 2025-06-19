package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class ib1 implements pe2<db1> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Context> f3803a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<ScheduledExecutorService> f3804b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<Executor> f3805c;

    private ib1(ze2<Context> ze2Var, ze2<ScheduledExecutorService> ze2Var2, ze2<Executor> ze2Var3) {
        this.f3803a = ze2Var;
        this.f3804b = ze2Var2;
        this.f3805c = ze2Var3;
    }

    public static ib1 a(ze2<Context> ze2Var, ze2<ScheduledExecutorService> ze2Var2, ze2<Executor> ze2Var3) {
        return new ib1(ze2Var, ze2Var2, ze2Var3);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new db1(this.f3803a.get(), this.f3804b.get(), this.f3805c.get());
    }
}
