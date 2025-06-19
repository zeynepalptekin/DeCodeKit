package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/* loaded from: classes.dex */
public final class ea1 implements ff1<fa1> {

    /* renamed from: a, reason: collision with root package name */
    private final ff1<jf1> f3244a;

    /* renamed from: b, reason: collision with root package name */
    private final an1 f3245b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f3246c;
    private final ao d;

    public ea1(ub1<jf1> ub1Var, an1 an1Var, Context context, ao aoVar) {
        this.f3244a = ub1Var;
        this.f3245b = an1Var;
        this.f3246c = context;
        this.d = aoVar;
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final dy1<fa1> a() {
        return qx1.i(this.f3244a.a(), new ru1(this) { // from class: com.google.android.gms.internal.ads.ha1

            /* renamed from: a, reason: collision with root package name */
            private final ea1 f3651a;

            {
                this.f3651a = this;
            }

            @Override // com.google.android.gms.internal.ads.ru1
            public final Object a(Object obj) {
                return this.f3651a.b((jf1) obj);
            }
        }, cs.f);
    }

    final /* synthetic */ fa1 b(jf1 jf1Var) {
        String str;
        boolean z;
        String strE;
        float f;
        int r8;
        int r9;
        int r5;
        DisplayMetrics displayMetrics;
        qw2 qw2Var = this.f3245b.e;
        qw2[] qw2VarArr = qw2Var.j;
        if (qw2VarArr != null) {
            str = null;
            boolean z2 = false;
            boolean z3 = false;
            z = false;
            for (qw2 qw2Var2 : qw2VarArr) {
                if (!qw2Var2.l && !z2) {
                    str = qw2Var2.d;
                    z2 = true;
                }
                if (qw2Var2.l && !z3) {
                    z3 = true;
                    z = true;
                }
                if (z2 && z3) {
                    break;
                }
            }
        } else {
            str = qw2Var.d;
            z = qw2Var.l;
        }
        Resources resources = this.f3246c.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            strE = null;
            f = 0.0f;
            r8 = 0;
            r9 = 0;
        } else {
            float f2 = displayMetrics.density;
            int r7 = displayMetrics.widthPixels;
            r9 = displayMetrics.heightPixels;
            strE = this.d.r().E();
            r8 = r7;
            f = f2;
        }
        StringBuilder sb = new StringBuilder();
        qw2[] qw2VarArr2 = qw2Var.j;
        if (qw2VarArr2 != null) {
            boolean z4 = false;
            for (qw2 qw2Var3 : qw2VarArr2) {
                if (qw2Var3.l) {
                    z4 = true;
                } else {
                    if (sb.length() != 0) {
                        sb.append("|");
                    }
                    sb.append((qw2Var3.h != -1 || f == 0.0f) ? qw2Var3.h : (int) (qw2Var3.i / f));
                    sb.append("x");
                    sb.append((qw2Var3.e != -2 || f == 0.0f) ? qw2Var3.e : (int) (qw2Var3.f / f));
                }
            }
            if (z4) {
                if (sb.length() != 0) {
                    r5 = 0;
                    sb.insert(0, "|");
                } else {
                    r5 = 0;
                }
                sb.insert(r5, "320x50");
            }
        }
        return new fa1(qw2Var, str, z, sb.toString(), f, r8, r9, strE, this.f3245b.o);
    }
}
