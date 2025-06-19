package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.fm0;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class pg2 extends ah2 {
    private final boolean i;

    public pg2(jf2 jf2Var, String str, String str2, fm0.a.C0175a c0175a, int r12, int r13) {
        super(jf2Var, str, str2, c0175a, r12, 61);
        this.i = jf2Var.q();
    }

    @Override // com.google.android.gms.internal.ads.ah2
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        long jLongValue = ((Long) this.f.invoke(null, this.f2690b.a(), Boolean.valueOf(this.i))).longValue();
        synchronized (this.e) {
            this.e.Q(jLongValue);
        }
    }
}
