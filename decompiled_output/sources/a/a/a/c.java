package a.a.a;

import a.a.a.a;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface c extends IInterface {

    public static abstract class a extends Binder implements c {
        private static final String d = "android.support.customtabs.IPostMessageService";
        static final int e = 2;
        static final int f = 3;

        /* renamed from: a.a.a.c$a$a, reason: collision with other inner class name */
        private static class C0003a implements c {
            private IBinder d;

            C0003a(IBinder iBinder) {
                this.d = iBinder;
            }

            public String L0() {
                return a.d;
            }

            @Override // a.a.a.c
            public void O6(a.a.a.a aVar, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.d);
                    parcelObtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.d.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.d;
            }

            @Override // a.a.a.c
            public void m8(a.a.a.a aVar, String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.d);
                    parcelObtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    parcelObtain.writeString(str);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.d.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, d);
        }

        public static c L0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(d);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof c)) ? new C0003a(iBinder) : (c) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int r5, Parcel parcel, Parcel parcel2, int r8) throws RemoteException {
            if (r5 == 2) {
                parcel.enforceInterface(d);
                O6(a.AbstractBinderC0000a.L0(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            } else {
                if (r5 != 3) {
                    if (r5 != 1598968902) {
                        return super.onTransact(r5, parcel, parcel2, r8);
                    }
                    parcel2.writeString(d);
                    return true;
                }
                parcel.enforceInterface(d);
                m8(a.AbstractBinderC0000a.L0(parcel.readStrongBinder()), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void O6(a.a.a.a aVar, Bundle bundle) throws RemoteException;

    void m8(a.a.a.a aVar, String str, Bundle bundle) throws RemoteException;
}
