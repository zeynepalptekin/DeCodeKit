package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class o {

    /* renamed from: a, reason: collision with root package name */
    final String f6471a;

    /* renamed from: b, reason: collision with root package name */
    final String f6472b;

    /* renamed from: c, reason: collision with root package name */
    final long f6473c;
    final long d;
    final long e;
    final long f;
    final long g;
    final Long h;
    final Long i;
    final Long j;
    final Boolean k;

    o(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        com.google.android.gms.common.internal.r.g(str);
        com.google.android.gms.common.internal.r.g(str2);
        com.google.android.gms.common.internal.r.a(j >= 0);
        com.google.android.gms.common.internal.r.a(j2 >= 0);
        com.google.android.gms.common.internal.r.a(j3 >= 0);
        com.google.android.gms.common.internal.r.a(j5 >= 0);
        this.f6471a = str;
        this.f6472b = str2;
        this.f6473c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = j5;
        this.h = l;
        this.i = l2;
        this.j = l3;
        this.k = bool;
    }

    o(String str, String str2, long j, long j2, long j3, long j4, Long l, Long l2, Long l3, Boolean bool) {
        this(str, str2, 0L, 0L, 0L, j3, 0L, null, null, null, null);
    }

    final o a(long j) {
        return new o(this.f6471a, this.f6472b, this.f6473c, this.d, this.e, j, this.g, this.h, this.i, this.j, this.k);
    }

    final o b(long j, long j2) {
        return new o(this.f6471a, this.f6472b, this.f6473c, this.d, this.e, this.f, j, Long.valueOf(j2), this.i, this.j, this.k);
    }

    final o c(Long l, Long l2, Boolean bool) {
        return new o(this.f6471a, this.f6472b, this.f6473c, this.d, this.e, this.f, this.g, this.h, l, l2, (bool == null || bool.booleanValue()) ? bool : null);
    }
}
