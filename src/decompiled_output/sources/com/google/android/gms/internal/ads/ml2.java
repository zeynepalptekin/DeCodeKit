package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
final class ml2 extends jl2 {
    public final long Q0;
    public final List<ll2> R0;
    public final List<ml2> S0;

    public ml2(int r1, long j) {
        super(r1);
        this.Q0 = j;
        this.R0 = new ArrayList();
        this.S0 = new ArrayList();
    }

    public final void d(ll2 ll2Var) {
        this.R0.add(ll2Var);
    }

    public final void e(ml2 ml2Var) {
        this.S0.add(ml2Var);
    }

    public final ll2 f(int r5) {
        int size = this.R0.size();
        for (int r1 = 0; r1 < size; r1++) {
            ll2 ll2Var = this.R0.get(r1);
            if (ll2Var.f3993a == r5) {
                return ll2Var;
            }
        }
        return null;
    }

    public final ml2 g(int r5) {
        int size = this.S0.size();
        for (int r1 = 0; r1 < size; r1++) {
            ml2 ml2Var = this.S0.get(r1);
            if (ml2Var.f3993a == r5) {
                return ml2Var;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.jl2
    public final String toString() {
        String strC = jl2.c(this.f3993a);
        String string = Arrays.toString(this.R0.toArray());
        String string2 = Arrays.toString(this.S0.toArray());
        StringBuilder sb = new StringBuilder(String.valueOf(strC).length() + 22 + String.valueOf(string).length() + String.valueOf(string2).length());
        sb.append(strC);
        sb.append(" leaves: ");
        sb.append(string);
        sb.append(" containers: ");
        sb.append(string2);
        return sb.toString();
    }
}
