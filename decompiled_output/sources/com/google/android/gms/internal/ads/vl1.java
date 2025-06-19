package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class vl1 implements pe2<ql1> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Context> f5702a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Executor> f5703b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<gz> f5704c;
    private final ze2<ik1<tq0, qq0>> d;
    private final ze2<qk1> e;
    private final ze2<cn1> f;
    private final ze2<zm1> g;

    public vl1(ze2<Context> ze2Var, ze2<Executor> ze2Var2, ze2<gz> ze2Var3, ze2<ik1<tq0, qq0>> ze2Var4, ze2<qk1> ze2Var5, ze2<cn1> ze2Var6, ze2<zm1> ze2Var7) {
        this.f5702a = ze2Var;
        this.f5703b = ze2Var2;
        this.f5704c = ze2Var3;
        this.d = ze2Var4;
        this.e = ze2Var5;
        this.f = ze2Var6;
        this.g = ze2Var7;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new ql1(this.f5702a.get(), this.f5703b.get(), this.f5704c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
    }
}
