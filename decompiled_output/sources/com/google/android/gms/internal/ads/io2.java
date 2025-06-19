package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class io2 extends ni2 {
    private static final Object h = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final long f3849b;

    /* renamed from: c, reason: collision with root package name */
    private final long f3850c;
    private final long d;
    private final long e;
    private final boolean f;
    private final boolean g;

    private io2(long j, long j2, long j3, long j4, boolean z, boolean z2) {
        this.f3849b = j;
        this.f3850c = j2;
        this.d = 0L;
        this.e = 0L;
        this.f = z;
        this.g = false;
    }

    public io2(long j, boolean z) {
        this(j, j, 0L, 0L, z, false);
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final qi2 c(int r10, qi2 qi2Var, boolean z) {
        vp2.g(r10, 0, 1);
        Object obj = z ? h : null;
        return qi2Var.a(obj, obj, 0, this.f3849b, 0L, false);
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final ti2 e(int r3, ti2 ti2Var, boolean z, long j) {
        vp2.g(r3, 0, 1);
        boolean z2 = this.f;
        long j2 = this.f3850c;
        ti2Var.f5407a = null;
        ti2Var.f5408b = -9223372036854775807L;
        ti2Var.f5409c = -9223372036854775807L;
        ti2Var.d = z2;
        ti2Var.e = false;
        ti2Var.h = 0L;
        ti2Var.i = j2;
        ti2Var.f = 0;
        ti2Var.g = 0;
        ti2Var.j = 0L;
        return ti2Var;
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final int f(Object obj) {
        return h.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final int g() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.ni2
    public final int h() {
        return 1;
    }
}
