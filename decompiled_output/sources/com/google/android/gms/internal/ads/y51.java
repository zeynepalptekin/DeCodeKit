package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class y51 extends u11<Integer, Object> {

    /* renamed from: b, reason: collision with root package name */
    public String f6092b;

    /* renamed from: c, reason: collision with root package name */
    public long f6093c;
    public String d;
    public String e;
    public String f;

    public y51() {
        this.f6092b = "E";
        this.f6093c = -1L;
        this.d = "E";
        this.e = "E";
        this.f = "E";
    }

    public y51(String str) {
        this();
        a(str);
    }

    @Override // com.google.android.gms.internal.ads.u11
    protected final void a(String str) {
        HashMap mapB = u11.b(str);
        if (mapB != null) {
            this.f6092b = mapB.get(0) == null ? "E" : (String) mapB.get(0);
            this.f6093c = mapB.get(1) == null ? -1L : ((Long) mapB.get(1)).longValue();
            this.d = mapB.get(2) == null ? "E" : (String) mapB.get(2);
            this.e = mapB.get(3) == null ? "E" : (String) mapB.get(3);
            this.f = mapB.get(4) != null ? (String) mapB.get(4) : "E";
        }
    }

    @Override // com.google.android.gms.internal.ads.u11
    protected final HashMap<Integer, Object> c() {
        HashMap<Integer, Object> map = new HashMap<>();
        map.put(0, this.f6092b);
        map.put(4, this.f);
        map.put(3, this.e);
        map.put(2, this.d);
        map.put(1, Long.valueOf(this.f6093c));
        return map;
    }
}
