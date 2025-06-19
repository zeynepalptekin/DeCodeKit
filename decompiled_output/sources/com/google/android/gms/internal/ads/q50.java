package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class q50 implements pe2<ch0<nc0>> {

    /* renamed from: a, reason: collision with root package name */
    private final h50 f4953a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Context> f4954b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<as> f4955c;
    private final ze2<km1> d;
    private final ze2<an1> e;

    public q50(h50 h50Var, ze2<Context> ze2Var, ze2<as> ze2Var2, ze2<km1> ze2Var3, ze2<an1> ze2Var4) {
        this.f4953a = h50Var;
        this.f4954b = ze2Var;
        this.f4955c = ze2Var2;
        this.d = ze2Var3;
        this.e = ze2Var4;
    }

    public static ch0<nc0> a(h50 h50Var, final Context context, final as asVar, final km1 km1Var, final an1 an1Var) {
        return (ch0) we2.b(new ch0(new nc0(context, asVar, km1Var, an1Var) { // from class: com.google.android.gms.internal.ads.k50
            private final Context d;
            private final as e;
            private final km1 f;
            private final an1 g;

            {
                this.d = context;
                this.e = asVar;
                this.f = km1Var;
                this.g = an1Var;
            }

            @Override // com.google.android.gms.internal.ads.nc0
            public final void u() {
                com.google.android.gms.ads.internal.p.m().c(this.d, this.e.d, this.f.B.toString(), this.g.f);
            }
        }, cs.f), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return a(this.f4953a, this.f4954b.get(), this.f4955c.get(), this.d.get(), this.e.get());
    }
}
