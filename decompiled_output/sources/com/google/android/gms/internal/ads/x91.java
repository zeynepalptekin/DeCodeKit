package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class x91 implements pe2<y91> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<an1> f5954a;

    private x91(ze2<an1> ze2Var) {
        this.f5954a = ze2Var;
    }

    public static x91 a(ze2<an1> ze2Var) {
        return new x91(ze2Var);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new y91(this.f5954a.get());
    }
}
