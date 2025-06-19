package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class pv implements Iterable<nv> {
    private final List<nv> d = new ArrayList();

    public static boolean i(zt ztVar) {
        nv nvVarJ = j(ztVar);
        if (nvVarJ == null) {
            return false;
        }
        nvVarJ.e.h();
        return true;
    }

    static nv j(zt ztVar) {
        Iterator<nv> it = com.google.android.gms.ads.internal.p.y().iterator();
        while (it.hasNext()) {
            nv next = it.next();
            if (next.d == ztVar) {
                return next;
            }
        }
        return null;
    }

    public final void c(nv nvVar) {
        this.d.add(nvVar);
    }

    public final void h(nv nvVar) {
        this.d.remove(nvVar);
    }

    @Override // java.lang.Iterable
    public final Iterator<nv> iterator() {
        return this.d.iterator();
    }
}
