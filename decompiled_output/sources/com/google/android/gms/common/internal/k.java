package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;

/* loaded from: classes.dex */
public interface k extends IInterface {

    public static abstract class a extends c.a.b.b.g.b.a implements k {

        /* renamed from: com.google.android.gms.common.internal.k$a$a, reason: collision with other inner class name */
        public static class C0167a extends c.a.b.b.g.b.b implements k {
            C0167a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }

            @Override // com.google.android.gms.common.internal.k
            public final Account a() throws RemoteException {
                Parcel parcelB2 = b2(2, L0());
                Account account = (Account) c.a.b.b.g.b.d.a(parcelB2, Account.CREATOR);
                parcelB2.recycle();
                return account;
            }
        }

        public a() {
            super("com.google.android.gms.common.internal.IAccountAccessor");
        }

        @RecentlyNonNull
        public static k b2(@RecentlyNonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return iInterfaceQueryLocalInterface instanceof k ? (k) iInterfaceQueryLocalInterface : new C0167a(iBinder);
        }

        @Override // c.a.b.b.g.b.a
        @RecentlyNonNull
        protected final boolean L0(@RecentlyNonNull int r1, @RecentlyNonNull Parcel parcel, @RecentlyNonNull Parcel parcel2, @RecentlyNonNull int r4) throws RemoteException {
            if (r1 != 2) {
                return false;
            }
            Account accountA = a();
            parcel2.writeNoException();
            c.a.b.b.g.b.d.f(parcel2, accountA);
            return true;
        }
    }

    @RecentlyNonNull
    Account a() throws RemoteException;
}
