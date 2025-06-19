package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class q3 extends c.a.b.b.g.c.a implements o3 {
    q3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.measurement.internal.o3
    public final void F7(s sVar, String str, String str2) throws RemoteException {
        Parcel parcelL0 = L0();
        c.a.b.b.g.c.b0.c(parcelL0, sVar);
        parcelL0.writeString(str);
        parcelL0.writeString(str2);
        e2(5, parcelL0);
    }

    @Override // com.google.android.gms.measurement.internal.o3
    public final List<va> H7(String str, String str2, ma maVar) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        parcelL0.writeString(str2);
        c.a.b.b.g.c.b0.c(parcelL0, maVar);
        Parcel parcelB2 = b2(16, parcelL0);
        ArrayList arrayListCreateTypedArrayList = parcelB2.createTypedArrayList(va.CREATOR);
        parcelB2.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.o3
    public final List<ca> K1(String str, String str2, boolean z, ma maVar) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        parcelL0.writeString(str2);
        c.a.b.b.g.c.b0.d(parcelL0, z);
        c.a.b.b.g.c.b0.c(parcelL0, maVar);
        Parcel parcelB2 = b2(14, parcelL0);
        ArrayList arrayListCreateTypedArrayList = parcelB2.createTypedArrayList(ca.CREATOR);
        parcelB2.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.o3
    public final String K5(ma maVar) throws RemoteException {
        Parcel parcelL0 = L0();
        c.a.b.b.g.c.b0.c(parcelL0, maVar);
        Parcel parcelB2 = b2(11, parcelL0);
        String string = parcelB2.readString();
        parcelB2.recycle();
        return string;
    }

    @Override // com.google.android.gms.measurement.internal.o3
    public final void L3(ma maVar) throws RemoteException {
        Parcel parcelL0 = L0();
        c.a.b.b.g.c.b0.c(parcelL0, maVar);
        e2(6, parcelL0);
    }

    @Override // com.google.android.gms.measurement.internal.o3
    public final List<ca> M1(ma maVar, boolean z) throws RemoteException {
        Parcel parcelL0 = L0();
        c.a.b.b.g.c.b0.c(parcelL0, maVar);
        c.a.b.b.g.c.b0.d(parcelL0, z);
        Parcel parcelB2 = b2(7, parcelL0);
        ArrayList arrayListCreateTypedArrayList = parcelB2.createTypedArrayList(ca.CREATOR);
        parcelB2.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.o3
    public final void N1(va vaVar, ma maVar) throws RemoteException {
        Parcel parcelL0 = L0();
        c.a.b.b.g.c.b0.c(parcelL0, vaVar);
        c.a.b.b.g.c.b0.c(parcelL0, maVar);
        e2(12, parcelL0);
    }

    @Override // com.google.android.gms.measurement.internal.o3
    public final void R1(ma maVar) throws RemoteException {
        Parcel parcelL0 = L0();
        c.a.b.b.g.c.b0.c(parcelL0, maVar);
        e2(4, parcelL0);
    }

    @Override // com.google.android.gms.measurement.internal.o3
    public final void U2(va vaVar) throws RemoteException {
        Parcel parcelL0 = L0();
        c.a.b.b.g.c.b0.c(parcelL0, vaVar);
        e2(13, parcelL0);
    }

    @Override // com.google.android.gms.measurement.internal.o3
    public final List<ca> V3(String str, String str2, String str3, boolean z) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        parcelL0.writeString(str2);
        parcelL0.writeString(str3);
        c.a.b.b.g.c.b0.d(parcelL0, z);
        Parcel parcelB2 = b2(15, parcelL0);
        ArrayList arrayListCreateTypedArrayList = parcelB2.createTypedArrayList(ca.CREATOR);
        parcelB2.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.o3
    public final void Y5(Bundle bundle, ma maVar) throws RemoteException {
        Parcel parcelL0 = L0();
        c.a.b.b.g.c.b0.c(parcelL0, bundle);
        c.a.b.b.g.c.b0.c(parcelL0, maVar);
        e2(19, parcelL0);
    }

    @Override // com.google.android.gms.measurement.internal.o3
    public final byte[] Z3(s sVar, String str) throws RemoteException {
        Parcel parcelL0 = L0();
        c.a.b.b.g.c.b0.c(parcelL0, sVar);
        parcelL0.writeString(str);
        Parcel parcelB2 = b2(9, parcelL0);
        byte[] bArrCreateByteArray = parcelB2.createByteArray();
        parcelB2.recycle();
        return bArrCreateByteArray;
    }

    @Override // com.google.android.gms.measurement.internal.o3
    public final void a4(s sVar, ma maVar) throws RemoteException {
        Parcel parcelL0 = L0();
        c.a.b.b.g.c.b0.c(parcelL0, sVar);
        c.a.b.b.g.c.b0.c(parcelL0, maVar);
        e2(1, parcelL0);
    }

    @Override // com.google.android.gms.measurement.internal.o3
    public final void k6(ca caVar, ma maVar) throws RemoteException {
        Parcel parcelL0 = L0();
        c.a.b.b.g.c.b0.c(parcelL0, caVar);
        c.a.b.b.g.c.b0.c(parcelL0, maVar);
        e2(2, parcelL0);
    }

    @Override // com.google.android.gms.measurement.internal.o3
    public final void m7(long j, String str, String str2, String str3) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeLong(j);
        parcelL0.writeString(str);
        parcelL0.writeString(str2);
        parcelL0.writeString(str3);
        e2(10, parcelL0);
    }

    @Override // com.google.android.gms.measurement.internal.o3
    public final void q2(ma maVar) throws RemoteException {
        Parcel parcelL0 = L0();
        c.a.b.b.g.c.b0.c(parcelL0, maVar);
        e2(20, parcelL0);
    }

    @Override // com.google.android.gms.measurement.internal.o3
    public final void y7(ma maVar) throws RemoteException {
        Parcel parcelL0 = L0();
        c.a.b.b.g.c.b0.c(parcelL0, maVar);
        e2(18, parcelL0);
    }

    @Override // com.google.android.gms.measurement.internal.o3
    public final List<va> z7(String str, String str2, String str3) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        parcelL0.writeString(str2);
        parcelL0.writeString(str3);
        Parcel parcelB2 = b2(17, parcelL0);
        ArrayList arrayListCreateTypedArrayList = parcelB2.createTypedArrayList(va.CREATOR);
        parcelB2.recycle();
        return arrayListCreateTypedArrayList;
    }
}
