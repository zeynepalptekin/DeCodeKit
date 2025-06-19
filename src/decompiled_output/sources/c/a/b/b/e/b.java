package c.a.b.b.e;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import c.a.b.b.e.c;

/* loaded from: classes.dex */
public interface b extends IInterface {

    public static abstract class a extends c.a.b.b.g.b.a implements b {

        /* renamed from: c.a.b.b.e.b$a$a, reason: collision with other inner class name */
        public static class C0124a extends c.a.b.b.g.b.b implements b {
            C0124a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamic.IFragmentWrapper");
            }

            @Override // c.a.b.b.e.b
            public final c A0() throws RemoteException {
                Parcel parcelB2 = b2(12, L0());
                c cVarB2 = c.a.b2(parcelB2.readStrongBinder());
                parcelB2.recycle();
                return cVarB2;
            }

            @Override // c.a.b.b.e.b
            public final boolean B() throws RemoteException {
                Parcel parcelB2 = b2(18, L0());
                boolean zE = c.a.b.b.g.b.d.e(parcelB2);
                parcelB2.recycle();
                return zE;
            }

            @Override // c.a.b.b.e.b
            public final String B0() throws RemoteException {
                Parcel parcelB2 = b2(8, L0());
                String string = parcelB2.readString();
                parcelB2.recycle();
                return string;
            }

            @Override // c.a.b.b.e.b
            public final boolean F() throws RemoteException {
                Parcel parcelB2 = b2(14, L0());
                boolean zE = c.a.b.b.g.b.d.e(parcelB2);
                parcelB2.recycle();
                return zE;
            }

            @Override // c.a.b.b.e.b
            public final void F0(c cVar) throws RemoteException {
                Parcel parcelL0 = L0();
                c.a.b.b.g.b.d.b(parcelL0, cVar);
                e2(27, parcelL0);
            }

            @Override // c.a.b.b.e.b
            public final void G0(Intent intent) throws RemoteException {
                Parcel parcelL0 = L0();
                c.a.b.b.g.b.d.c(parcelL0, intent);
                e2(25, parcelL0);
            }

            @Override // c.a.b.b.e.b
            public final boolean I() throws RemoteException {
                Parcel parcelB2 = b2(15, L0());
                boolean zE = c.a.b.b.g.b.d.e(parcelB2);
                parcelB2.recycle();
                return zE;
            }

            @Override // c.a.b.b.e.b
            public final boolean O() throws RemoteException {
                Parcel parcelB2 = b2(16, L0());
                boolean zE = c.a.b.b.g.b.d.e(parcelB2);
                parcelB2.recycle();
                return zE;
            }

            @Override // c.a.b.b.e.b
            public final void Q7(Intent intent, int r3) throws RemoteException {
                Parcel parcelL0 = L0();
                c.a.b.b.g.b.d.c(parcelL0, intent);
                parcelL0.writeInt(r3);
                e2(26, parcelL0);
            }

            @Override // c.a.b.b.e.b
            public final void T2(boolean z) throws RemoteException {
                Parcel parcelL0 = L0();
                c.a.b.b.g.b.d.d(parcelL0, z);
                e2(24, parcelL0);
            }

            @Override // c.a.b.b.e.b
            public final c a() throws RemoteException {
                Parcel parcelB2 = b2(2, L0());
                c cVarB2 = c.a.b2(parcelB2.readStrongBinder());
                parcelB2.recycle();
                return cVarB2;
            }

            @Override // c.a.b.b.e.b
            public final Bundle b() throws RemoteException {
                Parcel parcelB2 = b2(3, L0());
                Bundle bundle = (Bundle) c.a.b.b.g.b.d.a(parcelB2, Bundle.CREATOR);
                parcelB2.recycle();
                return bundle;
            }

            @Override // c.a.b.b.e.b
            public final int c() throws RemoteException {
                Parcel parcelB2 = b2(4, L0());
                int r1 = parcelB2.readInt();
                parcelB2.recycle();
                return r1;
            }

            @Override // c.a.b.b.e.b
            public final b d() throws RemoteException {
                Parcel parcelB2 = b2(5, L0());
                b bVarB2 = a.b2(parcelB2.readStrongBinder());
                parcelB2.recycle();
                return bVarB2;
            }

            @Override // c.a.b.b.e.b
            public final void d8(boolean z) throws RemoteException {
                Parcel parcelL0 = L0();
                c.a.b.b.g.b.d.d(parcelL0, z);
                e2(23, parcelL0);
            }

