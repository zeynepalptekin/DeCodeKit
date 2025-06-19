package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class mw0 implements pe2<jx0> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Context> f4457a;

    private mw0(ze2<Context> ze2Var) {
        this.f4457a = ze2Var;
    }

    public static mw0 a(ze2<Context> ze2Var) {
        return new mw0(ze2Var);
    }

    public static jx0 b(Context context) {
        return (jx0) we2.b(new jx0(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return b(this.f4457a.get());
    }
}
