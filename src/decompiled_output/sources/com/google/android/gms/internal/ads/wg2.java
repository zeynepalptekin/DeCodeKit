package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.fm0;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class wg2 extends ah2 {
    public wg2(jf2 jf2Var, String str, String str2, fm0.a.C0175a c0175a, int r12, int r13) {
        super(jf2Var, str, str2, c0175a, r12, 48);
    }

    @Override // com.google.android.gms.internal.ads.ah2
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        fm0.a.C0175a c0175a;
        nu0 nu0Var;
        this.e.z(nu0.ENUM_FAILURE);
        boolean zBooleanValue = ((Boolean) this.f.invoke(null, this.f2690b.a())).booleanValue();
        synchronized (this.e) {
            if (zBooleanValue) {
                c0175a = this.e;
                nu0Var = nu0.ENUM_TRUE;
            } else {
                c0175a = this.e;
                nu0Var = nu0.ENUM_FALSE;
            }
            c0175a.z(nu0Var);
        }
    }
}
