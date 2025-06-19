package b.k.b;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.h0;
import androidx.annotation.i0;

/* loaded from: classes.dex */
public abstract class a implements Parcelable {
    private final Parcelable d;
    public static final a e = new C0079a();
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: b.k.b.a$a, reason: collision with other inner class name */
    static class C0079a extends a {
        C0079a() {
            super((C0079a) null);
        }
    }

    static class b implements Parcelable.ClassLoaderCreator<a> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.e;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int r1) {
            return new a[r1];
        }
    }

    private a() {
        this.d = null;
    }

    protected a(@h0 Parcel parcel) {
        this(parcel, null);
    }

    protected a(@h0 Parcel parcel, @i0 ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.d = parcelable == null ? e : parcelable;
    }

    protected a(@h0 Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.d = parcelable == e ? null : parcelable;
    }

    /* synthetic */ a(C0079a c0079a) {
        this();
    }

    @i0
    public final Parcelable a() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int r3) {
        parcel.writeParcelable(this.d, r3);
    }
}
