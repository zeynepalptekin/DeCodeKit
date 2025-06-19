package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class o20 implements pe2<k20> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<qo> f4635a;

    private o20(ze2<qo> ze2Var) {
        this.f4635a = ze2Var;
    }

    public static o20 a(ze2<qo> ze2Var) {
        return new o20(ze2Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new k20(this.f4635a.get());
    }
}
