package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* loaded from: classes.dex */
final class s6 implements Runnable {
    private final /* synthetic */ Bundle d;
    private final /* synthetic */ f6 e;

    s6(f6 f6Var, Bundle bundle) {
        this.e = f6Var;
        this.d = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.D0(this.d);
    }
}
