package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class rb1 implements pe2<pb1> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<sj1> f5122a;

    private rb1(ze2<sj1> ze2Var) {
        this.f5122a = ze2Var;
    }

    public static rb1 a(ze2<sj1> ze2Var) {
        return new rb1(ze2Var);
    }

    public static pb1 b(sj1 sj1Var) {
        return new pb1(sj1Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return b(this.f5122a.get());
    }
}
