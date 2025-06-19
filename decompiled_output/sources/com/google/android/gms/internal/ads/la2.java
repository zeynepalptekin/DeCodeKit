package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
final class la2 extends ga2 {
    private la2() {
        super();
    }

    private static <E> x92<E> f(Object obj, long j) {
        return (x92) tc2.G(obj, j);
    }

    @Override // com.google.android.gms.internal.ads.ga2
    final <L> List<L> a(Object obj, long j) {
        x92 x92VarF = f(obj, j);
        if (x92VarF.m()) {
            return x92VarF;
        }
        int size = x92VarF.size();
        x92 x92VarK = x92VarF.k(size == 0 ? 10 : size << 1);
        tc2.f(obj, j, x92VarK);
        return x92VarK;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    final <E> void b(Object obj, Object obj2, long j) {
        x92 x92VarF = f(obj, j);
        x92 x92VarF2 = f(obj2, j);
        int size = x92VarF.size();
        int size2 = x92VarF2.size();
        if (size > 0 && size2 > 0) {
            if (!x92VarF.m()) {
                x92VarF = x92VarF.k(size2 + size);
            }
            x92VarF.addAll(x92VarF2);
        }
        if (size > 0) {
            x92VarF2 = x92VarF;
        }
        tc2.f(obj, j, x92VarF2);
    }

    @Override // com.google.android.gms.internal.ads.ga2
    final void c(Object obj, long j) {
        f(obj, j).w();
    }
}
