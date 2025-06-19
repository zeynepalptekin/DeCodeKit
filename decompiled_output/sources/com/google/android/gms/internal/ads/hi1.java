package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.e70;
import com.google.android.gms.internal.ads.ia0;
import com.google.android.gms.internal.ads.j40;
import com.google.android.gms.internal.ads.ja0;
import com.google.android.gms.internal.ads.qf0;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public abstract class hi1<AppOpenAd extends e70, AppOpenRequestComponent extends j40<AppOpenAd>, AppOpenRequestComponentBuilder extends ja0<AppOpenRequestComponent>> implements g81<AppOpenAd> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f3679a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f3680b;

    /* renamed from: c, reason: collision with root package name */
    protected final gz f3681c;
    private final oi1 d;
    private final ik1<AppOpenRequestComponent, AppOpenAd> e;
    private final ViewGroup f;

    @GuardedBy("this")
    private final cn1 g;

    @GuardedBy("this")
    @Nullable
    private dy1<AppOpenAd> h;

    protected hi1(Context context, Executor executor, gz gzVar, ik1<AppOpenRequestComponent, AppOpenAd> ik1Var, oi1 oi1Var, cn1 cn1Var) {
        this.f3679a = context;
        this.f3680b = executor;
        this.f3681c = gzVar;
        this.e = ik1Var;
        this.d = oi1Var;
        this.g = cn1Var;
        this.f = new FrameLayout(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final synchronized AppOpenRequestComponentBuilder h(hk1 hk1Var) {
        pi1 pi1Var = (pi1) hk1Var;
        if (((Boolean) qx2.e().c(e0.o5)).booleanValue()) {
            return (AppOpenRequestComponentBuilder) a(new z40(this.f), new ia0.a().g(this.f3679a).c(pi1Var.f4821a).d(), new qf0.a().o());
        }
        oi1 oi1VarF = oi1.f(this.d);
        qf0.a aVar = new qf0.a();
        aVar.e(oi1VarF, this.f3680b);
        aVar.i(oi1VarF, this.f3680b);
        aVar.b(oi1VarF, this.f3680b);
        aVar.k(oi1VarF);
        return (AppOpenRequestComponentBuilder) a(new z40(this.f), new ia0.a().g(this.f3679a).c(pi1Var.f4821a).d(), aVar.o());
    }

    static /* synthetic */ dy1 e(hi1 hi1Var, dy1 dy1Var) {
        hi1Var.h = null;
        return null;
    }

    @Override // com.google.android.gms.internal.ads.g81
    public final boolean Y() {
        dy1<AppOpenAd> dy1Var = this.h;
        return (dy1Var == null || dy1Var.isDone()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.g81
    public final synchronized boolean Z(jw2 jw2Var, String str, f81 f81Var, i81<? super AppOpenAd> i81Var) throws RemoteException {
        com.google.android.gms.common.internal.r.f("loadAd must be called on the main UI thread.");
        if (str == null) {
            tr.g("Ad unit ID should not be null for app open ad.");
            this.f3680b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.ki1
                private final hi1 d;

                {
                    this.d = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.d.g();
                }
            });
            return false;
        }
        if (this.h != null) {
            return false;
        }
        nn1.b(this.f3679a, jw2Var.i);
        an1 an1VarE = this.g.z(str).u(qw2.u()).B(jw2Var).e();
        pi1 pi1Var = new pi1(null);
        pi1Var.f4821a = an1VarE;
        dy1<AppOpenAd> dy1VarB = this.e.b(new jk1(pi1Var), new kk1(this) { // from class: com.google.android.gms.internal.ads.ji1

            /* renamed from: a, reason: collision with root package name */
            private final hi1 f3967a;

            {
                this.f3967a = this;
            }

            @Override // com.google.android.gms.internal.ads.kk1
            public final ja0 a(hk1 hk1Var) {
                return this.f3967a.h(hk1Var);
            }
        });
        this.h = dy1VarB;
        qx1.f(dy1VarB, new ni1(this, i81Var, pi1Var), this.f3680b);
        return true;
    }

    protected abstract AppOpenRequestComponentBuilder a(z40 z40Var, ia0 ia0Var, qf0 qf0Var);

    public final void f(vw2 vw2Var) {
        this.g.j(vw2Var);
    }

    final /* synthetic */ void g() {
        this.d.i(vn1.b(xn1.INVALID_AD_UNIT_ID, null, null));
    }
}
