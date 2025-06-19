package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import c.a.b.b.g.c.hc;
import c.a.b.b.g.c.md;
import c.a.b.b.g.c.wb;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b5 implements x5 {
    private static volatile b5 H;
    private volatile Boolean A;

    @com.google.android.gms.common.util.d0
    private Boolean B;

    @com.google.android.gms.common.util.d0
    private Boolean C;
    private volatile boolean D;
    private int E;

    @com.google.android.gms.common.util.d0
    final long G;

    /* renamed from: a, reason: collision with root package name */
    private final Context f6354a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6355b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6356c;
    private final String d;
    private final boolean e;
    private final wa f;
    private final xa g;
    private final j4 h;
    private final w3 i;
    private final u4 j;
    private final e9 k;
    private final ha l;
    private final u3 m;
    private final com.google.android.gms.common.util.g n;
    private final s7 o;
    private final f6 p;
    private final a q;
    private final j7 r;
    private s3 s;
    private x7 t;
    private m u;
    private p3 v;
    private o4 w;
    private Boolean y;
    private long z;
    private boolean x = false;
    private AtomicInteger F = new AtomicInteger(0);

    private b5(g6 g6Var) throws IllegalStateException {
        y3 y3VarI;
        String str;
        Bundle bundle;
        boolean z = false;
        com.google.android.gms.common.internal.r.k(g6Var);
        wa waVar = new wa(g6Var.f6397a);
        this.f = waVar;
        m3.f6457a = waVar;
        this.f6354a = g6Var.f6397a;
        this.f6355b = g6Var.f6398b;
        this.f6356c = g6Var.f6399c;
        this.d = g6Var.d;
        this.e = g6Var.h;
        this.A = g6Var.e;
        this.D = true;
        c.a.b.b.g.c.f fVar = g6Var.g;
        if (fVar != null && (bundle = fVar.j) != null) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.B = (Boolean) obj;
            }
            Object obj2 = fVar.j.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.C = (Boolean) obj2;
            }
        }
        c.a.b.b.g.c.l2.h(this.f6354a);
        com.google.android.gms.common.util.g gVarE = com.google.android.gms.common.util.k.e();
        this.n = gVarE;
        Long l = g6Var.i;
        this.G = l != null ? l.longValue() : gVarE.a();
        this.g = new xa(this);
        j4 j4Var = new j4(this);
        j4Var.m();
        this.h = j4Var;
        w3 w3Var = new w3(this);
        w3Var.m();
        this.i = w3Var;
        ha haVar = new ha(this);
        haVar.m();
        this.l = haVar;
        u3 u3Var = new u3(this);
        u3Var.m();
        this.m = u3Var;
        this.q = new a(this);
        s7 s7Var = new s7(this);
        s7Var.t();
        this.o = s7Var;
        f6 f6Var = new f6(this);
        f6Var.t();
        this.p = f6Var;
        e9 e9Var = new e9(this);
        e9Var.t();
        this.k = e9Var;
        j7 j7Var = new j7(this);
        j7Var.m();
        this.r = j7Var;
        u4 u4Var = new u4(this);
        u4Var.m();
        this.j = u4Var;
        c.a.b.b.g.c.f fVar2 = g6Var.g;
        if (fVar2 != null && fVar2.e != 0) {
            z = true;
        }
        boolean z2 = !z;
        if (this.f6354a.getApplicationContext() instanceof Application) {
            f6 f6VarE = E();
            if (f6VarE.F().getApplicationContext() instanceof Application) {
                Application application = (Application) f6VarE.F().getApplicationContext();
                if (f6VarE.f6388c == null) {
                    f6VarE.f6388c = new h7(f6VarE, null);
                }
                if (z2) {
                    application.unregisterActivityLifecycleCallbacks(f6VarE.f6388c);
                    application.registerActivityLifecycleCallbacks(f6VarE.f6388c);
                    y3VarI = f6VarE.B().N();
                    str = "Registered activity lifecycle callback";
                }
            }
            this.j.v(new d5(this, g6Var));
        }
        y3VarI = B().I();
        str = "Application context is not an Application";
        y3VarI.a(str);
        this.j.v(new d5(this, g6Var));
    }

    public static b5 a(Context context, c.a.b.b.g.c.f fVar, Long l) {
        Bundle bundle;
        if (fVar != null && (fVar.h == null || fVar.i == null)) {
            fVar = new c.a.b.b.g.c.f(fVar.d, fVar.e, fVar.f, fVar.g, null, null, fVar.j);
        }
        com.google.android.gms.common.internal.r.k(context);
        com.google.android.gms.common.internal.r.k(context.getApplicationContext());
        if (H == null) {
            synchronized (b5.class) {
                if (H == null) {
                    H = new b5(new g6(context, fVar, l));
                }
            }
        } else if (fVar != null && (bundle = fVar.j) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            H.k(fVar.j.getBoolean("dataCollectionDefaultEnabled"));
        }
        return H;
    }

    private static void g(v5 v5Var) {
        if (v5Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.y0
    public final void i(g6 g6Var) {
        String strConcat;
        y3 y3VarL;
        x().c();
        m mVar = new m(this);
        mVar.m();
        this.u = mVar;
        p3 p3Var = new p3(this, g6Var.f);
        p3Var.t();
        this.v = p3Var;
        s3 s3Var = new s3(this);
        s3Var.t();
        this.s = s3Var;
        x7 x7Var = new x7(this);
        x7Var.t();
        this.t = x7Var;
        this.l.n();
        this.h.n();
        this.w = new o4(this);
        this.v.u();
        B().L().b("App measurement initialized, version", 32053L);
        B().L().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String strA = p3Var.A();
        if (TextUtils.isEmpty(this.f6355b)) {
            if (G().D0(strA)) {
                y3VarL = B().L();
                strConcat = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.";
            } else {
                y3 y3VarL2 = B().L();
                String strValueOf = String.valueOf(strA);
                strConcat = strValueOf.length() != 0 ? "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(strValueOf) : new String("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ");
                y3VarL = y3VarL2;
            }
            y3VarL.a(strConcat);
        }
        B().M().a("Debug-level message logging enabled");
        if (this.E != this.F.get()) {
            B().E().c("Not all components initialized", Integer.valueOf(this.E), Integer.valueOf(this.F.get()));
        }
        this.x = true;
    }

    private final j7 s() {
        v(this.r);
        return this.r;
    }

    private static void u(g5 g5Var) {
        if (g5Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (g5Var.r()) {
            return;
        }
        String strValueOf = String.valueOf(g5Var.getClass());
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 27);
        sb.append("Component not initialized: ");
        sb.append(strValueOf);
        throw new IllegalStateException(sb.toString());
    }

    private static void v(y5 y5Var) {
        if (y5Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (y5Var.p()) {
            return;
        }
        String strValueOf = String.valueOf(y5Var.getClass());
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 27);
        sb.append("Component not initialized: ");
        sb.append(strValueOf);
        throw new IllegalStateException(sb.toString());
    }

    public final e9 A() {
        u(this.k);
        return this.k;
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final w3 B() {
        v(this.i);
        return this.i;
    }

    public final o4 C() {
        return this.w;
    }

    final u4 D() {
        return this.j;
    }

    public final f6 E() {
        u(this.p);
        return this.p;
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final Context F() {
        return this.f6354a;
    }

    public final ha G() {
        g(this.l);
        return this.l;
    }

    public final u3 H() {
        g(this.m);
        return this.m;
    }

    public final s3 I() {
        u(this.s);
        return this.s;
    }

    public final boolean J() {
        return TextUtils.isEmpty(this.f6355b);
    }

    public final String K() {
        return this.f6355b;
    }

    public final String L() {
        return this.f6356c;
    }

    public final String M() {
        return this.d;
    }

    public final boolean N() {
        return this.e;
    }

    public final s7 O() {
        u(this.o);
        return this.o;
    }

    public final x7 P() {
        u(this.t);
        return this.t;
    }

    public final m Q() {
        v(this.u);
        return this.u;
    }

    public final p3 R() {
        u(this.v);
        return this.v;
    }

    public final a S() {
        a aVar = this.q;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("Component not created");
    }

    @androidx.annotation.y0
    public final boolean T() {
        return this.A != null && this.A.booleanValue();
    }

    public final xa b() {
        return this.g;
    }

    @androidx.annotation.y0
    protected final void c(c.a.b.b.g.c.f fVar) {
        x().c();
        if (wb.b() && this.g.p(u.J0)) {
            e eVarL = t().L();
            if (fVar != null && fVar.j != null && t().t(40)) {
                e eVarJ = e.j(fVar.j);
                if (!eVarJ.equals(e.f6371c)) {
                    E().L(eVarJ, 40, this.G);
                    eVarL = eVarJ;
                }
            }
            E().K(eVarL);
        }
        if (t().e.a() == 0) {
            t().e.b(this.n.a());
        }
        if (Long.valueOf(t().j.a()).longValue() == 0) {
            B().N().b("Persisting first open", Long.valueOf(this.G));
            t().j.b(this.G);
        }
        if (this.g.p(u.F0)) {
            E().n.c();
        }
        if (q()) {
            if (!TextUtils.isEmpty(R().C()) || !TextUtils.isEmpty(R().D())) {
                G();
                if (ha.k0(R().C(), t().E(), R().D(), t().G())) {
                    B().L().a("Rechecking which service to use due to a GMP App Id change");
                    t().I();
                    I().H();
                    this.t.c0();
                    this.t.a0();
                    t().j.b(this.G);
                    t().l.b(null);
                }
                t().y(R().C());
                t().C(R().D());
            }
            if (wb.b() && this.g.p(u.J0) && !t().L().q()) {
                t().l.b(null);
            }
            E().V(t().l.a());
            if (hc.b() && this.g.p(u.q0) && !G().N0() && !TextUtils.isEmpty(t().z.a())) {
                B().I().a("Remote config removed with active feature rollouts");
                t().z.b(null);
            }
            if (!TextUtils.isEmpty(R().C()) || !TextUtils.isEmpty(R().D())) {
                boolean zL = l();
                if (!t().N() && !this.g.E()) {
                    t().A(!zL);
                }
                if (zL) {
                    E().n0();
                }
                A().d.a();
                P().R(new AtomicReference<>());
                if (md.b() && this.g.p(u.B0)) {
                    P().D(t().C.a());
                }
            }
        } else if (l()) {
            if (!G().A0("android.permission.INTERNET")) {
                B().E().a("App is missing INTERNET permission");
            }
            if (!G().A0("android.permission.ACCESS_NETWORK_STATE")) {
                B().E().a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!c.a.b.b.d.s.c.a(this.f6354a).f() && !this.g.R()) {
                if (!t4.b(this.f6354a)) {
                    B().E().a("AppMeasurementReceiver not registered/enabled");
                }
                if (!ha.Z(this.f6354a, false)) {
                    B().E().a("AppMeasurementService not registered/enabled");
                }
            }
            B().E().a("Uploading is not possible. App measurement disabled");
        }
        t().t.a(this.g.p(u.Z));
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final wa e() {
        return this.f;
    }

    final void f(g5 g5Var) {
        this.E++;
    }

    final void h(y5 y5Var) {
        this.E++;
    }

    final /* synthetic */ void j(String str, int r8, Throwable th, byte[] bArr, Map map) {
        List<ResolveInfo> listQueryIntentActivities;
        boolean z = true;
        if (!((r8 == 200 || r8 == 204 || r8 == 304) && th == null)) {
            B().I().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(r8), th);
            return;
        }
        t().x.a(true);
        if (bArr.length == 0) {
            B().M().a("Deferred Deep Link response empty.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            String strOptString = jSONObject.optString("deeplink", "");
            String strOptString2 = jSONObject.optString("gclid", "");
            double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
            if (TextUtils.isEmpty(strOptString)) {
                B().M().a("Deferred Deep Link is empty.");
                return;
            }
            ha haVarG = G();
            if (TextUtils.isEmpty(strOptString) || (listQueryIntentActivities = haVarG.F().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(strOptString)), 0)) == null || listQueryIntentActivities.isEmpty()) {
                z = false;
            }
            if (!z) {
                B().I().c("Deferred Deep Link validation failed. gclid, deep link", strOptString2, strOptString);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("gclid", strOptString2);
            bundle.putString("_cis", "ddp");
            this.p.Z("auto", "_cmp", bundle);
            ha haVarG2 = G();
            if (TextUtils.isEmpty(strOptString) || !haVarG2.f0(strOptString, dOptDouble)) {
                return;
            }
            haVarG2.F().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
        } catch (JSONException e) {
            B().E().b("Failed to parse the Deferred Deep Link response. exception", e);
        }
    }

    @androidx.annotation.y0
    final void k(boolean z) {
        this.A = Boolean.valueOf(z);
    }

    @androidx.annotation.y0
    public final boolean l() {
        return m() == 0;
    }

    @androidx.annotation.y0
    public final int m() {
        x().c();
        if (this.g.E()) {
            return 1;
        }
        Boolean bool = this.C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        if (wb.b() && this.g.p(u.J0) && !n()) {
            return 8;
        }
        Boolean boolJ = t().J();
        if (boolJ != null) {
            return boolJ.booleanValue() ? 0 : 3;
        }
        Boolean boolD = this.g.D("firebase_analytics_collection_enabled");
        if (boolD != null) {
            return boolD.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.B;
        if (bool2 != null) {
            return bool2.booleanValue() ? 0 : 5;
        }
        if (com.google.android.gms.common.api.internal.b.h()) {
            return 6;
        }
        return (!this.g.p(u.T) || this.A == null || this.A.booleanValue()) ? 0 : 7;
    }

    @androidx.annotation.y0
    public final boolean n() {
        x().c();
        return this.D;
    }

    final void o() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    final void p() {
        this.F.incrementAndGet();
    }

    @androidx.annotation.y0
    protected final boolean q() {
        if (!this.x) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        x().c();
        Boolean bool = this.y;
        if (bool == null || this.z == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.n.c() - this.z) > 1000)) {
            this.z = this.n.c();
            boolean z = true;
            Boolean boolValueOf = Boolean.valueOf(G().A0("android.permission.INTERNET") && G().A0("android.permission.ACCESS_NETWORK_STATE") && (c.a.b.b.d.s.c.a(this.f6354a).f() || this.g.R() || (t4.b(this.f6354a) && ha.Z(this.f6354a, false))));
            this.y = boolValueOf;
            if (boolValueOf.booleanValue()) {
                if (!G().j0(R().C(), R().D(), R().E()) && TextUtils.isEmpty(R().D())) {
                    z = false;
                }
                this.y = Boolean.valueOf(z);
            }
        }
        return this.y.booleanValue();
    }

    @androidx.annotation.y0
    public final void r() throws IllegalStateException {
        x().c();
        v(s());
        String strA = R().A();
        Pair<String, Boolean> pairQ = t().q(strA);
        if (!this.g.G().booleanValue() || ((Boolean) pairQ.second).booleanValue() || TextUtils.isEmpty((CharSequence) pairQ.first)) {
            B().M().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return;
        }
        if (!s().t()) {
            B().I().a("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        ha haVarG = G();
        R();
        URL urlJ = haVarG.J(32053L, strA, (String) pairQ.first, t().y.a() - 1);
        j7 j7VarS = s();
        m7 m7Var = new m7(this) { // from class: com.google.android.gms.measurement.internal.a5

            /* renamed from: a, reason: collision with root package name */
            private final b5 f6349a;

            {
                this.f6349a = this;
            }

            @Override // com.google.android.gms.measurement.internal.m7
            public final void a(String str, int r8, Throwable th, byte[] bArr, Map map) {
                this.f6349a.j(str, r8, th, bArr, map);
            }
        };
        j7VarS.c();
        j7VarS.l();
        com.google.android.gms.common.internal.r.k(urlJ);
        com.google.android.gms.common.internal.r.k(m7Var);
        j7VarS.x().E(new l7(j7VarS, strA, urlJ, null, null, m7Var));
    }

    public final j4 t() {
        g(this.h);
        return this.h;
    }

    @androidx.annotation.y0
    public final void w(boolean z) {
        x().c();
        this.D = z;
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final u4 x() {
        v(this.j);
        return this.j;
    }

    public final w3 y() {
        w3 w3Var = this.i;
        if (w3Var == null || !w3Var.p()) {
            return null;
        }
        return this.i;
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final com.google.android.gms.common.util.g z() {
        return this.n;
    }
}
