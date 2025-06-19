package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import java.util.List;

/* loaded from: classes.dex */
public final class ih1 {

    /* renamed from: a, reason: collision with root package name */
    private final wi f3825a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3826b;

    public ih1(wi wiVar, int r2) {
        this.f3825a = wiVar;
        this.f3826b = r2;
    }

    public final String a() {
        return this.f3825a.g;
    }

    public final String b() {
        return this.f3825a.d.getString("ms");
    }

    @androidx.annotation.i0
    public final PackageInfo c() {
        return this.f3825a.i;
    }

    public final boolean d() {
        return this.f3825a.k;
    }

    public final List<String> e() {
        return this.f3825a.h;
    }

    public final ApplicationInfo f() {
        return this.f3825a.f;
    }

    public final String g() {
        return this.f3825a.l;
    }

    public final int h() {
        return this.f3826b;
    }
}
