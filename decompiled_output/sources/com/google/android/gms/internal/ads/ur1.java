package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class ur1 implements Runnable {
    private final /* synthetic */ vs1 d;

    ur1(vs1 vs1Var) {
        this.d = vs1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        if (this.d.f5731b != null) {
            return;
        }
        synchronized (vs1.f5729c) {
            if (this.d.f5731b != null) {
                return;
            }
            boolean z = false;
            try {
                zBooleanValue = e0.A1.a().booleanValue();
            } catch (IllegalStateException unused) {
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                try {
                    vs1.d = new yu2(this.d.f5730a.f3958a, "ADSHIELD", null);
                    z = zBooleanValue;
                } catch (Throwable unused2) {
                }
            } else {
                z = zBooleanValue;
            }
            this.d.f5731b = Boolean.valueOf(z);
            vs1.f5729c.open();
        }
    }
}
