package c.a.b.b.g.c;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.z.d;

@d.a(creator = "InitializationParamsCreator")
/* loaded from: classes.dex */
public final class f extends com.google.android.gms.common.internal.z.a {
    public static final Parcelable.Creator<f> CREATOR = new i();

    @d.c(id = 1)
    public final long d;

    @d.c(id = 2)
    public final long e;

    @d.c(id = 3)
    public final boolean f;

    @d.c(id = 4)
    public final String g;

    @d.c(id = 5)
    public final String h;

    @d.c(id = 6)
    public final String i;

    @d.c(id = 7)
    public final Bundle j;

    @d.b
    public f(@d.e(id = 1) long j, @d.e(id = 2) long j2, @d.e(id = 3) boolean z, @d.e(id = 4) String str, @d.e(id = 5) String str2, @d.e(id = 6) String str3, @d.e(id = 7) Bundle bundle) {
        this.d = j;
        this.e = j2;
        this.f = z;
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int r52 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.K(parcel, 1, this.d);
        com.google.android.gms.common.internal.z.c.K(parcel, 2, this.e);
        com.google.android.gms.common.internal.z.c.g(parcel, 3, this.f);
        com.google.android.gms.common.internal.z.c.X(parcel, 4, this.g, false);
        com.google.android.gms.common.internal.z.c.X(parcel, 5, this.h, false);
        com.google.android.gms.common.internal.z.c.X(parcel, 6, this.i, false);
        com.google.android.gms.common.internal.z.c.k(parcel, 7, this.j, false);
        com.google.android.gms.common.internal.z.c.b(parcel, r52);
    }
}
