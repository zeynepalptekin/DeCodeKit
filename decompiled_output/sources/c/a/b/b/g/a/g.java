package c.a.b.b.g.a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class g extends a implements e {
    g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // c.a.b.b.g.a.e
    public final String J() throws RemoteException {
        Parcel parcelB2 = b2(1, L0());
        String string = parcelB2.readString();
        parcelB2.recycle();
        return string;
    }

    @Override // c.a.b.b.g.a.e
    public final boolean c() throws RemoteException {
        Parcel parcelB2 = b2(6, L0());
        boolean zB = c.b(parcelB2);
        parcelB2.recycle();
        return zB;
    }

    @Override // c.a.b.b.g.a.e
    public final boolean o1(boolean z) throws RemoteException {
        Parcel parcelL0 = L0();
        c.a(parcelL0, true);
        Parcel parcelB2 = b2(2, parcelL0);
        boolean zB = c.b(parcelB2);
        parcelB2.recycle();
        return zB;
    }
}
