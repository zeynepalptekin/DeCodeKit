package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import c.a.b.b.e.g;

/* loaded from: classes.dex */
public final class hw2 extends c.a.b.b.e.g<my2> {
    @com.google.android.gms.common.util.d0
    public hw2() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override // c.a.b.b.e.g
    protected final /* synthetic */ my2 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return iInterfaceQueryLocalInterface instanceof my2 ? (my2) iInterfaceQueryLocalInterface : new ly2(iBinder);
    }

    public final hy2 c(Context context, qw2 qw2Var, String str, qc qcVar, int r13) {
        try {
            IBinder iBinderY2 = b(context).y2(c.a.b.b.e.e.i2(context), qw2Var, str, qcVar, 202510000, r13);
            if (iBinderY2 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderY2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return iInterfaceQueryLocalInterface instanceof hy2 ? (hy2) iInterfaceQueryLocalInterface : new jy2(iBinderY2);
        } catch (RemoteException | g.a e) {
            tr.b("Could not create remote AdManager.", e);
            return null;
        }
    }
}
