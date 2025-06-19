package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class hs0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, Map<String, JSONObject>> f3719a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Executor f3720b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f3721c;
    private JSONObject d;

    public hs0(Executor executor) {
        this.f3720b = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized void e() {
        Map<String, JSONObject> map;
        this.f3721c = true;
        wn wnVarI = com.google.android.gms.ads.internal.p.g().r().i();
        if (wnVarI == null) {
            return;
        }
        JSONObject jSONObjectF = wnVarI.f();
        if (jSONObjectF == null) {
            return;
        }
        this.d = jSONObjectF.optJSONObject("ad_unit_patterns");
        JSONArray jSONArrayOptJSONArray = jSONObjectF.optJSONArray("ad_unit_id_settings");
        if (jSONArrayOptJSONArray == null) {
            return;
        }
        for (int r1 = 0; r1 < jSONArrayOptJSONArray.length(); r1++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(r1);
            if (jSONObjectOptJSONObject != null) {
                String strOptString = jSONObjectOptJSONObject.optString("ad_unit_id");
                String strOptString2 = jSONObjectOptJSONObject.optString("format");
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("request_signals");
                if (strOptString != null && jSONObjectOptJSONObject2 != null && strOptString2 != null) {
                    if (this.f3719a.containsKey(strOptString2)) {
                        map = this.f3719a.get(strOptString2);
                    } else {
                        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                        this.f3719a.put(strOptString2, concurrentHashMap);
                        map = concurrentHashMap;
                    }
                    map.put(strOptString, jSONObjectOptJSONObject2);
                }
            }
        }
    }

    public final void a() {
        com.google.android.gms.ads.internal.p.g().r().w(new Runnable(this) { // from class: com.google.android.gms.internal.ads.gs0
            private final hs0 d;

            {
                this.d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.d.d();
            }
        });
        this.f3720b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.js0
            private final hs0 d;

            {
                this.d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.d.c();
            }
        });
    }

    final /* synthetic */ void d() {
        this.f3720b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.is0
            private final hs0 d;

            {
                this.d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.d.e();
            }
        });
    }

    @CheckForNull
    public final JSONObject f(String str, String str2) {
        if (!((Boolean) qx2.e().c(e0.z2)).booleanValue() || str == null || str2 == null) {
            return null;
        }
        if (!this.f3721c) {
            e();
        }
        Map<String, JSONObject> map = this.f3719a.get(str2);
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = map.get(str);
        if (jSONObject != null) {
            return jSONObject;
        }
        String strA = ks0.a(this.d, str, str2);
        if (strA == null) {
            return null;
        }
        return map.get(strA);
    }
}
