package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class mu0 {

    /* renamed from: b, reason: collision with root package name */
    private final Executor f4454b;

    /* renamed from: c, reason: collision with root package name */
    private final xr f4455c;
    private final Context d;
    private final String e;
    private final boolean g;
    private final String h;

    /* renamed from: a, reason: collision with root package name */
    private final String f4453a = t1.f5333b.a();
    private final Map<String, String> f = new HashMap();

    public mu0(Executor executor, xr xrVar, Context context, as asVar) {
        this.f4454b = executor;
        this.f4455c = xrVar;
        this.d = context;
        this.e = context.getPackageName();
        this.g = ((double) qx2.h().nextFloat()) <= t1.f5332a.a().doubleValue();
        this.h = asVar.d;
        this.f.put("s", "gmob_sdk");
        this.f.put("v", "3");
        this.f.put("os", Build.VERSION.RELEASE);
        this.f.put("api_v", Build.VERSION.SDK);
        Map<String, String> map = this.f;
        com.google.android.gms.ads.internal.p.c();
        map.put("device", to.r0());
        this.f.put("app", this.e);
        Map<String, String> map2 = this.f;
        com.google.android.gms.ads.internal.p.c();
        map2.put("is_lite_sdk", to.E(this.d) ? "1" : "0");
        this.f.put("e", TextUtils.join(",", e0.e()));
        this.f.put("sdkVersion", this.h);
    }

    public final Map<String, String> a() {
        return new HashMap(this.f);
    }

    public final ConcurrentHashMap<String, String> b() {
        return new ConcurrentHashMap<>(this.f);
    }

    final /* synthetic */ void c(String str) {
        this.f4455c.a(str);
    }

    final void d(Map<String, String> map) {
        final String strE = e(map);
        if (this.g) {
            this.f4454b.execute(new Runnable(this, strE) { // from class: com.google.android.gms.internal.ads.qu0
                private final mu0 d;
                private final String e;

                {
                    this.d = this;
                    this.e = strE;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.d.c(this.e);
                }
            });
        }
        oo.m(strE);
    }

    final String e(Map<String, String> map) {
        Uri.Builder builderBuildUpon = Uri.parse(this.f4453a).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        return builderBuildUpon.build().toString();
    }
}
