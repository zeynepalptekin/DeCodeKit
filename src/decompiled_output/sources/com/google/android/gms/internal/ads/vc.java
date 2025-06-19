package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes.dex */
public interface vc extends IInterface {
    void D() throws RemoteException;

    c.a.b.b.e.c F3() throws RemoteException;

    void G6(c.a.b.b.e.c cVar, mk mkVar, List<String> list) throws RemoteException;

    void H4(jw2 jw2Var, String str, String str2) throws RemoteException;

    void H6(c.a.b.b.e.c cVar, c8 c8Var, List<l8> list) throws RemoteException;

    mf I0() throws RemoteException;

    void J2(c.a.b.b.e.c cVar, jw2 jw2Var, String str, wc wcVar) throws RemoteException;

    void L7(c.a.b.b.e.c cVar, jw2 jw2Var, String str, String str2, wc wcVar, z2 z2Var, List<String> list) throws RemoteException;

    dd O1() throws RemoteException;

    void O7(c.a.b.b.e.c cVar, jw2 jw2Var, String str, wc wcVar) throws RemoteException;

    void P5(c.a.b.b.e.c cVar, jw2 jw2Var, String str, String str2, wc wcVar) throws RemoteException;

    Bundle P6() throws RemoteException;

    void T(boolean z) throws RemoteException;

    boolean U4() throws RemoteException;

    ed Z6() throws RemoteException;

    mf b1() throws RemoteException;

    void b7(c.a.b.b.e.c cVar) throws RemoteException;

    jd c8() throws RemoteException;

    void d2(c.a.b.b.e.c cVar) throws RemoteException;

    void destroy() throws RemoteException;

    h4 e3() throws RemoteException;

    Bundle getInterstitialAdapterInfo() throws RemoteException;

    uz2 getVideoController() throws RemoteException;

    void h3(c.a.b.b.e.c cVar, qw2 qw2Var, jw2 jw2Var, String str, wc wcVar) throws RemoteException;

    boolean isInitialized() throws RemoteException;

    void n4(c.a.b.b.e.c cVar, qw2 qw2Var, jw2 jw2Var, String str, String str2, wc wcVar) throws RemoteException;

    void showInterstitial() throws RemoteException;

    void showVideo() throws RemoteException;

    void t() throws RemoteException;

    void t6(c.a.b.b.e.c cVar, jw2 jw2Var, String str, mk mkVar, String str2) throws RemoteException;

    void v8(jw2 jw2Var, String str) throws RemoteException;

    void y4(c.a.b.b.e.c cVar, jw2 jw2Var, String str, wc wcVar) throws RemoteException;

    Bundle zztv() throws RemoteException;
}
