package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class mp2 implements gp2 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f4437a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4438b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f4439c;
    private final dp2[] d;
    private int e;
    private int f;
    private int g;
    private dp2[] h;

    public mp2(boolean z, int r3) {
        this(true, 65536, 0);
    }

    private mp2(boolean z, int r2, int r3) {
        vp2.a(true);
        vp2.a(true);
        this.f4437a = true;
        this.f4438b = 65536;
        this.g = 0;
        this.h = new dp2[100];
        this.f4439c = null;
        this.d = new dp2[1];
    }

    @Override // com.google.android.gms.internal.ads.gp2
    public final synchronized void I() {
        int r0 = Math.max(0, nq2.q(this.e, this.f4438b) - this.f);
        if (r0 >= this.g) {
            return;
        }
        Arrays.fill(this.h, r0, this.g, (Object) null);
        this.g = r0;
    }

    @Override // com.google.android.gms.internal.ads.gp2
    public final int a() {
        return this.f4438b;
    }

    @Override // com.google.android.gms.internal.ads.gp2
    public final synchronized void b(dp2 dp2Var) {
        this.d[0] = dp2Var;
        c(this.d);
    }

    @Override // com.google.android.gms.internal.ads.gp2
    public final synchronized void c(dp2[] dp2VarArr) {
        if (this.g + dp2VarArr.length >= this.h.length) {
            this.h = (dp2[]) Arrays.copyOf(this.h, Math.max(this.h.length << 1, this.g + dp2VarArr.length));
        }
        for (dp2 dp2Var : dp2VarArr) {
            vp2.a(dp2Var.f3159a == null || dp2Var.f3159a.length == this.f4438b);
            dp2[] dp2VarArr2 = this.h;
            int r6 = this.g;
            this.g = r6 + 1;
            dp2VarArr2[r6] = dp2Var;
        }
        this.f -= dp2VarArr.length;
        notifyAll();
    }

    @Override // com.google.android.gms.internal.ads.gp2
    public final synchronized dp2 d() {
        dp2 dp2Var;
        this.f++;
        if (this.g > 0) {
            dp2[] dp2VarArr = this.h;
            int r1 = this.g - 1;
            this.g = r1;
            dp2Var = dp2VarArr[r1];
            this.h[r1] = null;
        } else {
            dp2Var = new dp2(new byte[this.f4438b], 0);
        }
        return dp2Var;
    }

    public final synchronized void e() {
        if (this.f4437a) {
            f(0);
        }
    }

    public final synchronized void f(int r2) {
        boolean z = r2 < this.e;
        this.e = r2;
        if (z) {
            I();
        }
    }

    public final synchronized int g() {
        return this.f * this.f4438b;
    }
}
