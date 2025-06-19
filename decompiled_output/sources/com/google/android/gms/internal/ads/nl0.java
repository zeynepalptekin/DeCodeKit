package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class nl0 {

    /* renamed from: a, reason: collision with root package name */
    private int f4561a;

    /* renamed from: b, reason: collision with root package name */
    private uz2 f4562b;

    /* renamed from: c, reason: collision with root package name */
    private b3 f4563c;
    private View d;
    private List<?> e;
    private r03 g;
    private Bundle h;
    private rw i;

    @androidx.annotation.i0
    private rw j;

    @androidx.annotation.i0
    private c.a.b.b.e.c k;
    private View l;
    private c.a.b.b.e.c m;
    private double n;
    private k3 o;
    private k3 p;
    private String q;
    private float t;

    @androidx.annotation.i0
    private String u;
    private b.f.i<String, v2> r = new b.f.i<>();
    private b.f.i<String, String> s = new b.f.i<>();
    private List<r03> f = Collections.emptyList();

    private static <T> T M(@androidx.annotation.i0 c.a.b.b.e.c cVar) {
        if (cVar == null) {
            return null;
        }
        return (T) c.a.b.b.e.e.e2(cVar);
    }

    public static nl0 N(dd ddVar) {
        try {
            return u(r(ddVar.getVideoController(), null), ddVar.i(), (View) M(ddVar.h0()), ddVar.j(), ddVar.n(), ddVar.k(), ddVar.getExtras(), ddVar.l(), (View) M(ddVar.V()), ddVar.m(), ddVar.N(), ddVar.H(), ddVar.v(), ddVar.G(), null, 0.0f);
        } catch (RemoteException e) {
            tr.d("Failed to get native ad assets from app install ad mapper", e);
            return null;
        }
    }

    public static nl0 O(ed edVar) {
        try {
            return u(r(edVar.getVideoController(), null), edVar.i(), (View) M(edVar.h0()), edVar.j(), edVar.n(), edVar.k(), edVar.getExtras(), edVar.l(), (View) M(edVar.V()), edVar.m(), null, null, -1.0d, edVar.m1(), edVar.L(), 0.0f);
        } catch (RemoteException e) {
            tr.d("Failed to get native ad assets from content ad mapper", e);
            return null;
        }
    }

    public static nl0 P(jd jdVar) {
        try {
            return u(r(jdVar.getVideoController(), jdVar), jdVar.i(), (View) M(jdVar.h0()), jdVar.j(), jdVar.n(), jdVar.k(), jdVar.getExtras(), jdVar.l(), (View) M(jdVar.V()), jdVar.m(), jdVar.N(), jdVar.H(), jdVar.v(), jdVar.G(), jdVar.L(), jdVar.l3());
        } catch (RemoteException e) {
            tr.d("Failed to get native ad assets from unified ad mapper", e);
            return null;
        }
    }

    private final synchronized String V(String str) {
        return this.s.get(str);
    }

    private final synchronized void p(float f) {
        this.t = f;
    }

    private static kl0 r(uz2 uz2Var, @androidx.annotation.i0 jd jdVar) {
        if (uz2Var == null) {
            return null;
        }
        return new kl0(uz2Var, jdVar);
    }

    public static nl0 s(dd ddVar) {
        try {
            kl0 kl0VarR = r(ddVar.getVideoController(), null);
            b3 b3VarI = ddVar.i();
            View view = (View) M(ddVar.h0());
            String strJ = ddVar.j();
            List<?> listN = ddVar.n();
            String strK = ddVar.k();
            Bundle extras = ddVar.getExtras();
            String strL = ddVar.l();
            View view2 = (View) M(ddVar.V());
            c.a.b.b.e.c cVarM = ddVar.m();
            String strN = ddVar.N();
            String strH = ddVar.H();
            double dV = ddVar.v();
            k3 k3VarG = ddVar.G();
            nl0 nl0Var = new nl0();
            nl0Var.f4561a = 2;
            nl0Var.f4562b = kl0VarR;
            nl0Var.f4563c = b3VarI;
            nl0Var.d = view;
            nl0Var.Z("headline", strJ);
            nl0Var.e = listN;
            nl0Var.Z("body", strK);
            nl0Var.h = extras;
            nl0Var.Z("call_to_action", strL);
            nl0Var.l = view2;
            nl0Var.m = cVarM;
            nl0Var.Z("store", strN);
            nl0Var.Z(FirebaseAnalytics.b.D, strH);
            nl0Var.n = dV;
            nl0Var.o = k3VarG;
            return nl0Var;
        } catch (RemoteException e) {
            tr.d("Failed to get native ad from app install ad mapper", e);
            return null;
        }
    }

    public static nl0 t(ed edVar) {
        try {
            kl0 kl0VarR = r(edVar.getVideoController(), null);
            b3 b3VarI = edVar.i();
            View view = (View) M(edVar.h0());
            String strJ = edVar.j();
            List<?> listN = edVar.n();
            String strK = edVar.k();
            Bundle extras = edVar.getExtras();
            String strL = edVar.l();
            View view2 = (View) M(edVar.V());
            c.a.b.b.e.c cVarM = edVar.m();
            String strL2 = edVar.L();
            k3 k3VarM1 = edVar.m1();
            nl0 nl0Var = new nl0();
            nl0Var.f4561a = 1;
            nl0Var.f4562b = kl0VarR;
            nl0Var.f4563c = b3VarI;
            nl0Var.d = view;
            nl0Var.Z("headline", strJ);
            nl0Var.e = listN;
            nl0Var.Z("body", strK);
            nl0Var.h = extras;
            nl0Var.Z("call_to_action", strL);
            nl0Var.l = view2;
            nl0Var.m = cVarM;
            nl0Var.Z("advertiser", strL2);
            nl0Var.p = k3VarM1;
            return nl0Var;
        } catch (RemoteException e) {
            tr.d("Failed to get native ad from content ad mapper", e);
            return null;
        }
    }

    private static nl0 u(uz2 uz2Var, b3 b3Var, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, c.a.b.b.e.c cVar, String str4, String str5, double d, k3 k3Var, String str6, float f) {
        nl0 nl0Var = new nl0();
        nl0Var.f4561a = 6;
        nl0Var.f4562b = uz2Var;
        nl0Var.f4563c = b3Var;
        nl0Var.d = view;
        nl0Var.Z("headline", str);
        nl0Var.e = list;
        nl0Var.Z("body", str2);
        nl0Var.h = bundle;
        nl0Var.Z("call_to_action", str3);
        nl0Var.l = view2;
        nl0Var.m = cVar;
        nl0Var.Z("store", str4);
        nl0Var.Z(FirebaseAnalytics.b.D, str5);
        nl0Var.n = d;
        nl0Var.o = k3Var;
        nl0Var.Z("advertiser", str6);
        nl0Var.p(f);
        return nl0Var;
    }

    public final synchronized int A() {
        return this.f4561a;
    }

    public final synchronized View B() {
        return this.d;
    }

    @androidx.annotation.i0
    public final k3 C() {
        List<?> list = this.e;
        if (list != null && list.size() != 0) {
            Object obj = this.e.get(0);
            if (obj instanceof IBinder) {
                return j3.y8((IBinder) obj);
            }
        }
        return null;
    }

    @androidx.annotation.i0
    public final synchronized r03 D() {
        return this.g;
    }

    public final synchronized View E() {
        return this.l;
    }

    public final synchronized rw F() {
        return this.i;
    }

    @androidx.annotation.i0
    public final synchronized rw G() {
        return this.j;
    }

    @androidx.annotation.i0
    public final synchronized c.a.b.b.e.c H() {
        return this.k;
    }

    public final synchronized b.f.i<String, v2> I() {
        return this.r;
    }

    @androidx.annotation.i0
    public final synchronized String J() {
        return this.u;
    }

    public final synchronized b.f.i<String, String> K() {
        return this.s;
    }

    public final synchronized void L(c.a.b.b.e.c cVar) {
        this.k = cVar;
    }

    public final synchronized void Q(k3 k3Var) {
        this.p = k3Var;
    }

    public final synchronized void R(uz2 uz2Var) {
        this.f4562b = uz2Var;
    }

    public final synchronized void S(int r1) {
        this.f4561a = r1;
    }

    public final synchronized void T(String str) {
        this.q = str;
    }

    public final synchronized void U(@androidx.annotation.i0 String str) {
        this.u = str;
    }

    public final synchronized void W(List<r03> list) {
        this.f = list;
    }

    public final synchronized void X(rw rwVar) {
        this.i = rwVar;
    }

    public final synchronized void Y(rw rwVar) {
        this.j = rwVar;
    }

    public final synchronized void Z(String str, String str2) {
        if (str2 == null) {
            this.s.remove(str);
        } else {
            this.s.put(str, str2);
        }
    }

    public final synchronized void a() {
        if (this.i != null) {
            this.i.destroy();
            this.i = null;
        }
        if (this.j != null) {
            this.j.destroy();
            this.j = null;
        }
        this.k = null;
        this.r.clear();
        this.s.clear();
        this.f4562b = null;
        this.f4563c = null;
        this.d = null;
        this.e = null;
        this.h = null;
        this.l = null;
        this.m = null;
        this.o = null;
        this.p = null;
        this.q = null;
    }

    public final synchronized k3 a0() {
        return this.o;
    }

    public final synchronized String b() {
        return V("advertiser");
    }

    public final synchronized b3 b0() {
        return this.f4563c;
    }

    public final synchronized String c() {
        return V("body");
    }

    public final synchronized c.a.b.b.e.c c0() {
        return this.m;
    }

    public final synchronized String d() {
        return V("call_to_action");
    }

    public final synchronized k3 d0() {
        return this.p;
    }

    public final synchronized String e() {
        return this.q;
    }

    public final synchronized Bundle f() {
        if (this.h == null) {
            this.h = new Bundle();
        }
        return this.h;
    }

    public final synchronized String g() {
        return V("headline");
    }

    public final synchronized List<?> h() {
        return this.e;
    }

    public final synchronized float i() {
        return this.t;
    }

    public final synchronized List<r03> j() {
        return this.f;
    }

    public final synchronized String k() {
        return V(FirebaseAnalytics.b.D);
    }

    public final synchronized double l() {
        return this.n;
    }

    public final synchronized String m() {
        return V("store");
    }

    public final synchronized uz2 n() {
        return this.f4562b;
    }

    public final synchronized void o(List<v2> list) {
        this.e = list;
    }

    public final synchronized void q(double d) {
        this.n = d;
    }

    public final synchronized void v(b3 b3Var) {
        this.f4563c = b3Var;
    }

    public final synchronized void w(k3 k3Var) {
        this.o = k3Var;
    }

    public final synchronized void x(@androidx.annotation.i0 r03 r03Var) {
        this.g = r03Var;
    }

    public final synchronized void y(String str, v2 v2Var) {
        if (v2Var == null) {
            this.r.remove(str);
        } else {
            this.r.put(str, v2Var);
        }
    }

    public final synchronized void z(View view) {
        this.l = view;
    }
}
