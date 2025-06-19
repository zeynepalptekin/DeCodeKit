package a.a.a;

import a.a.a.a;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes.dex */
public interface b extends IInterface {

    public static abstract class a extends Binder implements b {
        private static final String d = "android.support.customtabs.ICustomTabsService";
        static final int e = 2;
        static final int f = 3;
        static final int g = 4;
        static final int h = 5;
        static final int i = 6;
        static final int j = 7;
        static final int k = 8;
        static final int l = 9;

        /* renamed from: a.a.a.b$a$a, reason: collision with other inner class name */
        private static class C0002a implements b {
            private IBinder d;

            C0002a(IBinder iBinder) {
                this.d = iBinder;
            }

            @Override // a.a.a.b
            public boolean B4(a.a.a.a aVar, Bundle bundle) throws RemoteException {
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
                    this.d.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // a.a.a.b
            public boolean D5(a.a.a.a aVar, Uri uri) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.d);
                    parcelObtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.d.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String L0() {
                return a.d;
            }

            @Override // a.a.a.b
            public Bundle V5(String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.d);
                    parcelObtain.writeString(str);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.d.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcelObtain2) : null;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.d;
            }

            @Override // a.a.a.b
            public boolean b3(a.a.a.a aVar, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.d);
                    parcelObtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    parcelObtain.writeTypedList(list);
                    this.d.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // a.a.a.b
            public boolean k3(a.a.a.a aVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.d);
                    parcelObtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    this.d.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // a.a.a.b
            public boolean s3(a.a.a.a aVar, int r5, Uri uri, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.d);
                    parcelObtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    parcelObtain.writeInt(r5);
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.d.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // a.a.a.b
            public boolean x7(long j) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.d);
                    parcelObtain.writeLong(j);
                    this.d.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // a.a.a.b
            public int z2(a.a.a.a aVar, String str, Bundle bundle) throws RemoteException {
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
                    this.d.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, d);
        }

        public static b L0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(d);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new C0002a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int r5, Parcel parcel, Parcel parcel2, int r8) throws RemoteException {
            if (r5 == 1598968902) {
                parcel2.writeString(d);
                return true;
            }
            switch (r5) {
                case 2:
                    parcel.enforceInterface(d);
                    boolean zX7 = x7(parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(zX7 ? 1 : 0);
                    return true;
                case 3:
                    parcel.enforceInterface(d);
                    boolean zK3 = k3(a.AbstractBinderC0000a.L0(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(zK3 ? 1 : 0);
                    return true;
                case 4:
                    parcel.enforceInterface(d);
                    boolean zB3 = b3(a.AbstractBinderC0000a.L0(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, parcel.createTypedArrayList(Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zB3 ? 1 : 0);
                    return true;
                case 5:
                    parcel.enforceInterface(d);
                    Bundle bundleV5 = V5(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (bundleV5 != null) {
                        parcel2.writeInt(1);
                        bundleV5.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 6:
                    parcel.enforceInterface(d);
                    boolean zB4 = B4(a.AbstractBinderC0000a.L0(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zB4 ? 1 : 0);
                    return true;
                case 7:
                    parcel.enforceInterface(d);
                    boolean zD5 = D5(a.AbstractBinderC0000a.L0(parcel.readStrongBinder()), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zD5 ? 1 : 0);
                    return true;
                case 8:
                    parcel.enforceInterface(d);
                    int r52 = z2(a.AbstractBinderC0000a.L0(parcel.readStrongBinder()), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(r52);
                    return true;
                case 9:
                    parcel.enforceInterface(d);
                    boolean zS3 = s3(a.AbstractBinderC0000a.L0(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    parcel2.writeInt(zS3 ? 1 : 0);
                    return true;
                default:
                    return super.onTransact(r5, parcel, parcel2, r8);
            }
        }
    }

    boolean B4(a.a.a.a aVar, Bundle bundle) throws RemoteException;

    boolean D5(a.a.a.a aVar, Uri uri) throws RemoteException;

    Bundle V5(String str, Bundle bundle) throws RemoteException;

    boolean b3(a.a.a.a aVar, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException;

    boolean k3(a.a.a.a aVar) throws RemoteException;

    boolean s3(a.a.a.a aVar, int r2, Uri uri, Bundle bundle) throws RemoteException;

    boolean x7(long j) throws RemoteException;

    int z2(a.a.a.a aVar, String str, Bundle bundle) throws RemoteException;
}
