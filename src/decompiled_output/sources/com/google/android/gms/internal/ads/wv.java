package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
final class wv implements Runnable {
    private final /* synthetic */ String d;
    private final /* synthetic */ String e;
    private final /* synthetic */ int f;
    private final /* synthetic */ sv g;

    wv(sv svVar, String str, String str2, int r4) {
        this.g = svVar;
        this.d = str;
        this.e = str2;
        this.f = r4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put(androidx.core.app.p.i0, "precacheComplete");
        map.put("src", this.d);
        map.put("cachedSrc", this.e);
        map.put("totalBytes", Integer.toString(this.f));
        this.g.p("onPrecacheEvent", map);
    }
}
