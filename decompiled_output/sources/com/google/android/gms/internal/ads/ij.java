package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ij extends kj {

    /* renamed from: a, reason: collision with root package name */
    private final Object f3827a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Context f3828b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.i0
    private SharedPreferences f3829c;
    private final gb<JSONObject, JSONObject> d;

    public ij(Context context, gb<JSONObject, JSONObject> gbVar) {
        this.f3828b = context.getApplicationContext();
        this.d = gbVar;
    }

    public static JSONObject c(Context context) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", as.h().d);
            jSONObject.put("mf", a2.f2619a.a());
            jSONObject.put("cl", "330794610");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 20360);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.c(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", 12451009);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.kj
    public final dy1<Void> a() throws JSONException {
        synchronized (this.f3827a) {
            if (this.f3829c == null) {
                this.f3829c = this.f3828b.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        if (com.google.android.gms.ads.internal.p.j().a() - this.f3829c.getLong("js_last_update", 0L) < a2.f2620b.a().longValue()) {
            return qx1.g(null);
        }
        return qx1.i(this.d.b(c(this.f3828b)), new ru1(this) { // from class: com.google.android.gms.internal.ads.lj

            /* renamed from: a, reason: collision with root package name */
            private final ij f4258a;

            {
                this.f4258a = this;
            }

            @Override // com.google.android.gms.internal.ads.ru1
            public final Object a(Object obj) {
                return this.f4258a.b((JSONObject) obj);
            }
        }, cs.f);
    }

    final /* synthetic */ Void b(JSONObject jSONObject) {
        e0.b(this.f3828b, 1, jSONObject);
        this.f3829c.edit().putLong("js_last_update", com.google.android.gms.ads.internal.p.j().a()).apply();
        return null;
    }
}
