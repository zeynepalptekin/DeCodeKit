package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.z;
import java.util.Set;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class vh0 extends pf0<z.a> {

    @GuardedBy("this")
    private boolean e;

    protected vh0(Set<ch0<z.a>> set) {
        super(set);
    }

    public final void H0() {
        A0(xh0.f5977a);
    }

    public final void I0() {
        A0(uh0.f5521a);
    }

    public final synchronized void J0() {
        if (!this.e) {
            A0(zh0.f6263a);
            this.e = true;
        }
        A0(yh0.f6138a);
    }

    public final synchronized void K0() {
        A0(wh0.f5833a);
        this.e = true;
    }
}
