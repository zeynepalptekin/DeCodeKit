package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class bc1 implements cf1<Bundle> {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private final Location f2822a;

    public bc1(@Nullable Location location) {
        this.f2822a = location;
    }

    @Override // com.google.android.gms.internal.ads.cf1
    public final /* synthetic */ void b(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (this.f2822a != null) {
            Bundle bundle3 = new Bundle();
            float accuracy = this.f2822a.getAccuracy() * 1000.0f;
            long time = this.f2822a.getTime() * 1000;
            long latitude = (long) (this.f2822a.getLatitude() * 1.0E7d);
            long longitude = (long) (this.f2822a.getLongitude() * 1.0E7d);
            bundle3.putFloat("radius", accuracy);
            bundle3.putLong("lat", latitude);
            bundle3.putLong("long", longitude);
            bundle3.putLong("time", time);
            bundle2.putBundle("uule", bundle3);
        }
    }
}
