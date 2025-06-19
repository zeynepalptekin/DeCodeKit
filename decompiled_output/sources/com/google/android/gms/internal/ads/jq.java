package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class jq {

    /* renamed from: a, reason: collision with root package name */
    private final List<String> f4010a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List<Double> f4011b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final List<Double> f4012c = new ArrayList();

    public final jq a(String str, double d, double d2) {
        int r0 = 0;
        while (r0 < this.f4010a.size()) {
            double dDoubleValue = this.f4012c.get(r0).doubleValue();
            double dDoubleValue2 = this.f4011b.get(r0).doubleValue();
            if (d < dDoubleValue || (dDoubleValue == d && d2 < dDoubleValue2)) {
                break;
            }
            r0++;
        }
        this.f4010a.add(r0, str);
        this.f4012c.add(r0, Double.valueOf(d));
        this.f4011b.add(r0, Double.valueOf(d2));
        return this;
    }

    public final eq e() {
        return new eq(this);
    }
}
