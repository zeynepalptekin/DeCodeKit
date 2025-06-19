package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class mk1 {
    public static ik1<d40, i40> a(Context context, no1 no1Var, gp1 gp1Var) {
        return c(context, no1Var, gp1Var);
    }

    public static ik1<p40, v40> b(Context context, no1 no1Var, gp1 gp1Var) {
        return c(context, no1Var, gp1Var);
    }

    private static <AppOpenAdRequestComponent extends ga0<AppOpenAd>, AppOpenAd extends e70> ik1<AppOpenAdRequestComponent, AppOpenAd> c(Context context, no1 no1Var, gp1 gp1Var) {
        if (((Integer) qx2.e().c(e0.N4)).intValue() <= 0) {
            return new ak1();
        }
        fp1 fp1VarA = gp1Var.a(xo1.AppOpen, context, no1Var, new qj1(new gj1()));
        return new lj1(new zj1(new ak1()), new rj1(fp1VarA.f3431a, cs.f3023a), fp1VarA.f3432b, cs.f3023a);
    }
}
