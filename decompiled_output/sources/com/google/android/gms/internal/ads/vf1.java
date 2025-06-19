package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class vf1 implements pe2<uf1> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<vn> f5674a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Context> f5675b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<ScheduledExecutorService> f5676c;
    private final ze2<Executor> d;

    public vf1(ze2<vn> ze2Var, ze2<Context> ze2Var2, ze2<ScheduledExecutorService> ze2Var3, ze2<Executor> ze2Var4) {
        this.f5674a = ze2Var;
        this.f5675b = ze2Var2;
        this.f5676c = ze2Var3;
        this.d = ze2Var4;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new uf1(this.f5674a.get(), this.f5675b.get(), this.f5676c.get(), this.d.get());
    }
}
