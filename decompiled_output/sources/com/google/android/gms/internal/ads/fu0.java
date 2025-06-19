package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class fu0 {

    /* renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<String, String> f3459a;

    public fu0(mu0 mu0Var) {
        this.f3459a = mu0Var.b();
    }

    public final void a(wm1 wm1Var) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        String str;
        if (wm1Var.f5858b.f5550a.size() > 0) {
            int r0 = wm1Var.f5858b.f5550a.get(0).f4112b;
            if (r0 == 1) {
                concurrentHashMap = this.f3459a;
                str = "banner";
            } else if (r0 == 2) {
                concurrentHashMap = this.f3459a;
                str = "interstitial";
            } else if (r0 == 3) {
                concurrentHashMap = this.f3459a;
                str = "native_express";
            } else if (r0 == 4) {
                concurrentHashMap = this.f3459a;
                str = "native_advanced";
            } else if (r0 != 5) {
                concurrentHashMap = this.f3459a;
                str = b.i.k.d.f1056b;
            } else {
                concurrentHashMap = this.f3459a;
                str = "rewarded";
            }
            concurrentHashMap.put(FirebaseAnalytics.b.f6877b, str);
        }
        if (TextUtils.isEmpty(wm1Var.f5858b.f5551b.f4275b)) {
            return;
        }
        this.f3459a.put("gqi", wm1Var.f5858b.f5551b.f4275b);
    }

    public final void b(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.f3459a.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.f3459a.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }

    public final Map<String, String> c() {
        return this.f3459a;
    }
}
