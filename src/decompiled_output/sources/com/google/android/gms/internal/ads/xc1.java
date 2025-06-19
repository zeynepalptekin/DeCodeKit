package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class xc1 implements cf1<Bundle> {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f5965a;

    public xc1(Bundle bundle) {
        this.f5965a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.cf1
    public final /* synthetic */ void b(Bundle bundle) {
        Bundle bundle2 = bundle;
        Bundle bundleA = jn1.a(bundle2, "device");
        bundleA.putBundle("android_mem_info", this.f5965a);
        bundle2.putBundle("device", bundleA);
    }
}
