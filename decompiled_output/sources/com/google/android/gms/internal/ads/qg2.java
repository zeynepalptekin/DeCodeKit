package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.fm0;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* loaded from: classes.dex */
public final class qg2 extends ah2 {
    private List<Long> i;

    public qg2(jf2 jf2Var, String str, String str2, fm0.a.C0175a c0175a, int r12, int r13) {
        super(jf2Var, str, str2, c0175a, r12, 31);
        this.i = null;
    }

    @Override // com.google.android.gms.internal.ads.ah2
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        this.e.n0(-1L);
        this.e.o0(-1L);
        if (this.i == null) {
            this.i = (List) this.f.invoke(null, this.f2690b.a());
        }
        List<Long> list = this.i;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (this.e) {
            this.e.n0(this.i.get(0).longValue());
            this.e.o0(this.i.get(1).longValue());
        }
    }
}
