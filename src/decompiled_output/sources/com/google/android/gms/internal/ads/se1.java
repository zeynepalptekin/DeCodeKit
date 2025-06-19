package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class se1 implements pe2<qe1> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<cy1> f5249a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Context> f5250b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<as> f5251c;

    private se1(ze2<cy1> ze2Var, ze2<Context> ze2Var2, ze2<as> ze2Var3) {
        this.f5249a = ze2Var;
        this.f5250b = ze2Var2;
        this.f5251c = ze2Var3;
    }

    public static se1 a(ze2<cy1> ze2Var, ze2<Context> ze2Var2, ze2<as> ze2Var3) {
        return new se1(ze2Var, ze2Var2, ze2Var3);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new qe1(this.f5249a.get(), this.f5250b.get(), this.f5251c.get());
    }
}
