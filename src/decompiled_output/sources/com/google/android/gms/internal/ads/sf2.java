package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class sf2 extends u11<Integer, Long> {

    /* renamed from: b, reason: collision with root package name */
    public Long f5255b;

    /* renamed from: c, reason: collision with root package name */
    public Long f5256c;
    public Long d;
    public Long e;

    public sf2() {
    }

    public sf2(String str) {
        a(str);
    }

    @Override // com.google.android.gms.internal.ads.u11
    protected final void a(String str) {
        HashMap mapB = u11.b(str);
        if (mapB != null) {
            this.f5255b = (Long) mapB.get(0);
            this.f5256c = (Long) mapB.get(1);
            this.d = (Long) mapB.get(2);
            this.e = (Long) mapB.get(3);
        }
    }

    @Override // com.google.android.gms.internal.ads.u11
    protected final HashMap<Integer, Long> c() {
        HashMap<Integer, Long> map = new HashMap<>();
        map.put(0, this.f5255b);
        map.put(1, this.f5256c);
        map.put(2, this.d);
        map.put(3, this.e);
        return map;
    }
}
