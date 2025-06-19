package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class ab0 extends pf0<cb0> implements cb0 {
    public ab0(Set<ch0<cb0>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.cb0
    public final void i(final dw2 dw2Var) {
        A0(new rf0(dw2Var) { // from class: com.google.android.gms.internal.ads.db0

            /* renamed from: a, reason: collision with root package name */
            private final dw2 f3103a;

            {
                this.f3103a = dw2Var;
            }

            @Override // com.google.android.gms.internal.ads.rf0
            public final void a(Object obj) {
                ((cb0) obj).i(this.f3103a);
            }
        });
    }
}
