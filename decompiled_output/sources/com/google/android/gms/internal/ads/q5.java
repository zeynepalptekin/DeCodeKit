package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import c.a.b.b.e.g;

/* loaded from: classes.dex */
public final class q5 extends c.a.b.b.e.g<p3> {
    @com.google.android.gms.common.util.d0
    public q5() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    @Override // c.a.b.b.e.g
    protected final /* synthetic */ p3 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return iInterfaceQueryLocalInterface instanceof p3 ? (p3) iInterfaceQueryLocalInterface : new s3(iBinder);
    }

    public final o3 c(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        try {
            IBinder iBinderM7 = b(context).M7(c.a.b.b.e.e.i2(context), c.a.b.b.e.e.i2(frameLayout), c.a.b.b.e.e.i2(frameLayout2), 202510000);
            if (iBinderM7 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderM7.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            return iInterfaceQueryLocalInterface instanceof o3 ? (o3) iInterfaceQueryLocalInterface : new q3(iBinderM7);
        } catch (RemoteException | g.a e) {
            tr.d("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }
}
