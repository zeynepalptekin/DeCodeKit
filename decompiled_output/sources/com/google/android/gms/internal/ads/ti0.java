package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class ti0 implements pe2<mm> {

    /* renamed from: a, reason: collision with root package name */
    private final hi0 f5403a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Context> f5404b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<an1> f5405c;

    private ti0(hi0 hi0Var, ze2<Context> ze2Var, ze2<an1> ze2Var2) {
        this.f5403a = hi0Var;
        this.f5404b = ze2Var;
        this.f5405c = ze2Var2;
    }

    public static ti0 a(hi0 hi0Var, ze2<Context> ze2Var, ze2<an1> ze2Var2) {
        return new ti0(hi0Var, ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (mm) we2.b(new mm(this.f5404b.get(), this.f5405c.get().f), "Cannot return null from a non-@Nullable @Provides method");
    }
}
