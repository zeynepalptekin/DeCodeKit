package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class nw0 implements pe2<String> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Context> f4612a;

    private nw0(ze2<Context> ze2Var) {
        this.f4612a = ze2Var;
    }

    public static nw0 a(ze2<Context> ze2Var) {
        return new nw0(ze2Var);
    }

    public static String b(Context context) {
        return (String) we2.b(context.getPackageName(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return b(this.f4612a.get());
    }
}
