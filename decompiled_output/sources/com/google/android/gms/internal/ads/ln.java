package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import c.a.b.b.e.c;
import java.util.List;

/* loaded from: classes.dex */
public final class ln extends ih2 implements jn {
    ln(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.jn
    public final c.a.b.b.e.c I1(c.a.b.b.e.c cVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        Parcel parcelB2 = b2(4, parcelL0);
        c.a.b.b.e.c cVarB2 = c.a.b2(parcelB2.readStrongBinder());
        parcelB2.recycle();
        return cVarB2;
    }

    @Override // com.google.android.gms.internal.ads.jn
    public final void L2(th thVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.d(parcelL0, thVar);
        e2(7, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.jn
    public final c.a.b.b.e.c N6(c.a.b.b.e.c cVar, c.a.b.b.e.c cVar2) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        kh2.c(parcelL0, cVar2);
        Parcel parcelB2 = b2(3, parcelL0);
        c.a.b.b.e.c cVarB2 = c.a.b2(parcelB2.readStrongBinder());
        parcelB2.recycle();
        return cVarB2;
    }

    @Override // com.google.android.gms.internal.ads.jn
    public final void T5(c.a.b.b.e.c cVar, pn pnVar, en enVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        kh2.d(parcelL0, pnVar);
        kh2.c(parcelL0, enVar);
        e2(1, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.jn
    public final void a2(List<Uri> list, c.a.b.b.e.c cVar, lh lhVar) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeTypedList(list);
        kh2.c(parcelL0, cVar);
        kh2.c(parcelL0, lhVar);
        e2(6, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.jn
    public final void c7(c.a.b.b.e.c cVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        e2(2, parcelL0);
    }

    @Override // com.google.android.gms.internal.ads.jn
    public final void g7(List<Uri> list, c.a.b.b.e.c cVar, lh lhVar) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeTypedList(list);
        kh2.c(parcelL0, cVar);
        kh2.c(parcelL0, lhVar);
        e2(5, parcelL0);
    }
}
