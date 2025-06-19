package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class x10 implements pe2<xr> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<String> f5916a;

    public x10(ze2<String> ze2Var) {
        this.f5916a = ze2Var;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (xr) we2.b(new xr(this.f5916a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
