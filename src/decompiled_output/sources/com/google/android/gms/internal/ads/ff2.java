package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class ff2 extends u11<Integer, Object> {

    /* renamed from: b, reason: collision with root package name */
    public Long f3404b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f3405c;
    public Boolean d;

    public ff2() {
    }

    public ff2(String str) {
        a(str);
    }

    @Override // com.google.android.gms.internal.ads.u11
    protected final void a(String str) {
        HashMap mapB = u11.b(str);
        if (mapB != null) {
            this.f3404b = (Long) mapB.get(0);
            this.f3405c = (Boolean) mapB.get(1);
            this.d = (Boolean) mapB.get(2);
        }
    }

    @Override // com.google.android.gms.internal.ads.u11
    protected final HashMap<Integer, Object> c() {
        HashMap<Integer, Object> map = new HashMap<>();
        map.put(0, this.f3404b);
        map.put(1, this.f3405c);
        map.put(2, this.d);
        return map;
    }
}
