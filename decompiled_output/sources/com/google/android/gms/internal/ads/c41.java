package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.ia0;

/* loaded from: classes.dex */
public final class c41 extends b41<gi0> {

    /* renamed from: a, reason: collision with root package name */
    private final gz f2920a;

    /* renamed from: b, reason: collision with root package name */
    private final ia0.a f2921b;

    /* renamed from: c, reason: collision with root package name */
    private final m61 f2922c;
    private final qf0 d;

    public c41(gz gzVar, ia0.a aVar, m61 m61Var, qf0 qf0Var) {
        this.f2920a = gzVar;
        this.f2921b = aVar;
        this.f2922c = m61Var;
        this.d = qf0Var;
    }

    @Override // com.google.android.gms.internal.ads.b41
    protected final dy1<gi0> c(an1 an1Var, Bundle bundle) {
        return this.f2920a.p().w(this.f2921b.c(an1Var).j(bundle).d()).B(this.d).b(this.f2922c).o().b().g();
    }
}
