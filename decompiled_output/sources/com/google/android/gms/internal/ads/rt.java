package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* loaded from: classes.dex */
public final class rt extends jt {
    @Override // com.google.android.gms.internal.ads.jt
    @androidx.annotation.i0
    public final kt a(Context context, zt ztVar, int r18, boolean z, v0 v0Var, au auVar) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null || applicationInfo.targetSdkVersion >= 11) {
            return r18 == 2 ? new hu(context, new cu(context, ztVar.b(), ztVar.getRequestId(), v0Var, ztVar.j0()), ztVar, z, jt.b(ztVar), auVar) : new ws(context, z, jt.b(ztVar), auVar, new cu(context, ztVar.b(), ztVar.getRequestId(), v0Var, ztVar.j0()));
        }
        return null;
    }
}
