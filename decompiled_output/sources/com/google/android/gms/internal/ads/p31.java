package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class p31 implements c11<bl0, rn1, p21> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f4779a;

    /* renamed from: b, reason: collision with root package name */
    private final ek0 f4780b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f4781c;

    public p31(Context context, ek0 ek0Var, Executor executor) {
        this.f4779a = context;
        this.f4780b = ek0Var;
        this.f4781c = executor;
    }

    private static boolean c(wm1 wm1Var, int r1) {
        return wm1Var.f5857a.f5710a.g.contains(Integer.toString(r1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.c11
    public final /* synthetic */ bl0 a(wm1 wm1Var, km1 km1Var, w01 w01Var) throws k41, in1 {
        nl0 nl0VarT;
        dd ddVarW = ((rn1) w01Var.f5759b).w();
        ed edVarX = ((rn1) w01Var.f5759b).x();
        jd jdVarZ = ((rn1) w01Var.f5759b).z();
        if (jdVarZ != null && c(wm1Var, 6)) {
            nl0VarT = nl0.P(jdVarZ);
        } else if (ddVarW != null && c(wm1Var, 6)) {
            nl0VarT = nl0.N(ddVarW);
        } else if (ddVarW != null && c(wm1Var, 2)) {
            nl0VarT = nl0.s(ddVarW);
        } else if (edVarX != null && c(wm1Var, 6)) {
            nl0VarT = nl0.O(edVarX);
        } else {
            if (edVarX == null || !c(wm1Var, 1)) {
                throw new k41(xn1.INTERNAL_ERROR, "No native ad mappers");
            }
            nl0VarT = nl0.t(edVarX);
        }
        if (!wm1Var.f5857a.f5710a.g.contains(Integer.toString(nl0VarT.A()))) {
            throw new k41(xn1.INTERNAL_ERROR, "No corresponding native ad listener");
        }
        ol0 ol0VarA = this.f4780b.a(new v70(wm1Var, km1Var, w01Var.f5758a), new zl0(nl0VarT), new mn0(edVarX, ddVarW, jdVarZ));
        ((p21) w01Var.f5760c).z8(ol0VarA.f());
        ol0VarA.a().F0(new r20((rn1) w01Var.f5759b), this.f4781c);
        return ol0VarA.h();
    }

    @Override // com.google.android.gms.internal.ads.c11
    public final void b(wm1 wm1Var, km1 km1Var, w01<rn1, p21> w01Var) throws in1 {
        rn1 rn1Var = w01Var.f5759b;
        Context context = this.f4779a;
        jw2 jw2Var = wm1Var.f5857a.f5710a.d;
        String string = km1Var.u.toString();
        String strA = qq.a(km1Var.r);
        wc wcVar = (wc) w01Var.f5760c;
        an1 an1Var = wm1Var.f5857a.f5710a;
        rn1Var.p(context, jw2Var, string, strA, wcVar, an1Var.i, an1Var.g);
    }
}
