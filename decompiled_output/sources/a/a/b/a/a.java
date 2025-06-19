package a.a.b.a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: a.a.b.a.a$a, reason: collision with other inner class name */
    public static class C0004a implements a {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // a.a.b.a.a
        public void n8(int r1, Bundle bundle) throws RemoteException {
        }
    }

    public static abstract class b extends Binder implements a {
        private static final String d = "android.support.v4.os.IResultReceiver";
        static final int e = 1;

        /* renamed from: a.a.b.a.a$b$a, reason: collision with other inner class name */
        private static class C0005a implements a {
            public static a e;
            private IBinder d;

            C0005a(IBinder iBinder) {
                this.d = iBinder;
            }

            public String L0() {
                return b.d;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.d;
            }

            @Override // a.a.b.a.a
            public void n8(int r5, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.d);
                    parcelObtain.writeInt(r5);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.d.transact(1, parcelObtain, null, 1) || b.b2() == null) {
                        return;
                    }
                    b.b2().n8(r5, bundle);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, d);
        }

        public static a L0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(d);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0005a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        public static a b2() {
            return C0005a.e;
        }

        public static boolean e2(a aVar) {
            if (C0005a.e != null || aVar == null) {
                return false;
            }
            C0005a.e = aVar;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int r4, Parcel parcel, Parcel parcel2, int r7) throws RemoteException {
            if (r4 == 1) {
                parcel.enforceInterface(d);
                n8(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (r4 != 1598968902) {
                return super.onTransact(r4, parcel, parcel2, r7);
            }
            parcel2.writeString(d);
            return true;
        }
    }

    void n8(int r1, Bundle bundle) throws RemoteException;
}
