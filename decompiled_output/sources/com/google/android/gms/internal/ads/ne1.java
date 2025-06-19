package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class ne1 implements cf1<Bundle> {

    /* renamed from: a, reason: collision with root package name */
    private final String f4523a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4524b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4525c;
    private final String d;
    private final Long e;

    public ne1(String str, String str2, String str3, String str4, Long l) {
        this.f4523a = str;
        this.f4524b = str2;
        this.f4525c = str3;
        this.d = str4;
        this.e = l;
    }

    @Override // com.google.android.gms.internal.ads.cf1
    public final /* synthetic */ void b(Bundle bundle) {
        Bundle bundle2 = bundle;
        jn1.e(bundle2, "gmp_app_id", this.f4523a);
        jn1.e(bundle2, "fbs_aiid", this.f4524b);
        jn1.e(bundle2, "fbs_aeid", this.f4525c);
        jn1.e(bundle2, "apm_id_origin", this.d);
        Long l = this.e;
        if (l != null) {
            bundle2.putLong("sai_timeout", l.longValue());
        }
    }
}
