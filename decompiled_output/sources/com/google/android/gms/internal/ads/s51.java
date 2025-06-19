package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class s51 implements pe2<p51> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<x61> f5225a;

    private s51(ze2<x61> ze2Var) {
        this.f5225a = ze2Var;
    }

    public static s51 a(ze2<x61> ze2Var) {
        return new s51(ze2Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new p51(this.f5225a.get());
    }
}
