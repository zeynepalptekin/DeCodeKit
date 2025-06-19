package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final /* synthetic */ class g62 {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f3504a;

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ int[] f3505b;

    static {
        int[] r0 = new int[k62.values().length];
        f3505b = r0;
        try {
            r0[k62.NIST_P256.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f3505b[k62.NIST_P384.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f3505b[k62.NIST_P521.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] r3 = new int[i62.values().length];
        f3504a = r3;
        try {
            r3[i62.UNCOMPRESSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f3504a[i62.DO_NOT_USE_CRUNCHY_UNCOMPRESSED.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f3504a[i62.COMPRESSED.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
