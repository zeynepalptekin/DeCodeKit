package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class x21 implements pe2<r21> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Context> f5923a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<as> f5924b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<an1> f5925c;
    private final ze2<Executor> d;
    private final ze2<hj0> e;
    private final ze2<dr0> f;

    public x21(ze2<Context> ze2Var, ze2<as> ze2Var2, ze2<an1> ze2Var3, ze2<Executor> ze2Var4, ze2<hj0> ze2Var5, ze2<dr0> ze2Var6) {
        this.f5923a = ze2Var;
        this.f5924b = ze2Var2;
        this.f5925c = ze2Var3;
        this.d = ze2Var4;
        this.e = ze2Var5;
        this.f = ze2Var6;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new r21(this.f5923a.get(), this.f5924b.get(), this.f5925c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
