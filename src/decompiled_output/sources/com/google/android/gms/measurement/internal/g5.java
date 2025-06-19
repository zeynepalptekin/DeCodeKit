package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
abstract class g5 extends d2 {

    /* renamed from: b, reason: collision with root package name */
    private boolean f6396b;

    g5(b5 b5Var) {
        super(b5Var);
        this.f6543a.f(this);
    }

    final boolean r() {
        return this.f6396b;
    }

    protected final void s() {
        if (!r()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void t() {
        if (this.f6396b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (v()) {
            return;
        }
        this.f6543a.p();
        this.f6396b = true;
    }

    public final void u() {
        if (this.f6396b) {
            throw new IllegalStateException("Can't initialize twice");
        }
        w();
        this.f6543a.p();
        this.f6396b = true;
    }

    protected abstract boolean v();

    protected void w() {
    }
}
