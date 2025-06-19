package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class w11 implements c11<e50, rn1, p21> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f5767a;

    /* renamed from: b, reason: collision with root package name */
    private final as f5768b;

    /* renamed from: c, reason: collision with root package name */
    private final b60 f5769c;
    private final Executor d;

    public w11(Context context, as asVar, b60 b60Var, Executor executor) {
        this.f5767a = context;
        this.f5768b = asVar;
        this.f5769c = b60Var;
        this.d = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.c11
    public final /* synthetic */ e50 a(wm1 wm1Var, km1 km1Var, w01 w01Var) throws k41, in1 {
        b60 b60Var = this.f5769c;
        v70 v70Var = new v70(wm1Var, km1Var, w01Var.f5758a);
        View viewC = ((rn1) w01Var.f5759b).c();
        rn1 rn1Var = (rn1) w01Var.f5759b;
        rn1Var.getClass();
        d50 d50VarA = b60Var.a(v70Var, new h50(viewC, null, z11.a(rn1Var), km1Var.t.get(0)));
        d50VarA.j().H0(((rn1) w01Var.f5759b).c());
        d50VarA.a().F0(new r20((rn1) w01Var.f5759b), this.d);
        ((p21) w01Var.f5760c).z8(d50VarA.f());
        return d50VarA.i();
    }

    @Override // com.google.android.gms.internal.ads.c11
    public final void b(wm1 wm1Var, km1 km1Var, w01<rn1, p21> w01Var) throws in1 {
        qw2 qw2Var = wm1Var.f5857a.f5710a.e;
        qw2 qw2Var2 = qw2Var.q ? new qw2(this.f5767a, com.google.android.gms.ads.p0.a(qw2Var.h, qw2Var.e)) : gn1.b(this.f5767a, km1Var.t);
        if (this.f5768b.f < 4100000) {
            w01Var.f5759b.q(this.f5767a, qw2Var2, wm1Var.f5857a.f5710a.d, km1Var.u.toString(), (wc) w01Var.f5760c);
        } else {
            w01Var.f5759b.r(this.f5767a, qw2Var2, wm1Var.f5857a.f5710a.d, km1Var.u.toString(), qq.a(km1Var.r), (wc) w01Var.f5760c);
        }
    }
}
