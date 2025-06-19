package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class re1 implements cf1<Bundle> {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f5127a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f5128b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5129c;
    private final boolean d;
    private final int e;
    private final int f;
    private final int g;

    public re1(boolean z, boolean z2, String str, boolean z3, int r5, int r6, int r7) {
        this.f5127a = z;
        this.f5128b = z2;
        this.f5129c = str;
        this.d = z3;
        this.e = r5;
        this.f = r6;
        this.g = r7;
    }

    @Override // com.google.android.gms.internal.ads.cf1
    public final /* synthetic */ void b(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putString("js", this.f5129c);
        bundle2.putBoolean("is_nonagon", true);
        bundle2.putString("extra_caps", (String) qx2.e().c(e0.a2));
        bundle2.putInt("target_api", this.e);
        bundle2.putInt("dv", this.f);
        bundle2.putInt("lv", this.g);
        Bundle bundleA = jn1.a(bundle2, "sdk_env");
        bundleA.putBoolean("mf", a2.f2619a.a().booleanValue());
        bundleA.putBoolean("instant_app", this.f5127a);
        bundleA.putBoolean("lite", this.f5128b);
        bundleA.putBoolean("is_privileged_process", this.d);
        bundle2.putBundle("sdk_env", bundleA);
        Bundle bundleA2 = jn1.a(bundleA, "build_meta");
        bundleA2.putString("cl", "330794610");
        bundleA2.putString("rapid_rc", "dev");
        bundleA2.putString("rapid_rollup", "HEAD");
        bundleA.putBundle("build_meta", bundleA2);
    }
}
