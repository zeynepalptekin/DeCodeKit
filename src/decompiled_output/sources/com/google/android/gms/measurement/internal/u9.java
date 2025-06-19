package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
abstract class u9 extends r9 {

    /* renamed from: c, reason: collision with root package name */
    private boolean f6535c;

    u9(t9 t9Var) {
        super(t9Var);
        this.f6502b.q(this);
    }

    final boolean p() {
        return this.f6535c;
    }

    protected final void q() {
        if (!p()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void r() {
        if (this.f6535c) {
            throw new IllegalStateException("Can't initialize twice");
        }
        s();
        this.f6502b.l0();
        this.f6535c = true;
    }

    protected abstract boolean s();
}
