package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.j42;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class j02 extends jz1<o22> {
    j02() {
        super(o22.class, new i02(v62.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void k(s22 s22Var) throws GeneralSecurityException {
        if (s22Var.H() < 12 || s22Var.H() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final j42.a d() {
        return j42.a.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final iz1<r22, o22> g() {
        return new l02(this, r22.class);
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final /* synthetic */ void h(xa2 xa2Var) throws GeneralSecurityException {
        o22 o22Var = (o22) xa2Var;
        d72.b(o22Var.H(), 0);
        d72.a(o22Var.M().size());
        k(o22Var.N());
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final /* synthetic */ xa2 i(a82 a82Var) throws w92 {
        return o22.T(a82Var, y82.b());
    }
}
