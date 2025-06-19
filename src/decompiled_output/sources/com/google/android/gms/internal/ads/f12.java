package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECPrivateKeySpec;

/* loaded from: classes.dex */
final class f12 extends lz1<az1, s32> {
    f12(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.lz1
    public final /* synthetic */ az1 a(s32 s32Var) throws GeneralSecurityException {
        s32 s32Var2 = s32Var;
        p32 p32VarO = s32Var2.O().O();
        w32 w32VarH = p32VarO.H();
        k62 k62VarB = o12.b(w32VarH.H());
        byte[] bArrC = s32Var2.N().c();
        return new a62((ECPrivateKey) l62.l.a("EC").generatePrivate(new ECPrivateKeySpec(new BigInteger(1, bArrC), h62.d(k62VarB))), w32VarH.J().c(), o12.c(w32VarH.I()), o12.a(p32VarO.J()), new q12(p32VarO.I().H()));
    }
}
