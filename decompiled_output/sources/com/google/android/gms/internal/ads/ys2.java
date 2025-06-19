package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class ys2 implements Comparator<ms2> {
    public ys2(at2 at2Var) {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(ms2 ms2Var, ms2 ms2Var2) {
        ms2 ms2Var3 = ms2Var;
        ms2 ms2Var4 = ms2Var2;
        if (ms2Var3.b() < ms2Var4.b()) {
            return -1;
        }
        if (ms2Var3.b() > ms2Var4.b()) {
            return 1;
        }
        if (ms2Var3.a() < ms2Var4.a()) {
            return -1;
        }
        if (ms2Var3.a() > ms2Var4.a()) {
            return 1;
        }
        float fD = (ms2Var3.d() - ms2Var3.b()) * (ms2Var3.c() - ms2Var3.a());
        float fD2 = (ms2Var4.d() - ms2Var4.b()) * (ms2Var4.c() - ms2Var4.a());
        if (fD > fD2) {
            return -1;
        }
        return fD < fD2 ? 1 : 0;
    }
}
