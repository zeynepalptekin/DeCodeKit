package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes.dex */
public interface c4 extends IInterface {
    c.a.b.b.e.c K() throws RemoteException;

    String L() throws RemoteException;

    boolean Z(Bundle bundle) throws RemoteException;

    void c0(Bundle bundle) throws RemoteException;

    void destroy() throws RemoteException;

    String e() throws RemoteException;

    Bundle getExtras() throws RemoteException;

    uz2 getVideoController() throws RemoteException;

    b3 i() throws RemoteException;

    String j() throws RemoteException;

    String k() throws RemoteException;

    String l() throws RemoteException;

    c.a.b.b.e.c m() throws RemoteException;

    k3 m1() throws RemoteException;

    List n() throws RemoteException;

    void v0(Bundle bundle) throws RemoteException;
}
