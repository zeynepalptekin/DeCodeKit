package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.cf1;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class ub1<S extends cf1<?>> implements ff1<S> {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference<tb1<S>> f5499a = new AtomicReference<>();

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.common.util.g f5500b;

    /* renamed from: c, reason: collision with root package name */
    private final ff1<S> f5501c;
    private final long d;

    public ub1(ff1<S> ff1Var, long j, com.google.android.gms.common.util.g gVar) {
        this.f5500b = gVar;
        this.f5501c = ff1Var;
        this.d = j;
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final dy1<S> a() {
        tb1<S> tb1Var = this.f5499a.get();
        if (tb1Var == null || tb1Var.a()) {
            tb1Var = new tb1<>(this.f5501c.a(), this.d, this.f5500b);
            this.f5499a.set(tb1Var);
        }
        return tb1Var.f5378a;
    }
}
