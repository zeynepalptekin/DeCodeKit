package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class de1 implements cf1<Bundle> {

    /* renamed from: a, reason: collision with root package name */
    private final String f3119a;

    public de1(String str) {
        this.f3119a = str;
    }

    @Override // com.google.android.gms.internal.ads.cf1
    public final /* synthetic */ void b(Bundle bundle) {
        bundle.putString("rtb", this.f3119a);
    }
}
