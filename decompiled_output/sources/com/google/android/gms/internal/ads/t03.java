package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class t03 implements com.google.android.gms.ads.o {

    /* renamed from: a, reason: collision with root package name */
    private final e3 f5330a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.ads.z f5331b = new com.google.android.gms.ads.z();

    public t03(e3 e3Var) {
        this.f5330a = e3Var;
    }

    @Override // com.google.android.gms.ads.o
    public final float M() {
        try {
            return this.f5330a.M();
        } catch (RemoteException e) {
            tr.c("", e);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.ads.o
    public final float X() {
        try {
            return this.f5330a.X();
        } catch (RemoteException e) {
            tr.c("", e);
            return 0.0f;
        }
    }

    public final e3 a() {
        return this.f5330a;
    }

    @Override // com.google.android.gms.ads.o
    public final float d0() {
        try {
            return this.f5330a.d0();
        } catch (RemoteException e) {
            tr.c("", e);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.ads.o
    public final boolean f1() {
        try {
            return this.f5330a.f1();
        } catch (RemoteException e) {
            tr.c("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.o
    public final Drawable g1() {
        try {
            c.a.b.b.e.c cVarU7 = this.f5330a.U7();
            if (cVarU7 != null) {
                return (Drawable) c.a.b.b.e.e.e2(cVarU7);
            }
            return null;
        } catch (RemoteException e) {
            tr.c("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.o
    public final com.google.android.gms.ads.z getVideoController() {
        try {
            if (this.f5330a.getVideoController() != null) {
                this.f5331b.o(this.f5330a.getVideoController());
            }
        } catch (RemoteException e) {
            tr.c("Exception occurred while getting video controller", e);
        }
        return this.f5331b;
    }

    @Override // com.google.android.gms.ads.o
    public final void h1(Drawable drawable) {
        try {
            this.f5330a.w3(c.a.b.b.e.e.i2(drawable));
        } catch (RemoteException e) {
            tr.c("", e);
        }
    }
}
