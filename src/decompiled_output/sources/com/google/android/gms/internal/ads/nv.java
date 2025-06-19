package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class nv extends ko {
    final zt d;
    final sv e;
    private final String f;
    private final String[] g;

    nv(zt ztVar, sv svVar, String str, String[] strArr) {
        this.d = ztVar;
        this.e = svVar;
        this.f = str;
        this.g = strArr;
        com.google.android.gms.ads.internal.p.y().c(this);
    }

    @Override // com.google.android.gms.internal.ads.ko
    public final void b() {
        try {
            this.e.v(this.f, this.g);
        } finally {
            to.h.post(new qv(this));
        }
    }
}
