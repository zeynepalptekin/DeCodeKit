package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.z.d;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@d.f({1})
@ParametersAreNonnullByDefault
@d.a(creator = "AutoClickProtectionConfigurationParcelCreator")
/* loaded from: classes.dex */
public final class ki extends com.google.android.gms.common.internal.z.a {
    public static final Parcelable.Creator<ki> CREATOR = new ji();

    @d.c(id = 2)
    public final boolean d;

    @androidx.annotation.i0
    @d.c(id = 3)
    public final List<String> e;

    public ki() {
        this(false, Collections.emptyList());
    }

    @d.b
    public ki(@d.e(id = 2) boolean z, @d.e(id = 3) List<String> list) {
        this.d = z;
        this.e = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int r52 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.g(parcel, 2, this.d);
        com.google.android.gms.common.internal.z.c.Z(parcel, 3, this.e, false);
        com.google.android.gms.common.internal.z.c.b(parcel, r52);
    }
}
