package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class eq {

    /* renamed from: a, reason: collision with root package name */
    private final String[] f3307a;

    /* renamed from: b, reason: collision with root package name */
    private final double[] f3308b;

    /* renamed from: c, reason: collision with root package name */
    private final double[] f3309c;
    private final int[] d;
    private int e;

    private eq(jq jqVar) {
        int size = jqVar.f4011b.size();
        this.f3307a = (String[]) jqVar.f4010a.toArray(new String[size]);
        this.f3308b = b(jqVar.f4011b);
        this.f3309c = b(jqVar.f4012c);
        this.d = new int[size];
        this.e = 0;
    }

    private static double[] b(List<Double> list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int r2 = 0; r2 < size; r2++) {
            dArr[r2] = list.get(r2).doubleValue();
        }
        return dArr;
    }

    public final void a(double d) {
        this.e++;
        int r0 = 0;
        while (true) {
            double[] dArr = this.f3309c;
            if (r0 >= dArr.length) {
                return;
            }
            if (dArr[r0] <= d && d < this.f3308b[r0]) {
                int[] r1 = this.d;
                r1[r0] = r1[r0] + 1;
            }
            if (d < this.f3309c[r0]) {
                return;
            } else {
                r0++;
            }
        }
    }

    public final List<gq> c() {
        ArrayList arrayList = new ArrayList(this.f3307a.length);
        int r1 = 0;
        while (true) {
            String[] strArr = this.f3307a;
            if (r1 >= strArr.length) {
                return arrayList;
            }
            arrayList.add(new gq(strArr[r1], this.f3309c[r1], this.f3308b[r1], r2[r1] / this.e, this.d[r1]));
            r1++;
        }
    }
}
