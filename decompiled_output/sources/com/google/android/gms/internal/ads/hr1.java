package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class hr1 implements pe2<cr1> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<cy1> f3716a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<ScheduledExecutorService> f3717b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<br1> f3718c;

    private hr1(ze2<cy1> ze2Var, ze2<ScheduledExecutorService> ze2Var2, ze2<br1> ze2Var3) {
        this.f3716a = ze2Var;
        this.f3717b = ze2Var2;
        this.f3718c = ze2Var3;
    }

    public static hr1 a(ze2<cy1> ze2Var, ze2<ScheduledExecutorService> ze2Var2, ze2<br1> ze2Var3) {
        return new hr1(ze2Var, ze2Var2, ze2Var3);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new cr1(this.f3716a.get(), this.f3717b.get(), this.f3718c.get());
    }
}
