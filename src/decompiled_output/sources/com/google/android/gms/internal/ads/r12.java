package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final /* synthetic */ class r12 {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f5087a;

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ int[] f5088b;

    /* renamed from: c, reason: collision with root package name */
    static final /* synthetic */ int[] f5089c;

    static {
        int[] r0 = new int[j32.values().length];
        f5089c = r0;
        try {
            r0[j32.UNCOMPRESSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f5089c[j32.DO_NOT_USE_CRUNCHY_UNCOMPRESSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f5089c[j32.COMPRESSED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] r3 = new int[x32.values().length];
        f5088b = r3;
        try {
            r3[x32.NIST_P256.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f5088b[x32.NIST_P384.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f5088b[x32.NIST_P521.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        int[] r32 = new int[y32.values().length];
        f5087a = r32;
        try {
            r32[y32.SHA1.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f5087a[y32.SHA256.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f5087a[y32.SHA512.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
    }
}
