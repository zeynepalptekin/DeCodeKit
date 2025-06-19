package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* loaded from: classes.dex */
public final class ud1 implements pe2<rd1> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<ApplicationInfo> f5505a;

    /* renamed from: b, reason: collision with root package name */
    private final ze2<PackageInfo> f5506b;

    private ud1(ze2<ApplicationInfo> ze2Var, ze2<PackageInfo> ze2Var2) {
        this.f5505a = ze2Var;
        this.f5506b = ze2Var2;
    }

    public static rd1 a(ApplicationInfo applicationInfo, PackageInfo packageInfo) {
        return new rd1(applicationInfo, packageInfo);
    }

    public static ud1 b(ze2<ApplicationInfo> ze2Var, ze2<PackageInfo> ze2Var2) {
        return new ud1(ze2Var, ze2Var2);
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return a(this.f5505a.get(), this.f5506b.get());
    }
}
