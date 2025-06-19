package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.d;

/* loaded from: classes.dex */
final class bu2 implements d.b {
    private final /* synthetic */ wt2 d;

    bu2(wt2 wt2Var) {
        this.d = wt2Var;
    }

    @Override // com.google.android.gms.common.internal.d.b
    public final void b(@androidx.annotation.h0 c.a.b.b.d.c cVar) {
        synchronized (this.d.f5892b) {
            this.d.e = null;
            if (this.d.f5893c != null) {
                wt2.f(this.d, null);
            }
            this.d.f5892b.notifyAll();
        }
    }
}
