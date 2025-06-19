package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class t50 implements pe2<Set<ch0<nc0>>> {

    /* renamed from: a, reason: collision with root package name */
    private final h50 f5343a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<v60> f5344b;

    public t50(h50 h50Var, ze2<v60> ze2Var) {
        this.f5343a = h50Var;
        this.f5344b = ze2Var;
    }

    public static Set<ch0<nc0>> a(h50 h50Var, v60 v60Var) {
        return (Set) we2.b(Collections.singleton(new ch0(v60Var, cs.f)), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return a(this.f5343a, this.f5344b.get());
    }
}
