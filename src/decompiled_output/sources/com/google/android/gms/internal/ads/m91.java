package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes.dex */
public final class m91 implements pe2<Set<String>> {

    /* renamed from: a, reason: collision with root package name */
    private final g91 f4368a;

    public m91(g91 g91Var) {
        this.f4368a = g91Var;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (Set) we2.b(this.f4368a.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
