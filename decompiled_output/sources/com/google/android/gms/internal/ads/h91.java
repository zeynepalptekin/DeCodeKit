package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class h91 implements pe2<s81> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<gz> f3642a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Context> f3643b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<i52> f3644c;
    private final ze2<as> d;
    private final ze2<pn1<up0>> e;
    private final ze2<cy1> f;
    private final ze2<ScheduledExecutorService> g;

    public h91(ze2<gz> ze2Var, ze2<Context> ze2Var2, ze2<i52> ze2Var3, ze2<as> ze2Var4, ze2<pn1<up0>> ze2Var5, ze2<cy1> ze2Var6, ze2<ScheduledExecutorService> ze2Var7) {
        this.f3642a = ze2Var;
        this.f3643b = ze2Var2;
        this.f3644c = ze2Var3;
        this.d = ze2Var4;
        this.e = ze2Var5;
        this.f = ze2Var6;
        this.g = ze2Var7;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new s81(this.f3642a.get(), this.f3643b.get(), this.f3644c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
