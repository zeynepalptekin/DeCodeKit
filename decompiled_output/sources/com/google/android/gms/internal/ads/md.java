package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.reward.mediation.InitializableMediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class md extends uc {
    private final Object e;
    private sd f;
    private mk g;
    private c.a.b.b.e.c h;
    private com.google.android.gms.ads.mediation.u i;

    public md(@androidx.annotation.h0 com.google.android.gms.ads.mediation.a aVar) {
        this.e = aVar;
    }

    public md(@androidx.annotation.h0 com.google.android.gms.ads.mediation.g gVar) {
        this.e = gVar;
    }

    @androidx.annotation.i0
    private static String C8(String str, jw2 jw2Var) {
        String str2 = jw2Var.x;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    private static boolean D8(jw2 jw2Var) {
        if (jw2Var.i) {
            return true;
        }
        qx2.a();
        return jr.x();
    }

    private final Bundle E8(jw2 jw2Var) {
        Bundle bundle;
        Bundle bundle2 = jw2Var.p;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.e.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private final Bundle y8(String str, jw2 jw2Var, String str2) throws RemoteException {
        String strValueOf = String.valueOf(str);
        tr.f(strValueOf.length() != 0 ? "Server parameters: ".concat(strValueOf) : new String("Server parameters: "));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.e instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (jw2Var != null) {
                    bundle.putInt("tagForChildDirectedTreatment", jw2Var.j);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            tr.c("", th);
            throw new RemoteException();
        }
    }

    private final com.google.android.gms.ads.mediation.e<com.google.android.gms.ads.mediation.u, com.google.android.gms.ads.mediation.v> z8(wc wcVar) {
        return new od(this, wcVar);
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void D() throws RemoteException {
        Object obj = this.e;
        if (obj instanceof com.google.android.gms.ads.mediation.g) {
            try {
                ((com.google.android.gms.ads.mediation.g) obj).onResume();
            } catch (Throwable th) {
                tr.c("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final c.a.b.b.e.c F3() throws RemoteException {
        Object obj = this.e;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return c.a.b.b.e.e.i2(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                tr.c("", th);
                throw new RemoteException();
            }
        }
        String canonicalName = MediationBannerAdapter.class.getCanonicalName();
        String canonicalName2 = this.e.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        tr.i(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void G6(c.a.b.b.e.c cVar, mk mkVar, List<String> list) throws RemoteException {
        if (!(this.e instanceof InitializableMediationRewardedVideoAdAdapter)) {
            String canonicalName = InitializableMediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = this.e.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            tr.i(sb.toString());
            throw new RemoteException();
        }
        tr.f("Initialize rewarded video adapter.");
        try {
            InitializableMediationRewardedVideoAdAdapter initializableMediationRewardedVideoAdAdapter = (InitializableMediationRewardedVideoAdAdapter) this.e;
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(y8(it.next(), null, null));
            }
            initializableMediationRewardedVideoAdAdapter.initialize((Context) c.a.b.b.e.e.e2(cVar), new nk(mkVar), arrayList);
        } catch (Throwable th) {
            tr.d("Could not initialize rewarded video adapter.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void H4(jw2 jw2Var, String str, String str2) throws RemoteException {
        Object obj = this.e;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            tr.f("Requesting rewarded video ad from adapter.");
            try {
                MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.e;
                mediationRewardedVideoAdAdapter.loadAd(new nd(jw2Var.e == -1 ? null : new Date(jw2Var.e), jw2Var.g, jw2Var.h != null ? new HashSet(jw2Var.h) : null, jw2Var.n, D8(jw2Var), jw2Var.j, jw2Var.u, jw2Var.w, C8(str, jw2Var)), y8(str, jw2Var, str2), jw2Var.p != null ? jw2Var.p.getBundle(mediationRewardedVideoAdAdapter.getClass().getName()) : null);
                return;
            } catch (Throwable th) {
                tr.c("", th);
                throw new RemoteException();
            }
        }
        if (obj instanceof com.google.android.gms.ads.mediation.a) {
            J2(this.h, jw2Var, str, new rd((com.google.android.gms.ads.mediation.a) obj, this.g));
            return;
        }
        String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
        String canonicalName2 = com.google.android.gms.ads.mediation.a.class.getCanonicalName();
        String canonicalName3 = this.e.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
        sb.append(canonicalName);
        sb.append(" or ");
        sb.append(canonicalName2);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName3);
        tr.i(sb.toString());
        throw new RemoteException();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.vc
    public final void H6(c.a.b.b.e.c cVar, c8 c8Var, List<l8> list) throws RemoteException {
        com.google.android.gms.ads.b bVar;
        if (!(this.e instanceof com.google.android.gms.ads.mediation.a)) {
            throw new RemoteException();
        }
        qd qdVar = new qd(this, c8Var);
        ArrayList arrayList = new ArrayList();
        for (l8 l8Var : list) {
            String str = l8Var.d;
            char c2 = 65535;
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals("banner")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1052618729:
                    if (str.equals("native")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case -239580146:
                    if (str.equals("rewarded")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 604727084:
                    if (str.equals("interstitial")) {
                        c2 = 1;
                        break;
                    }
                    break;
            }
            if (c2 == 0) {
                bVar = com.google.android.gms.ads.b.BANNER;
            } else if (c2 == 1) {
                bVar = com.google.android.gms.ads.b.INTERSTITIAL;
            } else if (c2 == 2) {
                bVar = com.google.android.gms.ads.b.REWARDED;
            } else {
                if (c2 != 3) {
                    throw new RemoteException();
                }
                bVar = com.google.android.gms.ads.b.NATIVE;
            }
            arrayList.add(new com.google.android.gms.ads.mediation.l(bVar, l8Var.e));
        }
        ((com.google.android.gms.ads.mediation.a) this.e).initialize((Context) c.a.b.b.e.e.e2(cVar), qdVar, arrayList);
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final mf I0() {
        Object obj = this.e;
        if (obj instanceof com.google.android.gms.ads.mediation.a) {
            return mf.h(((com.google.android.gms.ads.mediation.a) obj).getSDKVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void J2(c.a.b.b.e.c cVar, jw2 jw2Var, String str, wc wcVar) throws RemoteException {
        if (this.e instanceof com.google.android.gms.ads.mediation.a) {
            tr.f("Requesting rewarded ad from adapter.");
            try {
                ((com.google.android.gms.ads.mediation.a) this.e).loadRewardedAd(new com.google.android.gms.ads.mediation.w((Context) c.a.b.b.e.e.e2(cVar), "", y8(str, jw2Var, null), E8(jw2Var), D8(jw2Var), jw2Var.n, jw2Var.j, jw2Var.w, C8(str, jw2Var), ""), z8(wcVar));
                return;
            } catch (Exception e) {
                tr.c("", e);
                throw new RemoteException();
            }
        }
        String canonicalName = com.google.android.gms.ads.mediation.a.class.getCanonicalName();
        String canonicalName2 = this.e.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        tr.i(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void L7(c.a.b.b.e.c cVar, jw2 jw2Var, String str, String str2, wc wcVar, z2 z2Var, List<String> list) throws RemoteException {
        Object obj = this.e;
        if (!(obj instanceof MediationNativeAdapter)) {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = this.e.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            tr.i(sb.toString());
            throw new RemoteException();
        }
        try {
            MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj;
            wd wdVar = new wd(jw2Var.e == -1 ? null : new Date(jw2Var.e), jw2Var.g, jw2Var.h != null ? new HashSet(jw2Var.h) : null, jw2Var.n, D8(jw2Var), jw2Var.j, z2Var, list, jw2Var.u, jw2Var.w, C8(str, jw2Var));
            Bundle bundle = jw2Var.p != null ? jw2Var.p.getBundle(mediationNativeAdapter.getClass().getName()) : null;
            this.f = new sd(wcVar);
            mediationNativeAdapter.requestNativeAd((Context) c.a.b.b.e.e.e2(cVar), this.f, y8(str, jw2Var, str2), wdVar, bundle);
        } catch (Throwable th) {
            tr.c("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final dd O1() {
        com.google.android.gms.ads.mediation.x xVarC = this.f.C();
        if (xVarC instanceof com.google.android.gms.ads.mediation.y) {
            return new ud((com.google.android.gms.ads.mediation.y) xVarC);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void O7(c.a.b.b.e.c cVar, jw2 jw2Var, String str, wc wcVar) throws RemoteException {
        P5(cVar, jw2Var, str, null, wcVar);
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void P5(c.a.b.b.e.c cVar, jw2 jw2Var, String str, String str2, wc wcVar) throws RemoteException {
        if (!(this.e instanceof MediationInterstitialAdapter)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = this.e.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            tr.i(sb.toString());
            throw new RemoteException();
        }
        tr.f("Requesting interstitial ad from adapter.");
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) this.e;
            mediationInterstitialAdapter.requestInterstitialAd((Context) c.a.b.b.e.e.e2(cVar), new sd(wcVar), y8(str, jw2Var, str2), new nd(jw2Var.e == -1 ? null : new Date(jw2Var.e), jw2Var.g, jw2Var.h != null ? new HashSet(jw2Var.h) : null, jw2Var.n, D8(jw2Var), jw2Var.j, jw2Var.u, jw2Var.w, C8(str, jw2Var)), jw2Var.p != null ? jw2Var.p.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
        } catch (Throwable th) {
            tr.c("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final Bundle P6() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void T(boolean z) throws RemoteException {
        Object obj = this.e;
        if (obj instanceof com.google.android.gms.ads.mediation.d0) {
            try {
                ((com.google.android.gms.ads.mediation.d0) obj).onImmersiveModeUpdated(z);
                return;
            } catch (Throwable th) {
                tr.c("", th);
                return;
            }
        }
        String canonicalName = com.google.android.gms.ads.mediation.d0.class.getCanonicalName();
        String canonicalName2 = this.e.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        tr.f(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final boolean U4() {
        return this.e instanceof InitializableMediationRewardedVideoAdAdapter;
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final ed Z6() {
        com.google.android.gms.ads.mediation.x xVarC = this.f.C();
        if (xVarC instanceof com.google.android.gms.ads.mediation.z) {
            return new td((com.google.android.gms.ads.mediation.z) xVarC);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final mf b1() {
        Object obj = this.e;
        if (obj instanceof com.google.android.gms.ads.mediation.a) {
            return mf.h(((com.google.android.gms.ads.mediation.a) obj).getVersionInfo());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void b7(c.a.b.b.e.c cVar) throws RemoteException {
        if (this.e instanceof com.google.android.gms.ads.mediation.a) {
            tr.f("Show rewarded ad from adapter.");
            com.google.android.gms.ads.mediation.u uVar = this.i;
            if (uVar != null) {
                uVar.a((Context) c.a.b.b.e.e.e2(cVar));
                return;
            } else {
                tr.g("Can not show null mediation rewarded ad.");
                throw new RemoteException();
            }
        }
        String canonicalName = com.google.android.gms.ads.mediation.a.class.getCanonicalName();
        String canonicalName2 = this.e.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        tr.i(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final jd c8() {
        com.google.android.gms.ads.mediation.e0 e0VarD = this.f.D();
        if (e0VarD != null) {
            return new me(e0VarD);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void d2(c.a.b.b.e.c cVar) throws RemoteException {
        Context context = (Context) c.a.b.b.e.e.e2(cVar);
        Object obj = this.e;
        if (obj instanceof com.google.android.gms.ads.mediation.c0) {
            ((com.google.android.gms.ads.mediation.c0) obj).a(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void destroy() throws RemoteException {
        Object obj = this.e;
        if (obj instanceof com.google.android.gms.ads.mediation.g) {
            try {
                ((com.google.android.gms.ads.mediation.g) obj).onDestroy();
            } catch (Throwable th) {
                tr.c("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final h4 e3() {
        com.google.android.gms.ads.d0.k kVarE = this.f.E();
        if (kVarE instanceof i4) {
            return ((i4) kVarE).a();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final Bundle getInterstitialAdapterInfo() {
        Object obj = this.e;
        if (obj instanceof zzbiy) {
            return ((zzbiy) obj).getInterstitialAdapterInfo();
        }
        String canonicalName = zzbiy.class.getCanonicalName();
        String canonicalName2 = this.e.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        tr.i(sb.toString());
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final uz2 getVideoController() {
        Object obj = this.e;
        if (!(obj instanceof com.google.android.gms.ads.mediation.h0)) {
            return null;
        }
        try {
            return ((com.google.android.gms.ads.mediation.h0) obj).getVideoController();
        } catch (Throwable th) {
            tr.c("", th);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void h3(c.a.b.b.e.c cVar, qw2 qw2Var, jw2 jw2Var, String str, wc wcVar) throws RemoteException {
        n4(cVar, qw2Var, jw2Var, str, null, wcVar);
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final boolean isInitialized() throws RemoteException {
        Object obj = this.e;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            tr.f("Check if adapter is initialized.");
            try {
                return ((MediationRewardedVideoAdAdapter) this.e).isInitialized();
            } catch (Throwable th) {
                tr.c("", th);
                throw new RemoteException();
            }
        }
        if (obj instanceof com.google.android.gms.ads.mediation.a) {
            return this.g != null;
        }
        String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
        String canonicalName2 = com.google.android.gms.ads.mediation.a.class.getCanonicalName();
        String canonicalName3 = this.e.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
        sb.append(canonicalName);
        sb.append(" or ");
        sb.append(canonicalName2);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName3);
        tr.i(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void n4(c.a.b.b.e.c cVar, qw2 qw2Var, jw2 jw2Var, String str, String str2, wc wcVar) throws RemoteException {
        if (!(this.e instanceof MediationBannerAdapter)) {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = this.e.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            tr.i(sb.toString());
            throw new RemoteException();
        }
        tr.f("Requesting banner ad from adapter.");
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.e;
            mediationBannerAdapter.requestBannerAd((Context) c.a.b.b.e.e.e2(cVar), new sd(wcVar), y8(str, jw2Var, str2), qw2Var.q ? com.google.android.gms.ads.p0.a(qw2Var.h, qw2Var.e) : com.google.android.gms.ads.p0.b(qw2Var.h, qw2Var.e, qw2Var.d), new nd(jw2Var.e == -1 ? null : new Date(jw2Var.e), jw2Var.g, jw2Var.h != null ? new HashSet(jw2Var.h) : null, jw2Var.n, D8(jw2Var), jw2Var.j, jw2Var.u, jw2Var.w, C8(str, jw2Var)), jw2Var.p != null ? jw2Var.p.getBundle(mediationBannerAdapter.getClass().getName()) : null);
        } catch (Throwable th) {
            tr.c("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void showInterstitial() throws RemoteException {
        if (this.e instanceof MediationInterstitialAdapter) {
            tr.f("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.e).showInterstitial();
                return;
            } catch (Throwable th) {
                tr.c("", th);
                throw new RemoteException();
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = this.e.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        tr.i(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void showVideo() throws RemoteException {
        Object obj = this.e;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            tr.f("Show rewarded video ad from adapter.");
            try {
                ((MediationRewardedVideoAdAdapter) this.e).showVideo();
                return;
            } catch (Throwable th) {
                tr.c("", th);
                throw new RemoteException();
            }
        }
        if (obj instanceof com.google.android.gms.ads.mediation.a) {
            com.google.android.gms.ads.mediation.u uVar = this.i;
            if (uVar != null) {
                uVar.a((Context) c.a.b.b.e.e.e2(this.h));
                return;
            } else {
                tr.g("Can not show null mediated rewarded ad.");
                throw new RemoteException();
            }
        }
        String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
        String canonicalName2 = com.google.android.gms.ads.mediation.a.class.getCanonicalName();
        String canonicalName3 = this.e.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
        sb.append(canonicalName);
        sb.append(" or ");
        sb.append(canonicalName2);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName3);
        tr.i(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void t() throws RemoteException {
        Object obj = this.e;
        if (obj instanceof com.google.android.gms.ads.mediation.g) {
            try {
                ((com.google.android.gms.ads.mediation.g) obj).onPause();
            } catch (Throwable th) {
                tr.c("", th);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void t6(c.a.b.b.e.c cVar, jw2 jw2Var, String str, mk mkVar, String str2) throws RemoteException {
        nd ndVar;
        Bundle bundle;
        Object obj = this.e;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            tr.f("Initialize rewarded video adapter.");
            try {
                MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.e;
                Bundle bundleY8 = y8(str2, jw2Var, null);
                if (jw2Var != null) {
                    nd ndVar2 = new nd(jw2Var.e == -1 ? null : new Date(jw2Var.e), jw2Var.g, jw2Var.h != null ? new HashSet(jw2Var.h) : null, jw2Var.n, D8(jw2Var), jw2Var.j, jw2Var.u, jw2Var.w, C8(str2, jw2Var));
                    bundle = jw2Var.p != null ? jw2Var.p.getBundle(mediationRewardedVideoAdAdapter.getClass().getName()) : null;
                    ndVar = ndVar2;
                } else {
                    ndVar = null;
                    bundle = null;
                }
                mediationRewardedVideoAdAdapter.initialize((Context) c.a.b.b.e.e.e2(cVar), ndVar, str, new nk(mkVar), bundleY8, bundle);
                return;
            } catch (Throwable th) {
                tr.c("", th);
                throw new RemoteException();
            }
        }
        if (obj instanceof com.google.android.gms.ads.mediation.a) {
            this.h = cVar;
            this.g = mkVar;
            mkVar.T7(c.a.b.b.e.e.i2(obj));
            return;
        }
        String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
        String canonicalName2 = com.google.android.gms.ads.mediation.a.class.getCanonicalName();
        String canonicalName3 = this.e.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 26 + String.valueOf(canonicalName2).length() + String.valueOf(canonicalName3).length());
        sb.append(canonicalName);
        sb.append(" or ");
        sb.append(canonicalName2);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName3);
        tr.i(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void v8(jw2 jw2Var, String str) throws RemoteException {
        H4(jw2Var, str, null);
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void y4(c.a.b.b.e.c cVar, jw2 jw2Var, String str, wc wcVar) throws RemoteException {
        if (this.e instanceof com.google.android.gms.ads.mediation.a) {
            tr.f("Requesting rewarded interstitial ad from adapter.");
            try {
                ((com.google.android.gms.ads.mediation.a) this.e).loadRewardedInterstitialAd(new com.google.android.gms.ads.mediation.w((Context) c.a.b.b.e.e.e2(cVar), "", y8(str, jw2Var, null), E8(jw2Var), D8(jw2Var), jw2Var.n, jw2Var.j, jw2Var.w, C8(str, jw2Var), ""), z8(wcVar));
                return;
            } catch (Exception e) {
                tr.c("", e);
                throw new RemoteException();
            }
        }
        String canonicalName = com.google.android.gms.ads.mediation.a.class.getCanonicalName();
        String canonicalName2 = this.e.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        tr.i(sb.toString());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final Bundle zztv() {
        Object obj = this.e;
        if (obj instanceof zzbiw) {
            return ((zzbiw) obj).zztv();
        }
        String canonicalName = zzbiw.class.getCanonicalName();
        String canonicalName2 = this.e.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        tr.i(sb.toString());
        return new Bundle();
    }
}
