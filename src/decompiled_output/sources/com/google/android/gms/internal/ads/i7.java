package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.d;

/* loaded from: classes.dex */
public final class i7 extends com.google.android.gms.ads.internal.c<s7> {
    i7(Context context, Looper looper, d.a aVar, d.b bVar) {
        super(rj.c(context), looper, 166, aVar, bVar, null);
    }

    @Override // com.google.android.gms.common.internal.d
    @com.google.android.gms.common.util.d0
    protected final /* synthetic */ IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        return iInterfaceQueryLocalInterface instanceof s7 ? (s7) iInterfaceQueryLocalInterface : new r7(iBinder);
    }

    public final s7 m0() throws DeadObjectException {
        return (s7) super.v();
    }

    @Override // com.google.android.gms.common.internal.d
    @com.google.android.gms.common.util.d0
    protected final String x() {
        return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
    }

    @Override // com.google.android.gms.common.internal.d
    @com.google.android.gms.common.util.d0
    protected final String z() {
        return "com.google.android.gms.ads.service.HTTP";
    }
}
