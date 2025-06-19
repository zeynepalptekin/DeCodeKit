package c.a.b.c.w;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.h0;
import androidx.annotation.i0;
import b.f.i;

/* loaded from: classes.dex */
public class a extends b.k.b.a {
    public static final Parcelable.Creator<a> CREATOR = new C0146a();

    @h0
    public final i<String, Bundle> f;

    /* renamed from: c.a.b.c.w.a$a, reason: collision with other inner class name */
    static class C0146a implements Parcelable.ClassLoaderCreator<a> {
        C0146a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        @i0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(@h0 Parcel parcel) {
            return new a(parcel, null, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        @h0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(@h0 Parcel parcel, ClassLoader classLoader) {
            return new a(parcel, classLoader, null);
        }

        @Override // android.os.Parcelable.Creator
        @h0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int r1) {
            return new a[r1];
        }
    }

    private a(@h0 Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int r7 = parcel.readInt();
        String[] strArr = new String[r7];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[r7];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f = new i<>(r7);
        for (int r6 = 0; r6 < r7; r6++) {
            this.f.put(strArr[r6], bundleArr[r6]);
        }
    }

    /* synthetic */ a(Parcel parcel, ClassLoader classLoader, C0146a c0146a) {
        this(parcel, classLoader);
    }

    public a(Parcelable parcelable) {
        super(parcelable);
        this.f = new i<>();
    }

    @h0
    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f + "}";
    }

    @Override // b.k.b.a, android.os.Parcelable
    public void writeToParcel(@h0 Parcel parcel, int r7) {
        super.writeToParcel(parcel, r7);
        int size = this.f.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int r3 = 0; r3 < size; r3++) {
            strArr[r3] = this.f.i(r3);
            bundleArr[r3] = this.f.m(r3);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
