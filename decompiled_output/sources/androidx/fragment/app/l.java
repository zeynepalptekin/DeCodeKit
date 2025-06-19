package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();
    ArrayList<o> d;
    ArrayList<String> e;
    b[] f;
    String g;
    int h;

    static class a implements Parcelable.Creator<l> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l createFromParcel(Parcel parcel) {
            return new l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public l[] newArray(int r1) {
            return new l[r1];
        }
    }

    public l() {
        this.g = null;
    }

    public l(Parcel parcel) {
        this.g = null;
        this.d = parcel.createTypedArrayList(o.CREATOR);
        this.e = parcel.createStringArrayList();
        this.f = (b[]) parcel.createTypedArray(b.CREATOR);
        this.g = parcel.readString();
        this.h = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int r3) {
        parcel.writeTypedList(this.d);
        parcel.writeStringList(this.e);
        parcel.writeTypedArray(this.f, r3);
        parcel.writeString(this.g);
        parcel.writeInt(this.h);
    }
}
