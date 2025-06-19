package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class cd0 extends pf0<hd0> implements tb0, xc0 {
    private final km1 e;
    private AtomicBoolean f;

    public cd0(Set<ch0<hd0>> set, km1 km1Var) {
        super(set);
        this.f = new AtomicBoolean();
        this.e = km1Var;
    }

    private final void I0() {
        sw2 sw2Var;
        if (((Boolean) qx2.e().c(e0.b5)).booleanValue() && this.f.compareAndSet(false, true) && (sw2Var = this.e.a0) != null && sw2Var.d == 3) {
            A0(new rf0(this) { // from class: com.google.android.gms.internal.ads.fd0

                /* renamed from: a, reason: collision with root package name */
                private final cd0 f3400a;

                {
                    this.f3400a = this;
                }

                @Override // com.google.android.gms.internal.ads.rf0
                public final void a(Object obj) throws Exception {
                    this.f3400a.H0((hd0) obj);
                }
            });
        }
    }

    final /* synthetic */ void H0(hd0 hd0Var) throws Exception {
        hd0Var.b(this.e.a0);
    }

    @Override // com.google.android.gms.internal.ads.tb0
    public final void U() {
        int r0 = this.e.f4112b;
        if (r0 == 2 || r0 == 5 || r0 == 4) {
            I0();
        }
    }

    @Override // com.google.android.gms.internal.ads.xc0
    public final void b2() {
        if (this.e.f4112b == 1) {
            I0();
        }
    }
}
