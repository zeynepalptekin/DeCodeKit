package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class r71 implements com.google.android.gms.ads.c0.a {

    @GuardedBy("this")
    private py2 d;

    @Override // com.google.android.gms.ads.c0.a
    public final synchronized void Q(String str, String str2) {
        if (this.d != null) {
            try {
                this.d.Q(str, str2);
            } catch (RemoteException e) {
                tr.d("Remote Exception at onAppEvent.", e);
            }
        }
    }

    public final synchronized py2 a() {
        return this.d;
    }

    public final synchronized void b(py2 py2Var) {
        this.d = py2Var;
    }
}
