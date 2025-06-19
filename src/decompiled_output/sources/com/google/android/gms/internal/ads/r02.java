package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
final class r02 extends iz1<d32, a32> {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ p02 f5083b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r02(p02 p02Var, Class cls) {
        super(cls);
        this.f5083b = p02Var;
    }

    @Override // com.google.android.gms.internal.ads.iz1
    public final /* synthetic */ void b(xa2 xa2Var) throws GeneralSecurityException {
        d72.a(((d32) xa2Var).H());
    }

    @Override // com.google.android.gms.internal.ads.iz1
    public final /* synthetic */ a32 c(xa2 xa2Var) throws GeneralSecurityException {
        return (a32) ((l92) a32.M().w(a82.S(c72.c(((d32) xa2Var).H()))).v(0).P());
    }

    @Override // com.google.android.gms.internal.ads.iz1
    public final /* synthetic */ xa2 d(a82 a82Var) throws w92 {
        return d32.J(a82Var, y82.b());
    }
}
