package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class bw {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<lp2> f2886a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private long f2887b;

    bw() {
    }

    final void a(lp2 lp2Var) {
        this.f2886a.add(lp2Var);
    }

    final long b() throws NumberFormatException {
        Iterator<lp2> it = this.f2886a.iterator();
        while (it.hasNext()) {
            Map<String, List<String>> mapB = it.next().b();
            if (mapB != null) {
                for (Map.Entry<String, List<String>> entry : mapB.entrySet()) {
                    try {
                        if ("content-length".equalsIgnoreCase(entry.getKey())) {
                            this.f2887b = Math.max(this.f2887b, Long.parseLong(entry.getValue().get(0)));
                        }
                    } catch (RuntimeException unused) {
                    }
                }
                it.remove();
            }
        }
        return this.f2887b;
    }
}
