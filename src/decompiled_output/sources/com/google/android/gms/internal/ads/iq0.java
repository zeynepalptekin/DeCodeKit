package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class iq0 implements pe2<hq0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Context> f3855a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Executor> f3856b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<i52> f3857c;
    private final ze2<as> d;
    private final ze2<com.google.android.gms.ads.internal.b> e;
    private final ze2<zw> f;

    public iq0(ze2<Context> ze2Var, ze2<Executor> ze2Var2, ze2<i52> ze2Var3, ze2<as> ze2Var4, ze2<com.google.android.gms.ads.internal.b> ze2Var5, ze2<zw> ze2Var6) {
        this.f3855a = ze2Var;
        this.f3856b = ze2Var2;
        this.f3857c = ze2Var3;
        this.d = ze2Var4;
        this.e = ze2Var5;
        this.f = ze2Var6;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new hq0(this.f3855a.get(), this.f3856b.get(), this.f3857c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
