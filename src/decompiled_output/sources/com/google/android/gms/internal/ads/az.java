package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface az extends IInterface {
    String C2() throws RemoteException;

    int E1(String str) throws RemoteException;

    void E2(Bundle bundle) throws RemoteException;

    String E3() throws RemoteException;

    String K2() throws RemoteException;

    Bundle L5(Bundle bundle) throws RemoteException;

    void O3(Bundle bundle) throws RemoteException;

    List X0(String str, String str2) throws RemoteException;

    void b8(String str) throws RemoteException;

    void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException;

    void d6(String str, String str2, c.a.b.b.e.c cVar) throws RemoteException;

    void e6(String str) throws RemoteException;

    Map g2(String str, String str2, boolean z) throws RemoteException;

    String m5() throws RemoteException;

    void n3(c.a.b.b.e.c cVar, String str, String str2) throws RemoteException;

    long n6() throws RemoteException;

    String u6() throws RemoteException;

    void y1(String str, String str2, Bundle bundle) throws RemoteException;
}