            @Override // c.a.b.b.e.b
            public final b e0() throws RemoteException {
                Parcel parcelB2 = b2(9, L0());
                b bVarB2 = a.b2(parcelB2.readStrongBinder());
                parcelB2.recycle();
                return bVarB2;
            }

            @Override // c.a.b.b.e.b
            public final c f() throws RemoteException {
                Parcel parcelB2 = b2(6, L0());
                c cVarB2 = c.a.b2(parcelB2.readStrongBinder());
                parcelB2.recycle();
                return cVarB2;
            }

            @Override // c.a.b.b.e.b
            public final int n0() throws RemoteException {
                Parcel parcelB2 = b2(10, L0());
                int r1 = parcelB2.readInt();
                parcelB2.recycle();
                return r1;
            }

            @Override // c.a.b.b.e.b
            public final void o0(c cVar) throws RemoteException {
                Parcel parcelL0 = L0();
                c.a.b.b.g.b.d.b(parcelL0, cVar);
                e2(20, parcelL0);
            }

            @Override // c.a.b.b.e.b
            public final void o1(boolean z) throws RemoteException {
                Parcel parcelL0 = L0();
                c.a.b.b.g.b.d.d(parcelL0, z);
                e2(22, parcelL0);
            }

            @Override // c.a.b.b.e.b
            public final boolean p0() throws RemoteException {
                Parcel parcelB2 = b2(19, L0());
                boolean zE = c.a.b.b.g.b.d.e(parcelB2);
                parcelB2.recycle();
                return zE;
            }

            @Override // c.a.b.b.e.b
            public final boolean u0() throws RemoteException {
                Parcel parcelB2 = b2(11, L0());
                boolean zE = c.a.b.b.g.b.d.e(parcelB2);
                parcelB2.recycle();
                return zE;
            }

            @Override // c.a.b.b.e.b
            public final void v4(boolean z) throws RemoteException {
                Parcel parcelL0 = L0();
                c.a.b.b.g.b.d.d(parcelL0, z);
                e2(21, parcelL0);
            }

            @Override // c.a.b.b.e.b
            public final boolean x() throws RemoteException {
                Parcel parcelB2 = b2(17, L0());
                boolean zE = c.a.b.b.g.b.d.e(parcelB2);
                parcelB2.recycle();
                return zE;
            }

            @Override // c.a.b.b.e.b
            public final boolean y0() throws RemoteException {
                Parcel parcelB2 = b2(7, L0());
                boolean zE = c.a.b.b.g.b.d.e(parcelB2);
                parcelB2.recycle();
                return zE;
            }

            @Override // c.a.b.b.e.b
            public final boolean z() throws RemoteException {
                Parcel parcelB2 = b2(13, L0());
                boolean zE = c.a.b.b.g.b.d.e(parcelB2);
                parcelB2.recycle();
                return zE;
            }
        }

        public a() {
            super("com.google.android.gms.dynamic.IFragmentWrapper");
        }

        @RecentlyNonNull
        public static b b2(@RecentlyNonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IFragmentWrapper");
            return iInterfaceQueryLocalInterface instanceof b ? (b) iInterfaceQueryLocalInterface : new C0124a(iBinder);
        }

