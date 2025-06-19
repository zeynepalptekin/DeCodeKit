package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class hf extends bf {
    private final RtbAdapter e;
    private com.google.android.gms.ads.mediation.n f;
    private com.google.android.gms.ads.mediation.u g;
    private String h = "";

    public hf(RtbAdapter rtbAdapter) {
        this.e = rtbAdapter;
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

    private static Bundle F8(String str) throws RemoteException {
        String strValueOf = String.valueOf(str);
        tr.i(strValueOf.length() != 0 ? "Server parameters: ".concat(strValueOf) : new String("Server parameters: "));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (JSONException e) {
            tr.c("", e);
            throw new RemoteException();
        }
    }

    private final com.google.android.gms.ads.mediation.e<com.google.android.gms.ads.mediation.u, com.google.android.gms.ads.mediation.v> z8(xe xeVar, wc wcVar) {
        return new kf(this, xeVar, wcVar);
    }

    @Override // com.google.android.gms.internal.ads.ye
    public final void E5(String str, String str2, jw2 jw2Var, c.a.b.b.e.c cVar, re reVar, wc wcVar) throws RemoteException {
        try {
            this.e.loadInterstitialAd(new com.google.android.gms.ads.mediation.p((Context) c.a.b.b.e.e.e2(cVar), str, F8(str2), E8(jw2Var), D8(jw2Var), jw2Var.n, jw2Var.j, jw2Var.w, C8(str2, jw2Var), this.h), new jf(this, reVar, wcVar));
        } catch (Throwable th) {
            tr.c("Adapter failed to render interstitial ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.ye
    public final mf I0() throws RemoteException {
        return mf.h(this.e.getSDKVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.ye
    public final void I4(String[] strArr, Bundle[] bundleArr) {
    }

    @Override // com.google.android.gms.internal.ads.ye
    public final void R3(String str) {
        this.h = str;
    }

    @Override // com.google.android.gms.internal.ads.ye
    public final void R5(c.a.b.b.e.c cVar) {
    }

    @Override // com.google.android.gms.internal.ads.ye
    public final void T3(String str, String str2, jw2 jw2Var, c.a.b.b.e.c cVar, xe xeVar, wc wcVar) throws RemoteException {
        try {
            this.e.loadRewardedInterstitialAd(new com.google.android.gms.ads.mediation.w((Context) c.a.b.b.e.e.e2(cVar), str, F8(str2), E8(jw2Var), D8(jw2Var), jw2Var.n, jw2Var.j, jw2Var.w, C8(str2, jw2Var), this.h), z8(xeVar, wcVar));
        } catch (Throwable th) {
            tr.c("Adapter failed to render rewarded interstitial ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.ye
    public final mf b1() throws RemoteException {
        return mf.h(this.e.getVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.ye
    public final void f7(String str, String str2, jw2 jw2Var, c.a.b.b.e.c cVar, se seVar, wc wcVar) throws RemoteException {
        try {
            this.e.loadNativeAd(new com.google.android.gms.ads.mediation.s((Context) c.a.b.b.e.e.e2(cVar), str, F8(str2), E8(jw2Var), D8(jw2Var), jw2Var.n, jw2Var.j, jw2Var.w, C8(str2, jw2Var), this.h), new Cif(this, seVar, wcVar));
        } catch (Throwable th) {
            tr.c("Adapter failed to render rewarded ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.ye
    public final uz2 getVideoController() {
        com.google.android.gms.ads.mediation.m mVar = this.e;
        if (!(mVar instanceof com.google.android.gms.ads.mediation.h0)) {
            return null;
        }
        try {
            return ((com.google.android.gms.ads.mediation.h0) mVar).getVideoController();
        } catch (Throwable th) {
            tr.c("", th);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.ye
    public final boolean h7(c.a.b.b.e.c cVar) throws RemoteException {
        com.google.android.gms.ads.mediation.u uVar = this.g;
        if (uVar == null) {
            return false;
        }
        try {
            uVar.a((Context) c.a.b.b.e.e.e2(cVar));
            return true;
        } catch (Throwable th) {
            tr.c("", th);
            return true;
        }
    }

    @Override // com.google.android.gms.internal.ads.ye
    public final void i3(String str, String str2, jw2 jw2Var, c.a.b.b.e.c cVar, le leVar, wc wcVar, qw2 qw2Var) throws RemoteException {
        try {
            this.e.loadBannerAd(new com.google.android.gms.ads.mediation.j((Context) c.a.b.b.e.e.e2(cVar), str, F8(str2), E8(jw2Var), D8(jw2Var), jw2Var.n, jw2Var.j, jw2Var.w, C8(str2, jw2Var), com.google.android.gms.ads.p0.b(qw2Var.h, qw2Var.e, qw2Var.d), this.h), new gf(this, leVar, wcVar));
        } catch (Throwable th) {
            tr.c("Adapter failed to render banner ad.", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.ye
    public final void m2(String str, String str2, jw2 jw2Var, c.a.b.b.e.c cVar, xe xeVar, wc wcVar) throws RemoteException {
        try {
            this.e.loadRewardedAd(new com.google.android.gms.ads.mediation.w((Context) c.a.b.b.e.e.e2(cVar), str, F8(str2), E8(jw2Var), D8(jw2Var), jw2Var.n, jw2Var.j, jw2Var.w, C8(str2, jw2Var), this.h), z8(xeVar, wcVar));
        } catch (Throwable th) {
            tr.c("Adapter failed to render rewarded ad.", th);
            throw new RemoteException();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.ye
    public final void n2(c.a.b.b.e.c cVar, String str, Bundle bundle, Bundle bundle2, qw2 qw2Var, df dfVar) throws RemoteException {
        com.google.android.gms.ads.b bVar;
        try {
            lf lfVar = new lf(this, dfVar);
            RtbAdapter rtbAdapter = this.e;
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
                    throw new IllegalArgumentException("Internal Error");
                }
                bVar = com.google.android.gms.ads.b.NATIVE;
            }
            com.google.android.gms.ads.mediation.l lVar = new com.google.android.gms.ads.mediation.l(bVar, bundle2);
            ArrayList arrayList = new ArrayList();
            arrayList.add(lVar);
            rtbAdapter.collectSignals(new com.google.android.gms.ads.mediation.rtb.a((Context) c.a.b.b.e.e.e2(cVar), arrayList, bundle, com.google.android.gms.ads.p0.b(qw2Var.h, qw2Var.e, qw2Var.d)), lfVar);
        } catch (Throwable th) {
            tr.c("Error generating signals for RTB", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.ye
    public final boolean x6(c.a.b.b.e.c cVar) throws RemoteException {
        com.google.android.gms.ads.mediation.n nVar = this.f;
        if (nVar == null) {
            return false;
        }
        try {
            nVar.a((Context) c.a.b.b.e.e.e2(cVar));
            return true;
        } catch (Throwable th) {
            tr.c("", th);
            return true;
        }
    }
}
