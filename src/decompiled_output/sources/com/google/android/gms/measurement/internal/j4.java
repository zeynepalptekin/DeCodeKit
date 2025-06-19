package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import c.a.b.b.g.c.wb;
import com.google.android.gms.ads.e0.a;

/* loaded from: classes.dex */
final class j4 extends y5 {

    @com.google.android.gms.common.util.d0
    static final Pair<String, Long> D = new Pair<>("", 0L);
    public final p4 A;
    public final n4 B;
    public final k4 C;

    /* renamed from: c, reason: collision with root package name */
    private SharedPreferences f6415c;
    public m4 d;
    public final n4 e;
    public final n4 f;
    public final n4 g;
    public final n4 h;
    public final n4 i;
    public final n4 j;
    public final n4 k;
    public final p4 l;
    private String m;
    private boolean n;
    private long o;
    public final n4 p;
    public final n4 q;
    public final l4 r;
    public final p4 s;
    public final l4 t;
    public final n4 u;
    public boolean v;
    public l4 w;
    public l4 x;
    public n4 y;
    public final p4 z;

    j4(b5 b5Var) {
        super(b5Var);
        this.e = new n4(this, "last_upload", 0L);
        this.f = new n4(this, "last_upload_attempt", 0L);
        this.g = new n4(this, "backoff", 0L);
        this.h = new n4(this, "last_delete_stale", 0L);
        this.p = new n4(this, "time_before_start", 10000L);
        this.q = new n4(this, "session_timeout", 1800000L);
        this.r = new l4(this, "start_new_session", true);
        this.u = new n4(this, "last_pause_time", 0L);
        this.s = new p4(this, "non_personalized_ads", null);
        this.t = new l4(this, "allow_remote_dynamite", false);
        this.i = new n4(this, "midnight_offset", 0L);
        this.j = new n4(this, "first_open_time", 0L);
        this.k = new n4(this, "app_install_time", 0L);
        this.l = new p4(this, "app_instance_id", null);
        this.w = new l4(this, "app_backgrounded", false);
        this.x = new l4(this, "deep_link_retrieval_complete", false);
        this.y = new n4(this, "deep_link_retrieval_attempts", 0L);
        this.z = new p4(this, "firebase_feature_rollouts", null);
        this.A = new p4(this, "deferred_attribution_cache", null);
        this.B = new n4(this, "deferred_attribution_cache_timestamp", 0L);
        this.C = new k4(this, "default_event_parameters", null);
    }

    @androidx.annotation.y0
    final void A(boolean z) {
        c();
        B().N().b("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor editorEdit = D().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z);
        editorEdit.apply();
    }

    @androidx.annotation.y0
    final void C(String str) {
        c();
        SharedPreferences.Editor editorEdit = D().edit();
        editorEdit.putString("admob_app_id", str);
        editorEdit.apply();
    }

    @androidx.annotation.y0
    @com.google.android.gms.common.util.d0
    protected final SharedPreferences D() {
        c();
        l();
        return this.f6415c;
    }

    @androidx.annotation.y0
    final String E() {
        c();
        return D().getString("gmp_app_id", null);
    }

    @androidx.annotation.y0
    final String G() {
        c();
        return D().getString("admob_app_id", null);
    }

    @androidx.annotation.y0
    final Boolean H() {
        c();
        if (D().contains("use_service")) {
            return Boolean.valueOf(D().getBoolean("use_service", false));
        }
        return null;
    }

    @androidx.annotation.y0
    final void I() {
        c();
        Boolean boolJ = J();
        SharedPreferences.Editor editorEdit = D().edit();
        editorEdit.clear();
        editorEdit.apply();
        if (boolJ != null) {
            r(boolJ);
        }
    }

    @androidx.annotation.y0
    final Boolean J() {
        c();
        if (D().contains("measurement_enabled")) {
            return Boolean.valueOf(D().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    @androidx.annotation.y0
    final Boolean K() {
        if (!wb.b() || !j().p(u.J0)) {
            return null;
        }
        c();
        if (D().contains("measurement_enabled_from_api")) {
            return Boolean.valueOf(D().getBoolean("measurement_enabled_from_api", true));
        }
        return null;
    }

    @androidx.annotation.y0
    final e L() {
        c();
        return e.b(D().getString("consent_settings", "G1"));
    }

    @androidx.annotation.y0
    protected final String M() {
        c();
        String string = D().getString("previous_os_version", null);
        d().l();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor editorEdit = D().edit();
            editorEdit.putString("previous_os_version", str);
            editorEdit.apply();
        }
        return string;
    }

    @androidx.annotation.y0
    final boolean N() {
        return this.f6415c.contains("deferred_analytics_collection");
    }

    @Override // com.google.android.gms.measurement.internal.y5
    @androidx.annotation.y0
    protected final void k() {
        SharedPreferences sharedPreferences = F().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f6415c = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.v = z;
        if (!z) {
            SharedPreferences.Editor editorEdit = this.f6415c.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        this.d = new m4(this, "health_monitor", Math.max(0L, u.d.a(null).longValue()));
    }

    @Override // com.google.android.gms.measurement.internal.y5
    protected final boolean o() {
        return true;
    }

    @androidx.annotation.y0
    @androidx.annotation.h0
    final Pair<String, Boolean> q(String str) {
        c();
        long jC = z().c();
        if (this.m != null && jC < this.o) {
            return new Pair<>(this.m, Boolean.valueOf(this.n));
        }
        this.o = jC + j().y(str);
        com.google.android.gms.ads.e0.a.e(true);
        try {
            a.C0160a c0160aB = com.google.android.gms.ads.e0.a.b(F());
            if (c0160aB != null) {
                this.m = c0160aB.a();
                this.n = c0160aB.b();
            }
            if (this.m == null) {
                this.m = "";
            }
        } catch (Exception e) {
            B().M().b("Unable to get advertising id", e);
            this.m = "";
        }
        com.google.android.gms.ads.e0.a.e(false);
        return new Pair<>(this.m, Boolean.valueOf(this.n));
    }

    @androidx.annotation.y0
    final void r(Boolean bool) {
        c();
        SharedPreferences.Editor editorEdit = D().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
    }

    @androidx.annotation.y0
    final void s(boolean z) {
        c();
        SharedPreferences.Editor editorEdit = D().edit();
        editorEdit.putBoolean("use_service", z);
        editorEdit.apply();
    }

    @androidx.annotation.y0
    final boolean t(int r4) {
        return e.g(r4, D().getInt("consent_source", 100));
    }

    final boolean u(long j) {
        return j - this.q.a() > this.u.a();
    }

    @androidx.annotation.y0
    final boolean v(e eVar, int r4) {
        if (!wb.b() || !j().p(u.J0)) {
            return false;
        }
        c();
        if (!t(r4)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = D().edit();
        editorEdit.putString("consent_settings", eVar.e());
        editorEdit.putInt("consent_source", r4);
        editorEdit.apply();
        return true;
    }

    @androidx.annotation.y0
    final void w(Boolean bool) {
        if (wb.b() && j().p(u.J0)) {
            c();
            SharedPreferences.Editor editorEdit = D().edit();
            if (bool != null) {
                editorEdit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit.remove("measurement_enabled_from_api");
            }
            editorEdit.apply();
        }
    }

    @androidx.annotation.y0
    final void y(String str) {
        c();
        SharedPreferences.Editor editorEdit = D().edit();
        editorEdit.putString("gmp_app_id", str);
        editorEdit.apply();
    }
}
