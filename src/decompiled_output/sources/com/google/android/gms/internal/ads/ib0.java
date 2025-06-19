package com.google.android.gms.internal.ads;

import java.util.Set;

@com.google.android.gms.common.util.d0
/* loaded from: classes.dex */
public final class ib0 extends pf0<pb0> implements fb0 {
    @com.google.android.gms.common.util.d0
    public ib0(Set<ch0<pb0>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.fb0
    public final void S(final dw2 dw2Var) {
        A0(new rf0(dw2Var) { // from class: com.google.android.gms.internal.ads.lb0

            /* renamed from: a, reason: collision with root package name */
            private final dw2 f4234a;

            {
                this.f4234a = dw2Var;
            }

            @Override // com.google.android.gms.internal.ads.rf0
            public final void a(Object obj) {
                ((pb0) obj).d(this.f4234a);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.fb0
    public final void k0() {
        A0(kb0.f4074a);
    }

    @Override // com.google.android.gms.internal.ads.fb0
    public final void v0(oj0 oj0Var) {
    }
}
