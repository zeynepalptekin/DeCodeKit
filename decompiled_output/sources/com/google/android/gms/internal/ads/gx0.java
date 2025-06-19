package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class gx0 implements pe2<cx0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<an1> f3590a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<xv0> f3591b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<cy1> f3592c;
    private final ze2<ScheduledExecutorService> d;
    private final ze2<vz0> e;

    private gx0(ze2<an1> ze2Var, ze2<xv0> ze2Var2, ze2<cy1> ze2Var3, ze2<ScheduledExecutorService> ze2Var4, ze2<vz0> ze2Var5) {
        this.f3590a = ze2Var;
        this.f3591b = ze2Var2;
        this.f3592c = ze2Var3;
        this.d = ze2Var4;
        this.e = ze2Var5;
    }

    public static gx0 a(ze2<an1> ze2Var, ze2<xv0> ze2Var2, ze2<cy1> ze2Var3, ze2<ScheduledExecutorService> ze2Var4, ze2<vz0> ze2Var5) {
        return new gx0(ze2Var, ze2Var2, ze2Var3, ze2Var4, ze2Var5);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new cx0(this.f3590a.get(), this.f3591b.get(), this.f3592c.get(), this.d.get(), this.e.get());
    }
}
