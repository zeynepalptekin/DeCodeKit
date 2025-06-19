package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class qf2 extends u11<Integer, Long> {

    /* renamed from: b, reason: collision with root package name */
    public Long f5008b;

    /* renamed from: c, reason: collision with root package name */
    public Long f5009c;
    public Long d;
    public Long e;
    public Long f;
    public Long g;
    public Long h;
    public Long i;
    public Long j;
    public Long k;
    public Long l;

    public qf2() {
    }

    public qf2(String str) {
        a(str);
    }

    @Override // com.google.android.gms.internal.ads.u11
    protected final void a(String str) {
        HashMap mapB = u11.b(str);
        if (mapB != null) {
            this.f5008b = (Long) mapB.get(0);
            this.f5009c = (Long) mapB.get(1);
            this.d = (Long) mapB.get(2);
            this.e = (Long) mapB.get(3);
            this.f = (Long) mapB.get(4);
            this.g = (Long) mapB.get(5);
            this.h = (Long) mapB.get(6);
            this.i = (Long) mapB.get(7);
            this.j = (Long) mapB.get(8);
            this.k = (Long) mapB.get(9);
            this.l = (Long) mapB.get(10);
        }
    }

    @Override // com.google.android.gms.internal.ads.u11
    protected final HashMap<Integer, Long> c() {
        HashMap<Integer, Long> map = new HashMap<>();
        map.put(0, this.f5008b);
        map.put(1, this.f5009c);
        map.put(2, this.d);
        map.put(3, this.e);
        map.put(4, this.f);
        map.put(5, this.g);
        map.put(6, this.h);
        map.put(7, this.i);
        map.put(8, this.j);
        map.put(9, this.k);
        map.put(10, this.l);
        return map;
    }
}
