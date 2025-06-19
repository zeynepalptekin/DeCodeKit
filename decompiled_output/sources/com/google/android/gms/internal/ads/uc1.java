package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class uc1 implements pe2<sc1> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<cy1> f5503a;

    private uc1(ze2<cy1> ze2Var) {
        this.f5503a = ze2Var;
    }

    public static uc1 a(ze2<cy1> ze2Var) {
        return new uc1(ze2Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new sc1(this.f5503a.get());
    }
}
