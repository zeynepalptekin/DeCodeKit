package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class r5 implements Runnable {
    private final /* synthetic */ ca d;
    private final /* synthetic */ ma e;
    private final /* synthetic */ c5 f;

    r5(c5 c5Var, ca caVar, ma maVar) {
        this.f = c5Var;
        this.d = caVar;
        this.e = maVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.e.k0();
        if (this.d.h() == null) {
            this.f.e.R(this.d, this.e);
        } else {
            this.f.e.s(this.d, this.e);
        }
    }
}