        @Override // c.a.b.b.g.b.a
        @RecentlyNonNull
        protected final boolean L0(@RecentlyNonNull int r1, @RecentlyNonNull Parcel parcel, @RecentlyNonNull Parcel parcel2, @RecentlyNonNull int r4) throws RemoteException {
            IInterface iInterfaceA;
            int r12;
            boolean zY0;
            switch (r1) {
                case 2:
                    iInterfaceA = a();
                    parcel2.writeNoException();
                    c.a.b.b.g.b.d.b(parcel2, iInterfaceA);
                    return true;
                case 3:
                    Bundle bundleB = b();
                    parcel2.writeNoException();
                    c.a.b.b.g.b.d.f(parcel2, bundleB);
                    return true;
                case 4:
                    r12 = c();
                    parcel2.writeNoException();
                    parcel2.writeInt(r12);
                    return true;
                case 5:
                    iInterfaceA = d();
                    parcel2.writeNoException();
                    c.a.b.b.g.b.d.b(parcel2, iInterfaceA);
                    return true;
                case 6:
                    iInterfaceA = f();
                    parcel2.writeNoException();
                    c.a.b.b.g.b.d.b(parcel2, iInterfaceA);
                    return true;
                case 7:
                    zY0 = y0();
                    parcel2.writeNoException();
                    c.a.b.b.g.b.d.d(parcel2, zY0);
                    return true;
                case 8:
                    String strB0 = B0();
                    parcel2.writeNoException();
                    parcel2.writeString(strB0);
                    return true;
                case 9:
                    iInterfaceA = e0();
                    parcel2.writeNoException();
                    c.a.b.b.g.b.d.b(parcel2, iInterfaceA);
                    return true;
                case 10:
                    r12 = n0();
                    parcel2.writeNoException();
                    parcel2.writeInt(r12);
                    return true;
                case 11:
                    zY0 = u0();
                    parcel2.writeNoException();
                    c.a.b.b.g.b.d.d(parcel2, zY0);
                    return true;
                case 12:
                    iInterfaceA = A0();
                    parcel2.writeNoException();
                    c.a.b.b.g.b.d.b(parcel2, iInterfaceA);
                    return true;
                case 13:
                    zY0 = z();
                    parcel2.writeNoException();
                    c.a.b.b.g.b.d.d(parcel2, zY0);
                    return true;
                case 14:
                    zY0 = F();
                    parcel2.writeNoException();
                    c.a.b.b.g.b.d.d(parcel2, zY0);
                    return true;
                case 15:
                    zY0 = I();
                    parcel2.writeNoException();
                    c.a.b.b.g.b.d.d(parcel2, zY0);
                    return true;
                case 16:
                    zY0 = O();
                    parcel2.writeNoException();
                    c.a.b.b.g.b.d.d(parcel2, zY0);
                    return true;
                case 17:
                    zY0 = x();
                    parcel2.writeNoException();
                    c.a.b.b.g.b.d.d(parcel2, zY0);
                    return true;
                case 18:
                    zY0 = B();
                    parcel2.writeNoException();
                    c.a.b.b.g.b.d.d(parcel2, zY0);
                    return true;
                case 19:
                    zY0 = p0();
                    parcel2.writeNoException();
                    c.a.b.b.g.b.d.d(parcel2, zY0);
                    return true;
                case 20:
                    o0(c.a.b2(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 21:
                    v4(c.a.b.b.g.b.d.e(parcel));
                    parcel2.writeNoException();
                    return true;
                case 22:
                    o1(c.a.b.b.g.b.d.e(parcel));
                    parcel2.writeNoException();
                    return true;
                case 23:
                    d8(c.a.b.b.g.b.d.e(parcel));
                    parcel2.writeNoException();
                    return true;
                case 24:
                    T2(c.a.b.b.g.b.d.e(parcel));
                    parcel2.writeNoException();
                    return true;
                case 25:
                    G0((Intent) c.a.b.b.g.b.d.a(parcel, Intent.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 26:
                    Q7((Intent) c.a.b.b.g.b.d.a(parcel, Intent.CREATOR), parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 27:
                    F0(c.a.b2(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }
    }

    @RecentlyNonNull
    c A0() throws RemoteException;

    @RecentlyNonNull
    boolean B() throws RemoteException;

    @RecentlyNullable
    String B0() throws RemoteException;

    @RecentlyNonNull
    boolean F() throws RemoteException;

    void F0(@RecentlyNonNull c cVar) throws RemoteException;

    void G0(@RecentlyNonNull Intent intent) throws RemoteException;

    @RecentlyNonNull
    boolean I() throws RemoteException;

    @RecentlyNonNull
    boolean O() throws RemoteException;

    void Q7(@RecentlyNonNull Intent intent, @RecentlyNonNull int r2) throws RemoteException;

    void T2(@RecentlyNonNull boolean z) throws RemoteException;

    @RecentlyNonNull
    c a() throws RemoteException;

    @RecentlyNonNull
    Bundle b() throws RemoteException;

    @RecentlyNonNull
    int c() throws RemoteException;

    @RecentlyNullable
    b d() throws RemoteException;

    void d8(@RecentlyNonNull boolean z) throws RemoteException;

    @RecentlyNullable
    b e0() throws RemoteException;

    @RecentlyNonNull
    c f() throws RemoteException;

    @RecentlyNonNull
    int n0() throws RemoteException;

    void o0(@RecentlyNonNull c cVar) throws RemoteException;

    void o1(@RecentlyNonNull boolean z) throws RemoteException;

    @RecentlyNonNull
    boolean p0() throws RemoteException;

    @RecentlyNonNull
    boolean u0() throws RemoteException;

    void v4(@RecentlyNonNull boolean z) throws RemoteException;

    @RecentlyNonNull
    boolean x() throws RemoteException;

    @RecentlyNonNull
    boolean y0() throws RemoteException;

    @RecentlyNonNull
    boolean z() throws RemoteException;
}
