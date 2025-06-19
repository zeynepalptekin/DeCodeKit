package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class ed0 implements pe2<cd0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Set<ch0<hd0>>> f3255a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<km1> f3256b;

    private ed0(ze2<Set<ch0<hd0>>> ze2Var, ze2<km1> ze2Var2) {
        this.f3255a = ze2Var;
        this.f3256b = ze2Var2;
    }

    public static ed0 a(ze2<Set<ch0<hd0>>> ze2Var, ze2<km1> ze2Var2) {
        return new ed0(ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new cd0(this.f3255a.get(), this.f3256b.get());
    }
}
