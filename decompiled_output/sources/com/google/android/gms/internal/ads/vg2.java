package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.internal.ads.fm0;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class vg2 extends ah2 {
    private final View i;

    public vg2(jf2 jf2Var, String str, String str2, fm0.a.C0175a c0175a, int r12, int r13, View view) {
        super(jf2Var, str, str2, c0175a, r12, 57);
        this.i = view;
    }

    @Override // com.google.android.gms.internal.ads.ah2
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        if (this.i != null) {
            Boolean bool = (Boolean) qx2.e().c(e0.T1);
            sf2 sf2Var = new sf2((String) this.f.invoke(null, this.i, this.f2690b.a().getResources().getDisplayMetrics(), bool));
            fm0.a.f.C0177a c0177aI = fm0.a.f.I();
            c0177aI.v(sf2Var.f5255b.longValue()).w(sf2Var.f5256c.longValue()).x(sf2Var.d.longValue());
            if (bool.booleanValue()) {
                c0177aI.z(sf2Var.e.longValue());
            }
            this.e.x((fm0.a.f) ((l92) c0177aI.P()));
        }
    }
}
