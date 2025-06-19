package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class la0 implements pe2<Context> {

    /* renamed from: a, reason: collision with root package name */
    private final ia0 f4231a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Context> f4232b;

    private la0(ia0 ia0Var, ze2<Context> ze2Var) {
        this.f4231a = ia0Var;
        this.f4232b = ze2Var;
    }

    public static la0 a(ia0 ia0Var, ze2<Context> ze2Var) {
        return new la0(ia0Var, ze2Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (Context) we2.b(this.f4231a.f(this.f4232b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
