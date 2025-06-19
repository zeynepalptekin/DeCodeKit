package com.google.android.gms.internal.ads;

import java.util.UUID;

/* loaded from: classes.dex */
public final class ph2 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f4816a;

    /* renamed from: b, reason: collision with root package name */
    public static final UUID f4817b;

    /* renamed from: c, reason: collision with root package name */
    private static final UUID f4818c;
    private static final UUID d;
    private static final UUID e;

    static {
        f4816a = nq2.f4592a < 23 ? b.i.p.a0.v : 6396;
        f4817b = new UUID(0L, 0L);
        f4818c = new UUID(1186680826959645954L, -5988876978535335093L);
        d = new UUID(-1301668207276963122L, -6645017420763422227L);
        e = new UUID(-7348484286925749626L, -6083546864340672619L);
    }

    public static long a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j / 1000;
    }

    public static long b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j * 1000;
    }
}
