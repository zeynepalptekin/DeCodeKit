package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.internal.ads.oo;

/* loaded from: classes.dex */
public final class t extends e {
    public t(Activity activity) {
        super(activity);
    }

    @Override // com.google.android.gms.ads.internal.overlay.e, com.google.android.gms.internal.ads.pg
    public final void C1(Bundle bundle) {
        oo.m("AdOverlayParcel is null or does not contain valid overlay type.");
        this.q = 3;
        this.e.finish();
    }
}
