package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
final class xj0 implements f70<k70> {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, u01<k70>> f5981a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, u01<bl0>> f5982b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, h31<bl0>> f5983c;
    private final ze2<f70<e50>> d;
    private final ul0 e;

    xj0(Map<String, u01<k70>> map, Map<String, u01<bl0>> map2, Map<String, h31<bl0>> map3, ze2<f70<e50>> ze2Var, ul0 ul0Var) {
        this.f5981a = map;
        this.f5982b = map2;
        this.f5983c = map3;
        this.d = ze2Var;
        this.e = ul0Var;
    }

    @Override // com.google.android.gms.internal.ads.f70
    @androidx.annotation.i0
    public final u01<k70> a(int r3, String str) {
        u01<e50> u01VarA;
        u01<k70> u01Var = this.f5981a.get(str);
        if (u01Var != null) {
            return u01Var;
        }
        if (r3 == 1) {
            if (this.e.d() == null || (u01VarA = this.d.get().a(r3, str)) == null) {
                return null;
            }
            return k70.a(u01VarA);
        }
        if (r3 != 4) {
            return null;
        }
        h31<bl0> h31Var = this.f5983c.get(str);
        if (h31Var != null) {
            return k70.b(h31Var);
        }
        u01<bl0> u01Var2 = this.f5982b.get(str);
        if (u01Var2 != null) {
            return k70.a(u01Var2);
        }
        return null;
    }
}
