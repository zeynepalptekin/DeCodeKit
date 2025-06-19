package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a71 {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, d71> f2644a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, Map<String, List<d71>>> f2645b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Executor f2646c;
    private JSONObject d;

    public a71(Executor executor) {
        this.f2646c = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized void e() {
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectF = com.google.android.gms.ads.internal.p.g().r().i().f();
        if (jSONObjectF != null) {
            try {
                JSONArray jSONArrayOptJSONArray2 = jSONObjectF.optJSONArray("ad_unit_id_settings");
                this.d = jSONObjectF.optJSONObject("ad_unit_patterns");
                if (jSONArrayOptJSONArray2 != null) {
                    for (int r2 = 0; r2 < jSONArrayOptJSONArray2.length(); r2++) {
                        JSONObject jSONObject = jSONArrayOptJSONArray2.getJSONObject(r2);
                        String strOptString = jSONObject.optString("ad_unit_id", "");
                        String strOptString2 = jSONObject.optString("format", "");
                        ArrayList arrayList = new ArrayList();
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("mediation_config");
                        if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("ad_networks")) != null) {
                            for (int r7 = 0; r7 < jSONArrayOptJSONArray.length(); r7++) {
                                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(r7);
                                ArrayList arrayList2 = new ArrayList();
                                if (jSONObject2 != null) {
                                    JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("data");
                                    Bundle bundle = new Bundle();
                                    if (jSONObjectOptJSONObject2 != null) {
                                        Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
                                        while (itKeys.hasNext()) {
                                            String next = itKeys.next();
                                            bundle.putString(next, jSONObjectOptJSONObject2.optString(next, ""));
                                        }
                                    }
                                    JSONArray jSONArrayOptJSONArray3 = jSONObject2.optJSONArray("rtb_adapters");
                                    if (jSONArrayOptJSONArray3 != null) {
                                        ArrayList arrayList3 = new ArrayList();
                                        for (int r12 = 0; r12 < jSONArrayOptJSONArray3.length(); r12++) {
                                            String strOptString3 = jSONArrayOptJSONArray3.optString(r12, "");
                                            if (!TextUtils.isEmpty(strOptString3)) {
                                                arrayList3.add(strOptString3);
                                            }
                                        }
                                        int size = arrayList3.size();
                                        int r122 = 0;
                                        while (r122 < size) {
                                            Object obj = arrayList3.get(r122);
                                            r122++;
                                            String str = (String) obj;
                                            f(str);
                                            if (this.f2644a.get(str) != null) {
                                                arrayList2.add(new d71(str, strOptString2, bundle));
                                            }
                                        }
                                    }
                                }
                                arrayList.addAll(arrayList2);
                            }
                        }
                        if (!TextUtils.isEmpty(strOptString2) && !TextUtils.isEmpty(strOptString)) {
                            Map<String, List<d71>> concurrentHashMap = this.f2645b.get(strOptString2);
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap<>();
                            }
                            this.f2645b.put(strOptString2, concurrentHashMap);
                            List<d71> arrayList4 = concurrentHashMap.get(strOptString);
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList<>();
                            }
                            arrayList4.addAll(arrayList);
                            concurrentHashMap.put(strOptString, arrayList4);
                        }
                    }
                }
            } catch (JSONException e) {
                oo.l("Malformed config loading JSON.", e);
            }
        }
    }

    public final void a() {
        com.google.android.gms.ads.internal.p.g().r().w(new Runnable(this) { // from class: com.google.android.gms.internal.ads.y61
            private final a71 d;

            {
                this.d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.d.d();
            }
        });
        this.f2646c.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.c71
            private final a71 d;

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
        this.f2646c.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.b71
            private final a71 d;

            {
                this.d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.d.e();
            }
        });
    }

    public final void f(String str) {
        if (TextUtils.isEmpty(str) || this.f2644a.containsKey(str)) {
            return;
        }
        this.f2644a.put(str, new d71(str, "", new Bundle()));
    }

    public final Map<String, List<Bundle>> g(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return Collections.emptyMap();
        }
        Map<String, List<d71>> map = this.f2645b.get(str);
        if (map == null) {
            return Collections.emptyMap();
        }
        List<d71> list = map.get(str2);
        if (list == null) {
            list = map.get(ks0.a(this.d, str2, str));
        }
        if (list == null) {
            return Collections.emptyMap();
        }
        HashMap map2 = new HashMap();
        for (d71 d71Var : list) {
            String str3 = d71Var.f3084a;
            if (!map2.containsKey(str3)) {
                map2.put(str3, new ArrayList());
            }
            ((List) map2.get(str3)).add(d71Var.f3086c);
        }
        return map2;
    }
}
