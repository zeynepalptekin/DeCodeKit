package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.e70;
import com.google.android.gms.internal.ads.ga0;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class gj1<R extends ga0<AdT>, AdT extends e70> implements ik1<R, cp1<AdT>> {

    /* renamed from: a, reason: collision with root package name */
    private R f3545a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f3546b = fy1.c();

    @Override // com.google.android.gms.internal.ads.ik1
    public final /* synthetic */ Object a() {
        return this.f3545a;
    }

    @Override // com.google.android.gms.internal.ads.ik1
    public final dy1<cp1<AdT>> b(jk1 jk1Var, kk1<R> kk1Var) {
        ja0<R> ja0VarA = kk1Var.a(jk1Var.f3984b);
        ja0VarA.s(new rk1(true));
        R rD = ja0VarA.d();
        this.f3545a = rD;
        final c80 c80VarB = rD.b();
        final cp1 cp1Var = new cp1();
        wi wiVar = jk1Var.f3983a;
        return lx1.H(wiVar != null ? c80VarB.b(wiVar) : c80VarB.f()).G(new ax1(this, cp1Var, c80VarB) { // from class: com.google.android.gms.internal.ads.jj1

            /* renamed from: a, reason: collision with root package name */
            private final gj1 f3974a;

            /* renamed from: b, reason: collision with root package name */
            private final cp1 f3975b;

            /* renamed from: c, reason: collision with root package name */
            private final c80 f3976c;

            {
                this.f3974a = this;
                this.f3975b = cp1Var;
                this.f3976c = c80VarB;
            }

            @Override // com.google.android.gms.internal.ads.ax1
            public final dy1 a(Object obj) {
                cp1 cp1Var2 = this.f3975b;
                c80 c80Var = this.f3976c;
                wm1 wm1Var = (wm1) obj;
                cp1Var2.f3013b = wm1Var;
                Iterator<km1> it = wm1Var.f5858b.f5550a.iterator();
                boolean z = false;
                boolean z2 = false;
                loop0: while (true) {
                    if (!it.hasNext()) {
                        z = z2;
                        break;
                    }
                    Iterator<String> it2 = it.next().f4111a.iterator();
                    while (it2.hasNext()) {
                        if (!it2.next().contains("FirstPartyRenderer")) {
                            break loop0;
                        }
                        z2 = true;
                    }
                }
                return !z ? qx1.g(null) : c80Var.j(qx1.g(wm1Var));
            }
        }, this.f3546b).D(new ru1(cp1Var) { // from class: com.google.android.gms.internal.ads.ij1

            /* renamed from: a, reason: collision with root package name */
            private final cp1 f3830a;

            {
                this.f3830a = cp1Var;
            }

            @Override // com.google.android.gms.internal.ads.ru1
            public final Object a(Object obj) {
                cp1 cp1Var2 = this.f3830a;
                cp1Var2.f3014c = (AdT) obj;
                return cp1Var2;
            }
        }, this.f3546b);
    }
}
