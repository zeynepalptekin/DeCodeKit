package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class lo2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f4287a;

    /* renamed from: b, reason: collision with root package name */
    private final di2[] f4288b;

    /* renamed from: c, reason: collision with root package name */
    private int f4289c;

    public lo2(di2... di2VarArr) {
        vp2.e(di2VarArr.length > 0);
        this.f4288b = di2VarArr;
        this.f4287a = di2VarArr.length;
    }

    public final di2 a(int r2) {
        return this.f4288b[r2];
    }

    public final int b(di2 di2Var) {
        int r0 = 0;
        while (true) {
            di2[] di2VarArr = this.f4288b;
            if (r0 >= di2VarArr.length) {
                return -1;
            }
            if (di2Var == di2VarArr[r0]) {
                return r0;
            }
            r0++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lo2.class == obj.getClass()) {
            lo2 lo2Var = (lo2) obj;
            if (this.f4287a == lo2Var.f4287a && Arrays.equals(this.f4288b, lo2Var.f4288b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f4289c == 0) {
            this.f4289c = Arrays.hashCode(this.f4288b) + 527;
        }
        return this.f4289c;
    }
}
