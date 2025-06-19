package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class e61 implements com.google.android.gms.ads.internal.g {

    /* renamed from: a, reason: collision with root package name */
    private final wa0 f3221a;

    /* renamed from: b, reason: collision with root package name */
    private final ob0 f3222b;

    /* renamed from: c, reason: collision with root package name */
    private final gh0 f3223c;
    private final fh0 d;
    private final g30 e;
    private AtomicBoolean f = new AtomicBoolean(false);

    e61(wa0 wa0Var, ob0 ob0Var, gh0 gh0Var, fh0 fh0Var, g30 g30Var) {
        this.f3221a = wa0Var;
        this.f3222b = ob0Var;
        this.f3223c = gh0Var;
        this.d = fh0Var;
        this.e = g30Var;
    }

    @Override // com.google.android.gms.ads.internal.g
    public final void a() {
        if (this.f.get()) {
            this.f3222b.U();
            this.f3223c.H0();
        }
    }

    @Override // com.google.android.gms.ads.internal.g
    public final synchronized void b(View view) {
        if (this.f.compareAndSet(false, true)) {
            this.e.U();
            this.d.H0(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.g
    public final void c() {
        if (this.f.get()) {
            this.f3221a.p();
        }
    }
}
