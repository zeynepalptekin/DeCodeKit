package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g30 implements com.google.android.gms.ads.internal.overlay.p, sb0, tb0, sr2 {
    private final x20 d;
    private final e30 e;
    private final bc<JSONObject, JSONObject> g;
    private final Executor h;
    private final com.google.android.gms.common.util.g i;
    private final Set<rw> f = new HashSet();
    private final AtomicBoolean j = new AtomicBoolean(false);

    @GuardedBy("this")
    private final i30 k = new i30();
    private boolean l = false;
    private WeakReference<?> m = new WeakReference<>(this);

    public g30(yb ybVar, e30 e30Var, Executor executor, x20 x20Var, com.google.android.gms.common.util.g gVar) {
        this.d = x20Var;
        kb<JSONObject> kbVar = ob.f4669b;
        this.g = ybVar.a("google.afma.activeView.handleUpdate", kbVar, kbVar);
        this.e = e30Var;
        this.h = executor;
        this.i = gVar;
    }

    private final void p() {
        Iterator<rw> it = this.f.iterator();
        while (it.hasNext()) {
            this.d.g(it.next());
        }
        this.d.d();
    }

    @Override // com.google.android.gms.internal.ads.sb0
    public final synchronized void D(@androidx.annotation.i0 Context context) {
        this.k.f3758b = true;
        i();
    }

    @Override // com.google.android.gms.internal.ads.sr2
    public final synchronized void K(pr2 pr2Var) {
        this.k.f3757a = pr2Var.m;
        this.k.f = pr2Var;
        i();
    }

    @Override // com.google.android.gms.internal.ads.tb0
    public final synchronized void U() {
        if (this.j.compareAndSet(false, true)) {
            this.d.b(this);
            i();
        }
    }

    @Override // com.google.android.gms.internal.ads.sb0
    public final synchronized void e(@androidx.annotation.i0 Context context) {
        this.k.e = "u";
        i();
        p();
        this.l = true;
    }

    public final synchronized void i() {
        if (!(this.m.get() != null)) {
            s();
            return;
        }
        if (!this.l && this.j.get()) {
            try {
                this.k.d = this.i.c();
                final JSONObject jSONObjectB = this.e.a(this.k);
                for (final rw rwVar : this.f) {
                    this.h.execute(new Runnable(rwVar, jSONObjectB) { // from class: com.google.android.gms.internal.ads.f30
                        private final rw d;
                        private final JSONObject e;

                        {
                            this.d = rwVar;
                            this.e = jSONObjectB;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.d.q("AFMA_updateActiveView", this.e);
                        }
                    });
                }
                gs.b(this.g.a(jSONObjectB), "ActiveViewListener.callActiveViewJs");
            } catch (Exception e) {
                oo.l("Failed to call ActiveViewJS", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.p
    public final synchronized void onPause() {
        this.k.f3758b = true;
        i();
    }

    @Override // com.google.android.gms.ads.internal.overlay.p
    public final synchronized void onResume() {
        this.k.f3758b = false;
        i();
    }

    @Override // com.google.android.gms.internal.ads.sb0
    public final synchronized void q(@androidx.annotation.i0 Context context) {
        this.k.f3758b = false;
        i();
    }

    @Override // com.google.android.gms.ads.internal.overlay.p
    public final void q4() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.p
    public final void r6() {
    }

    public final synchronized void s() {
        p();
        this.l = true;
    }

    public final synchronized void t(rw rwVar) {
        this.f.add(rwVar);
        this.d.f(rwVar);
    }

    public final void u(Object obj) {
        this.m = new WeakReference<>(obj);
    }
}
