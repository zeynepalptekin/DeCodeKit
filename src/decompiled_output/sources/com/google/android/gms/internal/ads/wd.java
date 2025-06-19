package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.d0.d;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class wd implements com.google.android.gms.ads.mediation.a0 {
    private final Date d;
    private final int e;
    private final Set<String> f;
    private final boolean g;
    private final Location h;
    private final int i;
    private final z2 j;
    private final boolean l;
    private final int n;
    private final String o;
    private final List<String> k = new ArrayList();
    private final Map<String, Boolean> m = new HashMap();

    public wd(@androidx.annotation.i0 Date date, int r2, @androidx.annotation.i0 Set<String> set, @androidx.annotation.i0 Location location, boolean z, int r6, z2 z2Var, List<String> list, boolean z2, int r10, String str) {
        Map<String, Boolean> map;
        String str2;
        Boolean bool;
        this.d = date;
        this.e = r2;
        this.f = set;
        this.h = location;
        this.g = z;
        this.i = r6;
        this.j = z2Var;
        this.l = z2;
        this.n = r10;
        this.o = str;
        if (list != null) {
            for (String str3 : list) {
                if (str3.startsWith("custom:")) {
                    String[] strArrSplit = str3.split(":", 3);
                    if (strArrSplit.length == 3) {
                        if ("true".equals(strArrSplit[2])) {
                            map = this.m;
                            str2 = strArrSplit[1];
                            bool = Boolean.TRUE;
                        } else if ("false".equals(strArrSplit[2])) {
                            map = this.m;
                            str2 = strArrSplit[1];
                            bool = Boolean.FALSE;
                        }
                        map.put(str2, bool);
                    }
                } else {
                    this.k.add(str3);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.f
    @Deprecated
    public final boolean a() {
        return this.l;
    }

    @Override // com.google.android.gms.ads.mediation.a0
    public final Map<String, Boolean> b() {
        return this.m;
    }

    @Override // com.google.android.gms.ads.mediation.a0
    public final boolean c() {
        List<String> list = this.k;
        if (list != null) {
            return list.contains("2") || this.k.contains("6");
        }
        return false;
    }

    @Override // com.google.android.gms.ads.mediation.f
    @Deprecated
    public final Date d() {
        return this.d;
    }

    @Override // com.google.android.gms.ads.mediation.f
    public final boolean e() {
        return this.g;
    }

    @Override // com.google.android.gms.ads.mediation.f
    public final Set<String> f() {
        return this.f;
    }

    @Override // com.google.android.gms.ads.mediation.a0
    public final boolean g() {
        List<String> list = this.k;
        return list != null && list.contains("3");
    }

    @Override // com.google.android.gms.ads.mediation.a0
    public final com.google.android.gms.ads.d0.d h() {
        m mVar;
        if (this.j == null) {
            return null;
        }
        d.b bVarF = new d.b().g(this.j.e).c(this.j.f).f(this.j.g);
        z2 z2Var = this.j;
        if (z2Var.d >= 2) {
            bVarF.b(z2Var.h);
        }
        z2 z2Var2 = this.j;
        if (z2Var2.d >= 3 && (mVar = z2Var2.i) != null) {
            bVarF.h(new com.google.android.gms.ads.a0(mVar));
        }
        return bVarF.a();
    }

    @Override // com.google.android.gms.ads.mediation.f
    public final int i() {
        return this.i;
    }

    @Override // com.google.android.gms.ads.mediation.a0
    public final boolean j() {
        return k03.v().u();
    }

    @Override // com.google.android.gms.ads.mediation.a0
    public final boolean k() {
        List<String> list = this.k;
        return list != null && list.contains("6");
    }

    @Override // com.google.android.gms.ads.mediation.f
    public final Location l() {
        return this.h;
    }

    @Override // com.google.android.gms.ads.mediation.a0
    public final boolean m() {
        List<String> list = this.k;
        if (list != null) {
            return list.contains("1") || this.k.contains("6");
        }
        return false;
    }

    @Override // com.google.android.gms.ads.mediation.f
    @Deprecated
    public final int n() {
        return this.e;
    }

    @Override // com.google.android.gms.ads.mediation.a0
    public final float o() {
        return k03.v().t();
    }
}
