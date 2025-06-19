package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class wb0 extends pf0<sb0> {
    public wb0(Set<ch0<sb0>> set) {
        super(set);
    }

    public final void H0(sh0 sh0Var, Executor executor) {
        D0(ch0.a(new ac0(this, sh0Var), executor));
    }

    public final void I0(final Context context) {
        A0(new rf0(context) { // from class: com.google.android.gms.internal.ads.vb0

            /* renamed from: a, reason: collision with root package name */
            private final Context f5662a;

            {
                this.f5662a = context;
            }

            @Override // com.google.android.gms.internal.ads.rf0
            public final void a(Object obj) {
                ((sb0) obj).D(this.f5662a);
            }
        });
    }

    public final void J0(final Context context) {
        A0(new rf0(context) { // from class: com.google.android.gms.internal.ads.yb0

            /* renamed from: a, reason: collision with root package name */
            private final Context f6117a;

            {
                this.f6117a = context;
            }

            @Override // com.google.android.gms.internal.ads.rf0
            public final void a(Object obj) {
                ((sb0) obj).q(this.f6117a);
            }
        });
    }

    public final void K0(final Context context) {
        A0(new rf0(context) { // from class: com.google.android.gms.internal.ads.xb0

            /* renamed from: a, reason: collision with root package name */
            private final Context f5961a;

            {
                this.f5961a = context;
            }

            @Override // com.google.android.gms.internal.ads.rf0
            public final void a(Object obj) {
                ((sb0) obj).e(this.f5961a);
            }
        });
    }
}
