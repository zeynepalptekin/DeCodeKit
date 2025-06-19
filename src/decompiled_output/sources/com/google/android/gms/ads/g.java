package com.google.android.gms.ads;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final int f2393a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2394b;

    /* renamed from: c, reason: collision with root package name */
    private final long f2395c;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
        public static final int h = 0;
        public static final int i = 1;
        public static final int j = 2;
        public static final int k = 3;
    }

    private g(int r1, String str, long j) {
        this.f2393a = r1;
        this.f2394b = str;
        this.f2395c = j;
    }

    public static g d(int r1, String str, long j) {
        return new g(r1, str, j);
    }

    public final String a() {
        return this.f2394b;
    }

    public final int b() {
        return this.f2393a;
    }

    public final long c() {
        return this.f2395c;
    }
}
