package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;

/* loaded from: classes.dex */
public final class x0 implements com.google.android.gms.ads.c0.b {

    /* renamed from: a, reason: collision with root package name */
    private final w0 f5905a;

    public x0(w0 w0Var) {
        this.f5905a = w0Var;
    }

    @Override // com.google.android.gms.ads.c0.b
    public final String G1() {
        try {
            return this.f5905a.G1();
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.c0.b
    public final String H1() {
        try {
            return this.f5905a.u3();
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.c0.b
    public final void I1(View view) {
        try {
            this.f5905a.W4(view != null ? c.a.b.b.e.e.i2(view) : null);
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.c0.b
    public final void g() {
        try {
            this.f5905a.g();
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.c0.b
    public final void g1() {
        try {
            this.f5905a.g1();
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }
}
