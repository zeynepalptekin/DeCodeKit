package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.i0;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.z.d;

@com.google.android.gms.common.annotation.a
@d.a(creator = "ScopeCreator")
/* loaded from: classes.dex */
public final class Scope extends com.google.android.gms.common.internal.z.a implements ReflectedParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<Scope> CREATOR = new k();

    @d.g(id = 1)
    private final int d;

    @d.c(getter = "getScopeUri", id = 2)
    private final String e;

    @d.b
    Scope(@d.e(id = 1) int r2, @d.e(id = 2) String str) {
        r.h(str, "scopeUri must not be null or empty");
        this.d = r2;
        this.e = str;
    }

    public Scope(@RecentlyNonNull String str) {
        this(1, str);
    }

    @RecentlyNonNull
    public final boolean equals(@i0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.e.equals(((Scope) obj).e);
        }
        return false;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public final String h() {
        return this.e;
    }

    @RecentlyNonNull
    public final int hashCode() {
        return this.e.hashCode();
    }

    @RecentlyNonNull
    public final String toString() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r5) {
        int r52 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.F(parcel, 1, this.d);
        com.google.android.gms.common.internal.z.c.X(parcel, 2, h(), false);
        com.google.android.gms.common.internal.z.c.b(parcel, r52);
    }
}
