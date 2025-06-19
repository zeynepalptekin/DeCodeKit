package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.as;
import com.google.android.gms.internal.ads.jw2;
import com.google.android.gms.internal.ads.q1;
import com.google.android.gms.internal.ads.tr;
import com.google.android.gms.internal.ads.we1;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
final class q {

    /* renamed from: a, reason: collision with root package name */
    private final Context f2422a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2423b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, String> f2424c = new TreeMap();
    private String d;
    private String e;

    public q(Context context, String str) {
        this.f2422a = context.getApplicationContext();
        this.f2423b = str;
    }

    public final String a() {
        return this.d;
    }

    public final void b(jw2 jw2Var, as asVar) {
        this.d = jw2Var.m.d;
        Bundle bundle = jw2Var.p;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 == null) {
            return;
        }
        String strA = q1.f4932c.a();
        for (String str : bundle2.keySet()) {
            if (strA.equals(str)) {
                this.e = bundle2.getString(str);
            } else if (str.startsWith("csa_")) {
                this.f2424c.put(str.substring(4), bundle2.getString(str));
            }
        }
        this.f2424c.put("SDKVersion", asVar.d);
        if (q1.f4930a.a().booleanValue()) {
            try {
                Bundle bundleB = we1.b(this.f2422a, new JSONArray(q1.f4931b.a()));
                for (String str2 : bundleB.keySet()) {
                    this.f2424c.put(str2, bundleB.get(str2).toString());
                }
            } catch (JSONException e) {
                tr.c("Flag gads:afs:csa_tcf_data_to_collect not a valid JSON array", e);
            }
        }
    }

    public final String c() {
        return this.e;
    }

    public final String d() {
        return this.f2423b;
    }

    public final Map<String, String> e() {
        return this.f2424c;
    }
}
