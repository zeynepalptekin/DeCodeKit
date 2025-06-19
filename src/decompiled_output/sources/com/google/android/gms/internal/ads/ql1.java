package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.ia0;
import com.google.android.gms.internal.ads.qf0;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class ql1 implements g81<qq0> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f5033a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f5034b;

    /* renamed from: c, reason: collision with root package name */
    private final gz f5035c;
    private final qk1 d;
    private final ik1<tq0, qq0> e;
    private final zm1 f;

    @GuardedBy("this")
    private final cn1 g;

    @GuardedBy("this")
    private dy1<qq0> h;

    public ql1(Context context, Executor executor, gz gzVar, ik1<tq0, qq0> ik1Var, qk1 qk1Var, cn1 cn1Var, zm1 zm1Var) {
        this.f5033a = context;
        this.f5034b = executor;
        this.f5035c = gzVar;
        this.e = ik1Var;
        this.d = qk1Var;
        this.g = cn1Var;
        this.f = zm1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final wq0 g(hk1 hk1Var) {
        wq0 wq0VarN;
        qf0.a aVarK;
        wl1 wl1Var = (wl1) hk1Var;
        if (((Boolean) qx2.e().c(e0.n5)).booleanValue()) {
            wq0VarN = this.f5035c.r().n(new ia0.a().g(this.f5033a).c(wl1Var.f5850a).k(wl1Var.f5851b).b(this.f).d());
            aVarK = new qf0.a();
        } else {
            qk1 qk1VarG = qk1.g(this.d);
            wq0VarN = this.f5035c.r().n(new ia0.a().g(this.f5033a).c(wl1Var.f5850a).k(wl1Var.f5851b).b(this.f).d());
            aVarK = new qf0.a().d(qk1VarG, this.f5034b).h(qk1VarG, this.f5034b).e(qk1VarG, this.f5034b).c(qk1VarG, this.f5034b).f(qk1VarG, this.f5034b).j(qk1VarG, this.f5034b).k(qk1VarG);
        }
        return wq0VarN.u(aVarK.o());
    }

    @Override // com.google.android.gms.internal.ads.g81
    public final boolean Y() {
        dy1<qq0> dy1Var = this.h;
        return (dy1Var == null || dy1Var.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.g81
    public final boolean Z(jw2 jw2Var, String str, f81 f81Var, i81<? super qq0> i81Var) throws RemoteException {
        hk hkVar = new hk(jw2Var, str);
        rl1 rl1Var = null;
        String str2 = f81Var instanceof ml1 ? ((ml1) f81Var).f4426a : null;
        if (hkVar.e == null) {
            tr.g("Ad unit ID should not be null for rewarded video ad.");
            this.f5034b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.pl1
                private final ql1 d;

                {
                    this.d = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.d.c();
                }
            });
            return false;
        }
        dy1<qq0> dy1Var = this.h;
        if (dy1Var != null && !dy1Var.isDone()) {
            return false;
        }
        nn1.b(this.f5033a, hkVar.d.i);
        an1 an1VarE = this.g.z(hkVar.e).u(qw2.t()).B(hkVar.d).e();
        wl1 wl1Var = new wl1(rl1Var);
        wl1Var.f5850a = an1VarE;
        wl1Var.f5851b = str2;
        dy1<qq0> dy1VarB = this.e.b(new jk1(wl1Var), new kk1(this) { // from class: com.google.android.gms.internal.ads.sl1

            /* renamed from: a, reason: collision with root package name */
            private final ql1 f5275a;

            {
                this.f5275a = this;
            }

            @Override // com.google.android.gms.internal.ads.kk1
            public final ja0 a(hk1 hk1Var) {
                return this.f5275a.g(hk1Var);
            }
        });
        this.h = dy1VarB;
        qx1.f(dy1VarB, new rl1(this, i81Var, wl1Var), this.f5034b);
        return true;
    }

    final /* synthetic */ void c() {
        this.d.i(vn1.b(xn1.INVALID_AD_UNIT_ID, null, null));
    }

    final void h(int r2) {
        this.g.d().c(r2);
    }
}
