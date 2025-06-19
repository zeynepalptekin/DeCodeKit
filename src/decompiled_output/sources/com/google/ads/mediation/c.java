package com.google.ads.mediation;

import com.google.ads.mediation.f;

@Deprecated
/* loaded from: classes.dex */
public interface c<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS extends f> {
    void destroy();

    Class<ADDITIONAL_PARAMETERS> getAdditionalParametersType();

    Class<SERVER_PARAMETERS> getServerParametersType();
}
