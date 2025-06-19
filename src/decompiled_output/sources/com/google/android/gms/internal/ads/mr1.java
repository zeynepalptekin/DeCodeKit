package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class mr1 implements pe2<pb> {

    /* renamed from: a, reason: collision with root package name */
    private final jr1 f4442a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Context> f4443b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<as> f4444c;

    public mr1(jr1 jr1Var, ze2<Context> ze2Var, ze2<as> ze2Var2) {
        this.f4442a = jr1Var;
        this.f4443b = ze2Var;
        this.f4444c = ze2Var2;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (pb) we2.b(new jb().b(this.f4443b.get(), this.f4444c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
