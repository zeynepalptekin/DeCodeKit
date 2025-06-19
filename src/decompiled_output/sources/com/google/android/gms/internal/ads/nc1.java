package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
final class nc1 implements cf1<Bundle> {

    /* renamed from: a, reason: collision with root package name */
    private final String f4518a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4519b;

    /* renamed from: c, reason: collision with root package name */
    private final Bundle f4520c;

    private nc1(String str, String str2, Bundle bundle) {
        this.f4518a = str;
        this.f4519b = str2;
        this.f4520c = bundle;
    }

    @Override // com.google.android.gms.internal.ads.cf1
    public final /* synthetic */ void b(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putString("consent_string", this.f4518a);
        bundle2.putString("fc_consent", this.f4519b);
        bundle2.putBundle("iab_consent_info", this.f4520c);
    }
}
