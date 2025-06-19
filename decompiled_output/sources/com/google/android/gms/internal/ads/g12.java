package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.j42;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class g12 extends vz1<s32, t32> {
    private static final byte[] e = new byte[0];

    g12() {
        super(s32.class, t32.class, new f12(az1.class));
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final j42.a d() {
        return j42.a.ASYMMETRIC_PRIVATE;
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final iz1<o32, s32> g() {
        return new i12(this, o32.class);
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final /* synthetic */ void h(xa2 xa2Var) throws GeneralSecurityException {
        s32 s32Var = (s32) xa2Var;
        if (s32Var.N().isEmpty()) {
            throw new GeneralSecurityException("invalid ECIES private key");
        }
        d72.b(s32Var.H(), 0);
        o12.d(s32Var.O().O());
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final /* synthetic */ xa2 i(a82 a82Var) throws w92 {
        return s32.S(a82Var, y82.b());
    }
}
