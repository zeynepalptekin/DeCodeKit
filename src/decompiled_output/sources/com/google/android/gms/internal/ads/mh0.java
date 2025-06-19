package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class mh0 extends pf0<k7> implements k7 {
    public mh0(Set<ch0<k7>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void M() {
        A0(rh0.f5139a);
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final synchronized void c0() {
        A0(ph0.f4815a);
    }

    @Override // com.google.android.gms.internal.ads.k7
    public final void j0(final qk qkVar) {
        A0(new rf0(qkVar) { // from class: com.google.android.gms.internal.ads.oh0

            /* renamed from: a, reason: collision with root package name */
            private final qk f4695a;

            {
                this.f4695a = qkVar;
            }

            @Override // com.google.android.gms.internal.ads.rf0
            public final void a(Object obj) {
                ((k7) obj).j0(this.f4695a);
            }
        });
    }
}
