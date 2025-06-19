package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class a7 implements z6<rw> {
    private static final Map<String, Integer> d = com.google.android.gms.common.util.h.g(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.ads.internal.a f2640a;

    /* renamed from: b, reason: collision with root package name */
    private final uf f2641b;

    /* renamed from: c, reason: collision with root package name */
    private final hg f2642c;

    public a7(com.google.android.gms.ads.internal.a aVar, uf ufVar, hg hgVar) {
        this.f2640a = aVar;
        this.f2641b = ufVar;
        this.f2642c = hgVar;
    }

    @Override // com.google.android.gms.internal.ads.z6
    public final /* synthetic */ void a(rw rwVar, Map map) throws JSONException {
        com.google.android.gms.ads.internal.a aVar;
        rw rwVar2 = rwVar;
        int r0 = d.get((String) map.get("a")).intValue();
        if (r0 != 5 && r0 != 7 && (aVar = this.f2640a) != null && !aVar.d()) {
            this.f2640a.b(null);
            return;
        }
        if (r0 == 1) {
            this.f2641b.j(map);
            return;
        }
        if (r0 == 3) {
            new zf(rwVar2, map).h();
            return;
        }
        if (r0 == 4) {
            new tf(rwVar2, map).i();
            return;
        }
        if (r0 == 5) {
            new wf(rwVar2, map).a();
            return;
        }
        if (r0 == 6) {
            this.f2641b.i(true);
        } else if (r0 != 7) {
            tr.h("Unknown MRAID command called.");
        } else {
            this.f2642c.b();
        }
    }
}
