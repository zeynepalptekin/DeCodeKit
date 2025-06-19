package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

/* loaded from: classes.dex */
public final class qc0 extends pf0<com.google.android.gms.ads.k0.a> implements b6 {
    private Bundle e;

    public qc0(Set<ch0<com.google.android.gms.ads.k0.a>> set) {
        super(set);
        this.e = new Bundle();
    }

    public final synchronized Bundle H0() {
        return new Bundle(this.e);
    }

    @Override // com.google.android.gms.internal.ads.b6
    public final synchronized void e(String str, Bundle bundle) {
        this.e.putAll(bundle);
        A0(pc0.f4801a);
    }
}
