package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class y70 implements com.google.android.gms.ads.internal.overlay.p {
    private final cc0 d;
    private AtomicBoolean e = new AtomicBoolean(false);

    public y70(cc0 cc0Var) {
        this.d = cc0Var;
    }

    public final boolean a() {
        return this.e.get();
    }

    @Override // com.google.android.gms.ads.internal.overlay.p
    public final void onPause() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.p
    public final void onResume() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.p
    public final void q4() {
        this.d.J0();
    }

    @Override // com.google.android.gms.ads.internal.overlay.p
    public final void r6() {
        this.e.set(true);
        this.d.H0();
    }
}
