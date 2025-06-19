package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class po implements qo {

    /* renamed from: b, reason: collision with root package name */
    private boolean f4847b;
    private dy1<?> d;

    @androidx.annotation.i0
    @GuardedBy("lock")
    private SharedPreferences f;

    @androidx.annotation.i0
    @GuardedBy("lock")
    private SharedPreferences.Editor g;

    @androidx.annotation.i0
    @GuardedBy("lock")
    private String j;

    @androidx.annotation.i0
    @GuardedBy("lock")
    private String k;

    /* renamed from: a, reason: collision with root package name */
    private final Object f4846a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final List<Runnable> f4848c = new ArrayList();

    @androidx.annotation.i0
    @GuardedBy("lock")
    private js2 e = null;

    @GuardedBy("lock")
    private boolean h = false;

    @GuardedBy("lock")
    private boolean i = true;

    @GuardedBy("lock")
    private boolean l = false;

    @GuardedBy("lock")
    private String m = "";

    @GuardedBy("lock")
    private long n = 0;

    @GuardedBy("lock")
    private long o = 0;

    @GuardedBy("lock")
    private long p = 0;

    @GuardedBy("lock")
    private int q = -1;

    @GuardedBy("lock")
    private int r = 0;

    @GuardedBy("lock")
    private Set<String> s = Collections.emptySet();

    @GuardedBy("lock")
    private JSONObject t = new JSONObject();

    @GuardedBy("lock")
    private boolean u = true;

    @GuardedBy("lock")
    private boolean v = true;

    @GuardedBy("lock")
    private String w = null;

    @GuardedBy("lock")
    private int x = -1;

    private final void b(Bundle bundle) {
        cs.f3023a.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.ro
            private final po d;

            {
                this.d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.d.C();
            }
        });
    }

    private final void d() throws ExecutionException, InterruptedException, TimeoutException {
        dy1<?> dy1Var = this.d;
        if (dy1Var == null || dy1Var.isDone()) {
            return;
        }
        try {
            this.d.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            tr.d("Interrupted while waiting for preferences loaded.", e);
        } catch (CancellationException e2) {
            e = e2;
            tr.c("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (ExecutionException e3) {
            e = e3;
            tr.c("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (TimeoutException e4) {
            e = e4;
            tr.c("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    private final Bundle e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("listener_registration_bundle", true);
        synchronized (this.f4846a) {
            bundle.putBoolean("use_https", this.i);
            bundle.putBoolean("content_url_opted_out", this.u);
            bundle.putBoolean("content_vertical_opted_out", this.v);
            bundle.putBoolean("auto_collect_location", this.l);
            bundle.putInt("version_code", this.r);
            bundle.putStringArray("never_pool_slots", (String[]) this.s.toArray(new String[0]));
            bundle.putString("app_settings_json", this.m);
            bundle.putLong("app_settings_last_update_ms", this.n);
            bundle.putLong("app_last_background_time_ms", this.o);
            bundle.putInt("request_in_session_count", this.q);
            bundle.putLong("first_ad_req_time_ms", this.p);
            bundle.putString("native_advanced_settings", this.t.toString());
            bundle.putString("display_cutout", this.w);
            bundle.putInt("app_measurement_npa", this.x);
            if (this.j != null) {
                bundle.putString("content_url_hashes", this.j);
            }
            if (this.k != null) {
                bundle.putString("content_vertical_hashes", this.k);
            }
        }
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.qo
    public final long A() throws ExecutionException, InterruptedException, TimeoutException {
        long j;
        d();
        synchronized (this.f4846a) {
            j = this.p;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.qo
    @androidx.annotation.i0
    public final String B() throws ExecutionException, InterruptedException, TimeoutException {
        String str;
        d();
        synchronized (this.f4846a) {
            str = this.k;
        }
        return str;
    }

    @Override // com.google.android.gms.internal.ads.qo
    @androidx.annotation.i0
    public final js2 C() {
        if (!this.f4847b) {
            return null;
        }
        if ((x() && j()) || !u1.f5468b.a().booleanValue()) {
            return null;
        }
        synchronized (this.f4846a) {
            if (Looper.getMainLooper() == null) {
                return null;
            }
            if (this.e == null) {
                this.e = new js2();
            }
            this.e.e();
            tr.h("start fetching content...");
            return this.e;
        }
    }

    @Override // com.google.android.gms.internal.ads.qo
    public final void D(boolean z) throws ExecutionException, InterruptedException, TimeoutException {
        d();
        synchronized (this.f4846a) {
            if (this.u == z) {
                return;
            }
            this.u = z;
            if (this.g != null) {
                this.g.putBoolean("content_url_opted_out", z);
                this.g.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("content_url_opted_out", this.u);
            bundle.putBoolean("content_vertical_opted_out", this.v);
            b(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.qo
    public final String E() throws ExecutionException, InterruptedException, TimeoutException {
        String str;
        d();
        synchronized (this.f4846a) {
            str = this.w;
        }
        return str;
    }

    @Override // com.google.android.gms.internal.ads.qo
    public final void F(@androidx.annotation.i0 String str) throws ExecutionException, InterruptedException, TimeoutException {
        d();
        synchronized (this.f4846a) {
            if (str != null) {
                if (!str.equals(this.k)) {
                    this.k = str;
                    if (this.g != null) {
                        this.g.putString("content_vertical_hashes", str);
                        this.g.apply();
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("content_vertical_hashes", str);
                    b(bundle);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.qo
    public final void G(long j) throws ExecutionException, InterruptedException, TimeoutException {
        d();
        synchronized (this.f4846a) {
            if (this.p == j) {
                return;
            }
            this.p = j;
            if (this.g != null) {
                this.g.putLong("first_ad_req_time_ms", j);
                this.g.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putLong("first_ad_req_time_ms", j);
            b(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.qo
    public final int H() throws ExecutionException, InterruptedException, TimeoutException {
        int r1;
        d();
        synchronized (this.f4846a) {
            r1 = this.q;
        }
        return r1;
    }

    public final void a(final Context context, String str, boolean z) {
        final String strConcat;
        synchronized (this.f4846a) {
            if (this.f != null) {
                return;
            }
            if (str == null) {
                strConcat = "admob";
            } else {
                String strValueOf = String.valueOf(str);
                strConcat = strValueOf.length() != 0 ? "admob__".concat(strValueOf) : new String("admob__");
            }
            this.d = cs.f3023a.submit(new Runnable(this, context, strConcat) { // from class: com.google.android.gms.internal.ads.so
                private final po d;
                private final Context e;
                private final String f;

                {
                    this.d = this;
                    this.e = context;
                    this.f = strConcat;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.d.c(this.e, this.f);
                }
            });
            this.f4847b = z;
        }
    }

    final /* synthetic */ void c(Context context, String str) {
        boolean z = false;
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        synchronized (this.f4846a) {
            this.f = sharedPreferences;
            this.g = editorEdit;
            if (com.google.android.gms.common.util.v.l() && !NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted()) {
                z = true;
            }
            this.h = z;
            this.i = this.f.getBoolean("use_https", this.i);
            this.u = this.f.getBoolean("content_url_opted_out", this.u);
            this.j = this.f.getString("content_url_hashes", this.j);
            this.l = this.f.getBoolean("auto_collect_location", this.l);
            this.v = this.f.getBoolean("content_vertical_opted_out", this.v);
            this.k = this.f.getString("content_vertical_hashes", this.k);
            this.r = this.f.getInt("version_code", this.r);
            this.m = this.f.getString("app_settings_json", this.m);
            this.n = this.f.getLong("app_settings_last_update_ms", this.n);
            this.o = this.f.getLong("app_last_background_time_ms", this.o);
            this.q = this.f.getInt("request_in_session_count", this.q);
            this.p = this.f.getLong("first_ad_req_time_ms", this.p);
            this.s = this.f.getStringSet("never_pool_slots", this.s);
            this.w = this.f.getString("display_cutout", this.w);
            this.x = this.f.getInt("app_measurement_npa", this.x);
            try {
                this.t = new JSONObject(this.f.getString("native_advanced_settings", "{}"));
            } catch (JSONException e) {
                tr.d("Could not convert native advanced settings to json object", e);
            }
            b(e());
        }
    }

    @Override // com.google.android.gms.internal.ads.qo
    public final void h(String str, String str2, boolean z) throws ExecutionException, InterruptedException, TimeoutException {
        d();
        synchronized (this.f4846a) {
            JSONArray jSONArrayOptJSONArray = this.t.optJSONArray(str);
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
            }
            int length = jSONArrayOptJSONArray.length();
            int r4 = 0;
            while (true) {
                if (r4 < jSONArrayOptJSONArray.length()) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(r4);
                    if (jSONObjectOptJSONObject == null) {
                        return;
                    }
                    if (!str2.equals(jSONObjectOptJSONObject.optString("template_id"))) {
                        r4++;
                    } else if (z && jSONObjectOptJSONObject.optBoolean("uses_media_view", false)) {
                        return;
                    } else {
                        length = r4;
                    }
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z);
                jSONObject.put("timestamp_ms", com.google.android.gms.ads.internal.p.j().a());
                jSONArrayOptJSONArray.put(length, jSONObject);
                this.t.put(str, jSONArrayOptJSONArray);
            } catch (JSONException e) {
                tr.d("Could not update native advanced settings", e);
            }
            if (this.g != null) {
                this.g.putString("native_advanced_settings", this.t.toString());
                this.g.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putString("native_advanced_settings", this.t.toString());
            b(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.qo
    public final wn i() throws ExecutionException, InterruptedException, TimeoutException {
        wn wnVar;
        d();
        synchronized (this.f4846a) {
            wnVar = new wn(this.m, this.n);
        }
        return wnVar;
    }

    @Override // com.google.android.gms.internal.ads.qo
    public final boolean j() throws ExecutionException, InterruptedException, TimeoutException {
        boolean z;
        d();
        synchronized (this.f4846a) {
            z = this.v;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.qo
    public final void k(String str) throws ExecutionException, InterruptedException, TimeoutException {
        d();
        synchronized (this.f4846a) {
            long jA = com.google.android.gms.ads.internal.p.j().a();
            this.n = jA;
            if (str != null && !str.equals(this.m)) {
                this.m = str;
                if (this.g != null) {
                    this.g.putString("app_settings_json", str);
                    this.g.putLong("app_settings_last_update_ms", jA);
                    this.g.apply();
                }
                Bundle bundle = new Bundle();
                bundle.putString("app_settings_json", str);
                bundle.putLong("app_settings_last_update_ms", jA);
                b(bundle);
                Iterator<Runnable> it = this.f4848c.iterator();
                while (it.hasNext()) {
                    it.next().run();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.qo
    public final void l() throws ExecutionException, InterruptedException, TimeoutException {
        d();
        synchronized (this.f4846a) {
            this.t = new JSONObject();
            if (this.g != null) {
                this.g.remove("native_advanced_settings");
                this.g.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putString("native_advanced_settings", "{}");
            b(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.qo
    public final void m(boolean z) throws ExecutionException, InterruptedException, TimeoutException {
        d();
        synchronized (this.f4846a) {
            if (this.v == z) {
                return;
            }
            this.v = z;
            if (this.g != null) {
                this.g.putBoolean("content_vertical_opted_out", z);
                this.g.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("content_url_opted_out", this.u);
            bundle.putBoolean("content_vertical_opted_out", this.v);
            b(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.qo
    public final long n() throws ExecutionException, InterruptedException, TimeoutException {
        long j;
        d();
        synchronized (this.f4846a) {
            j = this.o;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.qo
    public final int o() throws ExecutionException, InterruptedException, TimeoutException {
        int r1;
        d();
        synchronized (this.f4846a) {
            r1 = this.r;
        }
        return r1;
    }

    @Override // com.google.android.gms.internal.ads.qo
    @androidx.annotation.i0
    public final String p() throws ExecutionException, InterruptedException, TimeoutException {
        String str;
        d();
        synchronized (this.f4846a) {
            str = this.j;
        }
        return str;
    }

    @Override // com.google.android.gms.internal.ads.qo
    public final void q(int r4) throws ExecutionException, InterruptedException, TimeoutException {
        d();
        synchronized (this.f4846a) {
            if (this.r == r4) {
                return;
            }
            this.r = r4;
            if (this.g != null) {
                this.g.putInt("version_code", r4);
                this.g.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putInt("version_code", r4);
            b(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.qo
    public final void r(String str) throws ExecutionException, InterruptedException, TimeoutException {
        d();
        synchronized (this.f4846a) {
            if (TextUtils.equals(this.w, str)) {
                return;
            }
            this.w = str;
            if (this.g != null) {
                this.g.putString("display_cutout", str);
                this.g.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putString("display_cutout", str);
            b(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.qo
    public final void s(long j) throws ExecutionException, InterruptedException, TimeoutException {
        d();
        synchronized (this.f4846a) {
            if (this.o == j) {
                return;
            }
            this.o = j;
            if (this.g != null) {
                this.g.putLong("app_last_background_time_ms", j);
                this.g.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putLong("app_last_background_time_ms", j);
            b(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.qo
    public final void t(boolean z) throws ExecutionException, InterruptedException, TimeoutException {
        d();
        synchronized (this.f4846a) {
            if (this.l == z) {
                return;
            }
            this.l = z;
            if (this.g != null) {
                this.g.putBoolean("auto_collect_location", z);
                this.g.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("auto_collect_location", z);
            b(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.qo
    public final JSONObject u() throws ExecutionException, InterruptedException, TimeoutException {
        JSONObject jSONObject;
        d();
        synchronized (this.f4846a) {
            jSONObject = this.t;
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.qo
    public final boolean v() throws ExecutionException, InterruptedException, TimeoutException {
        boolean z;
        d();
        synchronized (this.f4846a) {
            z = this.l;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.qo
    public final void w(Runnable runnable) {
        this.f4848c.add(runnable);
    }

    @Override // com.google.android.gms.internal.ads.qo
    public final boolean x() throws ExecutionException, InterruptedException, TimeoutException {
        boolean z;
        d();
        synchronized (this.f4846a) {
            z = this.u;
        }
        return z;
    }

    @Override // com.google.android.gms.internal.ads.qo
    public final void y(int r4) throws ExecutionException, InterruptedException, TimeoutException {
        d();
        synchronized (this.f4846a) {
            if (this.q == r4) {
                return;
            }
            this.q = r4;
            if (this.g != null) {
                this.g.putInt("request_in_session_count", r4);
                this.g.apply();
            }
            Bundle bundle = new Bundle();
            bundle.putInt("request_in_session_count", r4);
            b(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.qo
    public final void z(@androidx.annotation.i0 String str) throws ExecutionException, InterruptedException, TimeoutException {
        d();
        synchronized (this.f4846a) {
            if (str != null) {
                if (!str.equals(this.j)) {
                    this.j = str;
                    if (this.g != null) {
                        this.g.putString("content_url_hashes", str);
                        this.g.apply();
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("content_url_hashes", str);
                    b(bundle);
                }
            }
        }
    }
}
