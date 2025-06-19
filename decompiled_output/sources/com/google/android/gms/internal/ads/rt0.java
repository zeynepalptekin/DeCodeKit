package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class rt0 implements ir1 {
    private Map<zq1, tt0> d;
    private tu2 e;

    rt0(tu2 tu2Var, Map<zq1, tt0> map) {
        this.d = map;
        this.e = tu2Var;
    }

    @Override // com.google.android.gms.internal.ads.ir1
    public final void a(zq1 zq1Var, String str) {
    }

    @Override // com.google.android.gms.internal.ads.ir1
    public final void b(zq1 zq1Var, String str) {
        if (this.d.containsKey(zq1Var)) {
            this.e.b(this.d.get(zq1Var).f5445a);
        }
    }

    @Override // com.google.android.gms.internal.ads.ir1
    public final void c(zq1 zq1Var, String str) {
        if (this.d.containsKey(zq1Var)) {
            this.e.b(this.d.get(zq1Var).f5446b);
        }
    }

    @Override // com.google.android.gms.internal.ads.ir1
    public final void d(zq1 zq1Var, String str, Throwable th) {
        if (this.d.containsKey(zq1Var)) {
            this.e.b(this.d.get(zq1Var).f5447c);
        }
    }
}
