package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
final class o12 {
    public static i62 a(j32 j32Var) throws GeneralSecurityException {
        int r0 = r12.f5089c[j32Var.ordinal()];
        if (r0 == 1) {
            return i62.UNCOMPRESSED;
        }
        if (r0 == 2) {
            return i62.DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
        }
        if (r0 == 3) {
            return i62.COMPRESSED;
        }
        String strValueOf = String.valueOf(j32Var);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 22);
        sb.append("unknown point format: ");
        sb.append(strValueOf);
        throw new GeneralSecurityException(sb.toString());
    }

    public static k62 b(x32 x32Var) throws GeneralSecurityException {
        int r0 = r12.f5088b[x32Var.ordinal()];
        if (r0 == 1) {
            return k62.NIST_P256;
        }
        if (r0 == 2) {
            return k62.NIST_P384;
        }
        if (r0 == 3) {
            return k62.NIST_P521;
        }
        String strValueOf = String.valueOf(x32Var);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 20);
        sb.append("unknown curve type: ");
        sb.append(strValueOf);
        throw new GeneralSecurityException(sb.toString());
    }

    public static String c(y32 y32Var) throws NoSuchAlgorithmException {
        int r0 = r12.f5087a[y32Var.ordinal()];
        if (r0 == 1) {
            return "HmacSha1";
        }
        if (r0 == 2) {
            return "HmacSha256";
        }
        if (r0 == 3) {
            return "HmacSha512";
        }
        String strValueOf = String.valueOf(y32Var);
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 27);
        sb.append("hash unsupported for HMAC: ");
        sb.append(strValueOf);
        throw new NoSuchAlgorithmException(sb.toString());
    }

    public static void d(p32 p32Var) throws GeneralSecurityException {
        h62.d(b(p32Var.H().H()));
        c(p32Var.H().I());
        if (p32Var.J() == j32.UNKNOWN_FORMAT) {
            throw new GeneralSecurityException("unknown EC point format");
        }
        uz1.e(p32Var.I().H());
    }
}
