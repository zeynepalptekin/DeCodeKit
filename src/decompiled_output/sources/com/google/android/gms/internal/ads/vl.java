package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class vl extends com.google.android.gms.ads.m0.a {

    /* renamed from: a, reason: collision with root package name */
    private final tk f5699a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f5700b;

    /* renamed from: c, reason: collision with root package name */
    private final tl f5701c = new tl();

    public vl(Context context, String str) {
        this.f5700b = context.getApplicationContext();
        this.f5699a = qx2.b().l(context, str, new rc());
    }

    @Override // com.google.android.gms.ads.m0.a
    public final Bundle a() {
        try {
            return this.f5699a.A();
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
            return new Bundle();
        }
    }

    @Override // com.google.android.gms.ads.m0.a
    @androidx.annotation.i0
    public final com.google.android.gms.ads.y b() {
        tz2 tz2VarO;
        try {
            tz2VarO = this.f5699a.o();
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
            tz2VarO = null;
        }
        return com.google.android.gms.ads.y.d(tz2VarO);
    }

    @Override // com.google.android.gms.ads.m0.a
    @androidx.annotation.h0
    public final com.google.android.gms.ads.l0.b c() {
        try {
            sk skVarB6 = this.f5699a.b6();
            if (skVarB6 != null) {
                return new il(skVarB6);
            }
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
        return com.google.android.gms.ads.l0.b.f2431a;
    }

    @Override // com.google.android.gms.ads.m0.a
    public final void f(@androidx.annotation.i0 com.google.android.gms.ads.k kVar) {
        this.f5701c.y8(kVar);
    }

    @Override // com.google.android.gms.ads.m0.a
    public final void g(com.google.android.gms.ads.l0.a aVar) {
        try {
            this.f5699a.I6(new e(aVar));
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.m0.a
    public final void h(@androidx.annotation.i0 com.google.android.gms.ads.u uVar) {
        try {
            this.f5699a.q0(new d(uVar));
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.m0.a
    public final void i(com.google.android.gms.ads.l0.f fVar) {
        try {
            this.f5699a.w8(new pl(fVar));
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.m0.a
    public final void j(@androidx.annotation.i0 Activity activity, @androidx.annotation.h0 com.google.android.gms.ads.v vVar) {
        this.f5701c.z8(vVar);
        try {
            this.f5699a.h6(this.f5701c);
            this.f5699a.G5(c.a.b.b.e.e.i2(activity));
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    public final void k(c03 c03Var, com.google.android.gms.ads.m0.b bVar) {
        try {
            this.f5699a.o8(ow2.b(this.f5700b, c03Var), new sl(bVar, this));
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }
}
