package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class w02 implements wy1 {

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f5761c = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    private final m42 f5762a;

    /* renamed from: b, reason: collision with root package name */
    private final wy1 f5763b;

    public w02(m42 m42Var, wy1 wy1Var) {
        this.f5762a = m42Var;
        this.f5763b = wy1Var;
    }

    @Override // com.google.android.gms.internal.ads.wy1
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrF = uz1.p(this.f5762a).f();
        byte[] bArrA = this.f5763b.a(bArrF, f5761c);
        byte[] bArrA2 = ((wy1) uz1.i(this.f5762a.H(), bArrF, wy1.class)).a(bArr, bArr2);
        return ByteBuffer.allocate(bArrA.length + 4 + bArrA2.length).putInt(bArrA.length).put(bArrA).put(bArrA2).array();
    }
}
