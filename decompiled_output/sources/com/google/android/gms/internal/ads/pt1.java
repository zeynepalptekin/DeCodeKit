package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.z.d;

@d.a(creator = "ProgramRequestCreator")
/* loaded from: classes.dex */
public final class pt1 extends com.google.android.gms.common.internal.z.a {
    public static final Parcelable.Creator<pt1> CREATOR = new st1();

    @d.g(id = 1)
    private final int d;

    @d.c(id = 2)
    private final int e;

    @d.c(id = 3)
    private final String f;

    @d.c(id = 4)
    private final String g;

    @d.c(id = 5)
    private final int h;

    @d.b
    pt1(@d.e(id = 1) int r1, @d.e(id = 2) int r2, @d.e(id = 5) int r3, @d.e(id = 3) String str, @d.e(id = 4) String str2) {
        this.d = r1;
        this.e = r2;
        this.f = str;
        this.g = str2;
        this.h = r3;
    }

    public pt1(int r7, ch2 ch2Var, String str, String str2) {
        this(1, r7, ch2Var.h(), str, str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int r52 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.F(parcel, 1, this.d);
        com.google.android.gms.common.internal.z.c.F(parcel, 2, this.e);
        com.google.android.gms.common.internal.z.c.X(parcel, 3, this.f, false);
        com.google.android.gms.common.internal.z.c.X(parcel, 4, this.g, false);
        com.google.android.gms.common.internal.z.c.F(parcel, 5, this.h);
        com.google.android.gms.common.internal.z.c.b(parcel, r52);
    }
}
