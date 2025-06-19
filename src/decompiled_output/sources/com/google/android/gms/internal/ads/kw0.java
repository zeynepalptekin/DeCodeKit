package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* loaded from: classes.dex */
public final class kw0 implements pe2<PackageInfo> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Context> f4154a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<ApplicationInfo> f4155b;

    private kw0(ze2<Context> ze2Var, ze2<ApplicationInfo> ze2Var2) {
        this.f4154a = ze2Var;
        this.f4155b = ze2Var2;
    }

    public static kw0 a(ze2<Context> ze2Var, ze2<ApplicationInfo> ze2Var2) {
        return new kw0(ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    @androidx.annotation.i0
    public final /* synthetic */ Object get() {
        return aw0.a(this.f4154a.get(), this.f4155b.get());
    }
}
