package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class fs1 extends bs1 {

    /* renamed from: a, reason: collision with root package name */
    private String f3453a;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f3454b;

    /* renamed from: c, reason: collision with root package name */
    private Boolean f3455c;

    fs1() {
    }

    @Override // com.google.android.gms.internal.ads.bs1
    public final yr1 a() {
        String strConcat = this.f3453a == null ? "".concat(" clientVersion") : "";
        if (this.f3454b == null) {
            strConcat = String.valueOf(strConcat).concat(" shouldGetAdvertisingId");
        }
        if (this.f3455c == null) {
            strConcat = String.valueOf(strConcat).concat(" isGooglePlayServicesAvailable");
        }
        if (strConcat.isEmpty()) {
            return new ds1(this.f3453a, this.f3454b.booleanValue(), this.f3455c.booleanValue());
        }
        String strValueOf = String.valueOf(strConcat);
        throw new IllegalStateException(strValueOf.length() != 0 ? "Missing required properties:".concat(strValueOf) : new String("Missing required properties:"));
    }

    @Override // com.google.android.gms.internal.ads.bs1
    public final bs1 b(boolean z) {
        this.f3454b = Boolean.valueOf(z);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.bs1
    public final bs1 c(boolean z) {
        this.f3455c = Boolean.TRUE;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.bs1
    public final bs1 d(String str) {
        if (str == null) {
            throw new NullPointerException("Null clientVersion");
        }
        this.f3453a = str;
        return this;
    }
}
