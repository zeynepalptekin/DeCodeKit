package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
final class na extends u9 {
    private String d;
    private Set<Integer> e;
    private Map<Integer, pa> f;
    private Long g;
    private Long h;

    na(t9 t9Var) {
        super(t9Var);
    }

    private final pa t(int r4) {
        if (this.f.containsKey(Integer.valueOf(r4))) {
            return this.f.get(Integer.valueOf(r4));
        }
        pa paVar = new pa(this, this.d, null);
        this.f.put(Integer.valueOf(r4), paVar);
        return paVar;
    }

    private final boolean v(int r3, int r4) {
        if (this.f.get(Integer.valueOf(r3)) == null) {
            return false;
        }
        return this.f.get(Integer.valueOf(r3)).d.get(r4);
    }

    @Override // com.google.android.gms.measurement.internal.u9
    protected final boolean s() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:215:0x0615, code lost:
    
        r7 = B().I();
        r9 = com.google.android.gms.measurement.internal.w3.t(r46.d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0627, code lost:
    
        if (r8.E() == false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0629, code lost:
    
        r8 = java.lang.Integer.valueOf(r8.F());
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0632, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0633, code lost:
    
        r7.c("Invalid property filter ID. appId, id", r9, java.lang.String.valueOf(r8));
        r8 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02c5  */
    @androidx.annotation.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.util.List<c.a.b.b.g.c.g1.a> u(java.lang.String r47, java.util.List<c.a.b.b.g.c.g1.c> r48, java.util.List<c.a.b.b.g.c.g1.k> r49, java.lang.Long r50, java.lang.Long r51) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1775
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.na.u(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }
}
