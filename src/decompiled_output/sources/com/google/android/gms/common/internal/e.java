package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.z.d;

@com.google.android.gms.common.annotation.a
@d.a(creator = "ConnectionTelemetryConfigurationCreator")
/* loaded from: classes.dex */
public class e extends com.google.android.gms.common.internal.z.a {

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static final Parcelable.Creator<e> CREATOR = new d0();

    @d.c(getter = "getRootTelemetryConfiguration", id = 1)
    private final t d;

    @d.c(getter = "getMethodInvocationTelemetryEnabled", id = 2)
    private final boolean e;

    @d.c(getter = "getMethodTimingTelemetryEnabled", id = 3)
    private final boolean f;

    @androidx.annotation.i0
    @d.c(getter = "getMethodInvocationMethodKeyWhitelist", id = 4)
    private final int[] g;

    @d.c(getter = "getMaxMethodInvocationsLogged", id = 5)
    private final int h;

    @d.b
    e(@d.e(id = 1) t tVar, @d.e(id = 2) boolean z, @d.e(id = 3) boolean z2, @androidx.annotation.i0 @d.e(id = 4) int[] r4, @d.e(id = 5) int r5) {
        this.d = tVar;
        this.e = z;
        this.f = z2;
        this.g = r4;
        this.h = r5;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r6) {
        int r0 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.S(parcel, 1, this.d, r6, false);
        com.google.android.gms.common.internal.z.c.g(parcel, 2, this.e);
        com.google.android.gms.common.internal.z.c.g(parcel, 3, this.f);
        com.google.android.gms.common.internal.z.c.G(parcel, 4, this.g, false);
        com.google.android.gms.common.internal.z.c.F(parcel, 5, this.h);
        com.google.android.gms.common.internal.z.c.b(parcel, r0);
    }
}
