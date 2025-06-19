package b.i.k;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* loaded from: classes.dex */
public final class m {

    static class a<T> implements Parcelable.ClassLoaderCreator<T> {

        /* renamed from: a, reason: collision with root package name */
        private final n<T> f1066a;

        a(n<T> nVar) {
            this.f1066a = nVar;
        }

        @Override // android.os.Parcelable.Creator
        public T createFromParcel(Parcel parcel) {
            return this.f1066a.createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public T createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return this.f1066a.createFromParcel(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        public T[] newArray(int r2) {
            return this.f1066a.newArray(r2);
        }
    }

    private m() {
    }

    @Deprecated
    public static <T> Parcelable.Creator<T> a(n<T> nVar) {
        return new a(nVar);
    }
}
