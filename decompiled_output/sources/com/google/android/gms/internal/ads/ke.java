package com.google.android.gms.internal.ads;

import c.a.a.a;
import java.util.Date;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class ke {
    public static int a(a.EnumC0118a enumC0118a) {
        int r2 = je.f3946b[enumC0118a.ordinal()];
        if (r2 == 2) {
            return 1;
        }
        if (r2 != 3) {
            return r2 != 4 ? 0 : 3;
        }
        return 2;
    }

    public static com.google.ads.mediation.b b(jw2 jw2Var, boolean z) {
        HashSet hashSet = jw2Var.h != null ? new HashSet(jw2Var.h) : null;
        Date date = new Date(jw2Var.e);
        int r1 = jw2Var.g;
        return new com.google.ads.mediation.b(date, r1 != 1 ? r1 != 2 ? a.b.UNKNOWN : a.b.FEMALE : a.b.MALE, hashSet, z, jw2Var.n);
    }
}
