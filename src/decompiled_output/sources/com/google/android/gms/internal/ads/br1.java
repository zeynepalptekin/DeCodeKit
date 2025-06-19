package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
final class br1 extends pf0<ir1> implements ar1<zq1> {
    br1(Set<ch0<ir1>> set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.ar1
    public final void P(final kq1<zq1, ?> kq1Var) {
        A0(new rf0(kq1Var) { // from class: com.google.android.gms.internal.ads.fr1

            /* renamed from: a, reason: collision with root package name */
            private final kq1 f3448a;

            {
                this.f3448a = kq1Var;
            }

            @Override // com.google.android.gms.internal.ads.rf0
            public final void a(Object obj) {
                kq1 kq1Var2 = this.f3448a;
                ((ir1) obj).c((zq1) kq1Var2.a(), kq1Var2.b());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ar1
    public final void g0(final kq1<zq1, ?> kq1Var) {
        A0(new rf0(kq1Var) { // from class: com.google.android.gms.internal.ads.dr1

            /* renamed from: a, reason: collision with root package name */
            private final kq1 f3167a;

            {
                this.f3167a = kq1Var;
            }

            @Override // com.google.android.gms.internal.ads.rf0
            public final void a(Object obj) {
                kq1 kq1Var2 = this.f3167a;
                ((ir1) obj).b((zq1) kq1Var2.a(), kq1Var2.b());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ar1
    public final void r0(final kq1<zq1, ?> kq1Var, final Throwable th) {
        A0(new rf0(kq1Var, th) { // from class: com.google.android.gms.internal.ads.gr1

            /* renamed from: a, reason: collision with root package name */
            private final kq1 f3577a;

            /* renamed from: b, reason: collision with root package name */
            private final Throwable f3578b;

            {
                this.f3577a = kq1Var;
                this.f3578b = th;
            }

            @Override // com.google.android.gms.internal.ads.rf0
            public final void a(Object obj) {
                kq1 kq1Var2 = this.f3577a;
                ((ir1) obj).d((zq1) kq1Var2.a(), kq1Var2.b(), this.f3578b);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ar1
    public final void t0(final kq1<zq1, ?> kq1Var) {
        A0(new rf0(kq1Var) { // from class: com.google.android.gms.internal.ads.er1

            /* renamed from: a, reason: collision with root package name */
            private final kq1 f3319a;

            {
                this.f3319a = kq1Var;
            }

            @Override // com.google.android.gms.internal.ads.rf0
            public final void a(Object obj) {
                kq1 kq1Var2 = this.f3319a;
                ((ir1) obj).a((zq1) kq1Var2.a(), kq1Var2.b());
            }
        });
    }
}
