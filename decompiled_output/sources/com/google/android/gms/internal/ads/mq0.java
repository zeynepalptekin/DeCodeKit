package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.z;

/* loaded from: classes.dex */
public final class mq0 extends z.a {

    /* renamed from: a, reason: collision with root package name */
    private final nl0 f4440a;

    public mq0(nl0 nl0Var) {
        this.f4440a = nl0Var;
    }

    private static zz2 f(nl0 nl0Var) {
        uz2 uz2VarN = nl0Var.n();
        if (uz2VarN == null) {
            return null;
        }
        try {
            return uz2VarN.I5();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.ads.z.a
    public final void a() {
        zz2 zz2VarF = f(this.f4440a);
        if (zz2VarF == null) {
            return;
        }
        try {
            zz2VarF.D1();
        } catch (RemoteException e) {
            tr.d("Unable to call onVideoEnd()", e);
        }
    }

    @Override // com.google.android.gms.ads.z.a
    public final void c() {
        zz2 zz2VarF = f(this.f4440a);
        if (zz2VarF == null) {
            return;
        }
        try {
            zz2VarF.g0();
        } catch (RemoteException e) {
            tr.d("Unable to call onVideoEnd()", e);
        }
    }

    @Override // com.google.android.gms.ads.z.a
    public final void e() {
        zz2 zz2VarF = f(this.f4440a);
        if (zz2VarF == null) {
            return;
        }
        try {
            zz2VarF.O0();
        } catch (RemoteException e) {
            tr.d("Unable to call onVideoEnd()", e);
        }
    }
}
