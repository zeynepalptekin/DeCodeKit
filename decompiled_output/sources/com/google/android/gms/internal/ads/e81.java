package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class e81 {

    /* renamed from: a, reason: collision with root package name */
    private final ul0 f3233a;

    /* renamed from: b, reason: collision with root package name */
    private final s71 f3234b;

    /* renamed from: c, reason: collision with root package name */
    private final cb0 f3235c;

    public e81(ul0 ul0Var) {
        final s71 s71Var = new s71();
        this.f3234b = s71Var;
        this.f3233a = ul0Var;
        final v8 v8VarE = ul0Var.e();
        this.f3235c = new cb0(s71Var, v8VarE) { // from class: com.google.android.gms.internal.ads.d81
            private final s71 d;
            private final v8 e;

            {
                this.d = s71Var;
                this.e = v8VarE;
            }

            @Override // com.google.android.gms.internal.ads.cb0
            public final void i(dw2 dw2Var) {
                s71 s71Var2 = this.d;
                v8 v8Var = this.e;
                s71Var2.i(dw2Var);
                if (v8Var != null) {
                    try {
                        v8Var.a5(dw2Var);
                    } catch (RemoteException e) {
                        tr.e("#007 Could not call remote method.", e);
                    }
                }
                if (v8Var != null) {
                    try {
                        v8Var.U6(dw2Var.d);
                    } catch (RemoteException e2) {
                        tr.e("#007 Could not call remote method.", e2);
                    }
                }
            }
        };
    }

    public final zj0 a() {
        return new zj0(this.f3233a, this.f3234b.a());
    }

    public final s71 b() {
        return this.f3234b;
    }

    public final bb0 c() {
        return this.f3234b;
    }

    public final nc0 d() {
        return this.f3234b;
    }

    public final cb0 e() {
        return this.f3235c;
    }

    public final tb0 f() {
        return this.f3234b;
    }

    public final zv2 g() {
        return this.f3234b;
    }

    public final void h(xx2 xx2Var) {
        this.f3234b.b(xx2Var);
    }
}
