package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class ek2 implements Parcelable, Comparator<a> {
    public static final Parcelable.Creator<ek2> CREATOR = new dk2();
    private final a[] d;
    private int e;
    public final int f;

    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new fk2();
        private int d;
        private final UUID e;
        private final String f;
        private final byte[] g;
        public final boolean h;

        a(Parcel parcel) {
            this.e = new UUID(parcel.readLong(), parcel.readLong());
            this.f = parcel.readString();
            this.g = parcel.createByteArray();
            this.h = parcel.readByte() != 0;
        }

        public a(UUID r2, String str, byte[] bArr) {
            this(r2, str, bArr, false);
        }

        private a(UUID r1, String str, byte[] bArr, boolean z) {
            this.e = (UUID) vp2.d(r1);
            this.f = (String) vp2.d(str);
            this.g = (byte[]) vp2.d(bArr);
            this.h = false;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            a aVar = (a) obj;
            return this.f.equals(aVar.f) && nq2.g(this.e, aVar.e) && Arrays.equals(this.g, aVar.g);
        }

        public final int hashCode() {
            if (this.d == 0) {
                this.d = (((this.e.hashCode() * 31) + this.f.hashCode()) * 31) + Arrays.hashCode(this.g);
            }
            return this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int r4) {
            parcel.writeLong(this.e.getMostSignificantBits());
            parcel.writeLong(this.e.getLeastSignificantBits());
            parcel.writeString(this.f);
            parcel.writeByteArray(this.g);
            parcel.writeByte(this.h ? (byte) 1 : (byte) 0);
        }
    }

    ek2(Parcel parcel) {
        a[] aVarArr = (a[]) parcel.createTypedArray(a.CREATOR);
        this.d = aVarArr;
        this.f = aVarArr.length;
    }

    public ek2(List<a> list) {
        this(false, (a[]) list.toArray(new a[list.size()]));
    }

    private ek2(boolean z, a... aVarArr) {
        aVarArr = z ? (a[]) aVarArr.clone() : aVarArr;
        Arrays.sort(aVarArr, this);
        for (int r3 = 1; r3 < aVarArr.length; r3++) {
            if (aVarArr[r3 - 1].e.equals(aVarArr[r3].e)) {
                String strValueOf = String.valueOf(aVarArr[r3].e);
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 25);
                sb.append("Duplicate data for uuid: ");
                sb.append(strValueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        this.d = aVarArr;
        this.f = aVarArr.length;
    }

    public ek2(a... aVarArr) {
        this(true, aVarArr);
    }

    public final a a(int r2) {
        return this.d[r2];
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(a aVar, a aVar2) {
        a aVar3 = aVar;
        a aVar4 = aVar2;
        return ph2.f4817b.equals(aVar3.e) ? ph2.f4817b.equals(aVar4.e) ? 0 : 1 : aVar3.e.compareTo(aVar4.e);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ek2.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.d, ((ek2) obj).d);
    }

    public final int hashCode() {
        if (this.e == 0) {
            this.e = Arrays.hashCode(this.d);
        }
        return this.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r3) {
        parcel.writeTypedArray(this.d, 0);
    }
}
