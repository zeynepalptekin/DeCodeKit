package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
final class rv implements Runnable {
    private final /* synthetic */ String d;
    private final /* synthetic */ String e;
    private final /* synthetic */ int f;
    private final /* synthetic */ int g;
    private final /* synthetic */ boolean h = false;
    private final /* synthetic */ sv i;

    rv(sv svVar, String str, String str2, int r4, int r5, boolean z) {
        this.i = svVar;
        this.d = str;
        this.e = str2;
        this.f = r4;
        this.g = r5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put(androidx.core.app.p.i0, "precacheProgress");
        map.put("src", this.d);
        map.put("cachedSrc", this.e);
        map.put("bytesLoaded", Integer.toString(this.f));
        map.put("totalBytes", Integer.toString(this.g));
        map.put("cacheReady", this.h ? "1" : "0");
        this.i.p("onPrecacheEvent", map);
    }
}
