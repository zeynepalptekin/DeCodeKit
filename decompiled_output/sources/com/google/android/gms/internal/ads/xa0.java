package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class xa0 implements pe2<im> {

    /* renamed from: a, reason: collision with root package name */
    private final ua0 f5956a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Context> f5957b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<as> f5958c;
    private final ze2<km1> d;
    private final ze2<km> e;

    private xa0(ua0 ua0Var, ze2<Context> ze2Var, ze2<as> ze2Var2, ze2<km1> ze2Var3, ze2<km> ze2Var4) {
        this.f5956a = ua0Var;
        this.f5957b = ze2Var;
        this.f5958c = ze2Var2;
        this.d = ze2Var3;
        this.e = ze2Var4;
    }

    public static xa0 a(ua0 ua0Var, ze2<Context> ze2Var, ze2<as> ze2Var2, ze2<km1> ze2Var3, ze2<km> ze2Var4) {
        return new xa0(ua0Var, ze2Var, ze2Var2, ze2Var3, ze2Var4);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    @androidx.annotation.i0
    public final /* synthetic */ Object get() {
        Context context = this.f5957b.get();
        as asVar = this.f5958c.get();
        km1 km1Var = this.d.get();
        km kmVar = this.e.get();
        if (km1Var.z != null) {
            return new ul(context, asVar, km1Var.z, km1Var.r.f4570b, kmVar);
        }
        return null;
    }
}
