package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class ee1 implements pe2<ce1> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Context> f3261a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<String> f3262b;

    private ee1(ze2<Context> ze2Var, ze2<String> ze2Var2) {
        this.f3261a = ze2Var;
        this.f3262b = ze2Var2;
    }

    public static ee1 a(ze2<Context> ze2Var, ze2<String> ze2Var2) {
        return new ee1(ze2Var, ze2Var2);
    }

    public static ce1 b(Context context, String str) {
        return new ce1(context, str);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return b(this.f3261a.get(), this.f3262b.get());
    }
}
