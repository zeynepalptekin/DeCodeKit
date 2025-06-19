package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class kl {
    public static tk a(Context context, String str, qc qcVar) {
        try {
            IBinder iBinderI4 = ((al) wr.a(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", nl.f4560a)).i4(c.a.b.b.e.e.i2(context), str, qcVar, 202510000);
            if (iBinderI4 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderI4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return iInterfaceQueryLocalInterface instanceof tk ? (tk) iInterfaceQueryLocalInterface : new wk(iBinderI4);
        } catch (RemoteException | yr e) {
            tr.e("#007 Could not call remote method.", e);
            return null;
        }
    }
}
