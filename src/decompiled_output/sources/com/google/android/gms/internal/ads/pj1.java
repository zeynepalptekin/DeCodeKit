package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
final class pj1<R> implements qp1 {

    /* renamed from: a, reason: collision with root package name */
    public final kk1<R> f4824a;

    /* renamed from: b, reason: collision with root package name */
    public final jk1 f4825b;

    /* renamed from: c, reason: collision with root package name */
    public final jw2 f4826c;
    public final String d;
    public final Executor e;
    public final vw2 f;

    @Nullable
    private final bp1 g;

    public pj1(kk1<R> kk1Var, jk1 jk1Var, jw2 jw2Var, String str, Executor executor, vw2 vw2Var, @Nullable bp1 bp1Var) {
        this.f4824a = kk1Var;
        this.f4825b = jk1Var;
        this.f4826c = jw2Var;
        this.d = str;
        this.e = executor;
        this.f = vw2Var;
        this.g = bp1Var;
    }

    @Override // com.google.android.gms.internal.ads.qp1
    @Nullable
    public final bp1 a() {
        return this.g;
    }

    @Override // com.google.android.gms.internal.ads.qp1
    public final Executor b() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.qp1
    public final qp1 c() {
        return new pj1(this.f4824a, this.f4825b, this.f4826c, this.d, this.e, this.f, this.g);
    }
}
