package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
final class l02 extends iz1<r22, o22> {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ j02 f4174b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l02(j02 j02Var, Class cls) {
        super(cls);
        this.f4174b = j02Var;
    }

    @Override // com.google.android.gms.internal.ads.iz1
    public final /* synthetic */ void b(xa2 xa2Var) throws GeneralSecurityException {
        r22 r22Var = (r22) xa2Var;
        d72.a(r22Var.H());
        j02 j02Var = this.f4174b;
        j02.k(r22Var.I());
    }

    @Override // com.google.android.gms.internal.ads.iz1
    public final /* synthetic */ o22 c(xa2 xa2Var) throws GeneralSecurityException {
        r22 r22Var = (r22) xa2Var;
        return (o22) ((l92) o22.O().v(r22Var.I()).x(a82.S(c72.c(r22Var.H()))).w(0).P());
    }

    @Override // com.google.android.gms.internal.ads.iz1
    public final /* synthetic */ xa2 d(a82 a82Var) throws w92 {
        return r22.L(a82Var, y82.b());
    }
}
