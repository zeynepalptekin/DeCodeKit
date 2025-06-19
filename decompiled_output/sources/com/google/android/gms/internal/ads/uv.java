package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
final class uv implements Runnable {
    private final /* synthetic */ String d;
    private final /* synthetic */ String e;
    private final /* synthetic */ long f;
    private final /* synthetic */ long g;
    private final /* synthetic */ boolean h;
    private final /* synthetic */ int i;
    private final /* synthetic */ int j;
    private final /* synthetic */ sv k;

    uv(sv svVar, String str, String str2, long j, long j2, boolean z, int r9, int r10) {
        this.k = svVar;
        this.d = str;
        this.e = str2;
        this.f = j;
        this.g = j2;
        this.h = z;
        this.i = r9;
        this.j = r10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put(androidx.core.app.p.i0, "precacheProgress");
        map.put("src", this.d);
        map.put("cachedSrc", this.e);
        map.put("bufferedDuration", Long.toString(this.f));
        map.put("totalDuration", Long.toString(this.g));
        map.put("cacheReady", this.h ? "1" : "0");
        map.put("playerCount", Integer.toString(this.i));
        map.put("playerPreparedCount", Integer.toString(this.j));
        this.k.p("onPrecacheEvent", map);
    }
}
