package c.a.b.b.g.c;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class rf extends a implements pf {
    rf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // c.a.b.b.g.c.pf
    public final void s0(Bundle bundle) throws RemoteException {
        Parcel parcelL0 = L0();
        b0.c(parcelL0, bundle);
        e2(1, parcelL0);
    }
}
