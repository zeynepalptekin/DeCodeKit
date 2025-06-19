package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class q30 implements sr2 {
    private rw d;
    private final Executor e;
    private final e30 f;
    private final com.google.android.gms.common.util.g g;
    private boolean h = false;
    private boolean i = false;
    private i30 j = new i30();

    public q30(Executor executor, e30 e30Var, com.google.android.gms.common.util.g gVar) {
        this.e = executor;
        this.f = e30Var;
        this.g = gVar;
    }

    private final void p() {
        try {
            final JSONObject jSONObjectA = this.f.a(this.j);
            if (this.d != null) {
                this.e.execute(new Runnable(this, jSONObjectA) { // from class: com.google.android.gms.internal.ads.t30
                    private final q30 d;
                    private final JSONObject e;

                    {
                        this.d = this;
                        this.e = jSONObjectA;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.d.t(this.e);
                    }
                });
            }
        } catch (JSONException e) {
            oo.l("Failed to call video active view js", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.sr2
    public final void K(pr2 pr2Var) {
        this.j.f3757a = this.i ? false : pr2Var.m;
        this.j.d = this.g.c();
        this.j.f = pr2Var;
        if (this.h) {
            p();
        }
    }

    public final void e() {
        this.h = false;
    }

    public final void i() {
        this.h = true;
        p();
    }

    public final void q(boolean z) {
        this.i = z;
    }

    public final void s(rw rwVar) {
        this.d = rwVar;
    }

    final /* synthetic */ void t(JSONObject jSONObject) {
        this.d.q("AFMA_updateActiveView", jSONObject);
    }
}
