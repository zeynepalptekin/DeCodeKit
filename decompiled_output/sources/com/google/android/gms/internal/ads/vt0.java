package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class vt0 implements fb0, tb0, af0, zv2 {
    private final Context d;
    private final mn1 e;
    private final hu0 f;
    private final wm1 g;
    private final km1 h;
    private final i01 i;

    @androidx.annotation.i0
    private Boolean j;
    private final boolean k = ((Boolean) qx2.e().c(e0.U4)).booleanValue();

    public vt0(Context context, mn1 mn1Var, hu0 hu0Var, wm1 wm1Var, km1 km1Var, i01 i01Var) {
        this.d = context;
        this.e = mn1Var;
        this.f = hu0Var;
        this.g = wm1Var;
        this.h = km1Var;
        this.i = i01Var;
    }

    private final void b(gu0 gu0Var) {
        if (!this.h.e0) {
            gu0Var.c();
            return;
        }
        this.i.b(new o01(com.google.android.gms.ads.internal.p.j().a(), this.g.f5858b.f5551b.f4275b, gu0Var.d(), j01.f3893b));
    }

    private final boolean d() {
        if (this.j == null) {
            synchronized (this) {
                if (this.j == null) {
                    String str = (String) qx2.e().c(e0.n1);
                    com.google.android.gms.ads.internal.p.c();
                    this.j = Boolean.valueOf(e(str, to.K(this.d)));
                }
            }
        }
        return this.j.booleanValue();
    }

    private static boolean e(String str, String str2) {
        if (str != null && str2 != null) {
            try {
                return Pattern.matches(str, str2);
            } catch (RuntimeException e) {
                com.google.android.gms.ads.internal.p.g().e(e, "CsiActionsListener.isPatternMatched");
            }
        }
        return false;
    }

    private final gu0 f(String str) {
        gu0 gu0VarG = this.f.b().a(this.g.f5858b.f5551b).g(this.h);
        gu0VarG.h("action", str);
        if (!this.h.s.isEmpty()) {
            gu0VarG.h("ancn", this.h.s.get(0));
        }
        if (this.h.e0) {
            com.google.android.gms.ads.internal.p.c();
            gu0VarG.h("device_connectivity", to.M(this.d) ? "online" : "offline");
            gu0VarG.h("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.p.j().a()));
            gu0VarG.h("offline_ad", "1");
        }
        return gu0VarG;
    }

    @Override // com.google.android.gms.internal.ads.fb0
    public final void S(dw2 dw2Var) {
        dw2 dw2Var2;
        if (this.k) {
            gu0 gu0VarF = f("ifts");
            gu0VarF.h("reason", "adapter");
            int r1 = dw2Var.d;
            String str = dw2Var.e;
            if (dw2Var.f.equals(com.google.android.gms.ads.q.f2483a) && (dw2Var2 = dw2Var.g) != null && !dw2Var2.f.equals(com.google.android.gms.ads.q.f2483a)) {
                dw2 dw2Var3 = dw2Var.g;
                r1 = dw2Var3.d;
                str = dw2Var3.e;
            }
            if (r1 >= 0) {
                gu0VarF.h("arec", String.valueOf(r1));
            }
            String strA = this.e.a(str);
            if (strA != null) {
                gu0VarF.h("areec", strA);
            }
            gu0VarF.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.tb0
    public final void U() {
        if (d() || this.h.e0) {
            b(f("impression"));
        }
    }

    @Override // com.google.android.gms.internal.ads.af0
    public final void a() {
        if (d()) {
            f("adapter_impression").c();
        }
    }

    @Override // com.google.android.gms.internal.ads.af0
    public final void c() {
        if (d()) {
            f("adapter_shown").c();
        }
    }

    @Override // com.google.android.gms.internal.ads.fb0
    public final void k0() {
        if (this.k) {
            gu0 gu0VarF = f("ifts");
            gu0VarF.h("reason", "blocked");
            gu0VarF.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.zv2
    public final void p() {
        if (this.h.e0) {
            b(f("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.fb0
    public final void v0(oj0 oj0Var) {
        if (this.k) {
            gu0 gu0VarF = f("ifts");
            gu0VarF.h("reason", "exception");
            if (!TextUtils.isEmpty(oj0Var.getMessage())) {
                gu0VarF.h(androidx.core.app.p.g0, oj0Var.getMessage());
            }
            gu0VarF.c();
        }
    }
}
