package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class m62 implements wy1 {

    /* renamed from: a, reason: collision with root package name */
    private final v62 f4354a;

    /* renamed from: b, reason: collision with root package name */
    private final pz1 f4355b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4356c;

    public m62(v62 v62Var, pz1 pz1Var, int r3) {
        this.f4354a = v62Var;
        this.f4355b = pz1Var;
        this.f4356c = r3;
    }

    @Override // com.google.android.gms.internal.ads.wy1
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrA = this.f4354a.a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return u52.c(bArrA, this.f4355b.a(u52.c(bArr2, bArrA, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
    }
}
