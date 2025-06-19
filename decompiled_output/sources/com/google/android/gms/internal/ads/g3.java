package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.d0.k;

/* loaded from: classes.dex */
public final class g3 implements k.a {

    /* renamed from: a, reason: collision with root package name */
    private final h4 f3493a;

    public g3(h4 h4Var) {
        this.f3493a = h4Var;
        try {
            h4Var.p5();
        } catch (RemoteException e) {
            tr.c("", e);
        }
    }

    @Override // com.google.android.gms.ads.d0.k.a
    public final void a(View view) {
        try {
            this.f3493a.L6(c.a.b.b.e.e.i2(view));
        } catch (RemoteException e) {
            tr.c("", e);
        }
    }

    @Override // com.google.android.gms.ads.d0.k.a
    public final boolean start() {
        try {
            return this.f3493a.e7();
        } catch (RemoteException e) {
            tr.c("", e);
            return false;
        }
    }
}
