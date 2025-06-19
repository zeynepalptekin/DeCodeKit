package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
final class p12 implements fz1 {

    /* renamed from: a, reason: collision with root package name */
    private final rz1<fz1> f4773a;

    public p12(rz1<fz1> rz1Var) {
        this.f4773a = rz1Var;
    }

    @Override // com.google.android.gms.internal.ads.fz1
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return u52.c(this.f4773a.e().d(), this.f4773a.e().a().a(bArr, bArr2));
    }
}
