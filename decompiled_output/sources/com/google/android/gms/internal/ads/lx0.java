package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.common.internal.d;
import java.io.InputStream;

/* loaded from: classes.dex */
public abstract class lx0 implements d.a, d.b {
    protected final ks<InputStream> d = new ks<>();
    protected final Object e = new Object();
    protected boolean f = false;
    protected boolean g = false;
    protected wi h;

    @androidx.annotation.u("mLock")
    @androidx.annotation.x0(otherwise = 3)
    protected di i;

    @Override // com.google.android.gms.common.internal.d.a
    public void a(int r1) {
        tr.f("Cannot connect to remote service, fallback to local instance.");
    }

    public void b(@androidx.annotation.h0 c.a.b.b.d.c cVar) {
        tr.f("Disconnected from remote ad request service.");
        this.d.b(new dy0(xn1.INTERNAL_ERROR));
    }

    protected final void d() {
        synchronized (this.e) {
            this.g = true;
            if (this.i.D() || this.i.E()) {
                this.i.e();
            }
            Binder.flushPendingCommands();
        }
    }
}
