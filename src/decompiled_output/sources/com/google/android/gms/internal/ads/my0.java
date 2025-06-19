package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class my0 extends li {
    private final Context e;
    private final Executor f;
    private final nj g;
    private final kj h;
    private final j20 i;
    private final HashMap<String, cz0> j;

    public my0(Context context, Executor executor, nj njVar, j20 j20Var, kj kjVar, HashMap<String, cz0> map) {
        e0.a(context);
        this.e = context;
        this.f = executor;
        this.g = njVar;
        this.h = kjVar;
        this.i = j20Var;
        this.j = map;
    }

    private final void B8(dy1<InputStream> dy1Var, pi piVar) {
        qx1.f(qx1.j(dy1Var, new ax1(this) { // from class: com.google.android.gms.internal.ads.xy0

            /* renamed from: a, reason: collision with root package name */
            private final my0 f6060a;

            {
                this.f6060a = this;
            }

            @Override // com.google.android.gms.internal.ads.ax1
            public final dy1 a(Object obj) {
                return qx1.g(tn1.a((InputStream) obj));
            }
        }, cs.f3023a), new zy0(this, piVar), cs.f);
    }

    private static dy1<JSONObject> y8(wi wiVar, cr1 cr1Var, final yf1 yf1Var) {
        ax1 ax1Var = new ax1(yf1Var) { // from class: com.google.android.gms.internal.ads.qy0

            /* renamed from: a, reason: collision with root package name */
            private final yf1 f5073a;

            {
                this.f5073a = yf1Var;
            }

            @Override // com.google.android.gms.internal.ads.ax1
            public final dy1 a(Object obj) {
                return this.f5073a.a().a(com.google.android.gms.ads.internal.p.c().R((Bundle) obj));
            }
        };
        return cr1Var.b(zq1.GMS_SIGNALS, qx1.g(wiVar.d)).b(ax1Var).g(uy0.f5613a).f();
    }

    private static dy1<cj> z8(dy1<JSONObject> dy1Var, cr1 cr1Var, pb pbVar) {
        return cr1Var.b(zq1.BUILD_URL, dy1Var).b(pbVar.a("AFMA_getAdDictionary", ob.f4669b, ty0.f5461a)).f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ InputStream A8(dy1 dy1Var, dy1 dy1Var2) throws Exception {
        String strH = ((cj) dy1Var.get()).h();
        this.j.put(strH, new cz0((cj) dy1Var.get(), (JSONObject) dy1Var2.get()));
        return new ByteArrayInputStream(strH.getBytes(pu1.f4893c));
    }

    final /* synthetic */ void C8() {
        gs.a(this.h.a(), "persistFlags");
    }

    public final dy1<InputStream> D8(wi wiVar, int r12) {
        String str;
        uq1 uq1VarA;
        pb pbVarA = com.google.android.gms.ads.internal.p.p().a(this.e, as.h());
        yf1 yf1VarA = this.i.a(wiVar, r12);
        gb gbVarA = pbVarA.a("google.afma.response.normalize", bz0.d, ob.f4670c);
        gz0 gz0Var = new gz0(this.e, wiVar.e.d, this.g, wiVar.j, r12);
        cr1 cr1VarC = yf1VarA.c();
        cz0 cz0VarRemove = null;
        if (f2.f3360a.a().booleanValue()) {
            String str2 = wiVar.n;
            if (str2 != null && !str2.isEmpty() && (cz0VarRemove = this.j.remove(wiVar.n)) == null) {
                str = "Request contained a PoolKey but no matching parameters were found.";
                oo.m(str);
            }
        } else {
            String str3 = wiVar.n;
            if (str3 != null && !str3.isEmpty()) {
                str = "Request contained a PoolKey but split request is disabled.";
                oo.m(str);
            }
        }
        if (cz0VarRemove == null) {
            final dy1<JSONObject> dy1VarY8 = y8(wiVar, cr1VarC, yf1VarA);
            final dy1<cj> dy1VarZ8 = z8(dy1VarY8, cr1VarC, pbVarA);
            final kq1 kq1VarF = cr1VarC.a(zq1.HTTP, dy1VarZ8, dy1VarY8).a(new Callable(dy1VarY8, dy1VarZ8) { // from class: com.google.android.gms.internal.ads.py0

                /* renamed from: a, reason: collision with root package name */
                private final dy1 f4916a;

                /* renamed from: b, reason: collision with root package name */
                private final dy1 f4917b;

                {
                    this.f4916a = dy1VarY8;
                    this.f4917b = dy1VarZ8;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new fz0((JSONObject) this.f4916a.get(), (cj) this.f4917b.get());
                }
            }).g(gz0Var).f();
            uq1VarA = cr1VarC.a(zq1.PRE_PROCESS, dy1VarY8, dy1VarZ8, kq1VarF).a(new Callable(kq1VarF, dy1VarY8, dy1VarZ8) { // from class: com.google.android.gms.internal.ads.oy0

                /* renamed from: a, reason: collision with root package name */
                private final dy1 f4755a;

                /* renamed from: b, reason: collision with root package name */
                private final dy1 f4756b;

                /* renamed from: c, reason: collision with root package name */
                private final dy1 f4757c;

                {
                    this.f4755a = kq1VarF;
                    this.f4756b = dy1VarY8;
                    this.f4757c = dy1VarZ8;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new bz0((iz0) this.f4755a.get(), (JSONObject) this.f4756b.get(), (cj) this.f4757c.get());
                }
            });
        } else {
            final kq1 kq1VarF2 = cr1VarC.b(zq1.HTTP, qx1.g(new fz0(cz0VarRemove.f3050b, cz0VarRemove.f3049a))).g(gz0Var).f();
            final dy1<?> dy1VarG = qx1.g(cz0VarRemove);
            uq1VarA = cr1VarC.a(zq1.PRE_PROCESS, kq1VarF2, dy1VarG).a(new Callable(kq1VarF2, dy1VarG) { // from class: com.google.android.gms.internal.ads.sy0

                /* renamed from: a, reason: collision with root package name */
                private final dy1 f5319a;

                /* renamed from: b, reason: collision with root package name */
                private final dy1 f5320b;

                {
                    this.f5319a = kq1VarF2;
                    this.f5320b = dy1VarG;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    dy1 dy1Var = this.f5319a;
                    dy1 dy1Var2 = this.f5320b;
                    return new bz0((iz0) dy1Var.get(), ((cz0) dy1Var2.get()).f3050b, ((cz0) dy1Var2.get()).f3049a);
                }
            });
        }
        return uq1VarA.b(gbVarA).f();
    }

    public final dy1<InputStream> E8(wi wiVar, int r6) {
        if (!f2.f3360a.a().booleanValue()) {
            return qx1.a(new Exception("Split request is disabled."));
        }
        yo1 yo1Var = wiVar.m;
        if (yo1Var == null) {
            return qx1.a(new Exception("Pool configuration missing from request."));
        }
        if (yo1Var.j == 0 || yo1Var.k == 0) {
            return qx1.a(new Exception("Caching is disabled."));
        }
        pb pbVarA = com.google.android.gms.ads.internal.p.p().a(this.e, as.h());
        yf1 yf1VarA = this.i.a(wiVar, r6);
        cr1 cr1VarC = yf1VarA.c();
        final dy1<JSONObject> dy1VarY8 = y8(wiVar, cr1VarC, yf1VarA);
        final dy1<cj> dy1VarZ8 = z8(dy1VarY8, cr1VarC, pbVarA);
        return cr1VarC.a(zq1.GET_URL_AND_CACHE_KEY, dy1VarY8, dy1VarZ8).a(new Callable(this, dy1VarZ8, dy1VarY8) { // from class: com.google.android.gms.internal.ads.vy0

            /* renamed from: a, reason: collision with root package name */
            private final my0 f5748a;

            /* renamed from: b, reason: collision with root package name */
            private final dy1 f5749b;

            /* renamed from: c, reason: collision with root package name */
            private final dy1 f5750c;

            {
                this.f5748a = this;
                this.f5749b = dy1VarZ8;
                this.f5750c = dy1VarY8;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f5748a.A8(this.f5749b, this.f5750c);
            }
        }).f();
    }

    public final dy1<InputStream> F8(wi wiVar, int r7) {
        pb pbVarA = com.google.android.gms.ads.internal.p.p().a(this.e, as.h());
        if (!l2.f4181a.a().booleanValue()) {
            return qx1.a(new Exception("Signal collection disabled."));
        }
        yf1 yf1VarA = this.i.a(wiVar, r7);
        final ef1<JSONObject> ef1VarB = yf1VarA.b();
        return yf1VarA.c().b(zq1.GET_SIGNALS, qx1.g(wiVar.d)).b(new ax1(ef1VarB) { // from class: com.google.android.gms.internal.ads.yy0

            /* renamed from: a, reason: collision with root package name */
            private final ef1 f6195a;

            {
                this.f6195a = ef1VarB;
            }

            @Override // com.google.android.gms.internal.ads.ax1
            public final dy1 a(Object obj) {
                return this.f6195a.a(com.google.android.gms.ads.internal.p.c().R((Bundle) obj));
            }
        }).j(zq1.JS_SIGNALS).b(pbVarA.a("google.afma.request.getSignals", ob.f4669b, ob.f4670c)).f();
    }

    public final dy1<InputStream> G8(String str) {
        if (!f2.f3360a.a().booleanValue()) {
            return qx1.a(new Exception("Split request is disabled."));
        }
        az0 az0Var = new az0(this);
        if (this.j.remove(str) != null) {
            return qx1.g(az0Var);
        }
        String strValueOf = String.valueOf(str);
        return qx1.a(new Exception(strValueOf.length() != 0 ? "URL to be removed not found for cache key: ".concat(strValueOf) : new String("URL to be removed not found for cache key: ")));
    }

    @Override // com.google.android.gms.internal.ads.mi
    public final void S4(gi giVar, ni niVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.mi
    public final void Z7(wi wiVar, pi piVar) {
        B8(E8(wiVar, Binder.getCallingUid()), piVar);
    }

    @Override // com.google.android.gms.internal.ads.mi
    public final ii r3(gi giVar) throws RemoteException {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.mi
    public final void r4(String str, pi piVar) {
        B8(G8(str), piVar);
    }

    @Override // com.google.android.gms.internal.ads.mi
    public final void s4(wi wiVar, pi piVar) {
        dy1<InputStream> dy1VarD8 = D8(wiVar, Binder.getCallingUid());
        B8(dy1VarD8, piVar);
        dy1VarD8.e(new Runnable(this) { // from class: com.google.android.gms.internal.ads.wy0
            private final my0 d;

            {
                this.d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.d.C8();
            }
        }, this.f);
    }

    @Override // com.google.android.gms.internal.ads.mi
    public final void v6(wi wiVar, pi piVar) {
        B8(F8(wiVar, Binder.getCallingUid()), piVar);
    }
}
