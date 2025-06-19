package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.ek2;

/* loaded from: classes.dex */
final class fk2 implements Parcelable.Creator<ek2.a> {
    fk2() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ek2.a createFromParcel(Parcel parcel) {
        return new ek2.a(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ek2.a[] newArray(int r1) {
        return new ek2.a[r1];
    }
}
