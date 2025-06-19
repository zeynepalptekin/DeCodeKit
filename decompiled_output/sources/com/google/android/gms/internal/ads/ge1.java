package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ge1 implements ff1<de1> {

    /* renamed from: a, reason: collision with root package name */
    private final cy1 f3523a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f3524b;

    /* renamed from: c, reason: collision with root package name */
    private final a71 f3525c;
    private final Context d;
    private final an1 e;
    private final x61 f;
    private String g;

    public ge1(cy1 cy1Var, ScheduledExecutorService scheduledExecutorService, String str, a71 a71Var, Context context, an1 an1Var, x61 x61Var) {
        this.f3523a = cy1Var;
        this.f3524b = scheduledExecutorService;
        this.g = str;
        this.f3525c = a71Var;
        this.d = context;
        this.e = an1Var;
        this.f = x61Var;
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final dy1<de1> a() {
        return ((Boolean) qx2.e().c(e0.k1)).booleanValue() ? qx1.c(new bx1(this) { // from class: com.google.android.gms.internal.ads.fe1

            /* renamed from: a, reason: collision with root package name */
            private final ge1 f3402a;

            {
                this.f3402a = this;
            }

            @Override // com.google.android.gms.internal.ads.bx1
            public final dy1 a() {
                return this.f3402a.c();
            }
        }, this.f3523a) : qx1.g(null);
    }

    final /* synthetic */ dy1 b(String str, List list, Bundle bundle) throws Exception {
        ks ksVar = new ks();
        this.f.a(str);
        ye yeVarB = this.f.b(str);
        if (yeVarB == null) {
            throw null;
        }
        yeVarB.n2(c.a.b.b.e.e.i2(this.d), this.g, bundle, (Bundle) list.get(0), this.e.e, new g71(str, yeVarB, ksVar));
        return ksVar;
    }

    final /* synthetic */ dy1 c() {
        Map<String, List<Bundle>> mapG = this.f3525c.g(this.g, this.e.f);
        final ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<Bundle>> entry : mapG.entrySet()) {
            final String key = entry.getKey();
            final List<Bundle> value = entry.getValue();
            Bundle bundle = this.e.d.p;
            final Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
            arrayList.add(lx1.H(qx1.c(new bx1(this, key, value, bundle2) { // from class: com.google.android.gms.internal.ads.je1

                /* renamed from: a, reason: collision with root package name */
                private final ge1 f3948a;

                /* renamed from: b, reason: collision with root package name */
                private final String f3949b;

                /* renamed from: c, reason: collision with root package name */
                private final List f3950c;
                private final Bundle d;

                {
                    this.f3948a = this;
                    this.f3949b = key;
                    this.f3950c = value;
                    this.d = bundle2;
                }

                @Override // com.google.android.gms.internal.ads.bx1
                public final dy1 a() {
                    return this.f3948a.b(this.f3949b, this.f3950c, this.d);
                }
            }, this.f3523a)).C(((Long) qx2.e().c(e0.j1)).longValue(), TimeUnit.MILLISECONDS, this.f3524b).E(Throwable.class, new ru1(key) { // from class: com.google.android.gms.internal.ads.ie1

                /* renamed from: a, reason: collision with root package name */
                private final String f3811a;

                {
                    this.f3811a = key;
                }

                @Override // com.google.android.gms.internal.ads.ru1
                public final Object a(Object obj) {
                    String strValueOf = String.valueOf(this.f3811a);
                    tr.g(strValueOf.length() != 0 ? "Error calling adapter: ".concat(strValueOf) : new String("Error calling adapter: "));
                    return null;
                }
            }, this.f3523a));
        }
        return qx1.o(arrayList).a(new Callable(arrayList) { // from class: com.google.android.gms.internal.ads.le1

            /* renamed from: a, reason: collision with root package name */
            private final List f4248a;

            {
                this.f4248a = arrayList;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List<dy1> list = this.f4248a;
                JSONArray jSONArray = new JSONArray();
                for (dy1 dy1Var : list) {
                    if (((JSONObject) dy1Var.get()) != null) {
                        jSONArray.put(dy1Var.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new de1(jSONArray.toString());
            }
        }, this.f3523a);
    }
}
