package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
final class tv implements Runnable {
    private final /* synthetic */ String d;
    private final /* synthetic */ String e;
    private final /* synthetic */ int f;
    private final /* synthetic */ int g;
    private final /* synthetic */ long h;
    private final /* synthetic */ long i;
    private final /* synthetic */ boolean j;
    private final /* synthetic */ int k;
    private final /* synthetic */ int l;
    private final /* synthetic */ sv m;

    tv(sv svVar, String str, String str2, int r4, int r5, long j, long j2, boolean z, int r11, int r12) {
        this.m = svVar;
        this.d = str;
        this.e = str2;
        this.f = r4;
        this.g = r5;
        this.h = j;
        this.i = j2;
        this.j = z;
        this.k = r11;
        this.l = r12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put(androidx.core.app.p.i0, "precacheProgress");
        map.put("src", this.d);
        map.put("cachedSrc", this.e);
        map.put("bytesLoaded", Integer.toString(this.f));
        map.put("totalBytes", Integer.toString(this.g));
        map.put("bufferedDuration", Long.toString(this.h));
        map.put("totalDuration", Long.toString(this.i));
        map.put("cacheReady", this.j ? "1" : "0");
        map.put("playerCount", Integer.toString(this.k));
        map.put("playerPreparedCount", Integer.toString(this.l));
        this.m.p("onPrecacheEvent", map);
    }
}
