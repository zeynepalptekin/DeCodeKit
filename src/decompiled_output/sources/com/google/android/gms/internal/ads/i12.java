package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;

/* loaded from: classes.dex */
final class i12 extends iz1<o32, s32> {

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ g12 f3750b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i12(g12 g12Var, Class cls) {
        super(cls);
        this.f3750b = g12Var;
    }

    @Override // com.google.android.gms.internal.ads.iz1
    public final /* synthetic */ void b(xa2 xa2Var) throws GeneralSecurityException {
        o12.d(((o32) xa2Var).H());
    }

    @Override // com.google.android.gms.internal.ads.iz1
    public final /* synthetic */ s32 c(xa2 xa2Var) throws GeneralSecurityException {
        o32 o32Var = (o32) xa2Var;
        KeyPair keyPairB = h62.b(h62.d(o12.b(o32Var.H().H().H())));
        ECPublicKey eCPublicKey = (ECPublicKey) keyPairB.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) keyPairB.getPrivate();
        ECPoint w = eCPublicKey.getW();
        return (s32) ((l92) s32.Q().x(0).w((t32) ((l92) t32.S().z(0).x(o32Var.H()).v(a82.S(w.getAffineX().toByteArray())).w(a82.S(w.getAffineY().toByteArray())).P())).v(a82.S(eCPrivateKey.getS().toByteArray())).P());
    }

    @Override // com.google.android.gms.internal.ads.iz1
    public final /* synthetic */ xa2 d(a82 a82Var) throws w92 {
        return o32.J(a82Var, y82.b());
    }
}
