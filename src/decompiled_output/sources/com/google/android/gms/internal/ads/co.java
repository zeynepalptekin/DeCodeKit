package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class co extends ko {
    private final /* synthetic */ ao d;

    co(ao aoVar) {
        this.d = aoVar;
    }

    @Override // com.google.android.gms.internal.ads.ko
    public final void b() {
        i0 i0Var = new i0(this.d.f, this.d.g.d);
        synchronized (this.d.f2722a) {
            try {
                com.google.android.gms.ads.internal.p.l();
                n0.a(this.d.h, i0Var);
            } catch (IllegalArgumentException e) {
                tr.d("Cannot config CSI reporter.", e);
            }
        }
    }
}
