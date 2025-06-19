package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import c.a.b.b.e.g;

/* loaded from: classes.dex */
public final class iw2 extends c.a.b.b.e.g<fy2> {
    public iw2() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    @Override // c.a.b.b.e.g
    protected final /* synthetic */ fy2 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return iInterfaceQueryLocalInterface instanceof fy2 ? (fy2) iInterfaceQueryLocalInterface : new iy2(iBinder);
    }

    public final dy2 c(Context context, String str, qc qcVar) {
        try {
            IBinder iBinderS2 = b(context).s2(c.a.b.b.e.e.i2(context), str, qcVar, 202510000);
            if (iBinderS2 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderS2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return iInterfaceQueryLocalInterface instanceof dy2 ? (dy2) iInterfaceQueryLocalInterface : new gy2(iBinderS2);
        } catch (RemoteException | g.a e) {
            tr.d("Could not create remote builder for AdLoader.", e);
            return null;
        }
    }
}
