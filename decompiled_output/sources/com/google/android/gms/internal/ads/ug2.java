package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.fm0;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class ug2 extends ah2 {
    private final vf2 i;
    private long j;

    public ug2(jf2 jf2Var, String str, String str2, fm0.a.C0175a c0175a, int r12, int r13, vf2 vf2Var) {
        super(jf2Var, str, str2, c0175a, r12, 53);
        this.i = vf2Var;
        if (vf2Var != null) {
            this.j = vf2Var.e();
        }
    }

    @Override // com.google.android.gms.internal.ads.ah2
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        if (this.i != null) {
            this.e.M(((Long) this.f.invoke(null, Long.valueOf(this.j))).longValue());
        }
    }
}
