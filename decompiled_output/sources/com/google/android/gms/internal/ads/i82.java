package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class i82 {

    /* renamed from: a, reason: collision with root package name */
    private final v82 f3787a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f3788b;

    private i82(int r1) {
        byte[] bArr = new byte[r1];
        this.f3788b = bArr;
        this.f3787a = v82.E0(bArr);
    }

    /* synthetic */ i82(int r1, z72 z72Var) {
        this(r1);
    }

    public final a82 a() {
        this.f3787a.D();
        return new k82(this.f3788b);
    }

    public final v82 b() {
        return this.f3787a;
    }
}
