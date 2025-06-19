package com.google.android.gms.ads.mediation;

import android.content.Context;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a implements m {
    public abstract f0 getSDKVersionInfo();

    public abstract f0 getVersionInfo();

    public abstract void initialize(Context context, b bVar, List<l> list);

    public void loadBannerAd(j jVar, e<h, i> eVar) {
        eVar.S(String.valueOf(getClass().getSimpleName()).concat(" does not support banner ads."));
    }

    public void loadInterstitialAd(p pVar, e<n, o> eVar) {
        eVar.S(String.valueOf(getClass().getSimpleName()).concat(" does not support interstitial ads."));
    }

    public void loadNativeAd(s sVar, e<e0, r> eVar) {
        eVar.S(String.valueOf(getClass().getSimpleName()).concat(" does not support native ads."));
    }

    public void loadRewardedAd(w wVar, e<u, v> eVar) {
        eVar.S(String.valueOf(getClass().getSimpleName()).concat(" does not support rewarded ads."));
    }

    public void loadRewardedInterstitialAd(w wVar, e<u, v> eVar) {
        eVar.S(String.valueOf(getClass().getSimpleName()).concat(" does not support rewarded interstitial ads."));
    }
}
