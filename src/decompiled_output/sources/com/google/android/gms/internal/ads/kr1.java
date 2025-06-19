package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class kr1 implements pe2<br1> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Set<ch0<ir1>>> f4143a;

    private kr1(ze2<Set<ch0<ir1>>> ze2Var) {
        this.f4143a = ze2Var;
    }

    public static kr1 a(ze2<Set<ch0<ir1>>> ze2Var) {
        return new kr1(ze2Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new br1(this.f4143a.get());
    }
}
