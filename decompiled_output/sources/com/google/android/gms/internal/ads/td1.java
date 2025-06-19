package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class td1 implements cf1<Bundle> {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f5390a;

    public td1(Bundle bundle) {
        this.f5390a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.cf1
    public final /* synthetic */ void b(Bundle bundle) {
        Bundle bundle2 = bundle;
        Bundle bundle3 = this.f5390a;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
    }
}
