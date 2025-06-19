package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import androidx.annotation.h0;
import androidx.annotation.p0;

@p0({p0.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class m extends SparseIntArray implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    static class a implements Parcelable.Creator<m> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @h0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public m createFromParcel(@h0 Parcel parcel) {
            int r0 = parcel.readInt();
            m mVar = new m(r0);
            int[] r2 = new int[r0];
            int[] r3 = new int[r0];
            parcel.readIntArray(r2);
            parcel.readIntArray(r3);
            for (int r7 = 0; r7 < r0; r7++) {
                mVar.put(r2[r7], r3[r7]);
            }
            return mVar;
        }

        @Override // android.os.Parcelable.Creator
        @h0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public m[] newArray(int r1) {
            return new m[r1];
        }
    }

    public m() {
    }

    public m(int r1) {
        super(r1);
    }

    public m(@h0 SparseIntArray sparseIntArray) {
        for (int r0 = 0; r0 < sparseIntArray.size(); r0++) {
            put(sparseIntArray.keyAt(r0), sparseIntArray.valueAt(r0));
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@h0 Parcel parcel, int r5) {
        int[] r52 = new int[size()];
        int[] r0 = new int[size()];
        for (int r1 = 0; r1 < size(); r1++) {
            r52[r1] = keyAt(r1);
            r0[r1] = valueAt(r1);
        }
        parcel.writeInt(size());
        parcel.writeIntArray(r52);
        parcel.writeIntArray(r0);
    }
}
