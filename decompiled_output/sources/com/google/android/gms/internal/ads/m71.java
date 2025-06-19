package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class m71 implements rx1<e50> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ b60 f4358a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j71 f4359b;

    m71(j71 j71Var, b60 b60Var) {
        this.f4359b = j71Var;
        this.f4358a = b60Var;
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final void a(Throwable th) {
        final dw2 dw2VarL = this.f4358a.c().l(th);
        synchronized (this.f4359b) {
            j71.B8(this.f4359b, null);
            this.f4358a.d().i(dw2VarL);
            if (((Boolean) qx2.e().c(e0.m5)).booleanValue()) {
                this.f4359b.e.e().execute(new Runnable(this, dw2VarL) { // from class: com.google.android.gms.internal.ads.o71
                    private final m71 d;
                    private final dw2 e;

                    {
                        this.d = this;
                        this.e = dw2VarL;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        m71 m71Var = this.d;
                        m71Var.f4359b.h.i(this.e);
                    }
                });
            }
            this.f4359b.l.K0(60);
            nn1.a(dw2VarL.d, th, "BannerAdManagerShim.onFailure");
        }
    }

    @Override // com.google.android.gms.internal.ads.rx1
    public final /* synthetic */ void b(e50 e50Var) {
        e50 e50Var2 = e50Var;
        synchronized (this.f4359b) {
            j71.B8(this.f4359b, null);
            if (this.f4359b.p != null) {
                this.f4359b.p.a();
            }
            this.f4359b.p = e50Var2;
            this.f4359b.g.removeAllViews();
            if (e50Var2.j() != null) {
                ViewParent parent = e50Var2.j().getParent();
                if (parent instanceof ViewGroup) {
                    String strE = this.f4359b.e();
                    StringBuilder sb = new StringBuilder(String.valueOf(strE).length() + 78);
                    sb.append("Banner view provided from ");
                    sb.append(strE);
                    sb.append(" already has a parent view. Removing its old parent.");
                    tr.i(sb.toString());
                    ((ViewGroup) parent).removeView(e50Var2.j());
                }
            }
            if (((Boolean) qx2.e().c(e0.m5)).booleanValue()) {
                e50Var2.f().d(this.f4359b.h).b(this.f4359b.i).c(this.f4359b.j).a(this.f4359b.k);
            }
            this.f4359b.g.addView(e50Var2.j());
            e50Var2.b();
            if (((Boolean) qx2.e().c(e0.m5)).booleanValue()) {
                Executor executorE = this.f4359b.e.e();
                s71 s71Var = this.f4359b.h;
                s71Var.getClass();
                executorE.execute(l71.a(s71Var));
            }
            this.f4359b.l.K0(e50Var2.l());
        }
    }
}
