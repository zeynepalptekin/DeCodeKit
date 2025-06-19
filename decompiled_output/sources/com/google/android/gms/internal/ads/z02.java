package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.j42;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class z02 extends jz1<z42> {
    z02() {
        super(z42.class, new y02(wy1.class));
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final j42.a d() {
        return j42.a.REMOTE;
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final iz1<c52, z42> g() {
        return new b12(this, c52.class);
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final /* synthetic */ void h(xa2 xa2Var) throws GeneralSecurityException {
        d72.b(((z42) xa2Var).H(), 0);
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final /* synthetic */ xa2 i(a82 a82Var) throws w92 {
        return z42.Q(a82Var, y82.b());
    }
}
