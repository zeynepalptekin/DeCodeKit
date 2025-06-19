package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class t41 implements c11<qq0, ye, p21> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f5340a;

    /* renamed from: b, reason: collision with root package name */
    private final tq0 f5341b;

    public t41(Context context, tq0 tq0Var) {
        this.f5340a = context;
        this.f5341b = tq0Var;
    }

    @Override // com.google.android.gms.internal.ads.c11
    public final /* synthetic */ qq0 a(wm1 wm1Var, km1 km1Var, w01 w01Var) throws k41, in1 {
        a31 a31Var = new a31(km1Var, (ye) w01Var.f5759b, true);
        sq0 sq0VarE = this.f5341b.e(new v70(wm1Var, km1Var, w01Var.f5758a), new rq0(a31Var));
        a31Var.b(sq0VarE.d());
        ((p21) w01Var.f5760c).z8(sq0VarE.n());
        return sq0VarE.k();
    }

    @Override // com.google.android.gms.internal.ads.c11
    public final void b(wm1 wm1Var, km1 km1Var, w01<ye, p21> w01Var) throws in1 {
        try {
            w01Var.f5759b.R3(km1Var.U);
            if (wm1Var.f5857a.f5710a.n.f5161a == sm1.f5282c) {
                w01Var.f5759b.T3(km1Var.O, km1Var.u.toString(), wm1Var.f5857a.f5710a.d, c.a.b.b.e.e.i2(this.f5340a), new v41(this, w01Var), (wc) w01Var.f5760c);
            } else {
                w01Var.f5759b.m2(km1Var.O, km1Var.u.toString(), wm1Var.f5857a.f5710a.d, c.a.b.b.e.e.i2(this.f5340a), new v41(this, w01Var), (wc) w01Var.f5760c);
            }
        } catch (RemoteException e) {
            oo.l("Remote exception loading a rewarded RTB ad", e);
        }
    }
}
