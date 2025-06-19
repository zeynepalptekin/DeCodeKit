package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class nd0 extends pf0<od0> implements od0 {
    public nd0(Set<ch0<od0>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void e0(final wi wiVar) {
        A0(new rf0(wiVar) { // from class: com.google.android.gms.internal.ads.md0

            /* renamed from: a, reason: collision with root package name */
            private final wi f4387a;

            {
                this.f4387a = wiVar;
            }

            @Override // com.google.android.gms.internal.ads.rf0
            public final void a(Object obj) {
                ((od0) obj).e0(this.f4387a);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.od0
    public final void t(final wm1 wm1Var) {
        A0(new rf0(wm1Var) { // from class: com.google.android.gms.internal.ads.pd0

            /* renamed from: a, reason: collision with root package name */
            private final wm1 f4804a;

            {
                this.f4804a = wm1Var;
            }

            @Override // com.google.android.gms.internal.ads.rf0
            public final void a(Object obj) {
                ((od0) obj).t(this.f4804a);
            }
        });
    }
}
