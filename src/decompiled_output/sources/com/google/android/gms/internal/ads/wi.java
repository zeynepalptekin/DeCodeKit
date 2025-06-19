package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.z.d;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@d.a(creator = "NonagonRequestParcelCreator")
/* loaded from: classes.dex */
public final class wi extends com.google.android.gms.common.internal.z.a {
    public static final Parcelable.Creator<wi> CREATOR = new zi();

    @d.c(id = 1)
    public final Bundle d;

    @d.c(id = 2)
    public final as e;

    @d.c(id = 3)
    public final ApplicationInfo f;

    @d.c(id = 4)
    public final String g;

    @d.c(id = 5)
    public final List<String> h;

    @androidx.annotation.i0
    @d.c(id = 6)
    public final PackageInfo i;

    @d.c(id = 7)
    public final String j;

    @d.c(id = 8)
    public final boolean k;

    @d.c(id = 9)
    public final String l;

    @androidx.annotation.i0
    @d.c(id = 10)
    public yo1 m;

    @androidx.annotation.i0
    @d.c(id = 11)
    public String n;

    @d.b
    public wi(@d.e(id = 1) Bundle bundle, @d.e(id = 2) as asVar, @d.e(id = 3) ApplicationInfo applicationInfo, @d.e(id = 4) String str, @d.e(id = 5) List<String> list, @androidx.annotation.i0 @d.e(id = 6) PackageInfo packageInfo, @d.e(id = 7) String str2, @d.e(id = 8) boolean z, @d.e(id = 9) String str3, @d.e(id = 10) yo1 yo1Var, @d.e(id = 11) String str4) {
        this.d = bundle;
        this.e = asVar;
        this.g = str;
        this.f = applicationInfo;
        this.h = list;
        this.i = packageInfo;
        this.j = str2;
        this.k = z;
        this.l = str3;
        this.m = yo1Var;
        this.n = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int r0 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.k(parcel, 1, this.d, false);
        com.google.android.gms.common.internal.z.c.S(parcel, 2, this.e, r6, false);
        com.google.android.gms.common.internal.z.c.S(parcel, 3, this.f, r6, false);
        com.google.android.gms.common.internal.z.c.X(parcel, 4, this.g, false);
        com.google.android.gms.common.internal.z.c.Z(parcel, 5, this.h, false);
        com.google.android.gms.common.internal.z.c.S(parcel, 6, this.i, r6, false);
        com.google.android.gms.common.internal.z.c.X(parcel, 7, this.j, false);
        com.google.android.gms.common.internal.z.c.g(parcel, 8, this.k);
        com.google.android.gms.common.internal.z.c.X(parcel, 9, this.l, false);
        com.google.android.gms.common.internal.z.c.S(parcel, 10, this.m, r6, false);
        com.google.android.gms.common.internal.z.c.X(parcel, 11, this.n, false);
        com.google.android.gms.common.internal.z.c.b(parcel, r0);
    }
}
