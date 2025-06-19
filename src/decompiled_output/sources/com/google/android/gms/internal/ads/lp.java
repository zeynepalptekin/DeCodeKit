package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.telephony.TelephonyManager;

@TargetApi(26)
/* loaded from: classes.dex */
public class lp extends ip {
    @Override // com.google.android.gms.internal.ads.dp
    public final mv2 g(Context context, TelephonyManager telephonyManager) {
        com.google.android.gms.ads.internal.p.c();
        if (to.l0(context, "android.permission.ACCESS_NETWORK_STATE") && telephonyManager.isDataEnabled()) {
            return mv2.ENUM_TRUE;
        }
        return mv2.ENUM_FALSE;
    }
}
