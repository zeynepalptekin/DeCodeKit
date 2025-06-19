package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.z.d;

@d.a(creator = "ExceptionParcelCreator")
/* loaded from: classes.dex */
public final class yp extends com.google.android.gms.common.internal.z.a {
    public static final Parcelable.Creator<yp> CREATOR = new cq();

    @d.c(id = 1)
    public final String d;

    @d.c(id = 2)
    public final int e;

    @d.b
    yp(@androidx.annotation.i0 @d.e(id = 1) String str, @d.e(id = 2) int r2) {
        this.d = str == null ? "" : str;
        this.e = r2;
    }

    @androidx.annotation.i0
    public static yp h(Throwable th) {
        dw2 dw2VarD = vn1.d(th);
        return new yp(dv1.b(th.getMessage()) ? dw2VarD.e : th.getMessage(), dw2VarD.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int r52 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.X(parcel, 1, this.d, false);
        com.google.android.gms.common.internal.z.c.F(parcel, 2, this.e);
        com.google.android.gms.common.internal.z.c.b(parcel, r52);
    }
}
