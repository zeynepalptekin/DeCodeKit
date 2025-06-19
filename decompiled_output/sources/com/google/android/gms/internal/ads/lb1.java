package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class lb1 implements cf1<Bundle> {

    /* renamed from: a, reason: collision with root package name */
    private final double f4235a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f4236b;

    public lb1(double d, boolean z) {
        this.f4235a = d;
        this.f4236b = z;
    }

    @Override // com.google.android.gms.internal.ads.cf1
    public final /* synthetic */ void b(Bundle bundle) {
        Bundle bundle2 = bundle;
        Bundle bundleA = jn1.a(bundle2, "device");
        bundle2.putBundle("device", bundleA);
        Bundle bundleA2 = jn1.a(bundleA, "battery");
        bundleA.putBundle("battery", bundleA2);
        bundleA2.putBoolean("is_charging", this.f4236b);
        bundleA2.putDouble("battery_level", this.f4235a);
    }
}
