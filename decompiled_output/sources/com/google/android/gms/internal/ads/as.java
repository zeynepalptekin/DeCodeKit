package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.z.d;

@d.f({1})
@d.a(creator = "VersionInfoParcelCreator")
/* loaded from: classes.dex */
public final class as extends com.google.android.gms.common.internal.z.a {
    public static final Parcelable.Creator<as> CREATOR = new zr();

    @d.c(id = 2)
    public String d;

    @d.c(id = 3)
    public int e;

    @d.c(id = 4)
    public int f;

    @d.c(id = 5)
    public boolean g;

    @d.c(id = 6)
    public boolean h;

    public as(int r7, int r8, boolean z) {
        this(r7, r8, z, false, false);
    }

    public as(int r7, int r8, boolean z, boolean z2) {
        this(r7, r8, true, false, false);
    }

    private as(int r8, int r9, boolean z, boolean z2, boolean z3) {
        String str = z ? "0" : "1";
        StringBuilder sb = new StringBuilder(str.length() + 36);
        sb.append("afma-sdk-a-v");
        sb.append(r8);
        sb.append(".");
        sb.append(r9);
        sb.append(".");
        sb.append(str);
        this(sb.toString(), r8, r9, z, false);
    }

    @d.b
    as(@d.e(id = 2) String str, @d.e(id = 3) int r2, @d.e(id = 4) int r3, @d.e(id = 5) boolean z, @d.e(id = 6) boolean z2) {
        this.d = str;
        this.e = r2;
        this.f = r3;
        this.g = z;
        this.h = z2;
    }

    public static as h() {
        return new as(12451009, 12451009, true);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int r52 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.X(parcel, 2, this.d, false);
        com.google.android.gms.common.internal.z.c.F(parcel, 3, this.e);
        com.google.android.gms.common.internal.z.c.F(parcel, 4, this.f);
        com.google.android.gms.common.internal.z.c.g(parcel, 5, this.g);
        com.google.android.gms.common.internal.z.c.g(parcel, 6, this.h);
        com.google.android.gms.common.internal.z.c.b(parcel, r52);
    }
}
