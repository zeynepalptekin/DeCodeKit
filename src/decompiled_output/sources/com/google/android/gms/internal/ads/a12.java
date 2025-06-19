package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.j42;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class a12 extends jz1<j52> {
    a12() {
        super(j52.class, new d12(wy1.class));
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final j42.a d() {
        return j42.a.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final iz1<k52, j52> g() {
        return new c12(this, k52.class);
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final /* synthetic */ void h(xa2 xa2Var) throws GeneralSecurityException {
        j52 j52Var = (j52) xa2Var;
        d72.b(j52Var.H(), 0);
        if (j52Var.L().size() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final /* synthetic */ xa2 i(a82 a82Var) throws w92 {
        return j52.Q(a82Var, y82.b());
    }
}
