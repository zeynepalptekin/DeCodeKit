package c.a.b.b.g.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public class a extends Binder implements IInterface {
    private static c d;

    protected a(String str) {
        attachInterface(this, str);
    }

    protected boolean L0(int r1, Parcel parcel, Parcel parcel2, int r4) throws RemoteException {
        return false;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int r2, Parcel parcel, Parcel parcel2, int r5) throws RemoteException {
        boolean zOnTransact;
        if (r2 > 16777215) {
            zOnTransact = super.onTransact(r2, parcel, parcel2, r5);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            zOnTransact = false;
        }
        if (zOnTransact) {
            return true;
        }
        return L0(r2, parcel, parcel2, r5);
    }
}
