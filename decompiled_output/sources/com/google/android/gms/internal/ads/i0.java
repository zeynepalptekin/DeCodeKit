package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    private String f3739a = t1.f5333b.a();

    /* renamed from: b, reason: collision with root package name */
    private Map<String, String> f3740b;

    /* renamed from: c, reason: collision with root package name */
    private Context f3741c;
    private String d;

    public i0(Context context, String str) {
        this.f3741c = null;
        this.d = null;
        this.f3741c = context;
        this.d = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f3740b = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        this.f3740b.put("v", "3");
        this.f3740b.put("os", Build.VERSION.RELEASE);
        this.f3740b.put("api_v", Build.VERSION.SDK);
        Map<String, String> map = this.f3740b;
        com.google.android.gms.ads.internal.p.c();
        map.put("device", to.r0());
        this.f3740b.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        Map<String, String> map2 = this.f3740b;
        com.google.android.gms.ads.internal.p.c();
        map2.put("is_lite_sdk", to.E(context) ? "1" : "0");
        Future<fj> futureB = com.google.android.gms.ads.internal.p.n().b(this.f3741c);
        try {
            this.f3740b.put("network_coarse", Integer.toString(futureB.get().o));
            this.f3740b.put("network_fine", Integer.toString(futureB.get().p));
        } catch (Exception e) {
            com.google.android.gms.ads.internal.p.g().e(e, "CsiConfiguration.CsiConfiguration");
        }
    }

    final Context a() {
        return this.f3741c;
    }

    final String b() {
        return this.d;
    }

    final String c() {
        return this.f3739a;
    }

    final Map<String, String> d() {
        return this.f3740b;
    }
}
