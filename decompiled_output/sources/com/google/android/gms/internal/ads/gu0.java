package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class gu0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f3581a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ hu0 f3582b;

    @com.google.android.gms.common.util.d0
    gu0(hu0 hu0Var) {
        this.f3582b = hu0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gu0 b() {
        this.f3581a.putAll(this.f3582b.f3724c);
        return this;
    }

    public final gu0 a(lm1 lm1Var) {
        this.f3581a.put("gqi", lm1Var.f4275b);
        return this;
    }

    public final void c() {
        this.f3582b.f3723b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.ju0
            private final gu0 d;

            {
                this.d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.d.e();
            }
        });
    }

    public final String d() {
        return this.f3582b.f3722a.e(this.f3581a);
    }

    final /* synthetic */ void e() {
        this.f3582b.f3722a.d(this.f3581a);
    }

    public final gu0 g(km1 km1Var) {
        this.f3581a.put("aai", km1Var.v);
        return this;
    }

    public final gu0 h(String str, String str2) {
        this.f3581a.put(str, str2);
        return this;
    }
}
