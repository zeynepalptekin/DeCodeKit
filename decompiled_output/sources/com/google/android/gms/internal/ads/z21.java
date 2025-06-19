package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class z21 implements c11<gi0, rn1, p21> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f6212a;

    /* renamed from: b, reason: collision with root package name */
    private final hj0 f6213b;

    /* renamed from: c, reason: collision with root package name */
    private final as f6214c;
    private final Executor d;

    public z21(Context context, as asVar, hj0 hj0Var, Executor executor) {
        this.f6212a = context;
        this.f6214c = asVar;
        this.f6213b = hj0Var;
        this.d = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.c11
    public final /* synthetic */ gi0 a(wm1 wm1Var, km1 km1Var, final w01 w01Var) throws k41, in1 {
        ii0 ii0VarA = this.f6213b.a(new v70(wm1Var, km1Var, w01Var.f5758a), new hi0(new pj0(w01Var) { // from class: com.google.android.gms.internal.ads.c31

            /* renamed from: a, reason: collision with root package name */
            private final w01 f2918a;

            {
                this.f2918a = w01Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.internal.ads.pj0
            public final void a(boolean z, Context context) throws oj0 {
                w01 w01Var2 = this.f2918a;
                try {
                    ((rn1) w01Var2.f5759b).h(z);
                    ((rn1) w01Var2.f5759b).i();
                } catch (in1 e) {
                    tr.h("Cannot show interstitial.");
                    throw new oj0(e.getCause());
                }
            }
        }));
        ii0VarA.a().F0(new r20((rn1) w01Var.f5759b), this.d);
        ((p21) w01Var.f5760c).z8(ii0VarA.f());
        return ii0VarA.j();
    }

    @Override // com.google.android.gms.internal.ads.c11
    public final void b(wm1 wm1Var, km1 km1Var, w01<rn1, p21> w01Var) throws in1 {
        if (this.f6214c.f < 4100000) {
            w01Var.f5759b.m(this.f6212a, wm1Var.f5857a.f5710a.d, km1Var.u.toString(), (wc) w01Var.f5760c);
        } else {
            w01Var.f5759b.o(this.f6212a, wm1Var.f5857a.f5710a.d, km1Var.u.toString(), qq.a(km1Var.r), (wc) w01Var.f5760c);
        }
    }
}
