package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class e31 implements c11<gi0, ye, p21> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f3213a;

    /* renamed from: b, reason: collision with root package name */
    private final hj0 f3214b;

    public e31(Context context, hj0 hj0Var) {
        this.f3213a = context;
        this.f3214b = hj0Var;
    }

    @Override // com.google.android.gms.internal.ads.c11
    public final /* synthetic */ gi0 a(wm1 wm1Var, km1 km1Var, w01 w01Var) throws k41, in1 {
        a31 a31Var = new a31(km1Var, (ye) w01Var.f5759b, false);
        ii0 ii0VarA = this.f3214b.a(new v70(wm1Var, km1Var, w01Var.f5758a), new hi0(a31Var));
        a31Var.b(ii0VarA.d());
        ((p21) w01Var.f5760c).z8(ii0VarA.g());
        return ii0VarA.j();
    }

    @Override // com.google.android.gms.internal.ads.c11
    public final void b(wm1 wm1Var, km1 km1Var, w01<ye, p21> w01Var) throws in1 {
        try {
            w01Var.f5759b.R3(km1Var.U);
            w01Var.f5759b.E5(km1Var.O, km1Var.u.toString(), wm1Var.f5857a.f5710a.d, c.a.b.b.e.e.i2(this.f3213a), new g31(this, w01Var), (wc) w01Var.f5760c);
        } catch (RemoteException e) {
            throw new in1(e);
        }
    }
}
