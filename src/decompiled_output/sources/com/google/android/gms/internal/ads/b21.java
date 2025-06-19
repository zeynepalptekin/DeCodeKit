package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;

/* loaded from: classes.dex */
public final class b21 implements c11<e50, ye, p21> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f2780a;

    /* renamed from: b, reason: collision with root package name */
    private final b60 f2781b;

    /* renamed from: c, reason: collision with root package name */
    private View f2782c;

    public b21(Context context, b60 b60Var) {
        this.f2780a = context;
        this.f2781b = b60Var;
    }

    static final /* synthetic */ uz2 d(w01 w01Var) throws in1 {
        try {
            return ((ye) w01Var.f5759b).getVideoController();
        } catch (RemoteException e) {
            throw new in1(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.c11
    public final /* synthetic */ e50 a(wm1 wm1Var, km1 km1Var, final w01 w01Var) throws k41, in1 {
        d50 d50VarA = this.f2781b.a(new v70(wm1Var, km1Var, w01Var.f5758a), new h50(this.f2782c, null, new b70(w01Var) { // from class: com.google.android.gms.internal.ads.a21

            /* renamed from: a, reason: collision with root package name */
            private final w01 f2621a;

            {
                this.f2621a = w01Var;
            }

            @Override // com.google.android.gms.internal.ads.b70
            public final uz2 getVideoController() {
                return b21.d(this.f2621a);
            }
        }, km1Var.t.get(0)));
        d50VarA.j().H0(this.f2782c);
        ((p21) w01Var.f5760c).z8(d50VarA.g());
        return d50VarA.i();
    }

    @Override // com.google.android.gms.internal.ads.c11
    public final void b(wm1 wm1Var, km1 km1Var, w01<ye, p21> w01Var) throws in1 {
        try {
            w01Var.f5759b.R3(km1Var.U);
            w01Var.f5759b.i3(km1Var.O, km1Var.u.toString(), wm1Var.f5857a.f5710a.d, c.a.b.b.e.e.i2(this.f2780a), new c21(this, w01Var), (wc) w01Var.f5760c, wm1Var.f5857a.f5710a.e);
        } catch (RemoteException e) {
            throw new in1(e);
        }
    }
}
