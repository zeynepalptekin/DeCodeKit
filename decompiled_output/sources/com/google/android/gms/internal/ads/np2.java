package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class np2 extends op2 {
    private final int f;
    private final Map<String, List<String>> g;

    public np2(int r3, Map<String, List<String>> map, jp2 jp2Var) {
        StringBuilder sb = new StringBuilder(26);
        sb.append("Response code: ");
        sb.append(r3);
        super(sb.toString(), jp2Var, 1);
        this.f = r3;
        this.g = map;
    }
}
