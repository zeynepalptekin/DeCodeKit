package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.z.d;

@d.f({1})
@d.a(creator = "EventParcelCreator")
/* loaded from: classes.dex */
public final class s extends com.google.android.gms.common.internal.z.a {
    public static final Parcelable.Creator<s> CREATOR = new r();

    @d.c(id = 2)
    public final String d;

    @d.c(id = 3)
    public final n e;

    @d.c(id = 4)
    public final String f;

    @d.c(id = 5)
    public final long g;

    s(s sVar, long j) {
        com.google.android.gms.common.internal.r.k(sVar);
        this.d = sVar.d;
        this.e = sVar.e;
        this.f = sVar.f;
        this.g = j;
    }

    @d.b
    public s(@d.e(id = 2) String str, @d.e(id = 3) n nVar, @d.e(id = 4) String str2, @d.e(id = 5) long j) {
        this.d = str;
        this.e = nVar;
        this.f = str2;
        this.g = j;
    }

    public final String toString() {
        String str = this.f;
        String str2 = this.d;
        String strValueOf = String.valueOf(this.e);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + String.valueOf(strValueOf).length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(strValueOf);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int r0 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.X(parcel, 2, this.d, false);
        com.google.android.gms.common.internal.z.c.S(parcel, 3, this.e, r6, false);
        com.google.android.gms.common.internal.z.c.X(parcel, 4, this.f, false);
        com.google.android.gms.common.internal.z.c.K(parcel, 5, this.g);
        com.google.android.gms.common.internal.z.c.b(parcel, r0);
    }
}
