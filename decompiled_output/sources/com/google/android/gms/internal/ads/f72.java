package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes.dex */
public final class f72 extends y52 {
    public f72(byte[] bArr) throws InvalidKeyException {
        super(bArr);
    }

    @Override // com.google.android.gms.internal.ads.y52, com.google.android.gms.internal.ads.wy1
    public final /* bridge */ /* synthetic */ byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return super.a(bArr, bArr2);
    }

    @Override // com.google.android.gms.internal.ads.y52
    final w52 b(byte[] bArr, int r3) throws InvalidKeyException {
        return new g72(bArr, r3);
    }
}
