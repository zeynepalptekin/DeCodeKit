package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class m40 implements pe2<Set<ch0<nc0>>> {

    /* renamed from: a, reason: collision with root package name */
    private final o40 f4341a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<v60> f4342b;

    public m40(o40 o40Var, ze2<v60> ze2Var) {
        this.f4341a = o40Var;
        this.f4342b = ze2Var;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (Set) we2.b(Collections.singleton(new ch0(this.f4342b.get(), cs.f)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
