package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class bl0 extends e70 {
    private final n71 A;
    private final Executor h;
    private final nl0 i;
    private final vl0 j;
    private final km0 k;
    private final rl0 l;
    private final ul0 m;
    private final je2<mp0> n;
    private final je2<kp0> o;
    private final je2<tp0> p;
    private final je2<fp0> q;
    private final je2<op0> r;
    private jn0 s;
    private boolean t;
    private boolean u;
    private final mm v;
    private final i52 w;
    private final as x;
    private final Context y;
    private final il0 z;

    public bl0(d70 d70Var, Executor executor, nl0 nl0Var, vl0 vl0Var, km0 km0Var, rl0 rl0Var, ul0 ul0Var, je2<mp0> je2Var, je2<kp0> je2Var2, je2<tp0> je2Var3, je2<fp0> je2Var4, je2<op0> je2Var5, mm mmVar, i52 i52Var, as asVar, Context context, il0 il0Var, n71 n71Var) {
        super(d70Var);
        this.u = false;
        this.h = executor;
        this.i = nl0Var;
        this.j = vl0Var;
        this.k = km0Var;
        this.l = rl0Var;
        this.m = ul0Var;
        this.n = je2Var;
        this.o = je2Var2;
        this.p = je2Var3;
        this.q = je2Var4;
        this.r = je2Var5;
        this.v = mmVar;
        this.w = i52Var;
        this.x = asVar;
        this.y = context;
        this.z = il0Var;
        this.A = n71Var;
    }

    public static boolean J(View view) {
        return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
    }

    public final synchronized void A(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (this.t) {
            return;
        }
        if (z) {
            this.k.h(this.s);
            this.j.i(view, map, map2);
            this.t = true;
            return;
        }
        if (!z) {
            if (((Boolean) qx2.e().c(e0.p2)).booleanValue() && map != null) {
                Iterator<Map.Entry<String, WeakReference<View>>> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    View view2 = it.next().getValue().get();
                    if (view2 != null && J(view2)) {
                        this.k.h(this.s);
                        this.j.i(view, map, map2);
                        this.t = true;
                        return;
                    }
                }
            }
        }
    }

    public final synchronized void B(jn0 jn0Var) {
        this.j.e(jn0Var.X5(), jn0Var.Y3());
        if (jn0Var.K7() != null) {
            jn0Var.K7().setClickable(false);
            jn0Var.K7().removeAllViews();
        }
        if (jn0Var.i2() != null) {
            jn0Var.i2().e(this.v);
        }
        this.s = null;
    }

    final /* synthetic */ void C(boolean z) {
        this.j.n(this.s.X5(), this.s.Y3(), this.s.w6(), z);
    }

    public final synchronized void D(String str) {
        this.j.j(str);
    }

    public final synchronized void E(Bundle bundle) {
        this.j.c(bundle);
    }

    public final synchronized void F(Bundle bundle) {
        this.j.l(bundle);
    }

    public final void G(String str, boolean z) {
        String str2;
        if (this.l.a()) {
            rw rwVarG = this.i.G();
            rw rwVarF = this.i.F();
            if (rwVarG == null && rwVarF == null) {
                return;
            }
            boolean z2 = rwVarG != null;
            boolean z3 = rwVarF != null;
            String str3 = null;
            if (z2) {
                str2 = str3;
            } else if (z3) {
                str3 = "javascript";
                rwVarG = rwVarF;
                str2 = str3;
            } else {
                rwVarG = null;
                str2 = null;
            }
            if (rwVarG.getWebView() != null && com.google.android.gms.ads.internal.p.r().h(this.y)) {
                as asVar = this.x;
                int r5 = asVar.e;
                int r4 = asVar.f;
                StringBuilder sb = new StringBuilder(23);
                sb.append(r5);
                sb.append(".");
                sb.append(r4);
                c.a.b.b.e.c cVarC = com.google.android.gms.ads.internal.p.r().c(sb.toString(), rwVarG.getWebView(), "", "javascript", str2, str);
                if (cVarC == null) {
                    return;
                }
                this.i.L(cVarC);
                rwVarG.N(cVarC);
                if (z3) {
                    View view = rwVarF.getView();
                    if (view != null) {
                        com.google.android.gms.ads.internal.p.r().d(cVarC, view);
                    }
                    this.u = true;
                }
                if (z) {
                    com.google.android.gms.ads.internal.p.r().e(cVarC);
                }
            }
        }
    }

    public final synchronized boolean H(Bundle bundle) {
        if (this.t) {
            return true;
        }
        boolean zO = this.j.o(bundle);
        this.t = zO;
        return zO;
    }

    public final synchronized void I() {
        this.j.N0();
    }

    @Override // com.google.android.gms.internal.ads.e70
    public final synchronized void a() {
        this.h.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.hl0
            private final bl0 d;

            {
                this.d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.d.y();
            }
        });
        super.a();
    }

    @Override // com.google.android.gms.internal.ads.e70
    @androidx.annotation.d
    public final void b() {
        this.h.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.fl0
            private final bl0 d;

            {
                this.d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.d.z();
            }
        });
        if (this.i.A() != 7) {
            Executor executor = this.h;
            vl0 vl0Var = this.j;
            vl0Var.getClass();
            executor.execute(dl0.a(vl0Var));
        }
        super.b();
    }

    public final synchronized void g() {
        this.j.V0();
    }

    public final synchronized boolean h() {
        return this.j.A1();
    }

    public final synchronized void i() {
        if (this.s == null) {
            tr.f("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            final boolean z = this.s instanceof em0;
            this.h.execute(new Runnable(this, z) { // from class: com.google.android.gms.internal.ads.gl0
                private final bl0 d;
                private final boolean e;

                {
                    this.d = this;
                    this.e = z;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.d.C(this.e);
                }
            });
        }
    }

    public final synchronized void j(View view) {
        this.j.d(view);
    }

    public final synchronized JSONObject k(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        return this.j.m(view, map, map2);
    }

    public final synchronized void l(View view, MotionEvent motionEvent, View view2) {
        this.j.g(view, motionEvent, view2);
    }

    public final synchronized void m(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        this.k.g(this.s);
        this.j.h(view, view2, map, map2, z);
        if (this.u) {
            if (((Boolean) qx2.e().c(e0.i2)).booleanValue() && this.i.F() != null) {
                this.i.F().M("onSdkAdUserInteractionClick", new HashMap());
            }
        }
    }

    public final synchronized void n(g5 g5Var) {
        this.j.F1(g5Var);
    }

    public final synchronized void o(jn0 jn0Var) {
        xu1 xu1VarH;
        this.s = jn0Var;
        this.k.b(jn0Var);
        this.j.a(jn0Var.X5(), jn0Var.w6(), jn0Var.a8(), jn0Var, jn0Var);
        if (((Boolean) qx2.e().c(e0.F1)).booleanValue() && (xu1VarH = this.w.h()) != null) {
            xu1VarH.a(jn0Var.X5());
        }
        if (jn0Var.i2() != null) {
            jn0Var.i2().d(this.v);
        }
    }

    public final synchronized void p(ez2 ez2Var) {
        this.j.j1(ez2Var);
    }

    public final synchronized void q(@androidx.annotation.i0 jz2 jz2Var) {
        this.j.n1(jz2Var);
    }

    public final synchronized void r(oz2 oz2Var) {
        this.A.a(oz2Var);
    }

    public final void s(View view) {
        c.a.b.b.e.c cVarH = this.i.H();
        boolean z = this.i.G() != null;
        if (!this.l.a() || cVarH == null || !z || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.p.r().d(cVarH, view);
    }

    public final void t(View view) {
        c.a.b.b.e.c cVarH = this.i.H();
        if (!this.l.a() || cVarH == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.p.r().g(cVarH, view);
    }

    public final synchronized void u() {
        if (this.t) {
            return;
        }
        this.j.k();
    }

    public final boolean v() {
        return this.l.d();
    }

    public final boolean w() {
        return this.l.a();
    }

    public final il0 x() {
        return this.z;
    }

    final /* synthetic */ void y() {
        this.j.destroy();
        this.i.a();
    }

    final /* synthetic */ void z() {
        try {
            int r0 = this.i.A();
            if (r0 == 1) {
                if (this.m.a() != null) {
                    G("Google", true);
                    this.m.a().e8(this.n.get());
                    return;
                }
                return;
            }
            if (r0 == 2) {
                if (this.m.b() != null) {
                    G("Google", true);
                    this.m.b().j5(this.o.get());
                    return;
                }
                return;
            }
            if (r0 == 3) {
                if (this.m.h(this.i.e()) != null) {
                    if (this.i.F() != null) {
                        G("Google", true);
                    }
                    this.m.h(this.i.e()).M5(this.r.get());
                    return;
                }
                return;
            }
            if (r0 == 6) {
                if (this.m.c() != null) {
                    G("Google", true);
                    this.m.c().d4(this.p.get());
                    return;
                }
                return;
            }
            if (r0 != 7) {
                tr.g("Wrong native template id!");
            } else if (this.m.e() != null) {
                this.m.e().y6(this.q.get());
            }
        } catch (RemoteException e) {
            tr.c("RemoteException when notifyAdLoad is called", e);
        }
    }
}
