package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes.dex */
public final class nh extends ih2 implements lh {
    nh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void Y7(List<Uri> list) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeTypedList(list);
        e2(1, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.lh
    public final void u1(String str) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        e2(2, parcelL0);
    }
}
