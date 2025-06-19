package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
final class g02 extends iz1<n22, k22> {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ f02 f3484b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g02(f02 f02Var, Class cls) {
        super(cls);
        this.f3484b = f02Var;
    }

    @Override // com.google.android.gms.internal.ads.iz1
    public final /* synthetic */ void b(xa2 xa2Var) throws GeneralSecurityException {
        n22 n22Var = (n22) xa2Var;
        new j02().g().b(n22Var.H());
        new u12().g().b(n22Var.I());
        d72.a(n22Var.H().H());
    }

    @Override // com.google.android.gms.internal.ads.iz1
    public final /* synthetic */ k22 c(xa2 xa2Var) throws GeneralSecurityException {
        n22 n22Var = (n22) xa2Var;
        o22 o22VarC = new j02().g().c(n22Var.H());
        return (k22) ((l92) k22.R().v(o22VarC).w(new u12().g().c(n22Var.I())).x(0).P());
    }

    @Override // com.google.android.gms.internal.ads.iz1
    public final /* synthetic */ xa2 d(a82 a82Var) throws w92 {
        return n22.K(a82Var, y82.b());
    }
}
