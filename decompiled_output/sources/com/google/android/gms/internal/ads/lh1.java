package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;

/* loaded from: classes.dex */
public final class lh1 implements pe2<ApplicationInfo> {

    /* renamed from: a, reason: collision with root package name */
    private final ih1 f4255a;

    public lh1(ih1 ih1Var) {
        this.f4255a = ih1Var;
    }

    public static ApplicationInfo a(ih1 ih1Var) {
        return (ApplicationInfo) we2.b(ih1Var.f(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return a(this.f4255a);
    }
}
