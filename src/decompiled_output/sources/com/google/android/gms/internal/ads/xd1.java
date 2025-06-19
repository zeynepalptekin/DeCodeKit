package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class xd1 implements cf1<Bundle> {

    /* renamed from: a, reason: collision with root package name */
    private String f5968a;

    public xd1(String str) {
        this.f5968a = str;
    }

    @Override // com.google.android.gms.internal.ads.cf1
    public final /* synthetic */ void b(Bundle bundle) {
        bundle.putString("request_id", this.f5968a);
    }
}
