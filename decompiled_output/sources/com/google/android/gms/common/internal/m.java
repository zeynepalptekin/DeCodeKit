package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;

/* loaded from: classes.dex */
public interface m extends IInterface {

    public static abstract class a extends c.a.b.b.g.b.a implements m {
        public a() {
            super("com.google.android.gms.common.internal.IGmsCallbacks");
        }

        @Override // c.a.b.b.g.b.a
        protected final boolean L0(int r3, Parcel parcel, Parcel parcel2, int r6) throws RemoteException {
            if (r3 == 1) {
                t8(parcel.readInt(), parcel.readStrongBinder(), (Bundle) c.a.b.b.g.b.d.a(parcel, Bundle.CREATOR));
            } else if (r3 == 2) {
                I7(parcel.readInt(), (Bundle) c.a.b.b.g.b.d.a(parcel, Bundle.CREATOR));
            } else {
                if (r3 != 3) {
                    return false;
                }
                P4(parcel.readInt(), parcel.readStrongBinder(), (c0) c.a.b.b.g.b.d.a(parcel, c0.CREATOR));
            }
            parcel2.writeNoException();
            return true;
        }
    }

    void I7(@RecentlyNonNull int r1, @RecentlyNonNull Bundle bundle) throws RemoteException;

    void P4(int r1, IBinder iBinder, c0 c0Var) throws RemoteException;

    void t8(@RecentlyNonNull int r1, @RecentlyNonNull IBinder iBinder, @RecentlyNonNull Bundle bundle) throws RemoteException;
}
