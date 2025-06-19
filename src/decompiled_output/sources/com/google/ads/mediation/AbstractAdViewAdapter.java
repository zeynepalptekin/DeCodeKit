package com.google.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.d;
import com.google.android.gms.ads.d0.g;
import com.google.android.gms.ads.d0.i;
import com.google.android.gms.ads.d0.k;
import com.google.android.gms.ads.d0.o;
import com.google.android.gms.ads.d0.q;
import com.google.android.gms.ads.e;
import com.google.android.gms.ads.l;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.a0;
import com.google.android.gms.ads.mediation.d0;
import com.google.android.gms.ads.mediation.e0;
import com.google.android.gms.ads.mediation.g;
import com.google.android.gms.ads.mediation.h0;
import com.google.android.gms.ads.mediation.k;
import com.google.android.gms.ads.mediation.t;
import com.google.android.gms.ads.mediation.y;
import com.google.android.gms.ads.mediation.z;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.internal.ads.jr;
import com.google.android.gms.internal.ads.qx2;
import com.google.android.gms.internal.ads.tr;
import com.google.android.gms.internal.ads.uz2;
import com.google.android.gms.internal.ads.zv2;
import com.google.android.gms.internal.ads.zzbiy;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class AbstractAdViewAdapter implements com.google.android.gms.ads.mediation.MediationBannerAdapter, MediationNativeAdapter, d0, h0, MediationRewardedVideoAdAdapter, zzbiy {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private AdView zzmi;
    private l zzmj;
    private com.google.android.gms.ads.d zzmk;
    private Context zzml;
    private l zzmm;
    private com.google.android.gms.ads.reward.mediation.a zzmn;

    @com.google.android.gms.common.util.d0
    private final com.google.android.gms.ads.k0.d zzmo = new i(this);

    static class a extends z {
        private final com.google.android.gms.ads.d0.i n;

        public a(com.google.android.gms.ads.d0.i iVar) {
            this.n = iVar;
            C(iVar.k().toString());
            D(iVar.l());
            A(iVar.h().toString());
            if (iVar.m() != null) {
                E(iVar.m());
            }
            B(iVar.i().toString());
            z(iVar.g().toString());
            n(true);
            m(true);
            r(iVar.o());
        }

        @Override // com.google.android.gms.ads.mediation.x
        public final void o(View view) {
            if (view instanceof com.google.android.gms.ads.d0.e) {
                ((com.google.android.gms.ads.d0.e) view).setNativeAd(this.n);
            }
            com.google.android.gms.ads.d0.f fVar = com.google.android.gms.ads.d0.f.f2364c.get(view);
            if (fVar != null) {
                fVar.b(this.n);
            }
        }
    }

    static class b extends y {
        private final com.google.android.gms.ads.d0.g p;

        public b(com.google.android.gms.ads.d0.g gVar) {
            this.p = gVar;
            D(gVar.j().toString());
            F(gVar.l());
            B(gVar.g().toString());
            E(gVar.k());
            C(gVar.h().toString());
            if (gVar.o() != null) {
                H(gVar.o().doubleValue());
            }
            if (gVar.p() != null) {
                I(gVar.p().toString());
            }
            if (gVar.n() != null) {
                G(gVar.n().toString());
            }
            n(true);
            m(true);
            r(gVar.q());
        }

        @Override // com.google.android.gms.ads.mediation.x
        public final void o(View view) {
            if (view instanceof com.google.android.gms.ads.d0.e) {
                ((com.google.android.gms.ads.d0.e) view).setNativeAd(this.p);
            }
            com.google.android.gms.ads.d0.f fVar = com.google.android.gms.ads.d0.f.f2364c.get(view);
            if (fVar != null) {
                fVar.b(this.p);
            }
        }
    }

    @com.google.android.gms.common.util.d0
    static final class c extends com.google.android.gms.ads.c implements com.google.android.gms.ads.c0.a, zv2 {

        @com.google.android.gms.common.util.d0
        private final AbstractAdViewAdapter d;

        @com.google.android.gms.common.util.d0
        private final k e;

        public c(AbstractAdViewAdapter abstractAdViewAdapter, k kVar) {
            this.d = abstractAdViewAdapter;
            this.e = kVar;
        }

        @Override // com.google.android.gms.ads.c0.a
        public final void Q(String str, String str2) {
            this.e.r(this.d, str, str2);
        }

        @Override // com.google.android.gms.ads.c
        public final void f() {
            this.e.a(this.d);
        }

        @Override // com.google.android.gms.ads.c
        public final void g(int r3) {
            this.e.A(this.d, r3);
        }

        @Override // com.google.android.gms.ads.c
        public final void j() {
            this.e.l(this.d);
        }

        @Override // com.google.android.gms.ads.c
        public final void k() {
            this.e.k(this.d);
        }

        @Override // com.google.android.gms.ads.c
        public final void l() {
            this.e.s(this.d);
        }

        @Override // com.google.android.gms.ads.c, com.google.android.gms.internal.ads.zv2
        public final void p() {
            this.e.h(this.d);
        }
    }

    static class d extends e0 {
        private final o s;

        public d(o oVar) {
            this.s = oVar;
            A(oVar.i());
            C(oVar.k());
            w(oVar.f());
            B(oVar.j());
            x(oVar.g());
            v(oVar.e());
            I(oVar.q());
            J(oVar.r());
            H(oVar.o());
            P(oVar.E());
            G(true);
            F(true);
            M(oVar.s());
        }

        @Override // com.google.android.gms.ads.mediation.e0
        public final void K(View view, Map<String, View> map, Map<String, View> map2) {
            if (view instanceof q) {
                ((q) view).setNativeAd(this.s);
                return;
            }
            com.google.android.gms.ads.d0.f fVar = com.google.android.gms.ads.d0.f.f2364c.get(view);
            if (fVar != null) {
                fVar.c(this.s);
            }
        }
    }

    @com.google.android.gms.common.util.d0
    static final class e extends com.google.android.gms.ads.c implements g.a, i.a, k.b, k.c, o.a {

        @com.google.android.gms.common.util.d0
        private final AbstractAdViewAdapter d;

        @com.google.android.gms.common.util.d0
        private final t e;

        public e(AbstractAdViewAdapter abstractAdViewAdapter, t tVar) {
            this.d = abstractAdViewAdapter;
            this.e = tVar;
        }

        @Override // com.google.android.gms.ads.d0.i.a
        public final void a(com.google.android.gms.ads.d0.i iVar) {
            this.e.u(this.d, new a(iVar));
        }

        @Override // com.google.android.gms.ads.d0.g.a
        public final void b(com.google.android.gms.ads.d0.g gVar) {
            this.e.u(this.d, new b(gVar));
        }

        @Override // com.google.android.gms.ads.d0.k.b
        public final void c(com.google.android.gms.ads.d0.k kVar, String str) {
            this.e.x(this.d, kVar, str);
        }

        @Override // com.google.android.gms.ads.d0.o.a
        public final void d(o oVar) {
            this.e.v(this.d, new d(oVar));
        }

        @Override // com.google.android.gms.ads.d0.k.c
        public final void e(com.google.android.gms.ads.d0.k kVar) {
            this.e.p(this.d, kVar);
        }

        @Override // com.google.android.gms.ads.c
        public final void f() {
            this.e.j(this.d);
        }

        @Override // com.google.android.gms.ads.c
        public final void g(int r3) {
            this.e.m(this.d, r3);
        }

        @Override // com.google.android.gms.ads.c
        public final void i() {
            this.e.y(this.d);
        }

        @Override // com.google.android.gms.ads.c
        public final void j() {
            this.e.i(this.d);
        }

        @Override // com.google.android.gms.ads.c
        public final void k() {
        }

        @Override // com.google.android.gms.ads.c
        public final void l() {
            this.e.b(this.d);
        }

        @Override // com.google.android.gms.ads.c, com.google.android.gms.internal.ads.zv2
        public final void p() {
            this.e.o(this.d);
        }
    }

    @com.google.android.gms.common.util.d0
    static final class f extends com.google.android.gms.ads.c implements zv2 {

        @com.google.android.gms.common.util.d0
        private final AbstractAdViewAdapter d;

        @com.google.android.gms.common.util.d0
        private final com.google.android.gms.ads.mediation.q e;

        public f(AbstractAdViewAdapter abstractAdViewAdapter, com.google.android.gms.ads.mediation.q qVar) {
            this.d = abstractAdViewAdapter;
            this.e = qVar;
        }

        @Override // com.google.android.gms.ads.c
        public final void f() {
            this.e.t(this.d);
        }

        @Override // com.google.android.gms.ads.c
        public final void g(int r3) {
            this.e.f(this.d, r3);
        }

        @Override // com.google.android.gms.ads.c
        public final void j() {
            this.e.e(this.d);
        }

        @Override // com.google.android.gms.ads.c
        public final void k() {
            this.e.q(this.d);
        }

        @Override // com.google.android.gms.ads.c
        public final void l() {
            this.e.z(this.d);
        }

        @Override // com.google.android.gms.ads.c, com.google.android.gms.internal.ads.zv2
        public final void p() {
            this.e.w(this.d);
        }
    }

    private final com.google.android.gms.ads.e zza(Context context, com.google.android.gms.ads.mediation.f fVar, Bundle bundle, Bundle bundle2) {
        e.a aVar = new e.a();
        Date dateD = fVar.d();
        if (dateD != null) {
            aVar.h(dateD);
        }
        int r1 = fVar.n();
        if (r1 != 0) {
            aVar.j(r1);
        }
        Set<String> setF = fVar.f();
        if (setF != null) {
            Iterator<String> it = setF.iterator();
            while (it.hasNext()) {
                aVar.b(it.next());
            }
        }
        Location locationL = fVar.l();
        if (locationL != null) {
            aVar.l(locationL);
        }
        if (fVar.e()) {
            qx2.a();
            aVar.e(jr.l(context));
        }
        if (fVar.i() != -1) {
            aVar.q(fVar.i() == 1);
        }
        aVar.k(fVar.a());
        aVar.d(AdMobAdapter.class, zza(bundle, bundle2));
        return aVar.f();
    }

    static /* synthetic */ l zza(AbstractAdViewAdapter abstractAdViewAdapter, l lVar) {
        abstractAdViewAdapter.zzmm = null;
        return null;
    }

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.zzmi;
    }

    @Override // com.google.android.gms.internal.ads.zzbiy
    public Bundle getInterstitialAdapterInfo() {
        return new g.a().b(1).a();
    }

    @Override // com.google.android.gms.ads.mediation.h0
    public uz2 getVideoController() {
        com.google.android.gms.ads.z videoController;
        AdView adView = this.zzmi;
        if (adView == null || (videoController = adView.getVideoController()) == null) {
            return null;
        }
        return videoController.p();
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public void initialize(Context context, com.google.android.gms.ads.mediation.f fVar, String str, com.google.android.gms.ads.reward.mediation.a aVar, Bundle bundle, Bundle bundle2) {
        this.zzml = context.getApplicationContext();
        this.zzmn = aVar;
        aVar.o0(this);
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public boolean isInitialized() {
        return this.zzmn != null;
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public void loadAd(com.google.android.gms.ads.mediation.f fVar, Bundle bundle, Bundle bundle2) {
        Context context = this.zzml;
        if (context == null || this.zzmn == null) {
            tr.g("AdMobAdapter.loadAd called before initialize.");
            return;
        }
        l lVar = new l(context);
        this.zzmm = lVar;
        lVar.p(true);
        this.zzmm.k(getAdUnitId(bundle));
        this.zzmm.n(this.zzmo);
        this.zzmm.j(new h(this));
        this.zzmm.h(zza(this.zzml, fVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.g
    public void onDestroy() {
        AdView adView = this.zzmi;
        if (adView != null) {
            adView.a();
            this.zzmi = null;
        }
        if (this.zzmj != null) {
            this.zzmj = null;
        }
        if (this.zzmk != null) {
            this.zzmk = null;
        }
        if (this.zzmm != null) {
            this.zzmm = null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.d0
    public void onImmersiveModeUpdated(boolean z) {
        l lVar = this.zzmj;
        if (lVar != null) {
            lVar.l(z);
        }
        l lVar2 = this.zzmm;
        if (lVar2 != null) {
            lVar2.l(z);
        }
    }

    @Override // com.google.android.gms.ads.mediation.g
    public void onPause() {
        AdView adView = this.zzmi;
        if (adView != null) {
            adView.d();
        }
    }

    @Override // com.google.android.gms.ads.mediation.g
    public void onResume() {
        AdView adView = this.zzmi;
        if (adView != null) {
            adView.e();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, com.google.android.gms.ads.mediation.k kVar, Bundle bundle, com.google.android.gms.ads.f fVar, com.google.android.gms.ads.mediation.f fVar2, Bundle bundle2) {
        AdView adView = new AdView(context);
        this.zzmi = adView;
        adView.setAdSize(new com.google.android.gms.ads.f(fVar.l(), fVar.d()));
        this.zzmi.setAdUnitId(getAdUnitId(bundle));
        this.zzmi.setAdListener(new c(this, kVar));
        this.zzmi.c(zza(context, fVar2, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, com.google.android.gms.ads.mediation.q qVar, Bundle bundle, com.google.android.gms.ads.mediation.f fVar, Bundle bundle2) {
        l lVar = new l(context);
        this.zzmj = lVar;
        lVar.k(getAdUnitId(bundle));
        this.zzmj.i(new f(this, qVar));
        this.zzmj.h(zza(context, fVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(Context context, t tVar, Bundle bundle, a0 a0Var, Bundle bundle2) {
        e eVar = new e(this, tVar);
        d.a aVarG = new d.a(context, bundle.getString(AD_UNIT_ID_PARAMETER)).g(eVar);
        com.google.android.gms.ads.d0.d dVarH = a0Var.h();
        if (dVarH != null) {
            aVarG.i(dVarH);
        }
        if (a0Var.k()) {
            aVarG.f(eVar);
        }
        if (a0Var.c()) {
            aVarG.b(eVar);
        }
        if (a0Var.m()) {
            aVarG.c(eVar);
        }
        if (a0Var.g()) {
            for (String str : a0Var.b().keySet()) {
                aVarG.d(str, eVar, a0Var.b().get(str).booleanValue() ? eVar : null);
            }
        }
        com.google.android.gms.ads.d dVarA = aVarG.a();
        this.zzmk = dVarA;
        dVarA.c(zza(context, a0Var, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        this.zzmj.o();
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public void showVideo() {
        this.zzmm.o();
    }

    protected abstract Bundle zza(Bundle bundle, Bundle bundle2);
}
