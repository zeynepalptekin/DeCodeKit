package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class c90 implements pe2<com.google.android.gms.ads.internal.a> {

    /* renamed from: a, reason: collision with root package name */
    private final z80 f2946a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Context> f2947b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<im> f2948c;

    private c90(z80 z80Var, ze2<Context> ze2Var, ze2<im> ze2Var2) {
        this.f2946a = z80Var;
        this.f2947b = ze2Var;
        this.f2948c = ze2Var2;
    }

    public static c90 a(z80 z80Var, ze2<Context> ze2Var, ze2<im> ze2Var2) {
        return new c90(z80Var, ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (com.google.android.gms.ads.internal.a) we2.b(new com.google.android.gms.ads.internal.a(this.f2947b.get(), this.f2948c.get(), null), "Cannot return null from a non-@Nullable @Provides method");
    }
}
