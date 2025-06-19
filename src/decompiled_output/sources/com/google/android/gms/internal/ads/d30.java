package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class d30 implements pe2<e30> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Context> f3063a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<mr2> f3064b;

    private d30(ze2<Context> ze2Var, ze2<mr2> ze2Var2) {
        this.f3063a = ze2Var;
        this.f3064b = ze2Var2;
    }

    public static d30 a(ze2<Context> ze2Var, ze2<mr2> ze2Var2) {
        return new d30(ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new e30(this.f3063a.get(), this.f3064b.get());
    }
}
