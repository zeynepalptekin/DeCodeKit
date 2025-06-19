package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class ko2 {
    public static final ko2 d = new ko2(new lo2[0]);

    /* renamed from: a, reason: collision with root package name */
    public final int f4129a;

    /* renamed from: b, reason: collision with root package name */
    private final lo2[] f4130b;

    /* renamed from: c, reason: collision with root package name */
    private int f4131c;

    public ko2(lo2... lo2VarArr) {
        this.f4130b = lo2VarArr;
        this.f4129a = lo2VarArr.length;
    }

    public final int a(lo2 lo2Var) {
        for (int r0 = 0; r0 < this.f4129a; r0++) {
            if (this.f4130b[r0] == lo2Var) {
                return r0;
            }
        }
        return -1;
    }

    public final lo2 b(int r2) {
        return this.f4130b[r2];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ko2.class == obj.getClass()) {
            ko2 ko2Var = (ko2) obj;
            if (this.f4129a == ko2Var.f4129a && Arrays.equals(this.f4130b, ko2Var.f4130b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f4131c == 0) {
            this.f4131c = Arrays.hashCode(this.f4130b);
        }
        return this.f4131c;
    }
}
