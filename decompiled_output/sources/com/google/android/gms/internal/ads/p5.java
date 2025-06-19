package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import c.a.b.b.e.g;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class p5 extends c.a.b.b.e.g<w3> {
    @com.google.android.gms.common.util.d0
    public p5() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    @Override // c.a.b.b.e.g
    protected final /* synthetic */ w3 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        return iInterfaceQueryLocalInterface instanceof w3 ? (w3) iInterfaceQueryLocalInterface : new v3(iBinder);
    }

    public final r3 c(View view, HashMap<String, View> map, HashMap<String, View> map2) {
        try {
            IBinder iBinderD5 = b(view.getContext()).d5(c.a.b.b.e.e.i2(view), c.a.b.b.e.e.i2(map), c.a.b.b.e.e.i2(map2));
            if (iBinderD5 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderD5.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
            return iInterfaceQueryLocalInterface instanceof r3 ? (r3) iInterfaceQueryLocalInterface : new t3(iBinderD5);
        } catch (RemoteException | g.a e) {
            tr.d("Could not create remote NativeAdViewHolderDelegate.", e);
            return null;
        }
    }
}
