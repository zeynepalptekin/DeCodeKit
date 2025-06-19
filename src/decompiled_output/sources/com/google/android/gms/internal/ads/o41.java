package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class o41 implements c11<qq0, rn1, p21> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f4643a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f4644b;

    /* renamed from: c, reason: collision with root package name */
    private final tq0 f4645c;

    public o41(Context context, Executor executor, tq0 tq0Var) {
        this.f4643a = context;
        this.f4644b = executor;
        this.f4645c = tq0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.c11
    public final /* synthetic */ qq0 a(wm1 wm1Var, km1 km1Var, final w01 w01Var) throws k41, in1 {
        sq0 sq0VarE = this.f4645c.e(new v70(wm1Var, km1Var, w01Var.f5758a), new rq0(new pj0(w01Var) { // from class: com.google.android.gms.internal.ads.r41

            /* renamed from: a, reason: collision with root package name */
            private final w01 f5100a;

            {
                this.f5100a = w01Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.internal.ads.pj0
            public final void a(boolean z, Context context) throws oj0 {
                w01 w01Var2 = this.f5100a;
                try {
                    ((rn1) w01Var2.f5759b).h(z);
                    ((rn1) w01Var2.f5759b).v(context);
                } catch (in1 e) {
                    throw new oj0(e.getCause());
                }
            }
        }));
        sq0VarE.a().F0(new r20((rn1) w01Var.f5759b), this.f4644b);
        ((p21) w01Var.f5760c).z8(sq0VarE.m());
        return sq0VarE.k();
    }

    @Override // com.google.android.gms.internal.ads.c11
    public final void b(wm1 wm1Var, km1 km1Var, w01<rn1, p21> w01Var) throws in1 {
        try {
            an1 an1Var = wm1Var.f5857a.f5710a;
            if (an1Var.n.f5161a == sm1.f5282c) {
                w01Var.f5759b.u(this.f4643a, an1Var.d, km1Var.u.toString(), (wc) w01Var.f5760c);
            } else {
                w01Var.f5759b.t(this.f4643a, an1Var.d, km1Var.u.toString(), (wc) w01Var.f5760c);
            }
        } catch (Exception e) {
            String strValueOf = String.valueOf(w01Var.f5758a);
            tr.d(strValueOf.length() != 0 ? "Fail to load ad from adapter ".concat(strValueOf) : new String("Fail to load ad from adapter "), e);
        }
    }
}
