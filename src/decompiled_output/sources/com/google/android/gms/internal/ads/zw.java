package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zw {
    public static rw a(final Context context, final hy hyVar, final String str, final boolean z, final boolean z2, @androidx.annotation.i0 final i52 i52Var, final f1 f1Var, final as asVar, v0 v0Var, final com.google.android.gms.ads.internal.k kVar, final com.google.android.gms.ads.internal.b bVar, final tu2 tu2Var, final ut2 ut2Var, final boolean z3, final km1 km1Var, final lm1 lm1Var) throws dx {
        e0.a(context);
        if (m2.f4331b.a().booleanValue()) {
            return oy.a(context, hyVar, str, z, z2, i52Var, f1Var, asVar, null, kVar, bVar, tu2Var, ut2Var, z3, km1Var, lm1Var);
        }
        try {
            final v0 v0Var2 = null;
            return (rw) ar.b(new cv1(context, hyVar, str, z, z2, i52Var, f1Var, asVar, v0Var2, kVar, bVar, tu2Var, ut2Var, z3, km1Var, lm1Var) { // from class: com.google.android.gms.internal.ads.bx

                /* renamed from: a, reason: collision with root package name */
                private final Context f2891a;

                /* renamed from: b, reason: collision with root package name */
                private final hy f2892b;

                /* renamed from: c, reason: collision with root package name */
                private final String f2893c;
                private final boolean d;
                private final boolean e;
                private final i52 f;
                private final f1 g;
                private final as h;
                private final v0 i = null;
                private final com.google.android.gms.ads.internal.k j;
                private final com.google.android.gms.ads.internal.b k;
                private final tu2 l;
                private final ut2 m;
                private final boolean n;
                private final km1 o;
                private final lm1 p;

                {
                    this.f2891a = context;
                    this.f2892b = hyVar;
                    this.f2893c = str;
                    this.d = z;
                    this.e = z2;
                    this.f = i52Var;
                    this.g = f1Var;
                    this.h = asVar;
                    this.j = kVar;
                    this.k = bVar;
                    this.l = tu2Var;
                    this.m = ut2Var;
                    this.n = z3;
                    this.o = km1Var;
                    this.p = lm1Var;
                }

                @Override // com.google.android.gms.internal.ads.cv1
                public final Object get() {
                    Context context2 = this.f2891a;
                    hy hyVar2 = this.f2892b;
                    String str2 = this.f2893c;
                    boolean z4 = this.d;
                    boolean z5 = this.e;
                    i52 i52Var2 = this.f;
                    f1 f1Var2 = this.g;
                    as asVar2 = this.h;
                    v0 v0Var3 = this.i;
                    com.google.android.gms.ads.internal.k kVar2 = this.j;
                    com.google.android.gms.ads.internal.b bVar2 = this.k;
                    tu2 tu2Var2 = this.l;
                    cx cxVar = new cx(hx.R0(context2, hyVar2, str2, z4, z5, i52Var2, f1Var2, asVar2, v0Var3, kVar2, bVar2, tu2Var2, this.m, this.n, this.o, this.p));
                    cxVar.setWebViewClient(com.google.android.gms.ads.internal.p.e().f(cxVar, tu2Var2, z5));
                    cxVar.setWebChromeClient(new jw(cxVar));
                    return cxVar;
                }
            });
        } catch (Throwable th) {
            throw new dx("Webview initialization failed.", th);
        }
    }

    public static dy1<rw> b(final Context context, final as asVar, final String str, final i52 i52Var, final com.google.android.gms.ads.internal.b bVar) {
        return qx1.j(qx1.g(null), new ax1(context, i52Var, asVar, bVar, str) { // from class: com.google.android.gms.internal.ads.yw

            /* renamed from: a, reason: collision with root package name */
            private final Context f6188a;

            /* renamed from: b, reason: collision with root package name */
            private final i52 f6189b;

            /* renamed from: c, reason: collision with root package name */
            private final as f6190c;
            private final com.google.android.gms.ads.internal.b d;
            private final String e;

            {
                this.f6188a = context;
                this.f6189b = i52Var;
                this.f6190c = asVar;
                this.d = bVar;
                this.e = str;
            }

            @Override // com.google.android.gms.internal.ads.ax1
            public final dy1 a(Object obj) throws dx {
                Context context2 = this.f6188a;
                i52 i52Var2 = this.f6189b;
                as asVar2 = this.f6190c;
                com.google.android.gms.ads.internal.b bVar2 = this.d;
                String str2 = this.e;
                com.google.android.gms.ads.internal.p.d();
                rw rwVarA = zw.a(context2, hy.b(), "", false, false, i52Var2, null, asVar2, null, null, bVar2, tu2.f(), null, false, null, null);
                ls lsVarF = ls.f(rwVarA);
                rwVarA.C0().m(new dy(lsVarF) { // from class: com.google.android.gms.internal.ads.ax

                    /* renamed from: a, reason: collision with root package name */
                    private final ls f2760a;

                    {
                        this.f2760a = lsVarF;
                    }

                    @Override // com.google.android.gms.internal.ads.dy
                    public final void a(boolean z) {
                        this.f2760a.g();
                    }
                });
                rwVarA.loadUrl(str2);
                return lsVarF;
            }
        }, cs.e);
    }
}
