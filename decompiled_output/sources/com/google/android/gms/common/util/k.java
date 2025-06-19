package com.google.android.gms.common.util;

import android.os.SystemClock;
import androidx.annotation.RecentlyNonNull;

@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public class k implements g {

    /* renamed from: a, reason: collision with root package name */
    private static final k f2583a = new k();

    private k() {
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static g e() {
        return f2583a;
    }

    @Override // com.google.android.gms.common.util.g
    @RecentlyNonNull
    public long a() {
        return System.currentTimeMillis();
    }

    @Override // com.google.android.gms.common.util.g
    @RecentlyNonNull
    public long b() {
        return SystemClock.currentThreadTimeMillis();
    }

    @Override // com.google.android.gms.common.util.g
    @RecentlyNonNull
    public long c() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.common.util.g
    @RecentlyNonNull
    public long d() {
        return System.nanoTime();
    }
}
