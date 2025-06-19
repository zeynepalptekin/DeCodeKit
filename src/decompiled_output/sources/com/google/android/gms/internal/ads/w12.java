package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
final class w12 extends iz1<e42, a42> {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ u12 f5770b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w12(u12 u12Var, Class cls) {
        super(cls);
        this.f5770b = u12Var;
    }

    @Override // com.google.android.gms.internal.ads.iz1
    public final /* synthetic */ void b(xa2 xa2Var) throws GeneralSecurityException {
        e42 e42Var = (e42) xa2Var;
        if (e42Var.H() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        u12.j(e42Var.I());
    }

    @Override // com.google.android.gms.internal.ads.iz1
    public final /* synthetic */ a42 c(xa2 xa2Var) throws GeneralSecurityException {
        e42 e42Var = (e42) xa2Var;
        return (a42) ((l92) a42.O().x(0).w(e42Var.I()).v(a82.S(c72.c(e42Var.H()))).P());
    }

    @Override // com.google.android.gms.internal.ads.iz1
    public final /* synthetic */ xa2 d(a82 a82Var) throws w92 {
        return e42.L(a82Var, y82.b());
    }
}
