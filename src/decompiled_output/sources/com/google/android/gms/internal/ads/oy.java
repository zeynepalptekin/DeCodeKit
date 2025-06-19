package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class oy {
    public static rw a(final Context context, final hy hyVar, final String str, final boolean z, final boolean z2, @androidx.annotation.i0 final i52 i52Var, final f1 f1Var, final as asVar, v0 v0Var, final com.google.android.gms.ads.internal.k kVar, final com.google.android.gms.ads.internal.b bVar, final tu2 tu2Var, final ut2 ut2Var, final boolean z3, final km1 km1Var, final lm1 lm1Var) throws dx {
        try {
            final v0 v0Var2 = null;
            return (rw) ar.b(new cv1(context, hyVar, str, z, z2, i52Var, f1Var, asVar, v0Var2, kVar, bVar, tu2Var, ut2Var, z3, km1Var, lm1Var) { // from class: com.google.android.gms.internal.ads.ry

                /* renamed from: a, reason: collision with root package name */
                private final Context f5195a;

                /* renamed from: b, reason: collision with root package name */
                private final hy f5196b;

                /* renamed from: c, reason: collision with root package name */
                private final String f5197c;
                private final boolean d;
                private final boolean e;
                private final i52 f;
                private final f1 g;
                private final as h;
                private final v0 i;
                private final com.google.android.gms.ads.internal.k j;
                private final com.google.android.gms.ads.internal.b k;
                private final tu2 l;
                private final ut2 m;
                private final boolean n;
                private final km1 o;
                private final lm1 p;

                {
                    this.f5195a = context;
                    this.f5196b = hyVar;
                    this.f5197c = str;
                    this.d = z;
                    this.e = z2;
                    this.f = i52Var;
                    this.g = f1Var;
                    this.h = asVar;
                    this.i = v0Var2;
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
                    Context context2 = this.f5195a;
                    hy hyVar2 = this.f5196b;
                    String str2 = this.f5197c;
                    boolean z4 = this.d;
                    boolean z5 = this.e;
                    i52 i52Var2 = this.f;
                    f1 f1Var2 = this.g;
                    as asVar2 = this.h;
                    v0 v0Var3 = this.i;
                    com.google.android.gms.ads.internal.k kVar2 = this.j;
                    com.google.android.gms.ads.internal.b bVar2 = this.k;
                    tu2 tu2Var2 = this.l;
                    ut2 ut2Var2 = this.m;
                    boolean z6 = this.n;
                    km1 km1Var2 = this.o;
                    lm1 lm1Var2 = this.p;
                    ly lyVar = new ly();
                    qy qyVar = new qy(new iy(context2), lyVar, hyVar2, str2, z4, z5, i52Var2, f1Var2, asVar2, v0Var3, kVar2, bVar2, tu2Var2, ut2Var2, z6, km1Var2, lm1Var2);
                    cx cxVar = new cx(qyVar);
                    qyVar.setWebChromeClient(new jw(cxVar));
                    lyVar.z(cxVar, z5);
                    return cxVar;
                }
            });
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.p.g().e(th, "AdWebViewFactory.newAdWebView2");
            throw new dx("Webview initialization failed.", th);
        }
    }
}
