package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class an2 extends dn2 {
    public static final Parcelable.Creator<an2> CREATOR = new zm2();
    private final String e;
    private final String f;
    private final int g;
    private final byte[] h;

    an2(Parcel parcel) {
        super("APIC");
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readInt();
        this.h = parcel.createByteArray();
    }

    public an2(String str, String str2, int r3, byte[] bArr) {
        super("APIC");
        this.e = str;
        this.f = null;
        this.g = 3;
        this.h = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && an2.class == obj.getClass()) {
            an2 an2Var = (an2) obj;
            if (this.g == an2Var.g && nq2.g(this.e, an2Var.e) && nq2.g(this.f, an2Var.f) && Arrays.equals(this.h, an2Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int r0 = (this.g + 527) * 31;
        String str = this.e;
        int r02 = (r0 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f;
        return ((r02 + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r2) {
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g);
        parcel.writeByteArray(this.h);
    }
}
