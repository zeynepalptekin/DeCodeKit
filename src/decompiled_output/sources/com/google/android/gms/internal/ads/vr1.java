package com.google.android.gms.internal.ads;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;

@com.google.android.gms.common.util.d0
/* loaded from: classes.dex */
public final class vr1 {

    /* renamed from: c, reason: collision with root package name */
    @com.google.android.gms.common.util.d0
    private static final byte[] f5724c = {61, 122, 18, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, -64, -119, 107, -5, 79, -74, 121, -12, -34, 95, -25, -62, 63, 50, 108, -113, -103, 74};

    @com.google.android.gms.common.util.d0
    private static final byte[] d = {16, 57, 56, -18, 69, 55, -27, -98, -114, -25, -110, -10, 84, 80, 79, -72, 52, 111, -58, -77, 70, -48, -69, -60, 65, 95, -61, 57, -4, -4, -114, -63};

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f5725a = d;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f5726b = f5724c;

    private static X509Certificate b(String str) throws GeneralSecurityException {
        try {
            X509Certificate[][] x509CertificateArrH = aq.h(str);
            if (x509CertificateArrH.length == 1) {
                return x509CertificateArrH[0][0];
            }
            throw new GeneralSecurityException("APK has more than one signature.");
        } catch (oh2 e) {
            throw new GeneralSecurityException("Package is not signed", e);
        } catch (IOException e2) {
            e = e2;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        } catch (RuntimeException e3) {
            e = e3;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        }
    }

    public final boolean a(File file) throws GeneralSecurityException {
        byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(b(file.getAbsolutePath()).getEncoded());
        if (Arrays.equals(this.f5726b, bArrDigest)) {
            return true;
        }
        return !"user".equals(Build.TYPE) && Arrays.equals(this.f5725a, bArrDigest);
    }
}
