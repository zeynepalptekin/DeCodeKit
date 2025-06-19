package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class oq2 implements Parcelable {
    public static final Parcelable.Creator<oq2> CREATOR = new rq2();
    public final int d;
    public final int e;
    public final int f;
    public final byte[] g;
    private int h;

    public oq2(int r1, int r2, int r3, byte[] bArr) {
        this.d = r1;
        this.e = r2;
        this.f = r3;
        this.g = bArr;
    }

    oq2(Parcel parcel) {
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && oq2.class == obj.getClass()) {
            oq2 oq2Var = (oq2) obj;
            if (this.d == oq2Var.d && this.e == oq2Var.e && this.f == oq2Var.f && Arrays.equals(this.g, oq2Var.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.h == 0) {
            this.h = ((((((this.d + 527) * 31) + this.e) * 31) + this.f) * 31) + Arrays.hashCode(this.g);
        }
        return this.h;
    }

    public final String toString() {
        int r0 = this.d;
        int r1 = this.e;
        int r2 = this.f;
        boolean z = this.g != null;
        StringBuilder sb = new StringBuilder(55);
        sb.append("ColorInfo(");
        sb.append(r0);
        sb.append(", ");
        sb.append(r1);
        sb.append(", ");
        sb.append(r2);
        sb.append(", ");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r2) {
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g != null ? 1 : 0);
        byte[] bArr = this.g;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
