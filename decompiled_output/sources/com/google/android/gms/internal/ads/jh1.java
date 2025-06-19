package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class jh1 implements pe2<hh1> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<yg> f3964a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<ScheduledExecutorService> f3965b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<Context> f3966c;

    public jh1(ze2<yg> ze2Var, ze2<ScheduledExecutorService> ze2Var2, ze2<Context> ze2Var3) {
        this.f3964a = ze2Var;
        this.f3965b = ze2Var2;
        this.f3966c = ze2Var3;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new hh1(this.f3964a.get(), this.f3965b.get(), this.f3966c.get());
    }
}
