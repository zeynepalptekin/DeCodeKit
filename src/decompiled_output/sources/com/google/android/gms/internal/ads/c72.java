package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

/* loaded from: classes.dex */
public final class c72 {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<SecureRandom> f2939a = new b72();

    /* JADX INFO: Access modifiers changed from: private */
    public static SecureRandom a() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }

    public static byte[] c(int r1) {
        byte[] bArr = new byte[r1];
        f2939a.get().nextBytes(bArr);
        return bArr;
    }
}
