package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.fm0;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class rg2 extends ah2 {
    public rg2(jf2 jf2Var, String str, String str2, fm0.a.C0175a c0175a, int r12, int r13) {
        super(jf2Var, str, str2, c0175a, r12, 51);
    }

    @Override // com.google.android.gms.internal.ads.ah2
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        synchronized (this.e) {
            kf2 kf2Var = new kf2((String) this.f.invoke(null, new Object[0]));
            this.e.J(kf2Var.f4088b.longValue());
            this.e.L(kf2Var.f4089c.longValue());
        }
    }
}
