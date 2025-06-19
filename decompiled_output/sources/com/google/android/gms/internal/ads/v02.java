package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.j42;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class v02 extends jz1<v42> {
    v02() {
        super(v42.class, new u02(wy1.class));
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final j42.a d() {
        return j42.a.REMOTE;
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final iz1<y42, v42> g() {
        return new x02(this, y42.class);
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final /* synthetic */ void h(xa2 xa2Var) throws GeneralSecurityException {
        d72.b(((v42) xa2Var).H(), 0);
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final /* synthetic */ xa2 i(a82 a82Var) throws w92 {
        return v42.Q(a82Var, y82.b());
    }
}
