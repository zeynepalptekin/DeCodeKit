package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class aa1 implements ff1<Object> {

    /* renamed from: a, reason: collision with root package name */
    private final dy1<String> f2658a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f2659b;

    public aa1(dy1<String> dy1Var, Executor executor) {
        this.f2658a = dy1Var;
        this.f2659b = executor;
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final dy1<Object> a() {
        return qx1.j(this.f2658a, z91.f6237a, this.f2659b);
    }
}
