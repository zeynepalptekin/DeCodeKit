package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ia0;

/* loaded from: classes.dex */
public final class sa0 implements pe2<ia0.a> {

    /* renamed from: a, reason: collision with root package name */
    private final ia0 f5233a;

    private sa0(ia0 ia0Var) {
        this.f5233a = ia0Var;
    }

    public static sa0 a(ia0 ia0Var) {
        return new sa0(ia0Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (ia0.a) we2.b(this.f5233a.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
