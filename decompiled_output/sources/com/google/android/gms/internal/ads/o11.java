package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class o11 implements pe2<k11> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<d40> f4630a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Context> f4631b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<Executor> f4632c;
    private final ze2<dr0> d;

    public o11(ze2<d40> ze2Var, ze2<Context> ze2Var2, ze2<Executor> ze2Var3, ze2<dr0> ze2Var4) {
        this.f4630a = ze2Var;
        this.f4631b = ze2Var2;
        this.f4632c = ze2Var3;
        this.d = ze2Var4;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new k11(this.f4630a.get(), this.f4631b.get(), this.f4632c.get(), this.d.get());
    }
}
