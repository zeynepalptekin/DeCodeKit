package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public class po2 implements xo2 {

    /* renamed from: a, reason: collision with root package name */
    private final lo2 f4852a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4853b;

    /* renamed from: c, reason: collision with root package name */
    private final int[] f4854c;
    private final di2[] d;
    private final long[] e;
    private int f;

    public po2(lo2 lo2Var, int... r6) {
        int r1 = 0;
        vp2.e(r6.length > 0);
        this.f4852a = (lo2) vp2.d(lo2Var);
        int length = r6.length;
        this.f4853b = length;
        this.d = new di2[length];
        for (int r0 = 0; r0 < r6.length; r0++) {
            this.d[r0] = lo2Var.a(r6[r0]);
        }
        Arrays.sort(this.d, new ro2());
        this.f4854c = new int[this.f4853b];
        while (true) {
            int r62 = this.f4853b;
            if (r1 >= r62) {
                this.e = new long[r62];
                return;
            } else {
                this.f4854c[r1] = lo2Var.b(this.d[r1]);
                r1++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.xo2
    public final lo2 a() {
        return this.f4852a;
    }

    @Override // com.google.android.gms.internal.ads.xo2
    public final di2 b(int r2) {
        return this.d[r2];
    }

    @Override // com.google.android.gms.internal.ads.xo2
    public final int c(int r2) {
        return this.f4854c[0];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            po2 po2Var = (po2) obj;
            if (this.f4852a == po2Var.f4852a && Arrays.equals(this.f4854c, po2Var.f4854c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f == 0) {
            this.f = (System.identityHashCode(this.f4852a) * 31) + Arrays.hashCode(this.f4854c);
        }
        return this.f;
    }

    @Override // com.google.android.gms.internal.ads.xo2
    public final int length() {
        return this.f4854c.length;
    }
}
