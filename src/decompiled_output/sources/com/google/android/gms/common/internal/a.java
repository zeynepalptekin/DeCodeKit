package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.k;

/* loaded from: classes.dex */
public class a extends k.a {
    @RecentlyNullable
    @com.google.android.gms.common.annotation.a
    public static Account e2(@RecentlyNonNull k kVar) {
        if (kVar != null) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return kVar.a();
            } catch (RemoteException unused) {
                Log.w("AccountAccessor", "Remote account accessor probably died");
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.common.internal.k
    @RecentlyNonNull
    public final Account a() {
        throw new NoSuchMethodError();
    }

    @RecentlyNonNull
    public boolean equals(@androidx.annotation.i0 Object obj) {
        throw new NoSuchMethodError();
    }
}
