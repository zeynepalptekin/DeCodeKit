package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class dp1 implements bp1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f3158a;

    public dp1(String str) {
        this.f3158a = str;
    }

    @Override // com.google.android.gms.internal.ads.bp1
    public final boolean equals(Object obj) {
        if (obj instanceof dp1) {
            return this.f3158a.equals(((dp1) obj).f3158a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.bp1
    public final int hashCode() {
        return this.f3158a.hashCode();
    }

    public final String toString() {
        return this.f3158a;
    }
}
