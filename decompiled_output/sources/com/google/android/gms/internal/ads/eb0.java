package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class eb0 extends pf0<fb0> implements fb0 {
    public eb0(ib0 ib0Var, Set<ch0<fb0>> set, Executor executor) {
        super(set);
        F0(ib0Var, executor);
    }

    @Override // com.google.android.gms.internal.ads.fb0
    public final void S(final dw2 dw2Var) {
        A0(new rf0(dw2Var) { // from class: com.google.android.gms.internal.ads.hb0

            /* renamed from: a, reason: collision with root package name */
            private final dw2 f3652a;

            {
                this.f3652a = dw2Var;
            }

            @Override // com.google.android.gms.internal.ads.rf0
            public final void a(Object obj) {
                ((fb0) obj).S(this.f3652a);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.fb0
    public final void k0() {
        A0(jb0.f3937a);
    }

    @Override // com.google.android.gms.internal.ads.fb0
    public final void v0(final oj0 oj0Var) {
        A0(new rf0(oj0Var) { // from class: com.google.android.gms.internal.ads.gb0

            /* renamed from: a, reason: collision with root package name */
            private final oj0 f3517a;

            {
                this.f3517a = oj0Var;
            }

            @Override // com.google.android.gms.internal.ads.rf0
            public final void a(Object obj) {
                ((fb0) obj).v0(this.f3517a);
            }
        });
    }
}
