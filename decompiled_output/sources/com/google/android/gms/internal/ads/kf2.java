package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class kf2 extends u11<Integer, Long> {

    /* renamed from: b, reason: collision with root package name */
    public Long f4088b;

    /* renamed from: c, reason: collision with root package name */
    public Long f4089c;

    public kf2() {
    }

    public kf2(String str) {
        a(str);
    }

    @Override // com.google.android.gms.internal.ads.u11
    protected final void a(String str) {
        HashMap mapB = u11.b(str);
        if (mapB != null) {
            this.f4088b = (Long) mapB.get(0);
            this.f4089c = (Long) mapB.get(1);
        }
    }

    @Override // com.google.android.gms.internal.ads.u11
    protected final HashMap<Integer, Long> c() {
        HashMap<Integer, Long> map = new HashMap<>();
        map.put(0, this.f4088b);
        map.put(1, this.f4089c);
        return map;
    }
}
