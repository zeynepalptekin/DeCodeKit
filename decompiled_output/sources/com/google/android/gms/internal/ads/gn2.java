package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class gn2 extends dn2 {
    public static final Parcelable.Creator<gn2> CREATOR = new fn2();
    private final String e;
    private final String f;

    gn2(Parcel parcel) {
        super(parcel.readString());
        this.e = parcel.readString();
        this.f = parcel.readString();
    }

    public gn2(String str, String str2, String str3) {
        super(str);
        this.e = null;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gn2.class == obj.getClass()) {
            gn2 gn2Var = (gn2) obj;
            if (this.d.equals(gn2Var.d) && nq2.g(this.e, gn2Var.e) && nq2.g(this.f, gn2Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int r0 = (this.d.hashCode() + 527) * 31;
        String str = this.e;
        int r02 = (r0 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f;
        return r02 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r2) {
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
    }
}
