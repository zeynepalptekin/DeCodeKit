package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class up0 {

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.ads.internal.b f5577b;

    /* renamed from: c, reason: collision with root package name */
    private final zw f5578c;
    private final Context d;
    private final Executor e;
    private final i52 f;
    private final as g;
    private dy1<rw> i;

    /* renamed from: a, reason: collision with root package name */
    private final cq0 f5576a = new cq0(null);
    private final f7 h = new f7();

    up0(hq0 hq0Var) {
        this.d = hq0Var.f3708c;
        this.e = hq0Var.d;
        this.f = hq0Var.e;
        this.g = hq0Var.f;
        this.f5577b = hq0Var.f3706a;
        this.f5578c = hq0Var.f3707b;
    }

    public final synchronized void a() {
        if (this.i == null) {
            return;
        }
        qx1.f(this.i, new zp0(this), this.e);
        this.i = null;
    }

    final /* synthetic */ dy1 c(String str, JSONObject jSONObject, rw rwVar) throws Exception {
        return this.h.b(rwVar, str, jSONObject);
    }

    public final synchronized void d(km1 km1Var, lm1 lm1Var) {
        if (this.i == null) {
            return;
        }
        qx1.f(this.i, new dq0(this, km1Var, lm1Var), this.e);
    }

    public final synchronized void e(String str, z6<Object> z6Var) {
        if (this.i == null) {
            return;
        }
        qx1.f(this.i, new yp0(this, str, z6Var), this.e);
    }

    public final synchronized void f(String str, Map<String, ?> map) {
        if (this.i == null) {
            return;
        }
        qx1.f(this.i, new aq0(this, str, map), this.e);
    }

    public final <T> void g(WeakReference<T> weakReference, String str, z6<T> z6Var) {
        e(str, new gq0(this, weakReference, str, z6Var, null));
    }

    public final synchronized void h() {
        dy1<rw> dy1VarI = qx1.i(zw.b(this.d, this.g, (String) qx2.e().c(e0.c2), this.f, this.f5577b), new ru1(this) { // from class: com.google.android.gms.internal.ads.xp0

            /* renamed from: a, reason: collision with root package name */
            private final up0 f6018a;

            {
                this.f6018a = this;
            }

            @Override // com.google.android.gms.internal.ads.ru1
            public final Object a(Object obj) {
                return this.f6018a.k((rw) obj);
            }
        }, this.e);
        this.i = dy1VarI;
        gs.a(dy1VarI, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void i(String str, z6<Object> z6Var) {
        if (this.i == null) {
            return;
        }
        qx1.f(this.i, new bq0(this, str, z6Var), this.e);
    }

    public final synchronized dy1<JSONObject> j(final String str, final JSONObject jSONObject) {
        if (this.i == null) {
            return qx1.g(null);
        }
        return qx1.j(this.i, new ax1(this, str, jSONObject) { // from class: com.google.android.gms.internal.ads.wp0

            /* renamed from: a, reason: collision with root package name */
            private final up0 f5873a;

            /* renamed from: b, reason: collision with root package name */
            private final String f5874b;

            /* renamed from: c, reason: collision with root package name */
            private final JSONObject f5875c;

            {
                this.f5873a = this;
                this.f5874b = str;
                this.f5875c = jSONObject;
            }

            @Override // com.google.android.gms.internal.ads.ax1
            public final dy1 a(Object obj) {
                return this.f5873a.c(this.f5874b, this.f5875c, (rw) obj);
            }
        }, this.e);
    }

    final /* synthetic */ rw k(rw rwVar) {
        rwVar.o("/result", this.h);
        ey eyVarC0 = rwVar.C0();
        cq0 cq0Var = this.f5576a;
        eyVarC0.o(null, cq0Var, cq0Var, cq0Var, cq0Var, false, null, new com.google.android.gms.ads.internal.a(this.d, null, null), null, null);
        return rwVar;
    }
}
