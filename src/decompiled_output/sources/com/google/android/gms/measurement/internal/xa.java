package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import c.a.b.b.g.c.ud;
import c.a.b.b.g.c.vb;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class xa extends v5 {

    /* renamed from: b, reason: collision with root package name */
    private Boolean f6562b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.h0
    private b f6563c;
    private Boolean d;

    xa(b5 b5Var) {
        super(b5Var);
        this.f6563c = c.f6361a;
    }

    public static long K() {
        return u.E.a(null).longValue();
    }

    public static long M() {
        return u.e.a(null).longValue();
    }

    @androidx.annotation.i0
    @com.google.android.gms.common.util.d0
    private final Bundle S() {
        try {
            if (F().getPackageManager() == null) {
                B().E().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoC = c.a.b.b.d.s.c.a(F()).c(F().getPackageName(), 128);
            if (applicationInfoC != null) {
                return applicationInfoC.metaData;
            }
            B().E().a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            B().E().b("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    private final String g(String str, String str2) {
        y3 y3VarE;
        String str3;
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (ClassNotFoundException e) {
            e = e;
            y3VarE = B().E();
            str3 = "Could not find SystemProperties class";
            y3VarE.b(str3, e);
            return str2;
        } catch (IllegalAccessException e2) {
            e = e2;
            y3VarE = B().E();
            str3 = "Could not access SystemProperties.get()";
            y3VarE.b(str3, e);
            return str2;
        } catch (NoSuchMethodException e3) {
            e = e3;
            y3VarE = B().E();
            str3 = "Could not find SystemProperties.get() method";
            y3VarE.b(str3, e);
            return str2;
        } catch (InvocationTargetException e4) {
            e = e4;
            y3VarE = B().E();
            str3 = "SystemProperties.get() threw an exception";
            y3VarE.b(str3, e);
            return str2;
        }
    }

    @androidx.annotation.y0
    private final int l(String str, @androidx.annotation.h0 l3<Integer> l3Var, int r3, int r4) {
        return Math.max(Math.min(r(str, l3Var), r4), r3);
    }

    public final boolean A() {
        if (this.d == null) {
            synchronized (this) {
                if (this.d == null) {
                    ApplicationInfo applicationInfo = F().getApplicationInfo();
                    String strA = com.google.android.gms.common.util.x.a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.d = Boolean.valueOf(str != null && str.equals(strA));
                    }
                    if (this.d == null) {
                        this.d = Boolean.TRUE;
                        B().E().a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.d.booleanValue();
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ w3 B() {
        return super.B();
    }

    public final boolean C(String str, l3<Boolean> l3Var) {
        return w(str, l3Var);
    }

    @androidx.annotation.i0
    @com.google.android.gms.common.util.d0
    final Boolean D(@androidx.annotation.q0(min = 1) String str) {
        com.google.android.gms.common.internal.r.g(str);
        Bundle bundleS = S();
        if (bundleS == null) {
            B().E().a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (bundleS.containsKey(str)) {
            return Boolean.valueOf(bundleS.getBoolean(str));
        }
        return null;
    }

    public final boolean E() {
        Boolean boolD = D("firebase_analytics_collection_deactivated");
        return boolD != null && boolD.booleanValue();
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ Context F() {
        return super.F();
    }

    public final Boolean G() {
        Boolean boolD = D("google_analytics_adid_collection_enabled");
        return Boolean.valueOf(boolD == null || boolD.booleanValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @androidx.annotation.i0
    @com.google.android.gms.common.util.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.util.List<java.lang.String> H(@androidx.annotation.q0(min = 1) java.lang.String r4) throws android.content.res.Resources.NotFoundException {
        /*
            r3 = this;
            com.google.android.gms.common.internal.r.g(r4)
            android.os.Bundle r0 = r3.S()
            r1 = 0
            if (r0 != 0) goto L19
            com.google.android.gms.measurement.internal.w3 r4 = r3.B()
            com.google.android.gms.measurement.internal.y3 r4 = r4.E()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.a(r0)
        L17:
            r4 = r1
            goto L28
        L19:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L20
            goto L17
        L20:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L28:
            if (r4 != 0) goto L2b
            return r1
        L2b:
            android.content.Context r0 = r3.F()     // Catch: android.content.res.Resources.NotFoundException -> L43
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L43
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L43
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L43
            if (r4 != 0) goto L3e
            return r1
        L3e:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L43
            return r4
        L43:
            r4 = move-exception
            com.google.android.gms.measurement.internal.w3 r0 = r3.B()
            com.google.android.gms.measurement.internal.y3 r0 = r0.E()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.b(r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.xa.H(java.lang.String):java.util.List");
    }

    public final Boolean I() {
        if (!ud.b() || !p(u.v0)) {
            return Boolean.TRUE;
        }
        Boolean boolD = D("google_analytics_automatic_screen_reporting_enabled");
        return Boolean.valueOf(boolD == null || boolD.booleanValue());
    }

    public final boolean J(String str) {
        return "1".equals(this.f6563c.g(str, "gaia_collection_enabled"));
    }

    public final boolean L(String str) {
        return "1".equals(this.f6563c.g(str, "measurement.event_sampling_enabled"));
    }

    @androidx.annotation.y0
    final boolean N(String str) {
        return w(str, u.L);
    }

    @androidx.annotation.y0
    final String O(String str) {
        l3<String> l3Var = u.M;
        return l3Var.a(str == null ? null : this.f6563c.g(str, l3Var.b()));
    }

    public final String P() {
        return g("debug.firebase.analytics.app", "");
    }

    public final String Q() {
        return g("debug.deferred.deeplink", "");
    }

    @androidx.annotation.y0
    final boolean R() {
        if (this.f6562b == null) {
            Boolean boolD = D("app_measurement_lite");
            this.f6562b = boolD;
            if (boolD == null) {
                this.f6562b = Boolean.FALSE;
            }
        }
        return this.f6562b.booleanValue() || !this.f6543a.N();
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ m d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ wa e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ u3 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ ha h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ j4 i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ xa j() {
        return super.j();
    }

    public final int k(@androidx.annotation.q0(min = 1) String str) {
        return l(str, u.J, 25, 100);
    }

    @androidx.annotation.y0
    public final long m(String str, @androidx.annotation.h0 l3<Long> l3Var) {
        if (str != null) {
            String strG = this.f6563c.g(str, l3Var.b());
            if (!TextUtils.isEmpty(strG)) {
                try {
                    return l3Var.a(Long.valueOf(Long.parseLong(strG))).longValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return l3Var.a(null).longValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String n(com.google.android.gms.measurement.internal.f4 r6) {
        /*
            r5 = this;
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            java.lang.String r1 = r6.A()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L33
            boolean r1 = c.a.b.b.g.c.hd.b()
            if (r1 == 0) goto L2f
            com.google.android.gms.measurement.internal.xa r1 = r5.j()
            java.lang.String r2 = r6.t()
            com.google.android.gms.measurement.internal.l3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.u.k0
            boolean r1 = r1.w(r2, r3)
            if (r1 == 0) goto L2f
            java.lang.String r1 = r6.G()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L33
        L2f:
            java.lang.String r1 = r6.D()
        L33:
            com.google.android.gms.measurement.internal.l3<java.lang.String> r2 = com.google.android.gms.measurement.internal.u.f
            r3 = 0
            java.lang.Object r2 = r2.a(r3)
            java.lang.String r2 = (java.lang.String) r2
            android.net.Uri$Builder r2 = r0.scheme(r2)
            com.google.android.gms.measurement.internal.l3<java.lang.String> r4 = com.google.android.gms.measurement.internal.u.g
            java.lang.Object r3 = r4.a(r3)
            java.lang.String r3 = (java.lang.String) r3
            android.net.Uri$Builder r2 = r2.encodedAuthority(r3)
            java.lang.String r3 = "config/app/"
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r4 = r1.length()
            if (r4 == 0) goto L5d
            java.lang.String r1 = r3.concat(r1)
            goto L62
        L5d:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3)
        L62:
            android.net.Uri$Builder r1 = r2.path(r1)
            java.lang.String r6 = r6.x()
            java.lang.String r2 = "app_instance_id"
            android.net.Uri$Builder r6 = r1.appendQueryParameter(r2, r6)
            java.lang.String r1 = "platform"
            java.lang.String r2 = "android"
            android.net.Uri$Builder r6 = r6.appendQueryParameter(r1, r2)
            java.lang.String r1 = "gmp_version"
            java.lang.String r2 = "32053"
            r6.appendQueryParameter(r1, r2)
            android.net.Uri r6 = r0.build()
            java.lang.String r6 = r6.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.xa.n(com.google.android.gms.measurement.internal.f4):java.lang.String");
    }

    final void o(@androidx.annotation.h0 b bVar) {
        this.f6563c = bVar;
    }

    public final boolean p(l3<Boolean> l3Var) {
        return w(null, l3Var);
    }

    final int q(@androidx.annotation.q0(min = 1) String str) {
        if (vb.b() && w(null, u.y0)) {
            return l(str, u.I, 500, 2000);
        }
        return 500;
    }

    @androidx.annotation.y0
    public final int r(String str, @androidx.annotation.h0 l3<Integer> l3Var) {
        if (str != null) {
            String strG = this.f6563c.g(str, l3Var.b());
            if (!TextUtils.isEmpty(strG)) {
                try {
                    return l3Var.a(Integer.valueOf(Integer.parseInt(strG))).intValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return l3Var.a(null).intValue();
    }

    @androidx.annotation.y0
    public final double s(String str, @androidx.annotation.h0 l3<Double> l3Var) {
        if (str != null) {
            String strG = this.f6563c.g(str, l3Var.b());
            if (!TextUtils.isEmpty(strG)) {
                try {
                    return l3Var.a(Double.valueOf(Double.parseDouble(strG))).doubleValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return l3Var.a(null).doubleValue();
    }

    @androidx.annotation.y0
    public final int t(@androidx.annotation.q0(min = 1) String str) {
        return r(str, u.p);
    }

    public final int u() {
        if (vb.b() && j().w(null, u.z0)) {
            ha haVarH = h();
            Boolean boolB0 = haVarH.f6543a.P().b0();
            if (haVarH.K0() >= 201500 || !(boolB0 == null || boolB0.booleanValue())) {
                return 100;
            }
        }
        return 25;
    }

    final int v(@androidx.annotation.q0(min = 1) String str) {
        if (vb.b() && w(null, u.y0)) {
            return l(str, u.H, 25, 100);
        }
        return 25;
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    @androidx.annotation.y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean w(java.lang.String r4, @androidx.annotation.h0 com.google.android.gms.measurement.internal.l3<java.lang.Boolean> r5) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto Le
        L3:
            java.lang.Object r4 = r5.a(r0)
        L7:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            return r4
        Le:
            com.google.android.gms.measurement.internal.b r1 = r3.f6563c
            java.lang.String r2 = r5.b()
            java.lang.String r4 = r1.g(r4, r2)
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 == 0) goto L1f
            goto L3
        L1f:
            boolean r4 = java.lang.Boolean.parseBoolean(r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.Object r4 = r5.a(r4)
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.xa.w(java.lang.String, com.google.android.gms.measurement.internal.l3):boolean");
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ u4 x() {
        return super.x();
    }

    @androidx.annotation.y0
    final long y(String str) {
        return m(str, u.f6527c);
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.g z() {
        return super.z();
    }
}
