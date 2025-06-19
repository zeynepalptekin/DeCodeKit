package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zo2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f6297a;

    /* renamed from: b, reason: collision with root package name */
    private final xo2[] f6298b;

    /* renamed from: c, reason: collision with root package name */
    private int f6299c;

    public zo2(xo2... xo2VarArr) {
        this.f6298b = xo2VarArr;
        this.f6297a = xo2VarArr.length;
    }

    public final xo2 a(int r2) {
        return this.f6298b[r2];
    }

    public final xo2[] b() {
        return (xo2[]) this.f6298b.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zo2.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f6298b, ((zo2) obj).f6298b);
    }

    public final int hashCode() {
        if (this.f6299c == 0) {
            this.f6299c = Arrays.hashCode(this.f6298b) + 527;
        }
        return this.f6299c;
    }
}
