package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
abstract class y5 extends v5 {

    /* renamed from: b, reason: collision with root package name */
    private boolean f6571b;

    y5(b5 b5Var) {
        super(b5Var);
        this.f6543a.h(this);
    }

    protected void k() {
    }

    protected final void l() {
        if (!p()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void m() {
        if (this.f6571b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (o()) {
            return;
        }
        this.f6543a.p();
        this.f6571b = true;
    }

    public final void n() {
        if (this.f6571b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        k();
        this.f6543a.p();
        this.f6571b = true;
    }

    protected abstract boolean o();

    final boolean p() {
        return this.f6571b;
    }
}
