package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import c.a.b.b.g.c.cb;
import c.a.b.b.g.c.md;
import c.a.b.b.g.c.oc;
import c.a.b.b.g.c.vc;
import c.a.b.b.g.c.wb;
import com.google.android.gms.measurement.c.a;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class f6 extends g5 {

    /* renamed from: c, reason: collision with root package name */
    @com.google.android.gms.common.util.d0
    protected h7 f6388c;
    private e6 d;
    private final Set<d6> e;
    private boolean f;
    private final AtomicReference<String> g;
    private final Object h;

    @androidx.annotation.u("consentLock")
    private e i;

    @androidx.annotation.u("consentLock")
    private int j;
    private final AtomicLong k;
    private long l;
    private int m;
    final oa n;

    @com.google.android.gms.common.util.d0
    private boolean o;
    private final ga p;

    protected f6(b5 b5Var) {
        super(b5Var);
        this.e = new CopyOnWriteArraySet();
        this.h = new Object();
        this.o = true;
        this.p = new z6(this);
        this.g = new AtomicReference<>();
        this.i = new e(null, null);
        this.j = 100;
        this.l = -1L;
        this.m = 100;
        this.k = new AtomicLong(0L);
        this.n = new oa(b5Var);
    }

    private final void A0(String str, String str2, String str3, Bundle bundle) throws IllegalStateException {
        long jA = z().a();
        com.google.android.gms.common.internal.r.g(str2);
        Bundle bundle2 = new Bundle();
        if (str != null) {
            bundle2.putString("app_id", str);
        }
        bundle2.putString(a.C0190a.f6334b, str2);
        bundle2.putLong(a.C0190a.m, jA);
        if (str3 != null) {
            bundle2.putString(a.C0190a.k, str3);
            bundle2.putBundle(a.C0190a.l, bundle);
        }
        x().v(new u6(this, bundle2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.y0
    public final void D0(Bundle bundle) {
        c();
        s();
        com.google.android.gms.common.internal.r.k(bundle);
        com.google.android.gms.common.internal.r.g(bundle.getString(a.C0190a.f6334b));
        com.google.android.gms.common.internal.r.g(bundle.getString("origin"));
        com.google.android.gms.common.internal.r.k(bundle.get("value"));
        if (!this.f6543a.l()) {
            B().N().a("Conditional property not set since app measurement is disabled");
            return;
        }
        try {
            n().P(new va(bundle.getString("app_id"), bundle.getString("origin"), new ca(bundle.getString(a.C0190a.f6334b), bundle.getLong(a.C0190a.o), bundle.get("value"), bundle.getString("origin")), bundle.getLong(a.C0190a.m), false, bundle.getString(a.C0190a.d), h().E(bundle.getString("app_id"), bundle.getString(a.C0190a.f), bundle.getBundle(a.C0190a.g), bundle.getString("origin"), 0L, true, false, cb.b() && j().p(u.N0)), bundle.getLong(a.C0190a.e), h().E(bundle.getString("app_id"), bundle.getString(a.C0190a.h), bundle.getBundle(a.C0190a.i), bundle.getString("origin"), 0L, true, false, cb.b() && j().p(u.N0)), bundle.getLong(a.C0190a.j), h().E(bundle.getString("app_id"), bundle.getString(a.C0190a.k), bundle.getBundle(a.C0190a.l), bundle.getString("origin"), 0L, true, false, cb.b() && j().p(u.N0))));
        } catch (IllegalArgumentException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.y0
    public final void E0(Bundle bundle) {
        c();
        s();
        com.google.android.gms.common.internal.r.k(bundle);
        com.google.android.gms.common.internal.r.g(bundle.getString(a.C0190a.f6334b));
        if (!this.f6543a.l()) {
            B().N().a("Conditional property not cleared since app measurement is disabled");
        } else {
            try {
                n().P(new va(bundle.getString("app_id"), bundle.getString("origin"), new ca(bundle.getString(a.C0190a.f6334b), 0L, null, null), bundle.getLong(a.C0190a.m), bundle.getBoolean(a.C0190a.n), bundle.getString(a.C0190a.d), null, bundle.getLong(a.C0190a.e), null, bundle.getLong(a.C0190a.j), h().E(bundle.getString("app_id"), bundle.getString(a.C0190a.k), bundle.getBundle(a.C0190a.l), bundle.getString("origin"), bundle.getLong(a.C0190a.m), true, false, cb.b() && j().p(u.N0))));
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.y0
    public final void M(e eVar, int r5, long j, boolean z, boolean z2) {
        c();
        s();
        if (j <= this.l && e.g(this.m, r5)) {
            B().L().b("Dropped out-of-date consent setting, proposed settings", eVar);
            return;
        }
        if (!i().v(eVar, r5)) {
            B().L().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(r5));
            return;
        }
        this.l = j;
        this.m = r5;
        n().V(z);
        if (z2) {
            n().R(new AtomicReference<>());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.y0
    public final void U(@androidx.annotation.i0 Boolean bool, boolean z) throws IllegalStateException {
        c();
        s();
        B().M().b("Setting app measurement enabled (FE)", bool);
        i().r(bool);
        if (wb.b() && j().p(u.J0) && z) {
            i().w(bool);
        }
        if (wb.b() && j().p(u.J0) && !this.f6543a.n() && bool.booleanValue()) {
            return;
        }
        r0();
    }

    private final void Y(String str, String str2, long j, Object obj) throws IllegalStateException {
        x().v(new o6(this, str, str2, obj, j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.y0
    public final void r0() throws IllegalStateException {
        c();
        String strA = i().s.a();
        if (strA != null) {
            if ("unset".equals(strA)) {
                c0("app", "_npa", null, z().a());
            } else {
                c0("app", "_npa", Long.valueOf("true".equals(strA) ? 1L : 0L), z().a());
            }
        }
        if (!this.f6543a.l() || !this.o) {
            B().M().a("Updating Scion state (FE)");
            n().X();
            return;
        }
        B().M().a("Recording app launch after enabling measurement for the first time (FE)");
        n0();
        if (vc.b() && j().p(u.r0)) {
            q().d.a();
        }
        if (oc.b() && j().p(u.u0)) {
            if (!(this.f6543a.C().f6477a.t().k.a() > 0)) {
                o4 o4VarC = this.f6543a.C();
                o4VarC.b(o4VarC.f6477a.F().getPackageName());
            }
        }
        if (j().p(u.F0)) {
            x().v(new k6(this));
        }
    }

    @com.google.android.gms.common.util.d0
    private final ArrayList<Bundle> s0(String str, String str2, String str3) {
        if (x().I()) {
            B().E().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        }
        if (wa.a()) {
            B().E().a("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f6543a.x().r(atomicReference, 5000L, "get conditional user properties", new x6(this, atomicReference, str, str2, str3));
        List list = (List) atomicReference.get();
        if (list != null) {
            return ha.t0(list);
        }
        B().E().b("Timed out waiting for get conditional user properties", str);
        return new ArrayList<>();
    }

    @com.google.android.gms.common.util.d0
    private final Map<String, Object> t0(String str, String str2, String str3, boolean z) {
        y3 y3VarE;
        String str4;
        if (x().I()) {
            y3VarE = B().E();
            str4 = "Cannot get user properties from analytics worker thread";
        } else {
            if (!wa.a()) {
                AtomicReference atomicReference = new AtomicReference();
                this.f6543a.x().r(atomicReference, 5000L, "get user properties", new w6(this, atomicReference, str, str2, str3, z));
                List<ca> list = (List) atomicReference.get();
                if (list == null) {
                    B().E().b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
                    return Collections.emptyMap();
                }
                b.f.a aVar = new b.f.a(list.size());
                for (ca caVar : list) {
                    aVar.put(caVar.e, caVar.h());
                }
                return aVar;
            }
            y3VarE = B().E();
            str4 = "Cannot get user properties from main thread";
        }
        y3VarE.a(str4);
        return Collections.emptyMap();
    }

    private final void v0(Bundle bundle, long j) throws IllegalStateException {
        com.google.android.gms.common.internal.r.k(bundle);
        a6.a(bundle, "app_id", String.class, null);
        a6.a(bundle, "origin", String.class, null);
        a6.a(bundle, a.C0190a.f6334b, String.class, null);
        a6.a(bundle, "value", Object.class, null);
        a6.a(bundle, a.C0190a.d, String.class, null);
        a6.a(bundle, a.C0190a.e, Long.class, 0L);
        a6.a(bundle, a.C0190a.f, String.class, null);
        a6.a(bundle, a.C0190a.g, Bundle.class, null);
        a6.a(bundle, a.C0190a.h, String.class, null);
        a6.a(bundle, a.C0190a.i, Bundle.class, null);
        a6.a(bundle, a.C0190a.j, Long.class, 0L);
        a6.a(bundle, a.C0190a.k, String.class, null);
        a6.a(bundle, a.C0190a.l, Bundle.class, null);
        com.google.android.gms.common.internal.r.g(bundle.getString(a.C0190a.f6334b));
        com.google.android.gms.common.internal.r.g(bundle.getString("origin"));
        com.google.android.gms.common.internal.r.k(bundle.get("value"));
        bundle.putLong(a.C0190a.m, j);
        String string = bundle.getString(a.C0190a.f6334b);
        Object obj = bundle.get("value");
        if (h().q0(string) != 0) {
            B().E().b("Invalid conditional user property name", f().w(string));
            return;
        }
        if (h().r0(string, obj) != 0) {
            B().E().c("Invalid conditional user property value", f().w(string), obj);
            return;
        }
        Object objY0 = h().y0(string, obj);
        if (objY0 == null) {
            B().E().c("Unable to normalize conditional user property value", f().w(string), obj);
            return;
        }
        a6.b(bundle, objY0);
        long j2 = bundle.getLong(a.C0190a.e);
        if (!TextUtils.isEmpty(bundle.getString(a.C0190a.d)) && (j2 > 15552000000L || j2 < 1)) {
            B().E().c("Invalid conditional user property timeout", f().w(string), Long.valueOf(j2));
            return;
        }
        long j3 = bundle.getLong(a.C0190a.j);
        if (j3 > 15552000000L || j3 < 1) {
            B().E().c("Invalid conditional user property time to live", f().w(string), Long.valueOf(j3));
        } else {
            x().v(new s6(this, bundle));
        }
    }

    private final void y0(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) throws IllegalStateException {
        x().v(new p6(this, str, str2, j, ha.s0(bundle), z, z2, z3, str3));
    }

    public final ArrayList<Bundle> A(String str, String str2, String str3) {
        com.google.android.gms.common.internal.r.g(str);
        a();
        return s0(str, str2, str3);
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ w3 B() {
        return super.B();
    }

    final /* synthetic */ void B0(Bundle bundle) {
        if (md.b() && j().p(u.B0)) {
            if (bundle == null) {
                i().C.b(new Bundle());
                return;
            }
            Bundle bundleA = i().C.a();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                    h();
                    if (ha.d0(obj)) {
                        h().W(this.p, 27, null, null, 0);
                    }
                    B().K().c("Invalid default event parameter type. Name, value", str, obj);
                } else if (ha.C0(str)) {
                    B().K().b("Invalid default event parameter name. Name", str);
                } else if (obj == null) {
                    bundleA.remove(str);
                } else if (h().i0("param", str, 100, obj)) {
                    h().N(bundleA, str, obj);
                }
            }
            h();
            if (ha.b0(bundleA, j().u())) {
                h().W(this.p, 26, null, null, 0);
                B().K().a("Too many default event parameters set. Discarding beyond event parameter limit");
            }
            i().C.b(bundleA);
            n().D(bundleA);
        }
    }

    public final List<ca> C(boolean z) {
        y3 y3VarE;
        String str;
        s();
        B().N().a("Getting user properties (FE)");
        if (x().I()) {
            y3VarE = B().E();
            str = "Cannot get all user properties from analytics worker thread";
        } else {
            if (!wa.a()) {
                AtomicReference atomicReference = new AtomicReference();
                this.f6543a.x().r(atomicReference, 5000L, "get user properties", new r6(this, atomicReference, z));
                List<ca> list = (List) atomicReference.get();
                if (list != null) {
                    return list;
                }
                B().E().b("Timed out waiting for get user properties, includeInternal", Boolean.valueOf(z));
                return Collections.emptyList();
            }
            y3VarE = B().E();
            str = "Cannot get all user properties from main thread";
        }
        y3VarE.a(str);
        return Collections.emptyList();
    }

    public final void C0(String str, String str2, Bundle bundle) throws IllegalStateException {
        A0(null, str, str2, bundle);
    }

    public final Map<String, Object> D(String str, String str2, String str3, boolean z) {
        com.google.android.gms.common.internal.r.g(str);
        a();
        return t0(str, str2, str3, z);
    }

    public final Map<String, Object> E(String str, String str2, boolean z) {
        return t0(null, str, str2, z);
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ Context F() {
        return super.F();
    }

    final void G(long j, boolean z) {
        c();
        s();
        B().M().a("Resetting analytics data (FE)");
        e9 e9VarQ = q();
        e9VarQ.c();
        e9VarQ.e.a();
        boolean zL = this.f6543a.l();
        j4 j4VarI = i();
        j4VarI.j.b(j);
        if (!TextUtils.isEmpty(j4VarI.i().z.a())) {
            j4VarI.z.b(null);
        }
        if (vc.b() && j4VarI.j().p(u.r0)) {
            j4VarI.u.b(0L);
        }
        if (!j4VarI.j().E()) {
            j4VarI.A(!zL);
        }
        j4VarI.A.b(null);
        j4VarI.B.b(0L);
        j4VarI.C.b(null);
        if (z) {
            n().Y();
        }
        if (vc.b() && j().p(u.r0)) {
            q().d.a();
        }
        this.o = !zL;
    }

    public final void H(Bundle bundle) throws IllegalStateException {
        J(bundle, z().a());
    }

    public final void I(Bundle bundle, int r5, long j) {
        if (wb.b() && j().p(u.J0)) {
            s();
            String strF = e.f(bundle);
            if (strF != null) {
                B().K().b("Ignoring invalid consent setting", strF);
                B().K().a("Valid consent values are 'granted', 'denied'");
            }
            L(e.j(bundle), r5, j);
        }
    }

    public final void J(Bundle bundle, long j) throws IllegalStateException {
        com.google.android.gms.common.internal.r.k(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            B().I().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        v0(bundle2, j);
    }

    @androidx.annotation.y0
    final void K(e eVar) {
        c();
        boolean z = (eVar.q() && eVar.o()) || n().e0();
        if (z != this.f6543a.n()) {
            this.f6543a.w(z);
            Boolean boolK = i().K();
            if (!z || boolK == null || boolK.booleanValue()) {
                U(Boolean.valueOf(z), false);
            }
        }
    }

    public final void L(e eVar, int r15, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        e eVarN = eVar;
        if (wb.b() && j().p(u.J0)) {
            s();
            if (eVar.l() == null && eVar.p() == null) {
                B().K().a("Discarding empty consent settings");
                return;
            }
            synchronized (this.h) {
                z = true;
                z2 = false;
                if (e.g(r15, this.j)) {
                    boolean zH = eVar.h(this.i);
                    if (eVar.q() && !this.i.q()) {
                        z2 = true;
                    }
                    eVarN = eVar.n(this.i);
                    this.i = eVarN;
                    z3 = z2;
                    z2 = zH;
                } else {
                    z = false;
                    z3 = false;
                }
            }
            if (!z) {
                B().L().b("Ignoring lower-priority consent settings, proposed settings", eVarN);
                return;
            }
            long andIncrement = this.k.getAndIncrement();
            if (!z2) {
                x().v(new f7(this, eVarN, r15, andIncrement, z3));
            } else {
                V(null);
                x().A(new c7(this, eVarN, j, r15, andIncrement, z3));
            }
        }
    }

    public final void N(d6 d6Var) {
        s();
        com.google.android.gms.common.internal.r.k(d6Var);
        if (this.e.add(d6Var)) {
            return;
        }
        B().I().a("OnEventListener already registered");
    }

    @androidx.annotation.y0
    public final void O(e6 e6Var) {
        e6 e6Var2;
        c();
        s();
        if (e6Var != null && e6Var != (e6Var2 = this.d)) {
            com.google.android.gms.common.internal.r.r(e6Var2 == null, "EventInterceptor already set.");
        }
        this.d = e6Var;
    }

    public final void T(@androidx.annotation.i0 Boolean bool) throws IllegalStateException {
        s();
        x().v(new d7(this, bool));
    }

    final void V(@androidx.annotation.i0 String str) {
        this.g.set(str);
    }

    @androidx.annotation.y0
    final void W(String str, String str2, long j, Bundle bundle) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        c();
        X(str, str2, j, bundle, true, this.d == null || ha.C0(str2), false, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0146, code lost:
    
        r6 = 13;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0150  */
    @androidx.annotation.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void X(java.lang.String r20, java.lang.String r21, long r22, android.os.Bundle r24, boolean r25, boolean r26, boolean r27, java.lang.String r28) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 1210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.f6.X(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    public final void Z(String str, String str2, Bundle bundle) {
        b0(str, str2, bundle, true, true, z().a());
    }

    @Override // com.google.android.gms.measurement.internal.d2, com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    public final void a0(String str, String str2, Bundle bundle, String str3) throws IllegalStateException {
        a();
        y0(str, str2, z().a(), bundle, false, true, false, str3);
    }

    @Override // com.google.android.gms.measurement.internal.d2, com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    public final void b0(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws IllegalStateException {
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (j().p(u.w0) && ha.B0(str2, FirebaseAnalytics.a.D)) {
            o().J(bundle2, j);
            return;
        }
        y0(str3, str2, j, bundle2, z2, !z2 || this.d == null || ha.C0(str2), !z, null);
    }

    @Override // com.google.android.gms.measurement.internal.d2, com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    @androidx.annotation.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void c0(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            com.google.android.gms.common.internal.r.g(r9)
            com.google.android.gms.common.internal.r.g(r10)
            r8.c()
            r8.s()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L60
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L50
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L50
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r10 = r0.toLowerCase(r10)
            java.lang.String r11 = "false"
            boolean r10 = r11.equals(r10)
            r2 = 1
            if (r10 == 0) goto L35
            r4 = r2
            goto L37
        L35:
            r4 = 0
        L37:
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            com.google.android.gms.measurement.internal.j4 r0 = r8.i()
            com.google.android.gms.measurement.internal.p4 r0 = r0.s
            long r4 = r10.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L4b
            java.lang.String r11 = "true"
        L4b:
            r0.b(r11)
            r6 = r10
            goto L5e
        L50:
            if (r11 != 0) goto L60
            com.google.android.gms.measurement.internal.j4 r10 = r8.i()
            com.google.android.gms.measurement.internal.p4 r10 = r10.s
            java.lang.String r0 = "unset"
            r10.b(r0)
            r6 = r11
        L5e:
            r3 = r1
            goto L62
        L60:
            r3 = r10
            r6 = r11
        L62:
            com.google.android.gms.measurement.internal.b5 r10 = r8.f6543a
            boolean r10 = r10.l()
            if (r10 != 0) goto L78
            com.google.android.gms.measurement.internal.w3 r9 = r8.B()
            com.google.android.gms.measurement.internal.y3 r9 = r9.N()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.a(r10)
            return
        L78:
            com.google.android.gms.measurement.internal.b5 r10 = r8.f6543a
            boolean r10 = r10.q()
            if (r10 != 0) goto L81
            return
        L81:
            com.google.android.gms.measurement.internal.ca r10 = new com.google.android.gms.measurement.internal.ca
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.x7 r9 = r8.n()
            r9.O(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.f6.c0(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ m d() {
        return super.d();
    }

    public final void d0(String str, String str2, Object obj, boolean z) throws IllegalStateException {
        e0(str, str2, obj, true, z().a());
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ wa e() {
        return super.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e0(java.lang.String r10, java.lang.String r11, java.lang.Object r12, boolean r13, long r14) throws java.lang.IllegalStateException {
        /*
            r9 = this;
            if (r10 != 0) goto L4
            java.lang.String r10 = "app"
        L4:
            r1 = r10
            r10 = 6
            r0 = 0
            r2 = 24
            if (r13 == 0) goto L15
            com.google.android.gms.measurement.internal.ha r10 = r9.h()
            int r10 = r10.q0(r11)
            r5 = r10
            goto L38
        L15:
            com.google.android.gms.measurement.internal.ha r13 = r9.h()
            java.lang.String r3 = "user property"
            boolean r4 = r13.h0(r3, r11)
            if (r4 != 0) goto L23
        L21:
            r5 = 6
            goto L38
        L23:
            java.lang.String[] r4 = com.google.android.gms.measurement.internal.b6.f6357a
            boolean r4 = r13.m0(r3, r4, r11)
            if (r4 != 0) goto L30
            r10 = 15
            r5 = 15
            goto L38
        L30:
            boolean r13 = r13.g0(r3, r2, r11)
            if (r13 != 0) goto L37
            goto L21
        L37:
            r5 = 0
        L38:
            r10 = 1
            if (r5 == 0) goto L59
            r9.h()
            java.lang.String r7 = com.google.android.gms.measurement.internal.ha.I(r11, r2, r10)
            if (r11 == 0) goto L4a
            int r0 = r11.length()
            r8 = r0
            goto L4b
        L4a:
            r8 = 0
        L4b:
            com.google.android.gms.measurement.internal.b5 r10 = r9.f6543a
            com.google.android.gms.measurement.internal.ha r3 = r10.G()
            com.google.android.gms.measurement.internal.ga r4 = r9.p
            java.lang.String r6 = "_ev"
            r3.W(r4, r5, r6, r7, r8)
            return
        L59:
            if (r12 == 0) goto L9f
            com.google.android.gms.measurement.internal.ha r13 = r9.h()
            int r5 = r13.r0(r11, r12)
            if (r5 == 0) goto L8e
            r9.h()
            java.lang.String r7 = com.google.android.gms.measurement.internal.ha.I(r11, r2, r10)
            boolean r10 = r12 instanceof java.lang.String
            if (r10 != 0) goto L77
            boolean r10 = r12 instanceof java.lang.CharSequence
            if (r10 == 0) goto L75
            goto L77
        L75:
            r8 = 0
            goto L80
        L77:
            java.lang.String r10 = java.lang.String.valueOf(r12)
            int r0 = r10.length()
            r8 = r0
        L80:
            com.google.android.gms.measurement.internal.b5 r10 = r9.f6543a
            com.google.android.gms.measurement.internal.ha r3 = r10.G()
            com.google.android.gms.measurement.internal.ga r4 = r9.p
            java.lang.String r6 = "_ev"
            r3.W(r4, r5, r6, r7, r8)
            return
        L8e:
            com.google.android.gms.measurement.internal.ha r10 = r9.h()
            java.lang.Object r5 = r10.y0(r11, r12)
            if (r5 == 0) goto L9e
            r0 = r9
            r2 = r11
            r3 = r14
            r0.Y(r1, r2, r3, r5)
        L9e:
            return
        L9f:
            r5 = 0
            r0 = r9
            r2 = r11
            r3 = r14
            r0.Y(r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.f6.e0(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ u3 f() {
        return super.f();
    }

    public final void f0(String str, String str2, String str3, Bundle bundle) throws IllegalStateException {
        com.google.android.gms.common.internal.r.g(str);
        a();
        A0(str, str2, str3, bundle);
    }

    public final void g0() {
        if (F().getApplicationContext() instanceof Application) {
            ((Application) F().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f6388c);
        }
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ ha h() {
        return super.h();
    }

    public final Boolean h0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) x().r(atomicReference, 15000L, "boolean test flag value", new l6(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ j4 i() {
        return super.i();
    }

    public final String i0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) x().r(atomicReference, 15000L, "String test flag value", new v6(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ xa j() {
        return super.j();
    }

    public final Long j0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) x().r(atomicReference, 15000L, "long test flag value", new y6(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ a k() {
        return super.k();
    }

    public final Integer k0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) x().r(atomicReference, 15000L, "int test flag value", new b7(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ f6 l() {
        return super.l();
    }

    public final Double l0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) x().r(atomicReference, 15000L, "double test flag value", new a7(this, atomicReference));
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ p3 m() {
        return super.m();
    }

    @androidx.annotation.i0
    public final String m0() {
        return this.g.get();
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ x7 n() {
        return super.n();
    }

    @androidx.annotation.y0
    public final void n0() {
        c();
        s();
        if (this.f6543a.q()) {
            if (j().p(u.e0)) {
                Boolean boolD = j().D("google_analytics_deferred_deep_link_enabled");
                if (boolD != null && boolD.booleanValue()) {
                    B().M().a("Deferred Deep Link feature enabled.");
                    x().v(new Runnable(this) { // from class: com.google.android.gms.measurement.internal.i6
                        private final f6 d;

                        {
                            this.d = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() throws IllegalStateException {
                            f6 f6Var = this.d;
                            f6Var.c();
                            if (f6Var.i().x.b()) {
                                f6Var.B().M().a("Deferred Deep Link already retrieved. Not fetching again.");
                                return;
                            }
                            long jA = f6Var.i().y.a();
                            f6Var.i().y.b(1 + jA);
                            if (jA < 5) {
                                f6Var.f6543a.r();
                            } else {
                                f6Var.B().I().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                                f6Var.i().x.a(true);
                            }
                        }
                    });
                }
            }
            n().Z();
            this.o = false;
            String strM = i().M();
            if (TextUtils.isEmpty(strM)) {
                return;
            }
            d().l();
            if (strM.equals(Build.VERSION.RELEASE)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", strM);
            Z("auto", "_ou", bundle);
        }
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ s7 o() {
        return super.o();
    }

    @androidx.annotation.i0
    public final String o0() {
        p7 p7VarS = this.f6543a.O().S();
        if (p7VarS != null) {
            return p7VarS.f6486a;
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ s3 p() {
        return super.p();
    }

    @androidx.annotation.i0
    public final String p0() {
        p7 p7VarS = this.f6543a.O().S();
        if (p7VarS != null) {
            return p7VarS.f6487b;
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.d2
    public final /* bridge */ /* synthetic */ e9 q() {
        return super.q();
    }

    @androidx.annotation.i0
    public final String q0() {
        if (this.f6543a.K() != null) {
            return this.f6543a.K();
        }
        try {
            return q7.b(F(), "google_app_id");
        } catch (IllegalStateException e) {
            this.f6543a.B().E().b("getGoogleAppId failed with exception", e);
            return null;
        }
    }

    public final void u0(Bundle bundle) throws IllegalStateException {
        com.google.android.gms.common.internal.r.k(bundle);
        com.google.android.gms.common.internal.r.g(bundle.getString("app_id"));
        a();
        v0(new Bundle(bundle), z().a());
    }

    @Override // com.google.android.gms.measurement.internal.g5
    protected final boolean v() {
        return false;
    }

    public final void w0(d6 d6Var) {
        s();
        com.google.android.gms.common.internal.r.k(d6Var);
        if (this.e.remove(d6Var)) {
            return;
        }
        B().I().a("OnEventListener had not been registered");
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ u4 x() {
        return super.x();
    }

    public final ArrayList<Bundle> y(String str, String str2) {
        return s0(null, str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.g z() {
        return super.z();
    }

    @androidx.annotation.y0
    final void z0(String str, String str2, Bundle bundle) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        c();
        W(str, str2, z().a(), bundle);
    }
}
