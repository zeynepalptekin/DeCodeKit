package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class cn2 extends dn2 {
    public static final Parcelable.Creator<cn2> CREATOR = new bn2();
    private final String e;
    public final String f;
    public final String g;

    cn2(Parcel parcel) {
        super("COMM");
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readString();
    }

    public cn2(String str, String str2, String str3) {
        super("COMM");
        this.e = str;
        this.f = str2;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && cn2.class == obj.getClass()) {
            cn2 cn2Var = (cn2) obj;
            if (nq2.g(this.f, cn2Var.f) && nq2.g(this.e, cn2Var.e) && nq2.g(this.g, cn2Var.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.e;
        int r0 = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f;
        int r02 = (r0 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.g;
        return r02 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r2) {
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.g);
    }
}
