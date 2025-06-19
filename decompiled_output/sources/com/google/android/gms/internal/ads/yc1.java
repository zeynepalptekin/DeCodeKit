package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class yc1 implements pe2<wc1> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<cy1> f6120a;

    private yc1(ze2<cy1> ze2Var) {
        this.f6120a = ze2Var;
    }

    public static yc1 a(ze2<cy1> ze2Var) {
        return new yc1(ze2Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new wc1(this.f6120a.get());
    }
}
