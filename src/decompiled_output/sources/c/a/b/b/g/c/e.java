package c.a.b.b.g.c;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class e extends a implements c {
    e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // c.a.b.b.g.c.c
    public final void K0(String str, String str2, Bundle bundle, long j) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        parcelL0.writeString(str2);
        b0.c(parcelL0, bundle);
        parcelL0.writeLong(j);
        e2(1, parcelL0);
    }

    @Override // c.a.b.b.g.c.c
    public final int a() throws RemoteException {
        Parcel parcelB2 = b2(2, L0());
        int r1 = parcelB2.readInt();
        parcelB2.recycle();
        return r1;
    }
}
