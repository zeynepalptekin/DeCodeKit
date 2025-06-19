package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.h0;
import com.google.android.material.datepicker.a;
import java.util.Arrays;

/* loaded from: classes.dex */
public class h implements a.c {
    public static final Parcelable.Creator<h> CREATOR = new a();
    private final long d;

    static class a implements Parcelable.Creator<h> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @h0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public h createFromParcel(@h0 Parcel parcel) {
            return new h(parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        @h0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public h[] newArray(int r1) {
            return new h[r1];
        }
    }

    private h(long j) {
        this.d = j;
    }

    /* synthetic */ h(long j, a aVar) {
        this(j);
    }

    @h0
    public static h a(long j) {
        return new h(j);
    }

    @h0
    public static h b() {
        return a(y.t().getTimeInMillis());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.d == ((h) obj).d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.d)});
    }

    @Override // com.google.android.material.datepicker.a.c
    public boolean s(long j) {
        return j <= this.d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@h0 Parcel parcel, int r4) {
        parcel.writeLong(this.d);
    }
}
