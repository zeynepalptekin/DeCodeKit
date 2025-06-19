package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class w61 implements pe2<x61> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<fs0> f5798a;

    private w61(ze2<fs0> ze2Var) {
        this.f5798a = ze2Var;
    }

    public static w61 a(ze2<fs0> ze2Var) {
        return new w61(ze2Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new x61(this.f5798a.get());
    }
}
