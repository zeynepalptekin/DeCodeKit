package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class gk0 implements pe2<Set<String>> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<ul0> f3551a;

    public gk0(ze2<ul0> ze2Var) {
        this.f3551a = ze2Var;
    }

    public static Set<String> a(ul0 ul0Var) {
        return (Set) we2.b(ul0Var.d() != null ? Collections.singleton("banner") : Collections.emptySet(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return a(this.f3551a.get());
    }
}
