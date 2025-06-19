package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.d;

/* loaded from: classes.dex */
public final class gt1 extends com.google.android.gms.ads.internal.c<jt1> {
    private final int J;

    public gt1(Context context, Looper looper, d.a aVar, d.b bVar, int r12) {
        super(context, looper, 116, aVar, bVar, null);
        this.J = r12;
    }

    @Override // com.google.android.gms.common.internal.d
    protected final /* synthetic */ IInterface d(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return iInterfaceQueryLocalInterface instanceof jt1 ? (jt1) iInterfaceQueryLocalInterface : new mt1(iBinder);
    }

    public final jt1 m0() throws DeadObjectException {
        return (jt1) super.v();
    }

    @Override // com.google.android.gms.common.internal.d
    public final int s() {
        return this.J;
    }

    @Override // com.google.android.gms.common.internal.d
    protected final String x() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    @Override // com.google.android.gms.common.internal.d
    protected final String z() {
        return "com.google.android.gms.gass.START";
    }
}
