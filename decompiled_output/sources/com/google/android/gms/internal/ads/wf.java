package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class wf {

    /* renamed from: a, reason: collision with root package name */
    private final rw f5825a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f5826b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5827c;

    public wf(rw rwVar, Map<String, String> map) {
        this.f5825a = rwVar;
        this.f5827c = map.get("forceOrientation");
        this.f5826b = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean(map.get("allowOrientationChange")) : true;
    }

    public final void a() {
        int r0;
        if (this.f5825a == null) {
            tr.i("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(this.f5827c)) {
            com.google.android.gms.ads.internal.p.e();
            r0 = 7;
        } else if ("landscape".equalsIgnoreCase(this.f5827c)) {
            com.google.android.gms.ads.internal.p.e();
            r0 = 6;
        } else {
            r0 = this.f5826b ? -1 : com.google.android.gms.ads.internal.p.e().q();
        }
        this.f5825a.setRequestedOrientation(r0);
    }
}
