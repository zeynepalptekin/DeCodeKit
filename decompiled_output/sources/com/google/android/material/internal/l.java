package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import androidx.annotation.h0;
import androidx.annotation.p0;

@p0({p0.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class l extends SparseBooleanArray implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    static class a implements Parcelable.Creator<l> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @h0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l createFromParcel(@h0 Parcel parcel) {
            int r0 = parcel.readInt();
            l lVar = new l(r0);
            int[] r2 = new int[r0];
            boolean[] zArr = new boolean[r0];
            parcel.readIntArray(r2);
            parcel.readBooleanArray(zArr);
            for (int r7 = 0; r7 < r0; r7++) {
                lVar.put(r2[r7], zArr[r7]);
            }
            return lVar;
        }

        @Override // android.os.Parcelable.Creator
        @h0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public l[] newArray(int r1) {
            return new l[r1];
        }
    }

    public l() {
    }

    public l(int r1) {
        super(r1);
    }

    public l(@h0 SparseBooleanArray sparseBooleanArray) {
        super(sparseBooleanArray.size());
        for (int r0 = 0; r0 < sparseBooleanArray.size(); r0++) {
            put(sparseBooleanArray.keyAt(r0), sparseBooleanArray.valueAt(r0));
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@h0 Parcel parcel, int r5) {
        int[] r52 = new int[size()];
        boolean[] zArr = new boolean[size()];
        for (int r1 = 0; r1 < size(); r1++) {
            r52[r1] = keyAt(r1);
            zArr[r1] = valueAt(r1);
        }
        parcel.writeInt(size());
        parcel.writeIntArray(r52);
        parcel.writeBooleanArray(zArr);
    }
}
