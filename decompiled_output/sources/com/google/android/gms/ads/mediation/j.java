package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import androidx.annotation.i0;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class j extends d {
    private final com.google.android.gms.ads.f n;

    public j(Context context, String str, Bundle bundle, Bundle bundle2, boolean z, @i0 Location location, int r18, int r19, String str2, @i0 com.google.android.gms.ads.f fVar, String str3) {
        super(context, str, bundle, bundle2, z, location, r18, r19, str2, str3);
        this.n = fVar;
    }

    public com.google.android.gms.ads.f k() {
        return this.n;
    }
}
