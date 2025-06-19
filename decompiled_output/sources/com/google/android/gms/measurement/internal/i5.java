package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class i5 implements Runnable {
    private final /* synthetic */ va d;
    private final /* synthetic */ ma e;
    private final /* synthetic */ c5 f;

    i5(c5 c5Var, va vaVar, ma maVar) {
        this.f = c5Var;
        this.d = vaVar;
        this.e = maVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.e.k0();
        if (this.d.f.h() == null) {
            this.f.e.U(this.d, this.e);
        } else {
            this.f.e.v(this.d, this.e);
        }
    }
}
