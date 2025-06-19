package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.z.d;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@d.a(creator = "SignalConfigurationParcelCreator")
/* loaded from: classes.dex */
public final class pn extends com.google.android.gms.common.internal.z.a {
    public static final Parcelable.Creator<pn> CREATOR = new on();

    @d.c(id = 1)
    @Deprecated
    public final String d;

    @d.c(id = 2)
    public final String e;

    @d.c(id = 3)
    @Deprecated
    public final qw2 f;

    @d.c(id = 4)
    public final jw2 g;

    @d.b
    public pn(@d.e(id = 1) String str, @d.e(id = 2) String str2, @d.e(id = 3) qw2 qw2Var, @d.e(id = 4) jw2 jw2Var) {
        this.d = str;
        this.e = str2;
        this.f = qw2Var;
        this.g = jw2Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int r0 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.X(parcel, 1, this.d, false);
        com.google.android.gms.common.internal.z.c.X(parcel, 2, this.e, false);
        com.google.android.gms.common.internal.z.c.S(parcel, 3, this.f, r6, false);
        com.google.android.gms.common.internal.z.c.S(parcel, 4, this.g, r6, false);
        com.google.android.gms.common.internal.z.c.b(parcel, r0);
    }
}
