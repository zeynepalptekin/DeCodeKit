package c.a.b.b.g.c;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class sf extends c1 implements pf {
    public sf() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // c.a.b.b.g.c.c1
    protected final boolean L0(int r1, Parcel parcel, Parcel parcel2, int r4) throws RemoteException {
        if (r1 != 1) {
            return false;
        }
        s0((Bundle) b0.a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
