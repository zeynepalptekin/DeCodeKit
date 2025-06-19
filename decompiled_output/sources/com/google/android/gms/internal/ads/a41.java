package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.ia0;

/* loaded from: classes.dex */
public final class a41 extends b41<e50> {

    /* renamed from: a, reason: collision with root package name */
    private final gz f2628a;

    /* renamed from: b, reason: collision with root package name */
    private final ia0.a f2629b;

    /* renamed from: c, reason: collision with root package name */
    private final m61 f2630c;
    private final qf0 d;
    private final zj0 e;
    private final gd0 f;
    private final ViewGroup g;

    public a41(gz gzVar, ia0.a aVar, m61 m61Var, qf0 qf0Var, zj0 zj0Var, gd0 gd0Var, @androidx.annotation.i0 ViewGroup viewGroup) {
        this.f2628a = gzVar;
        this.f2629b = aVar;
        this.f2630c = m61Var;
        this.d = qf0Var;
        this.e = zj0Var;
        this.f = gd0Var;
        this.g = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.b41
    protected final dy1<e50> c(an1 an1Var, Bundle bundle) {
        return this.f2628a.l().f(this.f2629b.c(an1Var).j(bundle).d()).c(this.d).h(this.f2630c).e(this.e).q(new x60(this.f)).m(new z40(this.g)).x().c().g();
    }
}
