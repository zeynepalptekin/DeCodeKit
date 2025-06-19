package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class s9 extends k {
    private final /* synthetic */ t9 e;
    private final /* synthetic */ p9 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s9(p9 p9Var, x5 x5Var, t9 t9Var) {
        super(x5Var);
        this.f = p9Var;
        this.e = t9Var;
    }

    @Override // com.google.android.gms.measurement.internal.k
    public final void b() {
        this.f.u();
        this.f.B().N().a("Starting upload from DelayedRunnable");
        this.e.j0();
    }
}
