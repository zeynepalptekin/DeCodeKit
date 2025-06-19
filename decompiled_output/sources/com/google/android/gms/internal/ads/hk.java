package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.z.d;

@d.f({1})
@d.a(creator = "RewardedVideoAdRequestParcelCreator")
/* loaded from: classes.dex */
public final class hk extends com.google.android.gms.common.internal.z.a {
    public static final Parcelable.Creator<hk> CREATOR = new kk();

    @d.c(id = 2)
    public final jw2 d;

    @d.c(id = 3)
    public final String e;

    @d.b
    public hk(@d.e(id = 2) jw2 jw2Var, @d.e(id = 3) String str) {
        this.d = jw2Var;
        this.e = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int r0 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.S(parcel, 2, this.d, r6, false);
        com.google.android.gms.common.internal.z.c.X(parcel, 3, this.e, false);
        com.google.android.gms.common.internal.z.c.b(parcel, r0);
    }
}
