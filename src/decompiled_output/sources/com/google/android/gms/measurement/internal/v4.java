package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import c.a.b.b.g.c.cb;
import c.a.b.b.g.c.d1;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class v4 extends u9 implements b {

    @com.google.android.gms.common.util.d0
    private static int j = 65535;

    @com.google.android.gms.common.util.d0
    private static int k = 2;
    private final Map<String, Map<String, String>> d;
    private final Map<String, Map<String, Boolean>> e;
    private final Map<String, Map<String, Boolean>> f;
    private final Map<String, d1.b> g;
    private final Map<String, Map<String, Integer>> h;
    private final Map<String, String> i;

    v4(t9 t9Var) {
        super(t9Var);
        this.d = new b.f.a();
        this.e = new b.f.a();
        this.f = new b.f.a();
        this.g = new b.f.a();
        this.i = new b.f.a();
        this.h = new b.f.a();
    }

    @androidx.annotation.y0
    private final void M(String str) throws Throwable {
        q();
        c();
        com.google.android.gms.common.internal.r.g(str);
        if (this.g.get(str) == null) {
            byte[] bArrT0 = n().t0(str);
            if (bArrT0 != null) {
                d1.b.a aVarX = u(str, bArrT0).x();
                w(str, aVarX);
                this.d.put(str, v((d1.b) ((c.a.b.b.g.c.h7) aVarX.j())));
                this.g.put(str, (d1.b) ((c.a.b.b.g.c.h7) aVarX.j()));
                this.i.put(str, null);
                return;
            }
            this.d.put(str, null);
            this.e.put(str, null);
            this.f.put(str, null);
            this.g.put(str, null);
            this.i.put(str, null);
            this.h.put(str, null);
        }
    }

    @androidx.annotation.y0
    private final d1.b u(String str, byte[] bArr) {
        if (bArr == null) {
            return d1.b.R();
        }
        try {
            d1.b bVar = (d1.b) ((c.a.b.b.g.c.h7) ((d1.b.a) da.A(d1.b.Q(), bArr)).j());
            B().N().c("Parsed config. version, gmp_app_id", bVar.G() ? Long.valueOf(bVar.J()) : null, bVar.K() ? bVar.L() : null);
            return bVar;
        } catch (c.a.b.b.g.c.q7 | RuntimeException e) {
            B().I().c("Unable to merge remote config. appId", w3.t(str), e);
            return d1.b.R();
        }
    }

    private static Map<String, String> v(d1.b bVar) {
        b.f.a aVar = new b.f.a();
        if (bVar != null) {
            for (d1.c cVar : bVar.M()) {
                aVar.put(cVar.C(), cVar.D());
            }
        }
        return aVar;
    }

    private final void w(String str, d1.b.a aVar) {
        b.f.a aVar2 = new b.f.a();
        b.f.a aVar3 = new b.f.a();
        b.f.a aVar4 = new b.f.a();
        if (aVar != null) {
            for (int r3 = 0; r3 < aVar.x(); r3++) {
                d1.a.C0126a c0126aX = aVar.z(r3).x();
                if (TextUtils.isEmpty(c0126aX.z())) {
                    B().I().a("EventConfig contained null event name");
                } else {
                    String strZ = c0126aX.z();
                    String strB = z5.b(c0126aX.z());
                    if (!TextUtils.isEmpty(strB)) {
                        c0126aX = c0126aX.x(strB);
                        aVar.A(r3, c0126aX);
                    }
                    if (!cb.b() || !j().p(u.P0)) {
                        strZ = c0126aX.z();
                    }
                    aVar2.put(strZ, Boolean.valueOf(c0126aX.A()));
                    aVar3.put(c0126aX.z(), Boolean.valueOf(c0126aX.C()));
                    if (c0126aX.D()) {
                        if (c0126aX.F() < k || c0126aX.F() > j) {
                            B().I().c("Invalid sampling rate. Event name, sample rate", c0126aX.z(), Integer.valueOf(c0126aX.F()));
                        } else {
                            aVar4.put(c0126aX.z(), Integer.valueOf(c0126aX.F()));
                        }
                    }
                }
            }
        }
        this.e.put(str, aVar2);
        this.f.put(str, aVar3);
        this.h.put(str, aVar4);
    }

    @androidx.annotation.y0
    protected final String A(String str) {
        c();
        return this.i.get(str);
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ w3 B() {
        return super.B();
    }

    @androidx.annotation.y0
    final boolean C(String str, String str2) throws Throwable {
        Boolean bool;
        c();
        M(str);
        if (K(str) && ha.C0(str2)) {
            return true;
        }
        if (L(str) && ha.e0(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.e.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @androidx.annotation.y0
    protected final void D(String str) {
        c();
        this.i.put(str, null);
    }

    @androidx.annotation.y0
    final boolean E(String str, String str2) throws Throwable {
        Boolean bool;
        c();
        M(str);
        if (FirebaseAnalytics.a.h.equals(str2) || FirebaseAnalytics.a.I.equals(str2) || FirebaseAnalytics.a.J.equals(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.f.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ Context F() {
        return super.F();
    }

    @androidx.annotation.y0
    final int G(String str, String str2) throws Throwable {
        Integer num;
        c();
        M(str);
        Map<String, Integer> map = this.h.get(str);
        if (map == null || (num = map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    @androidx.annotation.y0
    final void H(String str) {
        c();
        this.g.remove(str);
    }

    @androidx.annotation.y0
    final boolean I(String str) {
        c();
        d1.b bVarT = t(str);
        if (bVarT == null) {
            return false;
        }
        return bVarT.P();
    }

    @androidx.annotation.y0
    final long J(String str) throws Throwable {
        String strG = g(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(strG)) {
            return 0L;
        }
        try {
            return Long.parseLong(strG);
        } catch (NumberFormatException e) {
            B().I().c("Unable to parse timezone offset. appId", w3.t(str), e);
            return 0L;
        }
    }

    final boolean K(String str) {
        return "1".equals(g(str, "measurement.upload.blacklist_internal"));
    }

    final boolean L(String str) {
        return "1".equals(g(str, "measurement.upload.blacklist_public"));
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

    @Override // com.google.android.gms.measurement.internal.b
    @androidx.annotation.y0
    public final String g(String str, String str2) throws Throwable {
        c();
        M(str);
        Map<String, String> map = this.d.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
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

    @Override // com.google.android.gms.measurement.internal.r9
    public final /* bridge */ /* synthetic */ da k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.r9
    public final /* bridge */ /* synthetic */ y8 l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.r9
    public final /* bridge */ /* synthetic */ na m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.r9
    public final /* bridge */ /* synthetic */ d n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.r9
    public final /* bridge */ /* synthetic */ v4 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.u9
    protected final boolean s() {
        return false;
    }

    @androidx.annotation.y0
    protected final d1.b t(String str) {
        q();
        c();
        com.google.android.gms.common.internal.r.g(str);
        M(str);
        return this.g.get(str);
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ u4 x() {
        return super.x();
    }

    @androidx.annotation.y0
    protected final boolean y(String str, byte[] bArr, String str2) {
        q();
        c();
        com.google.android.gms.common.internal.r.g(str);
        d1.b.a aVarX = u(str, bArr).x();
        if (aVarX == null) {
            return false;
        }
        w(str, aVarX);
        this.g.put(str, (d1.b) ((c.a.b.b.g.c.h7) aVarX.j()));
        this.i.put(str, str2);
        this.d.put(str, v((d1.b) ((c.a.b.b.g.c.h7) aVarX.j())));
        n().S(str, new ArrayList(aVarX.C()));
        try {
            aVarX.D();
            bArr = ((d1.b) ((c.a.b.b.g.c.h7) aVarX.j())).l();
        } catch (RuntimeException e) {
            B().I().c("Unable to serialize reduced-size config. Storing full config instead. appId", w3.t(str), e);
        }
        d dVarN = n();
        com.google.android.gms.common.internal.r.g(str);
        dVarN.c();
        dVarN.q();
        new ContentValues().put("remote_config", bArr);
        try {
            if (dVarN.u().update("apps", r2, "app_id = ?", new String[]{str}) == 0) {
                dVarN.B().E().b("Failed to update remote config (got 0). appId", w3.t(str));
            }
        } catch (SQLiteException e2) {
            dVarN.B().E().c("Error storing remote config. appId", w3.t(str), e2);
        }
        this.g.put(str, (d1.b) ((c.a.b.b.g.c.h7) aVarX.j()));
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.g z() {
        return super.z();
    }
}
