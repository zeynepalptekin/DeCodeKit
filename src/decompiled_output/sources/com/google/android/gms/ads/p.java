package com.google.android.gms.ads;

import android.content.Context;
import java.util.List;

/* loaded from: classes.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    protected static final double f2481a = 0.5d;

    /* renamed from: b, reason: collision with root package name */
    protected static final double f2482b = 0.7d;

    public static f a(Context context, f fVar, List<f> list) {
        f fVar2 = null;
        if (list != null && fVar != null) {
            if (!fVar.s()) {
                float f = context.getResources().getDisplayMetrics().density;
                fVar = new f(Math.round(fVar.m(context) / f), Math.round(fVar.e(context) / f));
            }
            for (f fVar3 : list) {
                boolean z = false;
                if (fVar3 != null) {
                    int r2 = fVar.l();
                    int r3 = fVar3.l();
                    int r4 = fVar.d();
                    int r5 = fVar3.d();
                    if (r2 * f2481a <= r3 && r2 >= r3 && (!fVar.s() ? !(r4 * f2482b > r5 || r4 < r5) : fVar.t() >= r5)) {
                        z = true;
                    }
                }
                if (z && (fVar2 == null || fVar2.l() * fVar2.d() <= fVar3.l() * fVar3.d())) {
                    fVar2 = fVar3;
                }
            }
        }
        return fVar2;
    }
}
