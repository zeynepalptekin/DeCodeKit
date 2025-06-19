package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class xs2 {

    /* renamed from: a, reason: collision with root package name */
    final long f6034a;

    /* renamed from: b, reason: collision with root package name */
    final String f6035b;

    /* renamed from: c, reason: collision with root package name */
    final int f6036c;

    xs2(long j, String str, int r4) {
        this.f6034a = j;
        this.f6035b = str;
        this.f6036c = r4;
    }

    public final boolean equals(@androidx.annotation.i0 Object obj) {
        if (obj != null && (obj instanceof xs2)) {
            xs2 xs2Var = (xs2) obj;
            if (xs2Var.f6034a == this.f6034a && xs2Var.f6036c == this.f6036c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.f6034a;
    }
}
