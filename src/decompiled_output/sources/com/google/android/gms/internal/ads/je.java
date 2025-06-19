package com.google.android.gms.internal.ads;

import c.a.a.a;

/* loaded from: classes.dex */
final /* synthetic */ class je {

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ int[] f3945a;

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ int[] f3946b;

    static {
        int[] r0 = new int[a.EnumC0118a.values().length];
        f3946b = r0;
        try {
            r0[a.EnumC0118a.INTERNAL_ERROR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f3946b[a.EnumC0118a.INVALID_REQUEST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f3946b[a.EnumC0118a.NETWORK_ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f3946b[a.EnumC0118a.NO_FILL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] r3 = new int[a.b.values().length];
        f3945a = r3;
        try {
            r3[a.b.FEMALE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f3945a[a.b.MALE.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f3945a[a.b.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
