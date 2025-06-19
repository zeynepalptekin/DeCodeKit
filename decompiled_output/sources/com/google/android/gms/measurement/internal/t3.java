package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.d;

/* loaded from: classes.dex */
public final class t3 extends com.google.android.gms.common.internal.d<o3> {
    public t3(Context context, Looper looper, d.a aVar, d.b bVar) {
        super(context, looper, 93, aVar, bVar, null);
    }

    @Override // com.google.android.gms.common.internal.d
    public final /* synthetic */ IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return iInterfaceQueryLocalInterface instanceof o3 ? (o3) iInterfaceQueryLocalInterface : new q3(iBinder);
    }

    @Override // com.google.android.gms.common.internal.d
    public final int s() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.d
    @androidx.annotation.h0
    protected final String x() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // com.google.android.gms.common.internal.d
    @androidx.annotation.h0
    protected final String z() {
        return "com.google.android.gms.measurement.START";
    }
}
