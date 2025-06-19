package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class zx0 implements ay0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, ze2<ay0>> f6318a;

    /* renamed from: b, reason: collision with root package name */
    private final cy1 f6319b;

    /* renamed from: c, reason: collision with root package name */
    private final nd0 f6320c;

    public zx0(Map<String, ze2<ay0>> map, cy1 cy1Var, nd0 nd0Var) {
        this.f6318a = map;
        this.f6319b = cy1Var;
        this.f6320c = nd0Var;
    }

    @Override // com.google.android.gms.internal.ads.ay0
    public final dy1<wm1> a(final wi wiVar) {
        this.f6320c.e0(wiVar);
        dy1<wm1> dy1VarA = qx1.a(new uv0(xn1.NO_FILL));
        for (String str : ((String) qx2.e().c(e0.s5)).split(",")) {
            final ze2<ay0> ze2Var = this.f6318a.get(str.trim());
            if (ze2Var != null) {
                dy1VarA = qx1.k(dy1VarA, uv0.class, new ax1(ze2Var, wiVar) { // from class: com.google.android.gms.internal.ads.yx0

                    /* renamed from: a, reason: collision with root package name */
                    private final ze2 f6192a;

                    /* renamed from: b, reason: collision with root package name */
                    private final wi f6193b;

                    {
                        this.f6192a = ze2Var;
                        this.f6193b = wiVar;
                    }

                    @Override // com.google.android.gms.internal.ads.ax1
                    public final dy1 a(Object obj) {
                        ze2 ze2Var2 = this.f6192a;
                        return ((ay0) ze2Var2.get()).a(this.f6193b);
                    }
                }, this.f6319b);
            }
        }
        qx1.f(dy1VarA, new by0(this), cs.f);
        return dy1VarA;
    }
}
