package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import c.a.b.b.e.g;

/* loaded from: classes.dex */
public final class fk extends c.a.b.b.e.g<zj> {
    public fk() {
        super("com.google.android.gms.ads.reward.RewardedVideoAdCreatorImpl");
    }

    @Override // c.a.b.b.e.g
    protected final /* synthetic */ zj a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdCreator");
        return iInterfaceQueryLocalInterface instanceof zj ? (zj) iInterfaceQueryLocalInterface : new ck(iBinder);
    }

    public final yj c(Context context, qc qcVar) {
        try {
            IBinder iBinderS5 = b(context).s5(c.a.b.b.e.e.i2(context), qcVar, 202510000);
            if (iBinderS5 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderS5.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
            return iInterfaceQueryLocalInterface instanceof yj ? (yj) iInterfaceQueryLocalInterface : new ak(iBinderS5);
        } catch (RemoteException | g.a e) {
            tr.d("Could not get remote RewardedVideoAd.", e);
            return null;
        }
    }
}
