package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class iv0 {
    private final Context e;
    private final WeakReference<Context> f;
    private final fs0 g;
    private final Executor h;
    private final Executor i;
    private final ScheduledExecutorService j;
    private final su0 k;
    private final as l;

    /* renamed from: a, reason: collision with root package name */
    private boolean f3874a = false;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.u("this")
    private boolean f3875b = false;
    private final ks<Boolean> d = new ks<>();
    private Map<String, a8> m = new ConcurrentHashMap();
    private boolean n = true;

    /* renamed from: c, reason: collision with root package name */
    private final long f3876c = com.google.android.gms.ads.internal.p.j().c();

    public iv0(Executor executor, Context context, WeakReference<Context> weakReference, Executor executor2, fs0 fs0Var, ScheduledExecutorService scheduledExecutorService, su0 su0Var, as asVar) {
        this.g = fs0Var;
        this.e = context;
        this.f = weakReference;
        this.h = executor2;
        this.j = scheduledExecutorService;
        this.i = executor;
        this.k = su0Var;
        this.l = asVar;
        h("com.google.android.gms.ads.MobileAds", false, "", 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(String str, boolean z, String str2, int r6) {
        this.m.put(str, new a8(str, z, r6, str2));
    }

    static /* synthetic */ boolean i(iv0 iv0Var, boolean z) {
        iv0Var.f3875b = true;
        return true;
    }

    private final synchronized dy1<String> l() {
        String strC = com.google.android.gms.ads.internal.p.g().r().i().c();
        if (!TextUtils.isEmpty(strC)) {
            return qx1.g(strC);
        }
        final ks ksVar = new ks();
        com.google.android.gms.ads.internal.p.g().r().w(new Runnable(this, ksVar) { // from class: com.google.android.gms.internal.ads.jv0
            private final iv0 d;
            private final ks e;

            {
                this.d = this;
                this.e = ksVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.d.c(this.e);
            }
        });
        return ksVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(String str) throws JSONException {
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str).getJSONObject("initializer_settings").getJSONObject("config");
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                final String next = itKeys.next();
                final Object obj = new Object();
                final ks ksVar = new ks();
                dy1 dy1VarD = qx1.d(ksVar, ((Long) qx2.e().c(e0.s1)).longValue(), TimeUnit.SECONDS, this.j);
                this.k.d(next);
                final long jC = com.google.android.gms.ads.internal.p.j().c();
                Iterator<String> it = itKeys;
                dy1VarD.e(new Runnable(this, obj, ksVar, next, jC) { // from class: com.google.android.gms.internal.ads.lv0
                    private final iv0 d;
                    private final Object e;
                    private final ks f;
                    private final String g;
                    private final long h;

                    {
                        this.d = this;
                        this.e = obj;
                        this.f = ksVar;
                        this.g = next;
                        this.h = jC;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.d.g(this.e, this.f, this.g, this.h);
                    }
                }, this.h);
                arrayList.add(dy1VarD);
                final sv0 sv0Var = new sv0(this, obj, next, jC, ksVar);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                final ArrayList arrayList2 = new ArrayList();
                if (jSONObjectOptJSONObject != null) {
                    try {
                        JSONArray jSONArray = jSONObjectOptJSONObject.getJSONArray("data");
                        for (int r3 = 0; r3 < jSONArray.length(); r3++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(r3);
                            String strOptString = jSONObject2.optString("format", "");
                            JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("data");
                            Bundle bundle = new Bundle();
                            if (jSONObjectOptJSONObject2 != null) {
                                Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                                while (itKeys2.hasNext()) {
                                    String next2 = itKeys2.next();
                                    bundle.putString(next2, jSONObjectOptJSONObject2.optString(next2, ""));
                                }
                            }
                            arrayList2.add(new l8(strOptString, bundle));
                        }
                    } catch (JSONException unused) {
                    }
                }
                h(next, false, "", 0);
                try {
                    try {
                        final rn1 rn1VarD = this.g.d(next, new JSONObject());
                        this.i.execute(new Runnable(this, rn1VarD, sv0Var, arrayList2, next) { // from class: com.google.android.gms.internal.ads.nv0
                            private final iv0 d;
                            private final rn1 e;
                            private final c8 f;
                            private final List g;
                            private final String h;

                            {
                                this.d = this;
                                this.e = rn1VarD;
                                this.f = sv0Var;
                                this.g = arrayList2;
                                this.h = next;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.d.f(this.e, this.f, this.g, this.h);
                            }
                        });
                    } catch (in1 unused2) {
                        sv0Var.i1("Failed to create Adapter.");
                    }
                } catch (RemoteException e) {
                    tr.c("", e);
                }
                itKeys = it;
            }
            qx1.n(arrayList).a(new Callable(this) { // from class: com.google.android.gms.internal.ads.pv0

                /* renamed from: a, reason: collision with root package name */
                private final iv0 f4894a;

                {
                    this.f4894a = this;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f4894a.m();
                }
            }, this.h);
        } catch (JSONException e2) {
            oo.l("Malformed CLD response", e2);
        }
    }

    public final void a() {
        this.n = false;
    }

    final /* synthetic */ void c(final ks ksVar) {
        this.h.execute(new Runnable(this, ksVar) { // from class: com.google.android.gms.internal.ads.rv0
            private final iv0 d;
            private final ks e;

            {
                this.d = this;
                this.e = ksVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ks ksVar2 = this.e;
                String strC = com.google.android.gms.ads.internal.p.g().r().i().c();
                if (TextUtils.isEmpty(strC)) {
                    ksVar2.b(new Exception());
                } else {
                    ksVar2.a(strC);
                }
            }
        });
    }

    final /* synthetic */ void f(rn1 rn1Var, c8 c8Var, List list, String str) {
        try {
            try {
                Context context = this.f.get();
                if (context == null) {
                    context = this.e;
                }
                rn1Var.k(context, c8Var, list);
            } catch (in1 unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 74);
                sb.append("Failed to initialize adapter. ");
                sb.append(str);
                sb.append(" does not implement the initialize() method.");
                c8Var.i1(sb.toString());
            }
        } catch (RemoteException e) {
            tr.c("", e);
        }
    }

    final /* synthetic */ void g(Object obj, ks ksVar, String str, long j) {
        synchronized (obj) {
            if (!ksVar.isDone()) {
                h(str, false, "Timeout.", (int) (com.google.android.gms.ads.internal.p.j().c() - j));
                this.k.f(str, "timeout");
                ksVar.a(Boolean.FALSE);
            }
        }
    }

    public final void j() {
        if (((Boolean) qx2.e().c(e0.q1)).booleanValue() && !b2.f2776a.a().booleanValue()) {
            if (this.l.f >= ((Integer) qx2.e().c(e0.r1)).intValue() && this.n) {
                if (this.f3874a) {
                    return;
                }
                synchronized (this) {
                    if (this.f3874a) {
                        return;
                    }
                    this.k.a();
                    this.d.e(new Runnable(this) { // from class: com.google.android.gms.internal.ads.kv0
                        private final iv0 d;

                        {
                            this.d = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.d.o();
                        }
                    }, this.h);
                    this.f3874a = true;
                    dy1<String> dy1VarL = l();
                    this.j.schedule(new Runnable(this) { // from class: com.google.android.gms.internal.ads.mv0
                        private final iv0 d;

                        {
                            this.d = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.d.n();
                        }
                    }, ((Long) qx2.e().c(e0.t1)).longValue(), TimeUnit.SECONDS);
                    qx1.f(dy1VarL, new qv0(this), this.h);
                    return;
                }
            }
        }
        if (this.f3874a) {
            return;
        }
        h("com.google.android.gms.ads.MobileAds", true, "", 0);
        this.d.a(Boolean.FALSE);
        this.f3874a = true;
    }

    public final List<a8> k() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.m.keySet()) {
            a8 a8Var = this.m.get(str);
            arrayList.add(new a8(str, a8Var.e, a8Var.f, a8Var.g));
        }
        return arrayList;
    }

    final /* synthetic */ Object m() throws Exception {
        this.d.a(Boolean.TRUE);
        return null;
    }

    final /* synthetic */ void n() {
        synchronized (this) {
            if (this.f3875b) {
                return;
            }
            h("com.google.android.gms.ads.MobileAds", false, "Timeout.", (int) (com.google.android.gms.ads.internal.p.j().c() - this.f3876c));
            this.d.b(new Exception());
        }
    }

    final /* synthetic */ void o() {
        this.k.b();
    }

    public final void q(final d8 d8Var) {
        this.d.e(new Runnable(this, d8Var) { // from class: com.google.android.gms.internal.ads.hv0
            private final iv0 d;
            private final d8 e;

            {
                this.d = this;
                this.e = d8Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.d.s(this.e);
            }
        }, this.i);
    }

    final /* synthetic */ void s(d8 d8Var) {
        try {
            d8Var.p1(k());
        } catch (RemoteException e) {
            tr.c("", e);
        }
    }
}
