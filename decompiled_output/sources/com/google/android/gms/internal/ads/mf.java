package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.z.d;
import java.util.Arrays;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@d.a(creator = "RtbVersionInfoParcelCreator")
/* loaded from: classes.dex */
public final class mf extends com.google.android.gms.common.internal.z.a {
    public static final Parcelable.Creator<mf> CREATOR = new of();

    @d.c(id = 1)
    private final int d;

    @d.c(id = 2)
    private final int e;

    @d.c(id = 3)
    private final int f;

    @d.b
    mf(@d.e(id = 1) int r1, @d.e(id = 2) int r2, @d.e(id = 3) int r3) {
        this.d = r1;
        this.e = r2;
        this.f = r3;
    }

    public static mf h(com.google.android.gms.ads.mediation.f0 f0Var) {
        return new mf(f0Var.a(), f0Var.c(), f0Var.b());
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof mf)) {
            mf mfVar = (mf) obj;
            if (mfVar.f == this.f && mfVar.e == this.e && mfVar.d == this.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.d, this.e, this.f});
    }

    public final String toString() {
        int r0 = this.d;
        int r1 = this.e;
        int r2 = this.f;
        StringBuilder sb = new StringBuilder(35);
        sb.append(r0);
        sb.append(".");
        sb.append(r1);
        sb.append(".");
        sb.append(r2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r4) {
        int r42 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.F(parcel, 1, this.d);
        com.google.android.gms.common.internal.z.c.F(parcel, 2, this.e);
        com.google.android.gms.common.internal.z.c.F(parcel, 3, this.f);
        com.google.android.gms.common.internal.z.c.b(parcel, r42);
    }
}
