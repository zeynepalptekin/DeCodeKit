package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.d;

/* loaded from: classes.dex */
final class xt2 implements d.a {
    private final /* synthetic */ wt2 d;

    xt2(wt2 wt2Var) {
        this.d = wt2Var;
    }

    @Override // com.google.android.gms.common.internal.d.a
    public final void a(int r3) {
        synchronized (this.d.f5892b) {
            this.d.e = null;
            this.d.f5892b.notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.d.a
    public final void c(@androidx.annotation.i0 Bundle bundle) {
        synchronized (this.d.f5892b) {
            try {
            } catch (DeadObjectException e) {
                tr.c("Unable to obtain a cache service instance.", e);
                this.d.b();
            }
            if (this.d.f5893c != null) {
                this.d.e = this.d.f5893c.m0();
                this.d.f5892b.notifyAll();
            } else {
                this.d.f5892b.notifyAll();
            }
        }
    }
}
