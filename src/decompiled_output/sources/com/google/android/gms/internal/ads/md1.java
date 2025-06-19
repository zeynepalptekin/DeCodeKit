package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;

/* loaded from: classes.dex */
public final class md1 implements pe2<ed1> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<cy1> f4388a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<an1> f4389b;

    /* renamed from: c, reason: collision with root package name */
    private final ze2<PackageInfo> f4390c;
    private final ze2<qo> d;

    public md1(ze2<cy1> ze2Var, ze2<an1> ze2Var2, ze2<PackageInfo> ze2Var3, ze2<qo> ze2Var4) {
        this.f4388a = ze2Var;
        this.f4389b = ze2Var2;
        this.f4390c = ze2Var3;
        this.d = ze2Var4;
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return new ed1(this.f4388a.get(), this.f4389b.get(), this.f4390c.get(), this.d.get());
    }
}
