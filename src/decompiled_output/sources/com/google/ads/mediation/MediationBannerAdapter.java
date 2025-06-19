package com.google.ads.mediation;

import android.app.Activity;
import android.view.View;
import com.google.ads.mediation.f;
import com.google.ads.mediation.g;

@Deprecated
/* loaded from: classes.dex */
public interface MediationBannerAdapter<ADDITIONAL_PARAMETERS extends g, SERVER_PARAMETERS extends f> extends c<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS> {
    View getBannerView();

    void requestBannerAd(d dVar, Activity activity, SERVER_PARAMETERS server_parameters, c.a.a.b bVar, b bVar2, ADDITIONAL_PARAMETERS r6);
}
