package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.fm0;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class fg2 extends ah2 {
    private long i;

    public fg2(jf2 jf2Var, String str, String str2, fm0.a.C0175a c0175a, long j, int r14, int r15) {
        super(jf2Var, str, str2, c0175a, r14, 25);
        this.i = j;
    }

    @Override // com.google.android.gms.internal.ads.ah2
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        long jLongValue = ((Long) this.f.invoke(null, new Object[0])).longValue();
        synchronized (this.e) {
            this.e.U(jLongValue);
            if (this.i != 0) {
                this.e.j0(jLongValue - this.i);
                this.e.m0(this.i);
            }
        }
    }
}
