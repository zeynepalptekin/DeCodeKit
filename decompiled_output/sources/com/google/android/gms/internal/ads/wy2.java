package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class wy2 extends ih2 implements uy2 {
    wy2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.uy2
    public final tk D7(c.a.b.b.e.c cVar, String str, qc qcVar, int r5) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        parcelL0.writeString(str);
        kh2.c(parcelL0, qcVar);
        parcelL0.writeInt(r5);
        Parcel parcelB2 = b2(12, parcelL0);
        tk tkVarY8 = xk.y8(parcelB2.readStrongBinder());
        parcelB2.recycle();
        return tkVarY8;
    }

    @Override // com.google.android.gms.internal.ads.uy2
    public final pg F0(c.a.b.b.e.c cVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        Parcel parcelB2 = b2(8, parcelL0);
        pg pgVarY8 = tg.y8(parcelB2.readStrongBinder());
        parcelB2.recycle();
        return pgVarY8;
    }

    @Override // com.google.android.gms.internal.ads.uy2
    public final dy2 N5(c.a.b.b.e.c cVar, String str, qc qcVar, int r5) throws RemoteException {
        dy2 gy2Var;
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        parcelL0.writeString(str);
        kh2.c(parcelL0, qcVar);
        parcelL0.writeInt(r5);
        Parcel parcelB2 = b2(3, parcelL0);
        IBinder strongBinder = parcelB2.readStrongBinder();
        if (strongBinder == null) {
            gy2Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            gy2Var = iInterfaceQueryLocalInterface instanceof dy2 ? (dy2) iInterfaceQueryLocalInterface : new gy2(strongBinder);
        }
        parcelB2.recycle();
        return gy2Var;
    }

    @Override // com.google.android.gms.internal.ads.uy2
    public final hy2 W1(c.a.b.b.e.c cVar, qw2 qw2Var, String str, qc qcVar, int r6) throws RemoteException {
        hy2 jy2Var;
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        kh2.d(parcelL0, qw2Var);
        parcelL0.writeString(str);
        kh2.c(parcelL0, qcVar);
        parcelL0.writeInt(r6);
        Parcel parcelB2 = b2(13, parcelL0);
        IBinder strongBinder = parcelB2.readStrongBinder();
        if (strongBinder == null) {
            jy2Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            jy2Var = iInterfaceQueryLocalInterface instanceof hy2 ? (hy2) iInterfaceQueryLocalInterface : new jy2(strongBinder);
        }
        parcelB2.recycle();
        return jy2Var;
    }

    @Override // com.google.android.gms.internal.ads.uy2
    public final hy2 W6(c.a.b.b.e.c cVar, qw2 qw2Var, String str, qc qcVar, int r6) throws RemoteException {
        hy2 jy2Var;
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        kh2.d(parcelL0, qw2Var);
        parcelL0.writeString(str);
        kh2.c(parcelL0, qcVar);
        parcelL0.writeInt(r6);
        Parcel parcelB2 = b2(2, parcelL0);
        IBinder strongBinder = parcelB2.readStrongBinder();
        if (strongBinder == null) {
            jy2Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            jy2Var = iInterfaceQueryLocalInterface instanceof hy2 ? (hy2) iInterfaceQueryLocalInterface : new jy2(strongBinder);
        }
        parcelB2.recycle();
        return jy2Var;
    }

    @Override // com.google.android.gms.internal.ads.uy2
    public final gg Y0(c.a.b.b.e.c cVar, qc qcVar, int r4) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        kh2.c(parcelL0, qcVar);
        parcelL0.writeInt(r4);
        Parcel parcelB2 = b2(15, parcelL0);
        gg ggVarY8 = jg.y8(parcelB2.readStrongBinder());
        parcelB2.recycle();
        return ggVarY8;
    }

    @Override // com.google.android.gms.internal.ads.uy2
    public final jn Y1(c.a.b.b.e.c cVar, qc qcVar, int r4) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        kh2.c(parcelL0, qcVar);
        parcelL0.writeInt(r4);
        Parcel parcelB2 = b2(14, parcelL0);
        jn jnVarY8 = in.y8(parcelB2.readStrongBinder());
        parcelB2.recycle();
        return jnVarY8;
    }

    @Override // com.google.android.gms.internal.ads.uy2
    public final xy2 c6(c.a.b.b.e.c cVar, int r4) throws RemoteException {
        xy2 zy2Var;
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        parcelL0.writeInt(r4);
        Parcel parcelB2 = b2(9, parcelL0);
        IBinder strongBinder = parcelB2.readStrongBinder();
        if (strongBinder == null) {
            zy2Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            zy2Var = iInterfaceQueryLocalInterface instanceof xy2 ? (xy2) iInterfaceQueryLocalInterface : new zy2(strongBinder);
        }
        parcelB2.recycle();
        return zy2Var;
    }

    @Override // com.google.android.gms.internal.ads.uy2
    public final fh h5(c.a.b.b.e.c cVar) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        Parcel parcelB2 = b2(7, parcelL0);
        fh fhVarY8 = eh.y8(parcelB2.readStrongBinder());
        parcelB2.recycle();
        return fhVarY8;
    }

    @Override // com.google.android.gms.internal.ads.uy2
    public final xy2 j7(c.a.b.b.e.c cVar) throws RemoteException {
        xy2 zy2Var;
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        Parcel parcelB2 = b2(4, parcelL0);
        IBinder strongBinder = parcelB2.readStrongBinder();
        if (strongBinder == null) {
            zy2Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            zy2Var = iInterfaceQueryLocalInterface instanceof xy2 ? (xy2) iInterfaceQueryLocalInterface : new zy2(strongBinder);
        }
        parcelB2.recycle();
        return zy2Var;
    }

    @Override // com.google.android.gms.internal.ads.uy2
    public final yj p7(c.a.b.b.e.c cVar, qc qcVar, int r4) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        kh2.c(parcelL0, qcVar);
        parcelL0.writeInt(r4);
        Parcel parcelB2 = b2(6, parcelL0);
        yj yjVarY8 = xj.y8(parcelB2.readStrongBinder());
        parcelB2.recycle();
        return yjVarY8;
    }

    @Override // com.google.android.gms.internal.ads.uy2
    public final hy2 r5(c.a.b.b.e.c cVar, qw2 qw2Var, String str, qc qcVar, int r6) throws RemoteException {
        hy2 jy2Var;
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        kh2.d(parcelL0, qw2Var);
        parcelL0.writeString(str);
        kh2.c(parcelL0, qcVar);
        parcelL0.writeInt(r6);
        Parcel parcelB2 = b2(1, parcelL0);
        IBinder strongBinder = parcelB2.readStrongBinder();
        if (strongBinder == null) {
            jy2Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            jy2Var = iInterfaceQueryLocalInterface instanceof hy2 ? (hy2) iInterfaceQueryLocalInterface : new jy2(strongBinder);
        }
        parcelB2.recycle();
        return jy2Var;
    }

    @Override // com.google.android.gms.internal.ads.uy2
    public final o3 s8(c.a.b.b.e.c cVar, c.a.b.b.e.c cVar2) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        kh2.c(parcelL0, cVar2);
        Parcel parcelB2 = b2(5, parcelL0);
        o3 o3VarY8 = n3.y8(parcelB2.readStrongBinder());
        parcelB2.recycle();
        return o3VarY8;
    }

    @Override // com.google.android.gms.internal.ads.uy2
    public final hy2 t2(c.a.b.b.e.c cVar, qw2 qw2Var, String str, int r5) throws RemoteException {
        hy2 jy2Var;
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        kh2.d(parcelL0, qw2Var);
        parcelL0.writeString(str);
        parcelL0.writeInt(r5);
        Parcel parcelB2 = b2(10, parcelL0);
        IBinder strongBinder = parcelB2.readStrongBinder();
        if (strongBinder == null) {
            jy2Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            jy2Var = iInterfaceQueryLocalInterface instanceof hy2 ? (hy2) iInterfaceQueryLocalInterface : new jy2(strongBinder);
        }
        parcelB2.recycle();
        return jy2Var;
    }

    @Override // com.google.android.gms.internal.ads.uy2
    public final r3 t3(c.a.b.b.e.c cVar, c.a.b.b.e.c cVar2, c.a.b.b.e.c cVar3) throws RemoteException {
        Parcel parcelL0 = L0();
        kh2.c(parcelL0, cVar);
        kh2.c(parcelL0, cVar2);
        kh2.c(parcelL0, cVar3);
        Parcel parcelB2 = b2(11, parcelL0);
        r3 r3VarY8 = u3.y8(parcelB2.readStrongBinder());
        parcelB2.recycle();
        return r3VarY8;
    }
}
