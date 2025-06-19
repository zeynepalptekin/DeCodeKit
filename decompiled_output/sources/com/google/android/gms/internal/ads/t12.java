package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.j42;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class t12 extends jz1<e22> {
    t12() {
        super(e22.class, new s12(pz1.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void j(j22 j22Var) throws GeneralSecurityException {
        if (j22Var.H() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (j22Var.H() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void l(int r1) throws GeneralSecurityException {
        if (r1 != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 16 bytes");
        }
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final j42.a d() {
        return j42.a.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final iz1<g22, e22> g() {
        return new v12(this, g22.class);
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final /* synthetic */ void h(xa2 xa2Var) throws GeneralSecurityException {
        e22 e22Var = (e22) xa2Var;
        d72.b(e22Var.H(), 0);
        l(e22Var.M().size());
        j(e22Var.N());
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final /* synthetic */ xa2 i(a82 a82Var) throws w92 {
        return e22.R(a82Var, y82.b());
    }
}
