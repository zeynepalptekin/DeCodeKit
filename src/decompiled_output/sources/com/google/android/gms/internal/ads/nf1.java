package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class nf1 implements cf1<Bundle> {

    /* renamed from: a, reason: collision with root package name */
    private final String f4529a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4530b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4531c;
    private final int d;
    private final boolean e;
    private final int f;

    public nf1(String str, int r2, int r3, int r4, boolean z, int r6) {
        this.f4529a = str;
        this.f4530b = r2;
        this.f4531c = r3;
        this.d = r4;
        this.e = z;
        this.f = r6;
    }

    @Override // com.google.android.gms.internal.ads.cf1
    public final /* synthetic */ void b(Bundle bundle) {
        Bundle bundle2 = bundle;
        jn1.f(bundle2, "carrier", this.f4529a, !TextUtils.isEmpty(r0));
        jn1.d(bundle2, "cnt", Integer.valueOf(this.f4530b), this.f4530b != -2);
        bundle2.putInt("gnt", this.f4531c);
        bundle2.putInt("pt", this.d);
        Bundle bundleA = jn1.a(bundle2, "device");
        bundle2.putBundle("device", bundleA);
        Bundle bundleA2 = jn1.a(bundleA, "network");
        bundleA.putBundle("network", bundleA2);
        bundleA2.putInt("active_network_state", this.f);
        bundleA2.putBoolean("active_network_metered", this.e);
    }
}
