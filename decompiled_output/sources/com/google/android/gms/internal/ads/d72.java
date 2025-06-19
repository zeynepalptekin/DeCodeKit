package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class d72 {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f3087a = Pattern.compile(String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s$", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+"), 2);

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f3088b = Pattern.compile(String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s/cryptoKeyVersions/%s$", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+"), 2);

    public static void a(int r3) throws InvalidAlgorithmParameterException {
        if (r3 != 16 && r3 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(r3 << 3)));
        }
    }

    public static void b(int r2, int r3) throws GeneralSecurityException {
        if (r2 < 0 || r2 > 0) {
            throw new GeneralSecurityException(String.format("key has version %d; only keys with version in range [0..%d] are supported", Integer.valueOf(r2), 0));
        }
    }
}
