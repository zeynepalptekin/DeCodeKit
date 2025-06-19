package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class ej1 implements i81<v40> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ aj1 f3282a;

    ej1(aj1 aj1Var) {
        this.f3282a = aj1Var;
    }

    @Override // com.google.android.gms.internal.ads.i81
    public final void a() {
        synchronized (this.f3282a) {
            this.f3282a.m = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.i81
    public final /* synthetic */ void b(v40 v40Var) {
        v40 v40Var2 = v40Var;
        synchronized (this.f3282a) {
            if (this.f3282a.m != null) {
                this.f3282a.m.a();
            }
            this.f3282a.m = v40Var2;
            this.f3282a.A8(v40Var2);
            this.f3282a.j.g(new y40(v40Var2, this.f3282a, this.f3282a.j));
            v40Var2.b();
        }
    }
}
