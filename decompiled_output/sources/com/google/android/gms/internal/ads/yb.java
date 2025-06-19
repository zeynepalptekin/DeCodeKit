package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class yb {

    /* renamed from: a, reason: collision with root package name */
    private da f6115a;

    /* renamed from: b, reason: collision with root package name */
    private dy1<cb> f6116b;

    yb(da daVar) {
        this.f6115a = daVar;
    }

    private final void d() {
        if (this.f6116b == null) {
            final ks ksVar = new ks();
            this.f6116b = ksVar;
            this.f6115a.h(null).d(new os(ksVar) { // from class: com.google.android.gms.internal.ads.xb

                /* renamed from: a, reason: collision with root package name */
                private final ks f5960a;

                {
                    this.f5960a = ksVar;
                }

                @Override // com.google.android.gms.internal.ads.os
                public final void a(Object obj) {
                    this.f5960a.a((cb) obj);
                }
            }, new ms(ksVar) { // from class: com.google.android.gms.internal.ads.ac

                /* renamed from: a, reason: collision with root package name */
                private final ks f2664a;

                {
                    this.f2664a = ksVar;
                }

                @Override // com.google.android.gms.internal.ads.ms
                public final void run() {
                    this.f2664a.b(new hb("Cannot get Javascript Engine"));
                }
            });
        }
    }

    public final <I, O> bc<I, O> a(String str, lb<I> lbVar, ib<O> ibVar) {
        d();
        return new bc<>(this.f6116b, str, lbVar, ibVar);
    }

    public final void b(final String str, final z6<? super cb> z6Var) {
        d();
        this.f6116b = qx1.j(this.f6116b, new ax1(str, z6Var) { // from class: com.google.android.gms.internal.ads.zb

            /* renamed from: a, reason: collision with root package name */
            private final String f6243a;

            /* renamed from: b, reason: collision with root package name */
            private final z6 f6244b;

            {
                this.f6243a = str;
                this.f6244b = z6Var;
            }

            @Override // com.google.android.gms.internal.ads.ax1
            public final dy1 a(Object obj) {
                cb cbVar = (cb) obj;
                cbVar.o(this.f6243a, this.f6244b);
                return qx1.g(cbVar);
            }
        }, cs.f);
    }

    public final void c(final String str, final z6<? super cb> z6Var) {
        this.f6116b = qx1.i(this.f6116b, new ru1(str, z6Var) { // from class: com.google.android.gms.internal.ads.cc

            /* renamed from: a, reason: collision with root package name */
            private final String f2954a;

            /* renamed from: b, reason: collision with root package name */
            private final z6 f2955b;

            {
                this.f2954a = str;
                this.f2955b = z6Var;
            }

            @Override // com.google.android.gms.internal.ads.ru1
            public final Object a(Object obj) {
                cb cbVar = (cb) obj;
                cbVar.j(this.f2954a, this.f2955b);
                return cbVar;
            }
        }, cs.f);
    }
}
