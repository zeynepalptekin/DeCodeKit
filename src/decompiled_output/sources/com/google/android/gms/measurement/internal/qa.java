package com.google.android.gms.measurement.internal;

import c.a.b.b.g.c.x0;

/* loaded from: classes.dex */
final /* synthetic */ class qa {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f6497a;

    /* renamed from: b, reason: collision with root package name */
    static final /* synthetic */ int[] f6498b;

    static {
        int[] r0 = new int[x0.d.a.values().length];
        f6498b = r0;
        try {
            r0[x0.d.a.LESS_THAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f6498b[x0.d.a.GREATER_THAN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f6498b[x0.d.a.EQUAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f6498b[x0.d.a.BETWEEN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] r4 = new int[x0.f.b.values().length];
        f6497a = r4;
        try {
            r4[x0.f.b.REGEXP.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f6497a[x0.f.b.BEGINS_WITH.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f6497a[x0.f.b.ENDS_WITH.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f6497a[x0.f.b.PARTIAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f6497a[x0.f.b.EXACT.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f6497a[x0.f.b.IN_LIST.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
