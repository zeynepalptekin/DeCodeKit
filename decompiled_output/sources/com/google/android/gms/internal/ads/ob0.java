package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class ob0 extends pf0<tb0> {
    private boolean e;

    public ob0(Set<ch0<tb0>> set) {
        super(set);
        this.e = false;
    }

    public final synchronized void U() {
        if (!this.e) {
            A0(rb0.f5121a);
            this.e = true;
        }
    }
}
