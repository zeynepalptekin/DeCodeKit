package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class wb1 implements cf1<Bundle> {

    /* renamed from: a, reason: collision with root package name */
    private final String f5815a;

    public wb1(@Nullable String str) {
        this.f5815a = str;
    }

    @Override // com.google.android.gms.internal.ads.cf1
    public final /* synthetic */ void b(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (TextUtils.isEmpty(this.f5815a)) {
            return;
        }
        bundle2.putString("fwd_cld", this.f5815a);
    }
}
