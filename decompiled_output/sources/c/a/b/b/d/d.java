package c.a.b.b.d;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.i0;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.z.d;
import com.google.android.gms.measurement.c.a;

@com.google.android.gms.common.annotation.a
@d.a(creator = "FeatureCreator")
/* loaded from: classes.dex */
public class d extends com.google.android.gms.common.internal.z.a {

    @RecentlyNonNull
    public static final Parcelable.Creator<d> CREATOR = new u();

    @d.c(getter = "getName", id = 1)
    private final String d;

    @d.c(getter = "getOldVersion", id = 2)
    @Deprecated
    private final int e;

    @d.c(defaultValue = "-1", getter = "getVersion", id = 3)
    private final long f;

    @d.b
    public d(@RecentlyNonNull @d.e(id = 1) String str, @RecentlyNonNull @d.e(id = 2) int r2, @RecentlyNonNull @d.e(id = 3) long j) {
        this.d = str;
        this.e = r2;
        this.f = j;
    }

    @com.google.android.gms.common.annotation.a
    public d(@RecentlyNonNull String str, @RecentlyNonNull long j) {
        this.d = str;
        this.f = j;
        this.e = -1;
    }

    @RecentlyNonNull
    public boolean equals(@i0 Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (((h() != null && h().equals(dVar.h())) || (h() == null && dVar.h() == null)) && i() == dVar.i()) {
                return true;
            }
        }
        return false;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public String h() {
        return this.d;
    }

    @RecentlyNonNull
    public int hashCode() {
        return q.c(h(), Long.valueOf(i()));
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public long i() {
        long j = this.f;
        return j == -1 ? this.e : j;
    }

    @RecentlyNonNull
    public String toString() {
        return q.d(this).a(a.C0190a.f6334b, h()).a("version", Long.valueOf(i())).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r5) {
        int r52 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.X(parcel, 1, h(), false);
        com.google.android.gms.common.internal.z.c.F(parcel, 2, this.e);
        com.google.android.gms.common.internal.z.c.K(parcel, 3, i());
        com.google.android.gms.common.internal.z.c.b(parcel, r52);
    }
}
