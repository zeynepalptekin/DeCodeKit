package com.google.android.gms.internal.ads;

import com.google.android.gms.measurement.c.a;

/* loaded from: classes.dex */
public final class gq {

    /* renamed from: a, reason: collision with root package name */
    public final String f3566a;

    /* renamed from: b, reason: collision with root package name */
    private final double f3567b;

    /* renamed from: c, reason: collision with root package name */
    private final double f3568c;
    public final double d;
    public final int e;

    public gq(String str, double d, double d2, double d3, int r8) {
        this.f3566a = str;
        this.f3568c = d;
        this.f3567b = d2;
        this.d = d3;
        this.e = r8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gq)) {
            return false;
        }
        gq gqVar = (gq) obj;
        return com.google.android.gms.common.internal.q.b(this.f3566a, gqVar.f3566a) && this.f3567b == gqVar.f3567b && this.f3568c == gqVar.f3568c && this.e == gqVar.e && Double.compare(this.d, gqVar.d) == 0;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.q.c(this.f3566a, Double.valueOf(this.f3567b), Double.valueOf(this.f3568c), Double.valueOf(this.d), Integer.valueOf(this.e));
    }

    public final String toString() {
        return com.google.android.gms.common.internal.q.d(this).a(a.C0190a.f6334b, this.f3566a).a("minBound", Double.valueOf(this.f3568c)).a("maxBound", Double.valueOf(this.f3567b)).a("percent", Double.valueOf(this.d)).a("count", Integer.valueOf(this.e)).toString();
    }
}
