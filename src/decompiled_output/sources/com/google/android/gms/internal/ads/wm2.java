package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class wm2 implements Parcelable {
    public static final Parcelable.Creator<wm2> CREATOR = new ym2();
    private final a[] d;

    public interface a extends Parcelable {
    }

    wm2(Parcel parcel) {
        this.d = new a[parcel.readInt()];
        int r0 = 0;
        while (true) {
            a[] aVarArr = this.d;
            if (r0 >= aVarArr.length) {
                return;
            }
            aVarArr[r0] = (a) parcel.readParcelable(a.class.getClassLoader());
            r0++;
        }
    }

    public wm2(List<? extends a> list) {
        a[] aVarArr = new a[list.size()];
        this.d = aVarArr;
        list.toArray(aVarArr);
    }

    public final int a() {
        return this.d.length;
    }

    public final a b(int r2) {
        return this.d[r2];
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wm2.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.d, ((wm2) obj).d);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        parcel.writeInt(this.d.length);
        for (a aVar : this.d) {
            parcel.writeParcelable(aVar, 0);
        }
    }
}
