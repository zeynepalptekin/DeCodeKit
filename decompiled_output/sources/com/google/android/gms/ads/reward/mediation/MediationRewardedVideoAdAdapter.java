package com.google.android.gms.ads.reward.mediation;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.f;
import com.google.android.gms.ads.mediation.g;

@Deprecated
/* loaded from: classes.dex */
public interface MediationRewardedVideoAdAdapter extends g {
    public static final String CUSTOM_EVENT_SERVER_PARAMETER_FIELD = "parameter";

    void initialize(Context context, f fVar, String str, a aVar, Bundle bundle, Bundle bundle2);

    boolean isInitialized();

    void loadAd(f fVar, Bundle bundle, Bundle bundle2);

    void showVideo();
}
