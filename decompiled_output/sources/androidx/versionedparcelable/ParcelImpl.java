package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.p0;
import java.lang.reflect.InvocationTargetException;

@SuppressLint({"BanParcelableUsage"})
@p0({p0.a.LIBRARY})
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a();
    private final h d;

    static class a implements Parcelable.Creator<ParcelImpl> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelImpl[] newArray(int r1) {
            return new ParcelImpl[r1];
        }
    }

    protected ParcelImpl(Parcel parcel) {
        this.d = new f(parcel).g0();
    }

    public ParcelImpl(h hVar) {
        this.d = hVar;
    }

    public <T extends h> T a() {
        return (T) this.d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int r2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        new f(parcel).l1(this.d);
    }
}
