package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;

/* loaded from: classes.dex */
public interface l extends IInterface {

    public static abstract class a extends c.a.b.b.g.b.a implements l {

        /* renamed from: com.google.android.gms.common.internal.l$a$a, reason: collision with other inner class name */
        public static class C0168a extends c.a.b.b.g.b.b implements l {
            C0168a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.ICancelToken");
            }

            @Override // com.google.android.gms.common.internal.l
            public final void cancel() throws RemoteException {
                i2(2, L0());
            }
        }

        public a() {
            super("com.google.android.gms.common.internal.ICancelToken");
        }

        @RecentlyNonNull
        public static l b2(@RecentlyNonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            return iInterfaceQueryLocalInterface instanceof l ? (l) iInterfaceQueryLocalInterface : new C0168a(iBinder);
        }
    }

    void cancel() throws RemoteException;
}
