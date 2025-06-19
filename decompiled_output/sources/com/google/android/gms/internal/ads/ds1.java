package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class ds1 extends yr1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f3168a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f3169b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f3170c;

    private ds1(String str, boolean z, boolean z2) {
        this.f3168a = str;
        this.f3169b = z;
        this.f3170c = z2;
    }

    @Override // com.google.android.gms.internal.ads.yr1
    public final String a() {
        return this.f3168a;
    }

    @Override // com.google.android.gms.internal.ads.yr1
    public final boolean b() {
        return this.f3169b;
    }

    @Override // com.google.android.gms.internal.ads.yr1
    public final boolean d() {
        return this.f3170c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yr1) {
            yr1 yr1Var = (yr1) obj;
            if (this.f3168a.equals(yr1Var.a()) && this.f3169b == yr1Var.b() && this.f3170c == yr1Var.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f3168a.hashCode() ^ 1000003) * 1000003) ^ (this.f3169b ? 1231 : 1237)) * 1000003) ^ (this.f3170c ? 1231 : 1237);
    }

    public final String toString() {
        String str = this.f3168a;
        boolean z = this.f3169b;
        boolean z2 = this.f3170c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 99);
        sb.append("AdShield2Options{clientVersion=");
        sb.append(str);
        sb.append(", shouldGetAdvertisingId=");
        sb.append(z);
        sb.append(", isGooglePlayServicesAvailable=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
