package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

/* loaded from: classes.dex */
public final class ld1 implements cf1<Bundle> {

    /* renamed from: a, reason: collision with root package name */
    private final String f4243a;

    public ld1(String str) {
        this.f4243a = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean a(Set<String> set) {
        return set.contains("rewarded") || set.contains("interstitial") || set.contains("native") || set.contains("banner");
    }

    @Override // com.google.android.gms.internal.ads.cf1
    public final /* synthetic */ void b(Bundle bundle) {
        jn1.e(bundle, "omid_v", this.f4243a);
    }
}
