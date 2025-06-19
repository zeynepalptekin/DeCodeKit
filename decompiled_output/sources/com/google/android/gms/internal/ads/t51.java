package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.kc0;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class t51<AdT, AdapterT, ListenerT extends kc0> implements u01<AdT> {

    /* renamed from: a, reason: collision with root package name */
    private final v01<AdapterT, ListenerT> f5345a;

    /* renamed from: b, reason: collision with root package name */
    private final c11<AdT, AdapterT, ListenerT> f5346b;

    /* renamed from: c, reason: collision with root package name */
    private final cr1 f5347c;
    private final cy1 d;

    public t51(cr1 cr1Var, cy1 cy1Var, v01<AdapterT, ListenerT> v01Var, c11<AdT, AdapterT, ListenerT> c11Var) {
        this.f5347c = cr1Var;
        this.d = cy1Var;
        this.f5346b = c11Var;
        this.f5345a = v01Var;
    }

    @com.google.android.gms.common.util.d0
    static String d(String str, int r3) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 31);
        sb.append("Error from: ");
        sb.append(str);
        sb.append(", code: ");
        sb.append(r3);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.u01
    public final boolean a(wm1 wm1Var, km1 km1Var) {
        return !km1Var.s.isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.u01
    public final dy1<AdT> b(final wm1 wm1Var, final km1 km1Var) {
        final w01<AdapterT, ListenerT> w01VarA;
        Iterator<String> it = km1Var.s.iterator();
        while (true) {
            if (!it.hasNext()) {
                w01VarA = null;
                break;
            }
            try {
                w01VarA = this.f5345a.a(it.next(), km1Var.u);
                break;
            } catch (in1 unused) {
            }
        }
        if (w01VarA == null) {
            return qx1.a(new v31("unable to instantiate mediation adapter class"));
        }
        ks ksVar = new ks();
        w01VarA.f5760c.B6(new z51(this, w01VarA, ksVar));
        if (km1Var.H) {
            Bundle bundle = wm1Var.f5857a.f5710a.d.p;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        return this.f5347c.g(zq1.ADAPTER_LOAD_AD_SYN).a(new lq1(this, wm1Var, km1Var, w01VarA) { // from class: com.google.android.gms.internal.ads.w51

            /* renamed from: a, reason: collision with root package name */
            private final t51 f5789a;

            /* renamed from: b, reason: collision with root package name */
            private final wm1 f5790b;

            /* renamed from: c, reason: collision with root package name */
            private final km1 f5791c;
            private final w01 d;

            {
                this.f5789a = this;
                this.f5790b = wm1Var;
                this.f5791c = km1Var;
                this.d = w01VarA;
            }

            @Override // com.google.android.gms.internal.ads.lq1
            public final void run() throws Exception {
                this.f5789a.e(this.f5790b, this.f5791c, this.d);
            }
        }, this.d).j(zq1.ADAPTER_LOAD_AD_ACK).h(ksVar).j(zq1.ADAPTER_WRAP_ADAPTER).g(new iq1(this, wm1Var, km1Var, w01VarA) { // from class: com.google.android.gms.internal.ads.v51

            /* renamed from: a, reason: collision with root package name */
            private final t51 f5633a;

            /* renamed from: b, reason: collision with root package name */
            private final wm1 f5634b;

            /* renamed from: c, reason: collision with root package name */
            private final km1 f5635c;
            private final w01 d;

            {
                this.f5633a = this;
                this.f5634b = wm1Var;
                this.f5635c = km1Var;
                this.d = w01VarA;
            }

            @Override // com.google.android.gms.internal.ads.iq1
            public final Object a(Object obj) {
                return this.f5633a.c(this.f5634b, this.f5635c, this.d, (Void) obj);
            }
        }).f();
    }

    final /* synthetic */ Object c(wm1 wm1Var, km1 km1Var, w01 w01Var, Void r4) throws Exception {
        return this.f5346b.a(wm1Var, km1Var, w01Var);
    }

    final /* synthetic */ void e(wm1 wm1Var, km1 km1Var, w01 w01Var) throws Exception {
        this.f5346b.b(wm1Var, km1Var, w01Var);
    }
}
