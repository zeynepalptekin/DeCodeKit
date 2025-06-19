package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class ni0 implements pe2<ch0<nc0>> {

    /* renamed from: a, reason: collision with root package name */
    private final hi0 f4541a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Context> f4542b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<as> f4543c;
    private final ze2<km1> d;
    private final ze2<an1> e;

    private ni0(hi0 hi0Var, ze2<Context> ze2Var, ze2<as> ze2Var2, ze2<km1> ze2Var3, ze2<an1> ze2Var4) {
        this.f4541a = hi0Var;
        this.f4542b = ze2Var;
        this.f4543c = ze2Var2;
        this.d = ze2Var3;
        this.e = ze2Var4;
    }

    public static ni0 a(hi0 hi0Var, ze2<Context> ze2Var, ze2<as> ze2Var2, ze2<km1> ze2Var3, ze2<an1> ze2Var4) {
        return new ni0(hi0Var, ze2Var, ze2Var2, ze2Var3, ze2Var4);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        final Context context = this.f4542b.get();
        final as asVar = this.f4543c.get();
        final km1 km1Var = this.d.get();
        final an1 an1Var = this.e.get();
        return (ch0) we2.b(new ch0(new nc0(context, asVar, km1Var, an1Var) { // from class: com.google.android.gms.internal.ads.ki0
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
}
