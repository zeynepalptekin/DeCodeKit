package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.z.d;

@com.google.android.gms.common.annotation.a
@d.a(creator = "RootTelemetryConfigurationCreator")
/* loaded from: classes.dex */
public class t extends com.google.android.gms.common.internal.z.a {

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static final Parcelable.Creator<t> CREATOR = new v0();

    @d.c(getter = "getVersion", id = 1)
    private final int d;

    @d.c(getter = "getMethodInvocationTelemetryEnabled", id = 2)
    private final boolean e;

    @d.c(getter = "getMethodTimingTelemetryEnabled", id = 3)
    private final boolean f;

    @d.c(getter = "getBatchPeriodMillis", id = 4)
    private final int g;

    @d.c(getter = "getMaxMethodInvocationsInBatch", id = 5)
    private final int h;

    @d.b
    public t(@RecentlyNonNull @d.e(id = 1) int r1, @RecentlyNonNull @d.e(id = 2) boolean z, @RecentlyNonNull @d.e(id = 3) boolean z2, @RecentlyNonNull @d.e(id = 4) int r4, @RecentlyNonNull @d.e(id = 5) int r5) {
        this.d = r1;
        this.e = z;
        this.f = z2;
        this.g = r4;
        this.h = r5;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r4) {
        int r42 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.F(parcel, 1, this.d);
        com.google.android.gms.common.internal.z.c.g(parcel, 2, this.e);
        com.google.android.gms.common.internal.z.c.g(parcel, 3, this.f);
        com.google.android.gms.common.internal.z.c.F(parcel, 4, this.g);
        com.google.android.gms.common.internal.z.c.F(parcel, 5, this.h);
        com.google.android.gms.common.internal.z.c.b(parcel, r42);
    }
}
