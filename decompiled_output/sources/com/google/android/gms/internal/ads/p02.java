package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.j42;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class p02 extends jz1<a32> {
    p02() {
        super(a32.class, new o02(wy1.class));
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final j42.a d() {
        return j42.a.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final iz1<d32, a32> g() {
        return new r02(this, d32.class);
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final /* synthetic */ void h(xa2 xa2Var) throws GeneralSecurityException {
        a32 a32Var = (a32) xa2Var;
        d72.b(a32Var.H(), 0);
        d72.a(a32Var.L().size());
    }

    @Override // com.google.android.gms.internal.ads.jz1
    public final /* synthetic */ xa2 i(a82 a82Var) throws w92 {
        return a32.O(a82Var, y82.b());
    }
}
