package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class uw0 implements pe2<sw0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<ScheduledExecutorService> f5604a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<cy1> f5605b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<nx0> f5606c;
    private final ze2<my0> d;

    public uw0(ze2<ScheduledExecutorService> ze2Var, ze2<cy1> ze2Var2, ze2<nx0> ze2Var3, ze2<my0> ze2Var4) {
        this.f5604a = ze2Var;
        this.f5605b = ze2Var2;
        this.f5606c = ze2Var3;
        this.d = ze2Var4;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new sw0(this.f5604a.get(), this.f5605b.get(), this.f5606c.get(), me2.b(this.d));
    }
}
