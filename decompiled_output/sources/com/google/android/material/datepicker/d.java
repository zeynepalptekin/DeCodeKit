package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.h0;
import com.google.android.material.datepicker.a;
import java.util.List;

/* loaded from: classes.dex */
public final class d implements a.c {
    public static final Parcelable.Creator<d> CREATOR = new a();

    @h0
    private final List<a.c> d;

    static class a implements Parcelable.Creator<d> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        @h0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(@h0 Parcel parcel) {
            return new d((List) b.i.o.i.f(parcel.readArrayList(a.c.class.getClassLoader())), null);
        }

        @Override // android.os.Parcelable.Creator
        @h0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int r1) {
            return new d[r1];
        }
    }

    private d(@h0 List<a.c> list) {
        this.d = list;
    }

    /* synthetic */ d(List list, a aVar) {
        this(list);
    }

    @h0
    public static a.c a(@h0 List<a.c> list) {
        return new d(list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            return this.d.equals(((d) obj).d);
        }
        return false;
    }

    public int hashCode() {
        return this.d.hashCode();
    }

    @Override // com.google.android.material.datepicker.a.c
    public boolean s(long j) {
        for (a.c cVar : this.d) {
            if (cVar != null && !cVar.s(j)) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@h0 Parcel parcel, int r2) {
        parcel.writeList(this.d);
    }
}
