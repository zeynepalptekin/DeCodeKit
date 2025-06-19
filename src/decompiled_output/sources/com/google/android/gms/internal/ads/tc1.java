package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class tc1 implements cf1<Bundle> {

    /* renamed from: a, reason: collision with root package name */
    private final String f5383a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f5384b;

    public tc1(String str, boolean z) {
        this.f5383a = str;
        this.f5384b = z;
    }

    @Override // com.google.android.gms.internal.ads.cf1
    public final /* synthetic */ void b(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putString("gct", this.f5383a);
        if (this.f5384b) {
            bundle2.putString("de", "1");
        }
    }
}
