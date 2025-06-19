package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class w8 extends com.google.android.gms.ads.h0.a {

    /* renamed from: a, reason: collision with root package name */
    private final p8 f5801a;

    /* renamed from: b, reason: collision with root package name */
    private com.google.android.gms.ads.z f5802b = j();

    /* renamed from: c, reason: collision with root package name */
    private com.google.android.gms.ads.o f5803c = k();

    public w8(p8 p8Var) {
        this.f5801a = p8Var;
    }

    private final com.google.android.gms.ads.z j() {
        com.google.android.gms.ads.z zVar = new com.google.android.gms.ads.z();
        try {
            zVar.o(this.f5801a.getVideoController());
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
        return zVar;
    }

    private final com.google.android.gms.ads.o k() {
        try {
            if (this.f5801a.B1() != null) {
                return new t03(this.f5801a.B1());
            }
            return null;
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.h0.a
    public final void a() {
        try {
            this.f5801a.destroy();
            this.f5802b = null;
            this.f5803c = null;
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.h0.a
    public final float b() {
        com.google.android.gms.ads.z zVar = this.f5802b;
        if (zVar == null) {
            return 0.0f;
        }
        return zVar.a();
    }

    @Override // com.google.android.gms.ads.h0.a
    public final com.google.android.gms.ads.o c() {
        return this.f5803c;
    }

    @Override // com.google.android.gms.ads.h0.a
    public final com.google.android.gms.ads.z d() {
        return this.f5802b;
    }

    @Override // com.google.android.gms.ads.h0.a
    public final float e() {
        com.google.android.gms.ads.z zVar = this.f5802b;
        if (zVar == null) {
            return 0.0f;
        }
        return zVar.c();
    }

    @Override // com.google.android.gms.ads.h0.a
    public final float f() {
        com.google.android.gms.ads.z zVar = this.f5802b;
        if (zVar == null) {
            return 0.0f;
        }
        return zVar.d();
    }

    @Override // com.google.android.gms.ads.h0.a
    public final void i(com.google.android.gms.ads.h0.b bVar) {
        if (bVar == null) {
            tr.g("showInView: parameter view must not be null.");
            return;
        }
        try {
            this.f5801a.H3(c.a.b.b.e.e.i2(bVar));
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }
}
