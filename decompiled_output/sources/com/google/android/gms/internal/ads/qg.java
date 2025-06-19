package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import c.a.b.b.e.g;

/* loaded from: classes.dex */
public final class qg extends c.a.b.b.e.g<vg> {
    public qg() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    @Override // c.a.b.b.e.g
    protected final /* synthetic */ vg a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return iInterfaceQueryLocalInterface instanceof vg ? (vg) iInterfaceQueryLocalInterface : new ug(iBinder);
    }

    public final pg c(Activity activity) {
        try {
            IBinder iBinderT6 = b(activity).T6(c.a.b.b.e.e.i2(activity));
            if (iBinderT6 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderT6.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return iInterfaceQueryLocalInterface instanceof pg ? (pg) iInterfaceQueryLocalInterface : new sg(iBinderT6);
        } catch (RemoteException e) {
            tr.d("Could not create remote AdOverlay.", e);
            return null;
        } catch (g.a e2) {
            tr.d("Could not create remote AdOverlay.", e2);
            return null;
        }
    }
}
