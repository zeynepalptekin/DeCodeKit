package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class m92 extends u11<Integer, Long> {

    /* renamed from: b, reason: collision with root package name */
    public long f4369b;

    /* renamed from: c, reason: collision with root package name */
    public long f4370c;

    public m92() {
        this.f4369b = -1L;
        this.f4370c = -1L;
    }

    public m92(String str) {
        this();
        a(str);
    }

    @Override // com.google.android.gms.internal.ads.u11
    protected final void a(String str) {
        HashMap mapB = u11.b(str);
        if (mapB != null) {
            this.f4369b = ((Long) mapB.get(0)).longValue();
            this.f4370c = ((Long) mapB.get(1)).longValue();
        }
    }

    @Override // com.google.android.gms.internal.ads.u11
    protected final HashMap<Integer, Long> c() {
        HashMap<Integer, Long> map = new HashMap<>();
        map.put(0, Long.valueOf(this.f4369b));
        map.put(1, Long.valueOf(this.f4370c));
        return map;
    }
}
