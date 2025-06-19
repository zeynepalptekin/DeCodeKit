package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class rd1 implements cf1<Bundle>, ff1<cf1<Bundle>> {

    /* renamed from: a, reason: collision with root package name */
    private final ApplicationInfo f5124a;

    /* renamed from: b, reason: collision with root package name */
    private final PackageInfo f5125b;

    rd1(ApplicationInfo applicationInfo, @androidx.annotation.i0 PackageInfo packageInfo) {
        this.f5124a = applicationInfo;
        this.f5125b = packageInfo;
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final dy1<cf1<Bundle>> a() {
        return qx1.g(this);
    }

    @Override // com.google.android.gms.internal.ads.cf1
    public final /* synthetic */ void b(Bundle bundle) {
        Bundle bundle2 = bundle;
        String str = this.f5124a.packageName;
        PackageInfo packageInfo = this.f5125b;
        Integer numValueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
        bundle2.putString("pn", str);
        if (numValueOf != null) {
            bundle2.putInt("vc", numValueOf.intValue());
        }
        if (((Boolean) qx2.e().c(e0.d4)).booleanValue()) {
            PackageInfo packageInfo2 = this.f5125b;
            String str2 = packageInfo2 != null ? packageInfo2.versionName : null;
            if (str2 != null) {
                bundle2.putString("vnm", str2);
            }
        }
    }
}
