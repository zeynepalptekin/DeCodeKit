package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class q41 implements pe2<o41> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Context> f4950a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Executor> f4951b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<tq0> f4952c;

    public q41(ze2<Context> ze2Var, ze2<Executor> ze2Var2, ze2<tq0> ze2Var3) {
        this.f4950a = ze2Var;
        this.f4951b = ze2Var2;
        this.f4952c = ze2Var3;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new o41(this.f4950a.get(), this.f4951b.get(), this.f4952c.get());
    }
}
