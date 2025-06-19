package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* loaded from: classes.dex */
final class u6 implements Runnable {
    private final /* synthetic */ Bundle d;
    private final /* synthetic */ f6 e;

    u6(f6 f6Var, Bundle bundle) {
        this.e = f6Var;
        this.d = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.E0(this.d);
    }
}
