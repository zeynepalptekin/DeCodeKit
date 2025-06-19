package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class s31 implements pe2<p31> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Context> f5216a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<ek0> f5217b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<Executor> f5218c;

    public s31(ze2<Context> ze2Var, ze2<ek0> ze2Var2, ze2<Executor> ze2Var3) {
        this.f5216a = ze2Var;
        this.f5217b = ze2Var2;
        this.f5218c = ze2Var3;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new p31(this.f5216a.get(), this.f5217b.get(), this.f5218c.get());
    }
}
