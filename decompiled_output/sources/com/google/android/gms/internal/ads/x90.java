package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class x90 implements pe2<ru1<km1, pp>> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Context> f5951a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<as> f5952b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<an1> f5953c;

    public x90(ze2<Context> ze2Var, ze2<as> ze2Var2, ze2<an1> ze2Var3) {
        this.f5951a = ze2Var;
        this.f5952b = ze2Var2;
        this.f5953c = ze2Var3;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        final Context context = this.f5951a.get();
        final as asVar = this.f5952b.get();
        final an1 an1Var = this.f5953c.get();
        return (ru1) we2.b(new ru1(context, asVar, an1Var) { // from class: com.google.android.gms.internal.ads.u90

            /* renamed from: a, reason: collision with root package name */
            private final Context f5490a;

            /* renamed from: b, reason: collision with root package name */
            private final as f5491b;

            /* renamed from: c, reason: collision with root package name */
            private final an1 f5492c;

            {
                this.f5490a = context;
                this.f5491b = asVar;
                this.f5492c = an1Var;
            }

            @Override // com.google.android.gms.internal.ads.ru1
            public final Object a(Object obj) {
                Context context2 = this.f5490a;
                as asVar2 = this.f5491b;
                an1 an1Var2 = this.f5492c;
                km1 km1Var = (km1) obj;
                pp ppVar = new pp(context2);
                ppVar.i(km1Var.A);
                ppVar.j(km1Var.B.toString());
                ppVar.g(asVar2.d);
                ppVar.a(an1Var2.f);
                return ppVar;
            }
        }, "Cannot return null from a non-@Nullable @Provides method");
    }
}
