package com.google.android.gms.internal.ads;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

/* loaded from: classes.dex */
final class ng2 extends qj2 {
    private byte[] e;

    public ng2(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.e = bArr;
    }

    @Override // com.google.android.gms.internal.ads.qj2, java.security.cert.Certificate
    public final byte[] getEncoded() throws CertificateEncodingException {
        return this.e;
    }
}
