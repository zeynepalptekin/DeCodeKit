package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public final class q20 implements m20 {

    /* renamed from: a, reason: collision with root package name */
    private final im1 f4939a;

    public q20(im1 im1Var) {
        this.f4939a = im1Var;
    }

    @Override // com.google.android.gms.internal.ads.m20
    public final void a(Map<String, String> map) {
        String str = map.get("render_in_browser");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.f4939a.d(Boolean.parseBoolean(str));
        } catch (Exception unused) {
            throw new IllegalStateException("Invalid render_in_browser state");
        }
    }
}
