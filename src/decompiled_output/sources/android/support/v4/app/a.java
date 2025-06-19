package android.support.v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: android.support.v4.app.a$a, reason: collision with other inner class name */
    public static class C0007a implements a {
        @Override // android.support.v4.app.a
        public void B7(String str, int r2, String str2, Notification notification) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // android.support.v4.app.a
        public void i5(String str) throws RemoteException {
        }

        @Override // android.support.v4.app.a
        public void x2(String str, int r2, String str2) throws RemoteException {
        }
    }

    public static abstract class b extends Binder implements a {
        private static final String d = "android.support.v4.app.INotificationSideChannel";
        static final int e = 1;
        static final int f = 2;
        static final int g = 3;

        /* renamed from: android.support.v4.app.a$b$a, reason: collision with other inner class name */
        private static class C0008a implements a {
            public static a e;
            private IBinder d;

            C0008a(IBinder iBinder) {
                this.d = iBinder;
            }

            @Override // android.support.v4.app.a
            public void B7(String str, int r6, String str2, Notification notification) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.d);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(r6);
                    parcelObtain.writeString(str2);
                    if (notification != null) {
                        parcelObtain.writeInt(1);
                        notification.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (this.d.transact(1, parcelObtain, null, 1) || b.b2() == null) {
                        return;
                    }
                    b.b2().B7(str, r6, str2, notification);
                } finally {
                    parcelObtain.recycle();
                }
            }

            public String L0() {
                return b.d;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.d;
            }

            @Override // android.support.v4.app.a
            public void i5(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.d);
                    parcelObtain.writeString(str);
                    if (this.d.transact(3, parcelObtain, null, 1) || b.b2() == null) {
                        return;
                    }
                    b.b2().i5(str);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.app.a
            public void x2(String str, int r7, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.d);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(r7);
                    parcelObtain.writeString(str2);
                    if (this.d.transact(2, parcelObtain, null, 1) || b.b2() == null) {
                        return;
                    }
                    b.b2().x2(str, r7, str2);
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
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0008a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        public static a b2() {
            return C0008a.e;
        }

        public static boolean e2(a aVar) {
            if (C0008a.e != null || aVar == null) {
                return false;
            }
            C0008a.e = aVar;
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
                B7(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0 ? (Notification) Notification.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            if (r4 == 2) {
                parcel.enforceInterface(d);
                x2(parcel.readString(), parcel.readInt(), parcel.readString());
                return true;
            }
            if (r4 == 3) {
                parcel.enforceInterface(d);
                i5(parcel.readString());
                return true;
            }
            if (r4 != 1598968902) {
                return super.onTransact(r4, parcel, parcel2, r7);
            }
            parcel2.writeString(d);
            return true;
        }
    }

    void B7(String str, int r2, String str2, Notification notification) throws RemoteException;

    void i5(String str) throws RemoteException;

    void x2(String str, int r2, String str2) throws RemoteException;
}
