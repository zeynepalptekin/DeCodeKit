package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class jc1 implements pe2<ec1> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<gc> f3939a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<ScheduledExecutorService> f3940b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<qo> f3941c;
    private final ze2<ApplicationInfo> d;
    private final ze2<an1> e;

    private jc1(ze2<gc> ze2Var, ze2<ScheduledExecutorService> ze2Var2, ze2<qo> ze2Var3, ze2<ApplicationInfo> ze2Var4, ze2<an1> ze2Var5) {
        this.f3939a = ze2Var;
        this.f3940b = ze2Var2;
        this.f3941c = ze2Var3;
        this.d = ze2Var4;
        this.e = ze2Var5;
    }

    public static jc1 a(ze2<gc> ze2Var, ze2<ScheduledExecutorService> ze2Var2, ze2<qo> ze2Var3, ze2<ApplicationInfo> ze2Var4, ze2<an1> ze2Var5) {
        return new jc1(ze2Var, ze2Var2, ze2Var3, ze2Var4, ze2Var5);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new ec1(this.f3939a.get(), this.f3940b.get(), this.f3941c.get(), this.d.get(), this.e.get());
    }
}
