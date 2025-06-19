package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.d;

/* loaded from: classes.dex */
public final class cu2 extends com.google.android.gms.ads.internal.c<gu2> {
    cu2(Context context, Looper looper, d.a aVar, d.b bVar) {
        super(rj.c(context), looper, 123, aVar, bVar, null);
    }

    @Override // com.google.android.gms.common.internal.d
    @com.google.android.gms.common.util.d0
    protected final /* synthetic */ IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        return iInterfaceQueryLocalInterface instanceof gu2 ? (gu2) iInterfaceQueryLocalInterface : new ju2(iBinder);
    }

    public final gu2 m0() throws DeadObjectException {
        return (gu2) super.v();
    }

    @Override // com.google.android.gms.common.internal.d
    @com.google.android.gms.common.util.d0
    protected final String x() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    @Override // com.google.android.gms.common.internal.d
    @com.google.android.gms.common.util.d0
    protected final String z() {
        return "com.google.android.gms.ads.service.CACHE";
    }
}
