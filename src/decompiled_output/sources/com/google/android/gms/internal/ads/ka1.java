package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class ka1 implements cf1<Bundle> {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f4073a;

    private ka1(Bundle bundle) {
        this.f4073a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.cf1
    public final /* synthetic */ void b(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (this.f4073a.isEmpty()) {
            return;
        }
        bundle2.putBundle("installed_adapter_data", this.f4073a);
    }
}
