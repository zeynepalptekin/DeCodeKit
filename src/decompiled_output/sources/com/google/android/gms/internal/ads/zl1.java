package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zl1 implements pe2<yl1> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<String> f6282a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<ql1> f6283b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<Context> f6284c;
    private final ze2<qk1> d;
    private final ze2<zm1> e;

    public zl1(ze2<String> ze2Var, ze2<ql1> ze2Var2, ze2<Context> ze2Var3, ze2<qk1> ze2Var4, ze2<zm1> ze2Var5) {
        this.f6282a = ze2Var;
        this.f6283b = ze2Var2;
        this.f6284c = ze2Var3;
        this.d = ze2Var4;
        this.e = ze2Var5;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new yl1(this.f6282a.get(), this.f6283b.get(), this.f6284c.get(), this.d.get(), this.e.get());
    }
}
