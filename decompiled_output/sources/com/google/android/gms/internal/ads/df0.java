package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class df0 extends pf0<com.google.android.gms.ads.c0.a> implements d6 {
    public df0(Set<ch0<com.google.android.gms.ads.c0.a>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.d6
    public final synchronized void Q(final String str, final String str2) {
        A0(new rf0(str, str2) { // from class: com.google.android.gms.internal.ads.cf0

            /* renamed from: a, reason: collision with root package name */
            private final String f2963a;

            /* renamed from: b, reason: collision with root package name */
            private final String f2964b;

            {
                this.f2963a = str;
                this.f2964b = str2;
            }

            @Override // com.google.android.gms.internal.ads.rf0
            public final void a(Object obj) {
                ((com.google.android.gms.ads.c0.a) obj).Q(this.f2963a, this.f2964b);
            }
        });
    }
}
