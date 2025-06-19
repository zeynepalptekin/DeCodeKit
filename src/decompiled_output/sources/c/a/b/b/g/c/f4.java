package c.a.b.b.g.c;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class f4 extends a implements d2 {
    f4(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // c.a.b.b.g.c.d2
    public final Bundle s0(Bundle bundle) throws RemoteException {
        Parcel parcelL0 = L0();
        b0.c(parcelL0, bundle);
        Parcel parcelB2 = b2(1, parcelL0);
        Bundle bundle2 = (Bundle) b0.a(parcelB2, Bundle.CREATOR);
        parcelB2.recycle();
        return bundle2;
    }
}
