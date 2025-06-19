package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class g50 extends e50 {
    private final Context h;
    private final View i;

    @androidx.annotation.i0
    private final rw j;
    private final jm1 k;
    private final b70 l;
    private final ul0 m;
    private final gh0 n;
    private final je2<f71> o;
    private final Executor p;
    private qw2 q;

    g50(d70 d70Var, Context context, jm1 jm1Var, View view, @androidx.annotation.i0 rw rwVar, b70 b70Var, ul0 ul0Var, gh0 gh0Var, je2<f71> je2Var, Executor executor) {
        super(d70Var);
        this.h = context;
        this.i = view;
        this.j = rwVar;
        this.k = jm1Var;
        this.l = b70Var;
        this.m = ul0Var;
        this.n = gh0Var;
        this.o = je2Var;
        this.p = executor;
    }

    @Override // com.google.android.gms.internal.ads.e70
    public final void b() {
        this.p.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.f50
            private final g50 d;

            {
                this.d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.d.n();
            }
        });
        super.b();
    }

    @Override // com.google.android.gms.internal.ads.e50
    public final uz2 g() {
        try {
            return this.l.getVideoController();
        } catch (in1 unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.e50
    public final void h(ViewGroup viewGroup, qw2 qw2Var) {
        rw rwVar;
        if (viewGroup == null || (rwVar = this.j) == null) {
            return;
        }
        rwVar.p0(hy.i(qw2Var));
        viewGroup.setMinimumHeight(qw2Var.f);
        viewGroup.setMinimumWidth(qw2Var.i);
        this.q = qw2Var;
    }

    @Override // com.google.android.gms.internal.ads.e50
    public final jm1 i() {
        boolean z;
        qw2 qw2Var = this.q;
        if (qw2Var != null) {
            return gn1.c(qw2Var);
        }
        km1 km1Var = this.f3228b;
        if (km1Var.X) {
            Iterator<String> it = km1Var.f4111a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                String next = it.next();
                if (next != null && next.contains("FirstParty")) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                return new jm1(this.i.getWidth(), this.i.getHeight(), false);
            }
        }
        return gn1.a(this.f3228b.q, this.k);
    }

    @Override // com.google.android.gms.internal.ads.e50
    public final View j() {
        return this.i;
    }

    @Override // com.google.android.gms.internal.ads.e50
    public final jm1 k() {
        return this.k;
    }

    @Override // com.google.android.gms.internal.ads.e50
    public final int l() {
        if (((Boolean) qx2.e().c(e0.c5)).booleanValue() && this.f3228b.c0) {
            if (!((Boolean) qx2.e().c(e0.d5)).booleanValue()) {
                return 0;
            }
        }
        return this.f3227a.f5858b.f5551b.f4276c;
    }

    @Override // com.google.android.gms.internal.ads.e50
    public final void m() {
        this.n.H0();
    }

    final /* synthetic */ void n() {
        if (this.m.d() != null) {
            try {
                this.m.d().E7(this.o.get(), c.a.b.b.e.e.i2(this.h));
            } catch (RemoteException e) {
                tr.c("RemoteException when notifyAdLoad is called", e);
            }
        }
    }
}
