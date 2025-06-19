package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class r31 implements c11<bl0, ye, p21> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f5096a;

    /* renamed from: b, reason: collision with root package name */
    private final ek0 f5097b;

    /* renamed from: c, reason: collision with root package name */
    private jd f5098c;

    public r31(Context context, ek0 ek0Var) {
        this.f5096a = context;
        this.f5097b = ek0Var;
    }

    @Override // com.google.android.gms.internal.ads.c11
    public final /* synthetic */ bl0 a(wm1 wm1Var, km1 km1Var, w01 w01Var) throws k41, in1 {
        if (!wm1Var.f5857a.f5710a.g.contains(Integer.toString(6))) {
            throw new k41(xn1.INVALID_REQUEST, "Unified must be used for RTB.");
        }
        nl0 nl0VarP = nl0.P(this.f5098c);
        if (!wm1Var.f5857a.f5710a.g.contains(Integer.toString(nl0VarP.A()))) {
            throw new k41(xn1.INTERNAL_ERROR, "No corresponding native ad listener");
        }
        ol0 ol0VarA = this.f5097b.a(new v70(wm1Var, km1Var, w01Var.f5758a), new zl0(nl0VarP), new mn0(null, null, this.f5098c));
        ((p21) w01Var.f5760c).z8(ol0VarA.g());
        return ol0VarA.h();
    }

    @Override // com.google.android.gms.internal.ads.c11
    public final void b(wm1 wm1Var, km1 km1Var, w01<ye, p21> w01Var) throws in1 {
        try {
            w01Var.f5759b.R3(km1Var.U);
            w01Var.f5759b.f7(km1Var.O, km1Var.u.toString(), wm1Var.f5857a.f5710a.d, c.a.b.b.e.e.i2(this.f5096a), new t31(this, w01Var), (wc) w01Var.f5760c);
        } catch (RemoteException e) {
            throw new in1(e);
        }
    }
}
