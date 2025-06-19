package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.z.d;
import java.util.Iterator;

@d.f({1})
@d.a(creator = "EventParamsCreator")
/* loaded from: classes.dex */
public final class n extends com.google.android.gms.common.internal.z.a implements Iterable<String> {
    public static final Parcelable.Creator<n> CREATOR = new p();

    @d.c(getter = "z", id = 2)
    private final Bundle d;

    @d.b
    n(@d.e(id = 2) Bundle bundle) {
        this.d = bundle;
    }

    public final int h() {
        return this.d.size();
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new q(this);
    }

    final Object j(String str) {
        return this.d.get(str);
    }

    public final Bundle l() {
        return new Bundle(this.d);
    }

    final Long t(String str) {
        return Long.valueOf(this.d.getLong(str));
    }

    public final String toString() {
        return this.d.toString();
    }

    final Double u(String str) {
        return Double.valueOf(this.d.getDouble(str));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int r52 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.k(parcel, 2, l(), false);
        com.google.android.gms.common.internal.z.c.b(parcel, r52);
    }

    final String y(String str) {
        return this.d.getString(str);
    }
}
