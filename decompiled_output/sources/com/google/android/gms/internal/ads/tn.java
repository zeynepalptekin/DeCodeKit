package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.ads.e0.a;

/* loaded from: classes.dex */
public final class tn implements vn {
    @Override // com.google.android.gms.internal.ads.vn
    public final dy1<String> a(Context context, int r2) {
        return qx1.g(null);
    }

    @Override // com.google.android.gms.internal.ads.vn
    public final dy1<a.C0160a> b(Context context) {
        ks ksVar = new ks();
        qx2.a();
        if (jr.n(context)) {
            cs.f3023a.execute(new sn(this, context, ksVar));
        }
        return ksVar;
    }

    @Override // com.google.android.gms.internal.ads.vn
    public final dy1<String> c(String str, PackageInfo packageInfo) {
        return qx1.g(str);
    }
}
