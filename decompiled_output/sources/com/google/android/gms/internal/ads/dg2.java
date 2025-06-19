package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.fm0;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class dg2 extends ah2 {
    public dg2(jf2 jf2Var, String str, String str2, fm0.a.C0175a c0175a, int r12, int r13) {
        super(jf2Var, str, str2, c0175a, r12, 5);
    }

    @Override // com.google.android.gms.internal.ads.ah2
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        this.e.c0(-1L);
        this.e.d0(-1L);
        int[] r0 = (int[]) this.f.invoke(null, this.f2690b.a());
        synchronized (this.e) {
            this.e.c0(r0[0]);
            this.e.d0(r0[1]);
            if (r0[2] != Integer.MIN_VALUE) {
                this.e.N(r0[2]);
            }
        }
    }
}
