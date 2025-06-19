package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;

@p0({p0.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class k extends SparseArray<Parcelable> implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    static class a implements Parcelable.ClassLoaderCreator<k> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @i0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public k createFromParcel(@h0 Parcel parcel) {
            return new k(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        @h0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public k createFromParcel(@h0 Parcel parcel, ClassLoader classLoader) {
            return new k(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        @h0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public k[] newArray(int r1) {
            return new k[r1];
        }
    }

    public k() {
    }

    public k(@h0 Parcel parcel, @i0 ClassLoader classLoader) {
        int r0 = parcel.readInt();
        int[] r1 = new int[r0];
        parcel.readIntArray(r1);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        for (int r6 = 0; r6 < r0; r6++) {
            put(r1[r6], parcelableArray[r6]);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@h0 Parcel parcel, int r7) {
        int size = size();
        int[] r1 = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int r3 = 0; r3 < size; r3++) {
            r1[r3] = keyAt(r3);
            parcelableArr[r3] = valueAt(r3);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(r1);
        parcel.writeParcelableArray(parcelableArr, r7);
    }
}
