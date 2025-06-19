package com.google.ads.mediation;

import android.app.Activity;
import com.google.ads.mediation.f;
import com.google.ads.mediation.g;

@Deprecated
/* loaded from: classes.dex */
public interface MediationInterstitialAdapter<ADDITIONAL_PARAMETERS extends g, SERVER_PARAMETERS extends f> extends c<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS> {
    void requestInterstitialAd(e eVar, Activity activity, SERVER_PARAMETERS server_parameters, b bVar, ADDITIONAL_PARAMETERS r5);

    void showInterstitial();
}
