package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class pc1 implements cf1<Bundle> {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f4802a;

    public pc1(Bundle bundle) {
        this.f4802a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.cf1
    public final /* synthetic */ void b(Bundle bundle) {
        bundle.putBundle("content_info", this.f4802a);
    }
}
