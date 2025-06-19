package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class jl {

    /* renamed from: a, reason: collision with root package name */
    private final tk f3985a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f3986b;

    public jl(Context context, String str) {
        this.f3986b = context.getApplicationContext();
        this.f3985a = qx2.b().l(context, str, new rc());
    }

    public final Bundle a() {
        try {
            return this.f3985a.A();
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
            return new Bundle();
        }
    }

    public final String b() {
        try {
            return this.f3985a.e();
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
            return "";
        }
    }

    @androidx.annotation.i0
    public final com.google.android.gms.ads.y c() {
        tz2 tz2VarO;
        try {
            tz2VarO = this.f3985a.o();
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
            tz2VarO = null;
        }
        return com.google.android.gms.ads.y.d(tz2VarO);
    }

    @androidx.annotation.i0
    public final com.google.android.gms.ads.l0.b d() {
        try {
            sk skVarB6 = this.f3985a.b6();
            if (skVarB6 == null) {
                return null;
            }
            return new il(skVarB6);
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
            return null;
        }
    }

    public final boolean e() {
        try {
            return this.f3985a.W();
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
            return false;
        }
    }

    public final void f(com.google.android.gms.ads.l0.a aVar) {
        try {
            this.f3985a.I6(new e(aVar));
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    public final void g(@androidx.annotation.i0 com.google.android.gms.ads.u uVar) {
        try {
            this.f3985a.q0(new d(uVar));
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    public final void h(com.google.android.gms.ads.l0.f fVar) {
        try {
            this.f3985a.w8(new pl(fVar));
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    public final void i(Activity activity, com.google.android.gms.ads.l0.d dVar) {
        try {
            this.f3985a.h6(new ll(dVar));
            this.f3985a.G5(c.a.b.b.e.e.i2(activity));
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    public final void j(Activity activity, com.google.android.gms.ads.l0.d dVar, boolean z) {
        try {
            this.f3985a.h6(new ll(dVar));
            this.f3985a.r8(c.a.b.b.e.e.i2(activity), z);
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }

    public final void k(c03 c03Var, com.google.android.gms.ads.l0.e eVar) {
        try {
            this.f3985a.v5(ow2.b(this.f3986b, c03Var), new ml(eVar));
        } catch (RemoteException e) {
            tr.e("#007 Could not call remote method.", e);
        }
    }
}
