package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class z71 implements i81<e70> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ c81 f6231a;

    z71(c81 c81Var) {
        this.f6231a = c81Var;
    }

    @Override // com.google.android.gms.internal.ads.i81
    public final void a() {
        synchronized (this.f6231a) {
            c81.e(this.f6231a, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.i81
    public final /* synthetic */ void b(e70 e70Var) {
        e70 e70Var2 = e70Var;
        synchronized (this.f6231a) {
            c81.e(this.f6231a, false);
            this.f6231a.f2945c = e70Var2.d();
            e70Var2.b();
        }
    }
}
