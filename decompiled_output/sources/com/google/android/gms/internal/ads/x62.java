package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public final class x62 implements c22 {

    /* renamed from: a, reason: collision with root package name */
    private final ThreadLocal<Mac> f5942a = new a72(this);

    /* renamed from: b, reason: collision with root package name */
    private final String f5943b;

    /* renamed from: c, reason: collision with root package name */
    private final Key f5944c;
    private final int d;

    public x62(String str, Key key) throws GeneralSecurityException {
        int r5;
        this.f5943b = str;
        this.f5944c = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        char c2 = 65535;
        int r0 = str.hashCode();
        if (r0 != -1823053428) {
            if (r0 != 392315118) {
                if (r0 == 392317873 && str.equals("HMACSHA512")) {
                    c2 = 2;
                }
            } else if (str.equals("HMACSHA256")) {
                c2 = 1;
            }
        } else if (str.equals("HMACSHA1")) {
            c2 = 0;
        }
        if (c2 == 0) {
            r5 = 20;
        } else if (c2 == 1) {
            r5 = 32;
        } else {
            if (c2 != 2) {
                String strValueOf = String.valueOf(str);
                throw new NoSuchAlgorithmException(strValueOf.length() != 0 ? "unknown Hmac algorithm: ".concat(strValueOf) : new String("unknown Hmac algorithm: "));
            }
            r5 = 64;
        }
        this.d = r5;
        this.f5942a.get();
    }

    @Override // com.google.android.gms.internal.ads.c22
    public final byte[] a(byte[] bArr, int r3) throws IllegalStateException, GeneralSecurityException {
        if (r3 > this.d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        this.f5942a.get().update(bArr);
        return Arrays.copyOf(this.f5942a.get().doFinal(), r3);
    }
}
