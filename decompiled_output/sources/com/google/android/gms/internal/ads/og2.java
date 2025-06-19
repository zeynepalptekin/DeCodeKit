package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.fm0;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class og2 extends ah2 {
    public og2(jf2 jf2Var, String str, String str2, fm0.a.C0175a c0175a, int r12, int r13) {
        super(jf2Var, str, str2, c0175a, r12, 3);
    }

    @Override // com.google.android.gms.internal.ads.ah2
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        m92 m92Var = new m92((String) this.f.invoke(null, this.f2690b.a(), Boolean.valueOf(((Boolean) qx2.e().c(e0.H1)).booleanValue())));
        synchronized (this.e) {
            this.e.a0(m92Var.f4369b);
            this.e.O(m92Var.f4370c);
        }
    }
}
