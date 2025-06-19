package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class q2 extends a3 {
    private static final int n = Color.rgb(12, 174, 206);
    private static final int o;
    private static final int p;
    private static final int q;
    private final String e;
    private final List<v2> f = new ArrayList();
    private final List<k3> g = new ArrayList();
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final boolean m;

    static {
        int r0 = Color.rgb(204, 204, 204);
        o = r0;
        p = r0;
        q = n;
    }

    public q2(String str, List<v2> list, Integer num, Integer num2, Integer num3, int r8, int r9, boolean z) {
        this.e = str;
        if (list != null) {
            for (int r3 = 0; r3 < list.size(); r3++) {
                v2 v2Var = list.get(r3);
                this.f.add(v2Var);
                this.g.add(v2Var);
            }
        }
        this.h = num != null ? num.intValue() : p;
        this.i = num2 != null ? num2.intValue() : q;
        this.j = num3 != null ? num3.intValue() : 12;
        this.k = r8;
        this.l = r9;
        this.m = z;
    }

    public final int A8() {
        return this.i;
    }

    public final int B8() {
        return this.j;
    }

    public final List<v2> C8() {
        return this.f;
    }

    public final int D8() {
        return this.k;
    }

    public final int E8() {
        return this.l;
    }

    @Override // com.google.android.gms.internal.ads.b3
    public final String X2() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.b3
    public final List<k3> u5() {
        return this.g;
    }

    public final int z8() {
        return this.h;
    }
}
