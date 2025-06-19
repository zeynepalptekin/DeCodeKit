package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.f;
import com.google.ads.mediation.g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class vd<NETWORK_EXTRAS extends com.google.ads.mediation.g, SERVER_PARAMETERS extends com.google.ads.mediation.f> extends uc {
    private final com.google.ads.mediation.c<NETWORK_EXTRAS, SERVER_PARAMETERS> e;
    private final NETWORK_EXTRAS f;

    public vd(com.google.ads.mediation.c<NETWORK_EXTRAS, SERVER_PARAMETERS> cVar, NETWORK_EXTRAS network_extras) {
        this.e = cVar;
        this.f = network_extras;
    }

    private static boolean y8(jw2 jw2Var) {
        if (jw2Var.i) {
            return true;
        }
        qx2.a();
        return jr.x();
    }

    private final SERVER_PARAMETERS z8(String str) throws RemoteException {
        HashMap map;
        try {
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                map = new HashMap(jSONObject.length());
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, jSONObject.getString(next));
                }
            } else {
                map = new HashMap(0);
            }
            Class<SERVER_PARAMETERS> serverParametersType = this.e.getServerParametersType();
            if (serverParametersType == null) {
                return null;
            }
            SERVER_PARAMETERS server_parametersNewInstance = serverParametersType.newInstance();
            server_parametersNewInstance.a(map);
            return server_parametersNewInstance;
        } catch (Throwable th) {
            tr.c("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void D() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final c.a.b.b.e.c F3() throws RemoteException {
        com.google.ads.mediation.c<NETWORK_EXTRAS, SERVER_PARAMETERS> cVar = this.e;
        if (!(cVar instanceof MediationBannerAdapter)) {
            String strValueOf = String.valueOf(cVar.getClass().getCanonicalName());
            tr.i(strValueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(strValueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        try {
            return c.a.b.b.e.e.i2(((MediationBannerAdapter) cVar).getBannerView());
        } catch (Throwable th) {
            tr.c("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void G6(c.a.b.b.e.c cVar, mk mkVar, List<String> list) {
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void H4(jw2 jw2Var, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void H6(c.a.b.b.e.c cVar, c8 c8Var, List<l8> list) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final mf I0() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void J2(c.a.b.b.e.c cVar, jw2 jw2Var, String str, wc wcVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void L7(c.a.b.b.e.c cVar, jw2 jw2Var, String str, String str2, wc wcVar, z2 z2Var, List<String> list) {
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final dd O1() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void O7(c.a.b.b.e.c cVar, jw2 jw2Var, String str, wc wcVar) throws RemoteException {
        P5(cVar, jw2Var, str, null, wcVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.vc
    public final void P5(c.a.b.b.e.c cVar, jw2 jw2Var, String str, String str2, wc wcVar) throws RemoteException {
        com.google.ads.mediation.c<NETWORK_EXTRAS, SERVER_PARAMETERS> cVar2 = this.e;
        if (!(cVar2 instanceof MediationInterstitialAdapter)) {
            String strValueOf = String.valueOf(cVar2.getClass().getCanonicalName());
            tr.i(strValueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(strValueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        tr.f("Requesting interstitial ad from adapter.");
        try {
            ((MediationInterstitialAdapter) this.e).requestInterstitialAd(new yd(wcVar), (Activity) c.a.b.b.e.e.e2(cVar), z8(str), ke.b(jw2Var, y8(jw2Var)), this.f);
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
    public final void T(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final boolean U4() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final ed Z6() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final mf b1() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void b7(c.a.b.b.e.c cVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final jd c8() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void d2(c.a.b.b.e.c cVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void destroy() throws RemoteException {
        try {
            this.e.destroy();
        } catch (Throwable th) {
            tr.c("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final h4 e3() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final Bundle getInterstitialAdapterInfo() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final uz2 getVideoController() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void h3(c.a.b.b.e.c cVar, qw2 qw2Var, jw2 jw2Var, String str, wc wcVar) throws RemoteException {
        n4(cVar, qw2Var, jw2Var, str, null, wcVar);
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final boolean isInitialized() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.vc
    public final void n4(c.a.b.b.e.c cVar, qw2 qw2Var, jw2 jw2Var, String str, String str2, wc wcVar) throws RemoteException {
        c.a.a.b bVar;
        com.google.ads.mediation.c<NETWORK_EXTRAS, SERVER_PARAMETERS> cVar2 = this.e;
        if (!(cVar2 instanceof MediationBannerAdapter)) {
            String strValueOf = String.valueOf(cVar2.getClass().getCanonicalName());
            tr.i(strValueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(strValueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        tr.f("Requesting banner ad from adapter.");
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.e;
            yd ydVar = new yd(wcVar);
            Activity activity = (Activity) c.a.b.b.e.e.e2(cVar);
            com.google.ads.mediation.f fVarZ8 = z8(str);
            int r13 = 0;
            c.a.a.b[] bVarArr = {c.a.a.b.g, c.a.a.b.h, c.a.a.b.i, c.a.a.b.j, c.a.a.b.k, c.a.a.b.l};
            while (true) {
                if (r13 >= 6) {
                    bVar = new c.a.a.b(com.google.android.gms.ads.p0.b(qw2Var.h, qw2Var.e, qw2Var.d));
                    break;
                } else {
                    if (bVarArr[r13].d() == qw2Var.h && bVarArr[r13].b() == qw2Var.e) {
                        bVar = bVarArr[r13];
                        break;
                    }
                    r13++;
                }
            }
            mediationBannerAdapter.requestBannerAd(ydVar, activity, fVarZ8, bVar, ke.b(jw2Var, y8(jw2Var)), this.f);
        } catch (Throwable th) {
            tr.c("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void showInterstitial() throws RemoteException {
        com.google.ads.mediation.c<NETWORK_EXTRAS, SERVER_PARAMETERS> cVar = this.e;
        if (!(cVar instanceof MediationInterstitialAdapter)) {
            String strValueOf = String.valueOf(cVar.getClass().getCanonicalName());
            tr.i(strValueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(strValueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        tr.f("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.e).showInterstitial();
        } catch (Throwable th) {
            tr.c("", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void showVideo() {
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void t() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void t6(c.a.b.b.e.c cVar, jw2 jw2Var, String str, mk mkVar, String str2) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void v8(jw2 jw2Var, String str) {
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final void y4(c.a.b.b.e.c cVar, jw2 jw2Var, String str, wc wcVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.vc
    public final Bundle zztv() {
        return new Bundle();
    }
}
