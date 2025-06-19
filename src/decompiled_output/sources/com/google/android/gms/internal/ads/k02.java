package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.j42;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class k02 extends jz1<v22> {
    k02() {
        super(v22.class, new n02(wy1.class));
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final j42.a d() {
        return j42.a.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final iz1<w22, v22> g() {
        return new m02(this, w22.class);
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final /* synthetic */ void h(xa2 xa2Var) throws GeneralSecurityException {
        v22 v22Var = (v22) xa2Var;
        d72.b(v22Var.H(), 0);
        d72.a(v22Var.N().size());
        if (v22Var.O().H() != 12 && v22Var.O().H() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final /* synthetic */ xa2 i(a82 a82Var) throws w92 {
        return v22.S(a82Var, y82.b());
    }
}
