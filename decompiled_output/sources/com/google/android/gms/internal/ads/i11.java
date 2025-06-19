package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class i11 implements pe2<b11> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<p40> f3747a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Context> f3748b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<Executor> f3749c;
    private final ze2<dr0> d;
    private final ze2<an1> e;
    private final ze2<as> f;

    public i11(ze2<p40> ze2Var, ze2<Context> ze2Var2, ze2<Executor> ze2Var3, ze2<dr0> ze2Var4, ze2<an1> ze2Var5, ze2<as> ze2Var6) {
        this.f3747a = ze2Var;
        this.f3748b = ze2Var2;
        this.f3749c = ze2Var3;
        this.d = ze2Var4;
        this.e = ze2Var5;
        this.f = ze2Var6;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new b11(this.f3747a.get(), this.f3748b.get(), this.f3749c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
