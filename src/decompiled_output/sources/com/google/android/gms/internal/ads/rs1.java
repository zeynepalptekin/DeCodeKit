package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.internal.ads.fm0;

@com.google.android.gms.common.util.d0
/* loaded from: classes.dex */
final class rs1 implements qs1 {

    /* renamed from: a, reason: collision with root package name */
    private static final fm0.a f5184a = (fm0.a) ((l92) fm0.a.v0().w0("E").P());

    rs1() {
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final fm0.a a() {
        return f5184a;
    }

    @Override // com.google.android.gms.internal.ads.qs1
    public final fm0.a b(Context context) throws PackageManager.NameNotFoundException {
        return es1.a(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }
}
