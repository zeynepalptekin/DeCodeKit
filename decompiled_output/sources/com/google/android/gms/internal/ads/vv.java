package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
final class vv implements Runnable {
    private final /* synthetic */ String d;
    private final /* synthetic */ String e;
    private final /* synthetic */ long f;
    private final /* synthetic */ sv g;

    vv(sv svVar, String str, String str2, long j) {
        this.g = svVar;
        this.d = str;
        this.e = str2;
        this.f = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put(androidx.core.app.p.i0, "precacheComplete");
        map.put("src", this.d);
        map.put("cachedSrc", this.e);
        map.put("totalDuration", Long.toString(this.f));
        this.g.p("onPrecacheEvent", map);
    }
}
