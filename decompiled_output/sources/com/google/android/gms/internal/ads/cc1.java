package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class cc1 implements pe2<im1> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<com.google.android.gms.common.util.g> f2956a;

    public cc1(ze2<com.google.android.gms.common.util.g> ze2Var) {
        this.f2956a = ze2Var;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return (im1) we2.b(new im1(this.f2956a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
