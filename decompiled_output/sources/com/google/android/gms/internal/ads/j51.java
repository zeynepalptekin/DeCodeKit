package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class j51 implements c11<qq0, rn1, o21> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f3916a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f3917b;

    /* renamed from: c, reason: collision with root package name */
    private final tq0 f3918c;

    public j51(Context context, Executor executor, tq0 tq0Var) {
        this.f3916a = context;
        this.f3917b = executor;
        this.f3918c = tq0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(wm1 wm1Var, km1 km1Var, w01<rn1, o21> w01Var) {
        try {
            w01Var.f5759b.s(wm1Var.f5857a.f5710a.d, km1Var.u.toString());
        } catch (Exception e) {
            String strValueOf = String.valueOf(w01Var.f5758a);
            tr.d(strValueOf.length() != 0 ? "Fail to load ad from adapter ".concat(strValueOf) : new String("Fail to load ad from adapter "), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.c11
    public final /* synthetic */ qq0 a(wm1 wm1Var, km1 km1Var, final w01 w01Var) throws k41, in1 {
        sq0 sq0VarE = this.f3918c.e(new v70(wm1Var, km1Var, w01Var.f5758a), new rq0(new pj0(w01Var) { // from class: com.google.android.gms.internal.ads.m51

            /* renamed from: a, reason: collision with root package name */
            private final w01 f4348a;

            {
                this.f4348a = w01Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.internal.ads.pj0
            public final void a(boolean z, Context context) throws oj0 {
                w01 w01Var2 = this.f4348a;
                try {
                    ((rn1) w01Var2.f5759b).h(z);
                    ((rn1) w01Var2.f5759b).j();
                } catch (in1 e) {
                    tr.d("Cannot show rewarded video.", e);
                    throw new oj0(e.getCause());
                }
            }
        }));
        sq0VarE.a().F0(new r20((rn1) w01Var.f5759b), this.f3917b);
        cc0 cc0VarB = sq0VarE.b();
        wa0 wa0VarC = sq0VarE.c();
        ((o21) w01Var.f5760c).z8(new n51(this, sq0VarE.j(), wa0VarC, cc0VarB, sq0VarE.l()));
        return sq0VarE.k();
    }

    @Override // com.google.android.gms.internal.ads.c11
    public final void b(wm1 wm1Var, km1 km1Var, w01<rn1, o21> w01Var) throws in1 {
        if (w01Var.f5759b.d()) {
            e(wm1Var, km1Var, w01Var);
            return;
        }
        ((o21) w01Var.f5760c).A8(new l51(this, wm1Var, km1Var, w01Var));
        w01Var.f5759b.n(this.f3916a, wm1Var.f5857a.f5710a.d, null, (mk) w01Var.f5760c, km1Var.u.toString());
    }
}
