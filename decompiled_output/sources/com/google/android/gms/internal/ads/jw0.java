package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* loaded from: classes.dex */
public final class jw0 implements pe2<ApplicationInfo> {

    /* renamed from: a, reason: collision with root package name */
    private final ze2<Context> f4019a;

    private jw0(ze2<Context> ze2Var) {
        this.f4019a = ze2Var;
    }

    public static jw0 a(ze2<Context> ze2Var) {
        return new jw0(ze2Var);
    }

    public static ApplicationInfo b(Context context) {
        return (ApplicationInfo) we2.b(context.getApplicationInfo(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.gms.internal.ads.ze2
    public final /* synthetic */ Object get() {
        return b(this.f4019a.get());
    }
}
