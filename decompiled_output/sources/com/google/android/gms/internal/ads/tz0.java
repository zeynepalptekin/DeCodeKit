package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class tz0 implements cb0, nc0 {
    private static final Object e = new Object();
    private static int f;
    private final yz0 d;

    public tz0(yz0 yz0Var) {
        this.d = yz0Var;
    }

    private static boolean a() {
        boolean z;
        synchronized (e) {
            z = f < ((Integer) qx2.e().c(e0.t4)).intValue();
        }
        return z;
    }

    private final void b(boolean z) {
        if (((Boolean) qx2.e().c(e0.s4)).booleanValue() && a()) {
            this.d.f(z);
            synchronized (e) {
                f++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.cb0
    public final void i(dw2 dw2Var) {
        b(false);
    }

    @Override // com.google.android.gms.internal.ads.nc0
    public final void u() {
        b(true);
    }
}
