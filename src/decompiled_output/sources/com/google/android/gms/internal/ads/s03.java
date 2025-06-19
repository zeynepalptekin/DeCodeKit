package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import c.a.b.b.e.g;

/* loaded from: classes.dex */
public final class s03 extends c.a.b.b.e.g<cz2> {
    public s03() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    @Override // c.a.b.b.e.g
    protected final /* synthetic */ cz2 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return iInterfaceQueryLocalInterface instanceof cz2 ? (cz2) iInterfaceQueryLocalInterface : new bz2(iBinder);
    }

    public final xy2 c(Context context) {
        try {
            IBinder iBinderS7 = b(context).s7(c.a.b.b.e.e.i2(context), 202510000);
            if (iBinderS7 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderS7.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return iInterfaceQueryLocalInterface instanceof xy2 ? (xy2) iInterfaceQueryLocalInterface : new zy2(iBinderS7);
        } catch (RemoteException | g.a e) {
            tr.d("Could not get remote MobileAdsSettingManager.", e);
            return null;
        }
    }
}
