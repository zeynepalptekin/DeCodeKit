package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class qc1 implements pe2<oc1> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Context> f4980a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<cy1> f4981b;

    private qc1(ze2<Context> ze2Var, ze2<cy1> ze2Var2) {
        this.f4980a = ze2Var;
        this.f4981b = ze2Var2;
    }

    public static qc1 a(ze2<Context> ze2Var, ze2<cy1> ze2Var2) {
        return new qc1(ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new oc1(this.f4980a.get(), this.f4981b.get());
    }
}
