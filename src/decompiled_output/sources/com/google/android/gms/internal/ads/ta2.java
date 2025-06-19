package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class ta2 implements ua2 {
    ta2() {
    }

    @Override // com.google.android.gms.internal.ads.ua2
    public final sa2<?, ?> a(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.ads.ua2
    public final Object b(Object obj) {
        return ra2.f().g();
    }

    @Override // com.google.android.gms.internal.ads.ua2
    public final int c(int r1, Object obj, Object obj2) {
        ra2 ra2Var = (ra2) obj;
        if (ra2Var.isEmpty()) {
            return 0;
        }
        Iterator it = ra2Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.ads.ua2
    public final Map<?, ?> d(Object obj) {
        return (ra2) obj;
    }

    @Override // com.google.android.gms.internal.ads.ua2
    public final boolean e(Object obj) {
        return !((ra2) obj).b();
    }

    @Override // com.google.android.gms.internal.ads.ua2
    public final Map<?, ?> f(Object obj) {
        return (ra2) obj;
    }

    @Override // com.google.android.gms.internal.ads.ua2
    public final Object g(Object obj) {
        ((ra2) obj).e();
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.ua2
    public final Object h(Object obj, Object obj2) {
        ra2 ra2VarG = (ra2) obj;
        ra2 ra2Var = (ra2) obj2;
        if (!ra2Var.isEmpty()) {
            if (!ra2VarG.b()) {
                ra2VarG = ra2VarG.g();
            }
            ra2VarG.c(ra2Var);
        }
        return ra2VarG;
    }
}
