package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
final class q12 implements b62 {

    /* renamed from: a, reason: collision with root package name */
    private final String f4936a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4937b;

    /* renamed from: c, reason: collision with root package name */
    private a32 f4938c;
    private k22 d;
    private int e;

    q12(m42 m42Var) throws GeneralSecurityException {
        String strH = m42Var.H();
        this.f4936a = strH;
        if (strH.equals(a02.f2614b)) {
            try {
                d32 d32VarJ = d32.J(m42Var.I(), y82.b());
                this.f4938c = (a32) uz1.p(m42Var);
                this.f4937b = d32VarJ.H();
                return;
            } catch (w92 e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        }
        if (!this.f4936a.equals(a02.f2613a)) {
            String strValueOf = String.valueOf(this.f4936a);
            throw new GeneralSecurityException(strValueOf.length() != 0 ? "unsupported AEAD DEM key type: ".concat(strValueOf) : new String("unsupported AEAD DEM key type: "));
        }
        try {
            n22 n22VarK = n22.K(m42Var.I(), y82.b());
            this.d = (k22) uz1.p(m42Var);
            this.e = n22VarK.H().H();
            this.f4937b = this.e + n22VarK.I().H();
        } catch (w92 e2) {
            throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.b62
    public final int a() {
        return this.f4937b;
    }

    @Override // com.google.android.gms.internal.ads.b62
    public final wy1 b(byte[] bArr) throws GeneralSecurityException {
        xa2 xa2Var;
        if (bArr.length != this.f4937b) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        }
        if (this.f4936a.equals(a02.f2614b)) {
            xa2Var = (a32) ((l92) a32.M().k(this.f4938c).w(a82.P(bArr, 0, this.f4937b)).P());
        } else {
            if (!this.f4936a.equals(a02.f2613a)) {
                throw new GeneralSecurityException("unknown DEM key type");
            }
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, this.e);
            byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, this.e, this.f4937b);
            o22 o22Var = (o22) ((l92) o22.O().k(this.d.O()).x(a82.S(bArrCopyOfRange)).P());
            xa2Var = (k22) ((l92) k22.R().x(this.d.H()).v(o22Var).w((a42) ((l92) a42.O().k(this.d.Q()).v(a82.S(bArrCopyOfRange2)).P())).P());
        }
        return (wy1) uz1.h(this.f4936a, xa2Var, wy1.class);
    }
}
