package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class o10 extends az2 {
    private final Context e;
    private final as f;
    private final fs0 g;
    private final v01<rn1, o21> h;
    private final a71 i;
    private final iv0 j;
    private final lm k;
    private final hs0 l;

    @GuardedBy("this")
    private boolean m = false;

    o10(Context context, as asVar, fs0 fs0Var, v01<rn1, o21> v01Var, a71 a71Var, iv0 iv0Var, lm lmVar, hs0 hs0Var) {
        this.e = context;
        this.f = asVar;
        this.g = fs0Var;
        this.h = v01Var;
        this.i = a71Var;
        this.j = iv0Var;
        this.k = lmVar;
        this.l = hs0Var;
    }

    @Override // com.google.android.gms.internal.ads.xy2
    public final synchronized void E0() {
        if (this.m) {
            tr.i("Mobile ads is initialized already.");
            return;
        }
        e0.a(this.e);
        com.google.android.gms.ads.internal.p.g().k(this.e, this.f);
        com.google.android.gms.ads.internal.p.i().c(this.e);
        this.m = true;
        this.j.j();
        if (((Boolean) qx2.e().c(e0.l1)).booleanValue()) {
            this.i.a();
        }
        if (((Boolean) qx2.e().c(e0.z2)).booleanValue()) {
            this.l.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.xy2
    public final synchronized void F6(String str) {
        e0.a(this.e);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) qx2.e().c(e0.y2)).booleanValue()) {
                com.google.android.gms.ads.internal.p.k().b(this.e, this.f, str, null);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.xy2
    public final void G4(d8 d8Var) throws RemoteException {
        this.j.q(d8Var);
    }

    @Override // com.google.android.gms.internal.ads.xy2
    public final synchronized void L4(boolean z) {
        com.google.android.gms.ads.internal.p.h().a(z);
    }

    @Override // com.google.android.gms.internal.ads.xy2
    public final synchronized float M2() {
        return com.google.android.gms.ads.internal.p.h().d();
    }

    @Override // com.google.android.gms.internal.ads.xy2
    public final synchronized boolean R7() {
        return com.google.android.gms.ads.internal.p.h().e();
    }

    @Override // com.google.android.gms.internal.ads.xy2
    public final void S1(qc qcVar) throws RemoteException {
        this.g.c(qcVar);
    }

    @Override // com.google.android.gms.internal.ads.xy2
    public final void T1(c.a.b.b.e.c cVar, String str) {
        if (cVar == null) {
            tr.g("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) c.a.b.b.e.e.e2(cVar);
        if (context == null) {
            tr.g("Context is null. Failed to open debug menu.");
            return;
        }
        pp ppVar = new pp(context);
        ppVar.a(str);
        ppVar.g(this.f.d);
        ppVar.b();
    }

    @Override // com.google.android.gms.internal.ads.xy2
    public final synchronized void b5(float f) {
        com.google.android.gms.ads.internal.p.h().b(f);
    }

    @Override // com.google.android.gms.internal.ads.xy2
    public final void c4() {
        this.j.a();
    }

    @Override // com.google.android.gms.internal.ads.xy2
    public final List<a8> g6() throws RemoteException {
        return this.j.k();
    }

    @Override // com.google.android.gms.internal.ads.xy2
    public final String i8() {
        return this.f.d;
    }

    @Override // com.google.android.gms.internal.ads.xy2
    public final void t7(String str) {
        this.i.f(str);
    }

    @Override // com.google.android.gms.internal.ads.xy2
    public final void u8(@androidx.annotation.i0 String str, c.a.b.b.e.c cVar) throws JSONException {
        String strK;
        e0.a(this.e);
        if (((Boolean) qx2.e().c(e0.A2)).booleanValue()) {
            com.google.android.gms.ads.internal.p.c();
            strK = to.K(this.e);
        } else {
            strK = "";
        }
        if (!TextUtils.isEmpty(strK)) {
            str = strK;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean zBooleanValue = ((Boolean) qx2.e().c(e0.y2)).booleanValue() | ((Boolean) qx2.e().c(e0.s0)).booleanValue();
        Runnable runnable = null;
        if (((Boolean) qx2.e().c(e0.s0)).booleanValue()) {
            zBooleanValue = true;
            final Runnable runnable2 = (Runnable) c.a.b.b.e.e.e2(cVar);
            runnable = new Runnable(this, runnable2) { // from class: com.google.android.gms.internal.ads.r10
                private final o10 d;
                private final Runnable e;

                {
                    this.d = this;
                    this.e = runnable2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    cs.e.execute(new Runnable(this.d, this.e) { // from class: com.google.android.gms.internal.ads.q10
                        private final o10 d;
                        private final Runnable e;

                        {
                            this.d = o10Var;
                            this.e = runnable;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.d.y8(this.e);
                        }
                    });
                }
            };
        }
        if (zBooleanValue) {
            com.google.android.gms.ads.internal.p.k().b(this.e, this.f, str, runnable);
        }
    }

    @Override // com.google.android.gms.internal.ads.xy2
    public final void w2(g gVar) throws RemoteException {
        this.k.c(this.e, gVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ void y8(Runnable runnable) {
        com.google.android.gms.common.internal.r.f("Adapters must be initialized on the main thread.");
        Map<String, pc> mapE = com.google.android.gms.ads.internal.p.g().r().i().e();
        if (mapE == null || mapE.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                tr.d("Could not initialize rewarded ads.", th);
                return;
            }
        }
        if (this.g.a()) {
            HashMap map = new HashMap();
            Iterator<pc> it = mapE.values().iterator();
            while (it.hasNext()) {
                for (lc lcVar : it.next().f4798a) {
                    String str = lcVar.k;
                    for (String str2 : lcVar.f4239c) {
                        if (!map.containsKey(str2)) {
                            map.put(str2, new ArrayList());
                        }
                        if (str != null) {
                            ((Collection) map.get(str2)).add(str);
                        }
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                try {
                    w01<rn1, ListenerT> w01VarA = this.h.a(str3, jSONObject);
                    if (w01VarA != 0) {
                        rn1 rn1Var = (rn1) w01VarA.f5759b;
                        if (!rn1Var.d() && rn1Var.y()) {
                            rn1Var.l(this.e, (o21) w01VarA.f5760c, (List) entry.getValue());
                            String strValueOf = String.valueOf(str3);
                            tr.f(strValueOf.length() != 0 ? "Initialized rewarded video mediation adapter ".concat(strValueOf) : new String("Initialized rewarded video mediation adapter "));
                        }
                    }
                } catch (in1 e) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 56);
                    sb.append("Failed to initialize rewarded video mediation adapter \"");
                    sb.append(str3);
                    sb.append("\"");
                    tr.d(sb.toString(), e);
                }
            }
        }
    }
}
