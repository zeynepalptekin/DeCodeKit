package c.a.b.b.g.c;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class b extends c1 implements c {
    public b() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // c.a.b.b.g.c.c1
    protected final boolean L0(int r7, Parcel parcel, Parcel parcel2, int r10) throws RemoteException {
        if (r7 == 1) {
            K0(parcel.readString(), parcel.readString(), (Bundle) b0.a(parcel, Bundle.CREATOR), parcel.readLong());
            parcel2.writeNoException();
        } else {
            if (r7 != 2) {
                return false;
            }
            int r72 = a();
            parcel2.writeNoException();
            parcel2.writeInt(r72);
        }
        return true;
    }
}
