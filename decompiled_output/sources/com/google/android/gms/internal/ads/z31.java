package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.ia0;

/* loaded from: classes.dex */
public final class z31 extends b41<k70> {

    /* renamed from: a, reason: collision with root package name */
    private final gz f6216a;

    /* renamed from: b, reason: collision with root package name */
    private final zj0 f6217b;

    /* renamed from: c, reason: collision with root package name */
    private final ia0.a f6218c;
    private final qf0 d;

    public z31(gz gzVar, zj0 zj0Var, ia0.a aVar, qf0 qf0Var) {
        this.f6216a = gzVar;
        this.f6217b = zj0Var;
        this.f6218c = aVar;
        this.d = qf0Var;
    }

    @Override // com.google.android.gms.internal.ads.b41
    protected final dy1<k70> c(an1 an1Var, Bundle bundle) {
        return this.f6216a.q().A(this.f6218c.c(an1Var).j(bundle).d()).y(this.d).k(this.f6217b).z().c().g();
    }
}
