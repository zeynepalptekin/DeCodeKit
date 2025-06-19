package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes.dex */
public final class z62 implements pz1 {

    /* renamed from: a, reason: collision with root package name */
    private final c22 f6228a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6229b;

    public z62(c22 c22Var, int r3) throws GeneralSecurityException {
        this.f6228a = c22Var;
        this.f6229b = r3;
        if (r3 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        c22Var.a(new byte[0], r3);
    }

    @Override // com.google.android.gms.internal.ads.pz1
    public final byte[] a(byte[] bArr) throws GeneralSecurityException {
        return this.f6228a.a(bArr, this.f6229b);
    }
}
