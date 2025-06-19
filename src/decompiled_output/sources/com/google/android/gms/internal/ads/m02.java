package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
final class m02 extends iz1<w22, v22> {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ k02 f4325b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m02(k02 k02Var, Class cls) {
        super(cls);
        this.f4325b = k02Var;
    }

    @Override // com.google.android.gms.internal.ads.iz1
    public final /* synthetic */ void b(xa2 xa2Var) throws GeneralSecurityException {
        w22 w22Var = (w22) xa2Var;
        d72.a(w22Var.H());
        if (w22Var.I().H() != 12 && w22Var.I().H() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    @Override // com.google.android.gms.internal.ads.iz1
    public final /* synthetic */ v22 c(xa2 xa2Var) throws GeneralSecurityException {
        w22 w22Var = (w22) xa2Var;
        return (v22) ((l92) v22.Q().x(a82.S(c72.c(w22Var.H()))).v(w22Var.I()).w(0).P());
    }

    @Override // com.google.android.gms.internal.ads.iz1
    public final /* synthetic */ xa2 d(a82 a82Var) throws w92 {
        return w22.K(a82Var, y82.b());
    }
}
