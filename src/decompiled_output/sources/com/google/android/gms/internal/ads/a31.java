package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class a31 implements pj0 {

    /* renamed from: a, reason: collision with root package name */
    private final km1 f2623a;

    /* renamed from: b, reason: collision with root package name */
    private final ye f2624b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f2625c;

    @androidx.annotation.i0
    private ob0 d = null;

    a31(km1 km1Var, ye yeVar, boolean z) {
        this.f2623a = km1Var;
        this.f2624b = yeVar;
        this.f2625c = z;
    }

    @Override // com.google.android.gms.internal.ads.pj0
    public final void a(boolean z, Context context) throws oj0 {
        try {
            if (!(this.f2625c ? this.f2624b.h7(c.a.b.b.e.e.i2(context)) : this.f2624b.x6(c.a.b.b.e.e.i2(context)))) {
                throw new oj0("Adapter failed to show.");
            }
            if (this.d == null) {
                return;
            }
            if (((Boolean) qx2.e().c(e0.p1)).booleanValue() || this.f2623a.S != 2) {
                return;
            }
            this.d.U();
        } catch (Throwable th) {
            throw new oj0(th);
        }
    }

    public final void b(ob0 ob0Var) {
        this.d = ob0Var;
    }
}
