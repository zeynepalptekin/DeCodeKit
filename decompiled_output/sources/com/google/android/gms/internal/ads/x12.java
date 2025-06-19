package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
final class x12 extends lz1<pz1, a42> {
    x12(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.lz1
    public final /* synthetic */ pz1 a(a42 a42Var) throws GeneralSecurityException {
        a42 a42Var2 = a42Var;
        y32 y32VarI = a42Var2.N().I();
        SecretKeySpec secretKeySpec = new SecretKeySpec(a42Var2.M().c(), "HMAC");
        int r5 = a42Var2.N().H();
        int r0 = z12.f6211a[y32VarI.ordinal()];
        if (r0 == 1) {
            return new z62(new x62("HMACSHA1", secretKeySpec), r5);
        }
        if (r0 == 2) {
            return new z62(new x62("HMACSHA256", secretKeySpec), r5);
        }
        if (r0 == 3) {
            return new z62(new x62("HMACSHA512", secretKeySpec), r5);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}
