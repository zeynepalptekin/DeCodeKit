package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class l91 implements pe2<dy1<p91>> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<cr1> f4221a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<o91> f4222b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<fa0> f4223c;

    public l91(ze2<cr1> ze2Var, ze2<o91> ze2Var2, ze2<fa0> ze2Var3) {
        this.f4221a = ze2Var;
        this.f4222b = ze2Var2;
        this.f4223c = ze2Var3;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (dy1) we2.b(this.f4221a.get().b(zq1.GENERATE_SIGNALS, this.f4223c.get().b()).b(this.f4222b.get()).a(((Integer) qx2.e().c(e0.J3)).intValue(), TimeUnit.SECONDS).f(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
