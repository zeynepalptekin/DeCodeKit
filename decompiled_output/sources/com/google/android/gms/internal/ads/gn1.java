package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class gn1 {
    public static jm1 a(List<jm1> list, jm1 jm1Var) {
        return list.get(0);
    }

    public static qw2 b(Context context, List<jm1> list) {
        ArrayList arrayList = new ArrayList();
        for (jm1 jm1Var : list) {
            if (jm1Var.f3999c) {
                arrayList.add(com.google.android.gms.ads.f.p);
            } else {
                arrayList.add(new com.google.android.gms.ads.f(jm1Var.f3997a, jm1Var.f3998b));
            }
        }
        return new qw2(context, (com.google.android.gms.ads.f[]) arrayList.toArray(new com.google.android.gms.ads.f[arrayList.size()]));
    }

    public static jm1 c(qw2 qw2Var) {
        return qw2Var.l ? new jm1(-3, 0, true) : new jm1(qw2Var.h, qw2Var.e, false);
    }
}
