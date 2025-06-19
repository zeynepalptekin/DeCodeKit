package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
final class qn2 implements ho2 {

    /* renamed from: a, reason: collision with root package name */
    private final int f5041a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ hn2 f5042b;

    public qn2(hn2 hn2Var, int r2) {
        this.f5042b = hn2Var;
        this.f5041a = r2;
    }

    @Override // com.google.android.gms.internal.ads.ho2
    public final void a(long j) {
        this.f5042b.A(this.f5041a, j);
    }

    @Override // com.google.android.gms.internal.ads.ho2
    public final int b(fi2 fi2Var, bk2 bk2Var, boolean z) {
        return this.f5042b.t(this.f5041a, fi2Var, bk2Var, z);
    }

    @Override // com.google.android.gms.internal.ads.ho2
    public final void c() throws IOException {
        this.f5042b.F();
    }

    @Override // com.google.android.gms.internal.ads.ho2
    public final boolean t0() {
        return this.f5042b.x(this.f5041a);
    }
}
