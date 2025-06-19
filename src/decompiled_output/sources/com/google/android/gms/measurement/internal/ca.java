package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.z.d;

@d.a(creator = "UserAttributeParcelCreator")
/* loaded from: classes.dex */
public final class ca extends com.google.android.gms.common.internal.z.a {
    public static final Parcelable.Creator<ca> CREATOR = new fa();

    @d.c(id = 1)
    private final int d;

    @d.c(id = 2)
    public final String e;

    @d.c(id = 3)
    public final long f;

    @d.c(id = 4)
    public final Long g;

    @d.c(id = 5)
    private final Float h;

    @d.c(id = 6)
    public final String i;

    @d.c(id = 7)
    public final String j;

    @d.c(id = 8)
    public final Double k;

    @d.b
    ca(@d.e(id = 1) int r1, @d.e(id = 2) String str, @d.e(id = 3) long j, @d.e(id = 4) Long l, @d.e(id = 5) Float f, @d.e(id = 6) String str2, @d.e(id = 7) String str3, @d.e(id = 8) Double d) {
        this.d = r1;
        this.e = str;
        this.f = j;
        this.g = l;
        this.h = null;
        if (r1 == 1) {
            this.k = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.k = d;
        }
        this.i = str2;
        this.j = str3;
    }

    ca(ea eaVar) {
        this(eaVar.f6380c, eaVar.d, eaVar.e, eaVar.f6379b);
    }

    ca(String str, long j, Object obj, String str2) {
        com.google.android.gms.common.internal.r.g(str);
        this.d = 2;
        this.e = str;
        this.f = j;
        this.j = str2;
        if (obj == null) {
            this.g = null;
            this.h = null;
            this.k = null;
            this.i = null;
            return;
        }
        if (obj instanceof Long) {
            this.g = (Long) obj;
            this.h = null;
            this.k = null;
            this.i = null;
            return;
        }
        if (obj instanceof String) {
            this.g = null;
            this.h = null;
            this.k = null;
            this.i = (String) obj;
            return;
        }
        if (!(obj instanceof Double)) {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
        this.g = null;
        this.h = null;
        this.k = (Double) obj;
        this.i = null;
    }

    public final Object h() {
        Long l = this.g;
        if (l != null) {
            return l;
        }
        Double d = this.k;
        if (d != null) {
            return d;
        }
        String str = this.i;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int r62 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.F(parcel, 1, this.d);
        com.google.android.gms.common.internal.z.c.X(parcel, 2, this.e, false);
        com.google.android.gms.common.internal.z.c.K(parcel, 3, this.f);
        com.google.android.gms.common.internal.z.c.N(parcel, 4, this.g, false);
        com.google.android.gms.common.internal.z.c.z(parcel, 5, null, false);
        com.google.android.gms.common.internal.z.c.X(parcel, 6, this.i, false);
        com.google.android.gms.common.internal.z.c.X(parcel, 7, this.j, false);
        com.google.android.gms.common.internal.z.c.u(parcel, 8, this.k, false);
        com.google.android.gms.common.internal.z.c.b(parcel, r62);
    }
}
