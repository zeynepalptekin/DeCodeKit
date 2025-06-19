package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;

/* loaded from: classes.dex */
final class yv implements Runnable {
    private final /* synthetic */ String d;
    private final /* synthetic */ String e;
    private final /* synthetic */ String f;
    private final /* synthetic */ String g;
    private final /* synthetic */ sv h;

    yv(sv svVar, String str, String str2, String str3, String str4) {
        this.h = svVar;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap map = new HashMap();
        map.put(androidx.core.app.p.i0, "precacheCanceled");
        map.put("src", this.d);
        if (!TextUtils.isEmpty(this.e)) {
            map.put("cachedSrc", this.e);
        }
        sv svVar = this.h;
        map.put("type", sv.y(this.f));
        map.put("reason", this.f);
        if (!TextUtils.isEmpty(this.g)) {
            map.put("message", this.g);
        }
        this.h.p("onPrecacheEvent", map);
    }
}
