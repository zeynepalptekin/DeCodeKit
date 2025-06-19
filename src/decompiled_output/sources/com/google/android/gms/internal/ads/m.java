package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.z.d;

@d.f({1})
@d.a(creator = "VideoOptionsParcelCreator")
/* loaded from: classes.dex */
public final class m extends com.google.android.gms.common.internal.z.a {
    public static final Parcelable.Creator<m> CREATOR = new l();

    @d.c(id = 2)
    public final boolean d;

    @d.c(id = 3)
    public final boolean e;

    @d.c(id = 4)
    public final boolean f;

    public m(com.google.android.gms.ads.a0 a0Var) {
        this(a0Var.c(), a0Var.b(), a0Var.a());
    }

    @d.b
    public m(@d.e(id = 2) boolean z, @d.e(id = 3) boolean z2, @d.e(id = 4) boolean z3) {
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r4) {
        int r42 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.g(parcel, 2, this.d);
        com.google.android.gms.common.internal.z.c.g(parcel, 3, this.e);
        com.google.android.gms.common.internal.z.c.g(parcel, 4, this.f);
        com.google.android.gms.common.internal.z.c.b(parcel, r42);
    }
}
