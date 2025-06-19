package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes.dex */
public interface o3 extends IInterface {
    void F7(s sVar, String str, String str2) throws RemoteException;

    List<va> H7(String str, String str2, ma maVar) throws RemoteException;

    List<ca> K1(String str, String str2, boolean z, ma maVar) throws RemoteException;

    String K5(ma maVar) throws RemoteException;

    void L3(ma maVar) throws RemoteException;

    List<ca> M1(ma maVar, boolean z) throws RemoteException;

    void N1(va vaVar, ma maVar) throws RemoteException;

    void R1(ma maVar) throws RemoteException;

    void U2(va vaVar) throws RemoteException;

    List<ca> V3(String str, String str2, String str3, boolean z) throws RemoteException;

    void Y5(Bundle bundle, ma maVar) throws RemoteException;

    byte[] Z3(s sVar, String str) throws RemoteException;

    void a4(s sVar, ma maVar) throws RemoteException;

    void k6(ca caVar, ma maVar) throws RemoteException;

    void m7(long j, String str, String str2, String str3) throws RemoteException;

    void q2(ma maVar) throws RemoteException;

    void y7(ma maVar) throws RemoteException;

    List<va> z7(String str, String str2, String str3) throws RemoteException;
}
