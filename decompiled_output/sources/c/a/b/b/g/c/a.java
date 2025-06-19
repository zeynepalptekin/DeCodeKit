package c.a.b.b.g.c;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public class a implements IInterface {
    private final IBinder d;
    private final String e;

    protected a(IBinder iBinder, String str) {
        this.d = iBinder;
        this.e = str;
    }

    protected final Parcel L0() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.e);
        return parcelObtain;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.d;
    }

    protected final Parcel b2(int r4, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.d.transact(r4, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    protected final void e2(int r4, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.d.transact(r4, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}
