package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* loaded from: classes.dex */
public interface MediationBannerAdapter extends g {
    View getBannerView();

    void requestBannerAd(Context context, k kVar, Bundle bundle, com.google.android.gms.ads.f fVar, f fVar2, Bundle bundle2);
}
