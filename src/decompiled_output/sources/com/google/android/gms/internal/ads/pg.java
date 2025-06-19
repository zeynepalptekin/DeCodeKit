package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface pg extends IInterface {
    void A6() throws RemoteException;

    void C0() throws RemoteException;

    void C1(Bundle bundle) throws RemoteException;

    void N4() throws RemoteException;

    void U0() throws RemoteException;

    void Z1() throws RemoteException;

    void c5(c.a.b.b.e.c cVar) throws RemoteException;

    void f2(int r1, int r2, Intent intent) throws RemoteException;

    boolean k7() throws RemoteException;

    void onDestroy() throws RemoteException;

    void onPause() throws RemoteException;

    void onResume() throws RemoteException;

    void x1(Bundle bundle) throws RemoteException;
}
