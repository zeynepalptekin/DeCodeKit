package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class yd1 implements pe2<wd1> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<cy1> f6123a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<Bundle> f6124b;

    private yd1(ze2<cy1> ze2Var, ze2<Bundle> ze2Var2) {
        this.f6123a = ze2Var;
        this.f6124b = ze2Var2;
    }

    public static yd1 a(ze2<cy1> ze2Var, ze2<Bundle> ze2Var2) {
        return new yd1(ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new wd1(this.f6123a.get(), this.f6124b.get());
    }
}
