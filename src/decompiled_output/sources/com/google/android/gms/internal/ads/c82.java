package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes.dex */
final class c82 implements Comparator<a82> {
    c82() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(a82 a82Var, a82 a82Var2) {
        a82 a82Var3 = a82Var;
        a82 a82Var4 = a82Var2;
        f82 f82Var = (f82) a82Var3.iterator();
        f82 f82Var2 = (f82) a82Var4.iterator();
        while (f82Var.hasNext() && f82Var2.hasNext()) {
            int r2 = Integer.compare(a82.o(f82Var.nextByte()), a82.o(f82Var2.nextByte()));
            if (r2 != 0) {
                return r2;
            }
        }
        return Integer.compare(a82Var3.size(), a82Var4.size());
    }
}
