package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;

/* loaded from: classes.dex */
public final class d62 implements fz1 {
    private static final byte[] f = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    private final f62 f3076a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3077b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f3078c;
    private final i62 d;
    private final b62 e;

    public d62(ECPublicKey eCPublicKey, byte[] bArr, String str, i62 i62Var, b62 b62Var) throws GeneralSecurityException {
        h62.f(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.f3076a = new f62(eCPublicKey);
        this.f3078c = bArr;
        this.f3077b = str;
        this.d = i62Var;
        this.e = b62Var;
    }

    @Override // com.google.android.gms.internal.ads.fz1
    public final byte[] a(byte[] bArr, byte[] bArr2) throws IllegalStateException, GeneralSecurityException {
        e62 e62VarA = this.f3076a.a(this.f3077b, this.f3078c, bArr2, this.e.a(), this.d);
        byte[] bArrA = this.e.b(e62VarA.b()).a(bArr, f);
        byte[] bArrA2 = e62VarA.a();
        return ByteBuffer.allocate(bArrA2.length + bArrA.length).put(bArrA2).put(bArrA).array();
    }
}
