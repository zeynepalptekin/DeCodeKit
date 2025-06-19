package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class in2 implements go2 {
    private final go2[] d;

    public in2(go2[] go2VarArr) {
        this.d = go2VarArr;
    }

    @Override // com.google.android.gms.internal.ads.go2
    public final long a() {
        long jMin = Long.MAX_VALUE;
        for (go2 go2Var : this.d) {
            long jA = go2Var.a();
            if (jA != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jA);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.gms.internal.ads.go2
    public final boolean b(long j) {
        boolean zB;
        boolean z = false;
        do {
            long jA = a();
            if (jA == Long.MIN_VALUE) {
                break;
            }
            zB = false;
            for (go2 go2Var : this.d) {
                if (go2Var.a() == jA) {
                    zB |= go2Var.b(j);
                }
            }
            z |= zB;
        } while (zB);
        return z;
    }
}
