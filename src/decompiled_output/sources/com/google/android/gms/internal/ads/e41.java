package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.ia0;

/* loaded from: classes.dex */
public final class e41 extends b41<qq0> {

    /* renamed from: a, reason: collision with root package name */
    private final gz f3216a;

    /* renamed from: b, reason: collision with root package name */
    private final ia0.a f3217b;

    /* renamed from: c, reason: collision with root package name */
    private final qf0 f3218c;

    public e41(gz gzVar, ia0.a aVar, qf0 qf0Var) {
        this.f3216a = gzVar;
        this.f3217b = aVar;
        this.f3218c = qf0Var;
    }

    @Override // com.google.android.gms.internal.ads.b41
    protected final dy1<qq0> c(an1 an1Var, Bundle bundle) {
        return this.f3216a.r().n(this.f3217b.c(an1Var).j(bundle).d()).u(this.f3218c).p().b().g();
    }
}
