package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.d;

/* loaded from: classes.dex */
public final class di extends com.google.android.gms.ads.internal.c<mi> {
    public di(Context context, Looper looper, d.a aVar, d.b bVar) {
        super(rj.c(context), looper, 8, aVar, bVar, null);
    }

    @Override // com.google.android.gms.common.internal.d
    @com.google.android.gms.common.util.d0
    protected final /* synthetic */ IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        return iInterfaceQueryLocalInterface instanceof mi ? (mi) iInterfaceQueryLocalInterface : new oi(iBinder);
    }

    public final mi m0() throws DeadObjectException {
        return (mi) super.v();
    }

    @Override // com.google.android.gms.common.internal.d
    @com.google.android.gms.common.util.d0
    protected final String x() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    @Override // com.google.android.gms.common.internal.d
    @com.google.android.gms.common.util.d0
    protected final String z() {
        return "com.google.android.gms.ads.service.START";
    }
}
