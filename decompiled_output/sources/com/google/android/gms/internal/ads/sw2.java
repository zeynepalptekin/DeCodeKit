package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.z.d;
import com.google.firebase.analytics.FirebaseAnalytics;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
@d.a(creator = "AdValueParcelCreator")
/* loaded from: classes.dex */
public final class sw2 extends com.google.android.gms.common.internal.z.a {
    public static final Parcelable.Creator<sw2> CREATOR = new rw2();

    @d.c(id = 1)
    public final int d;

    @d.c(id = 2)
    public final int e;

    @d.c(id = 3)
    public final String f;

    @d.c(id = 4)
    public final long g;

    @d.b
    public sw2(@d.e(id = 1) int r1, @d.e(id = 2) int r2, @d.e(id = 3) String str, @d.e(id = 4) long j) {
        this.d = r1;
        this.e = r2;
        this.f = str;
        this.g = j;
    }

    public static sw2 h(JSONObject jSONObject) throws JSONException {
        return new sw2(jSONObject.getInt("type_num"), jSONObject.getInt("precision_num"), jSONObject.getString(FirebaseAnalytics.b.i), jSONObject.getLong("value"));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int r52 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.F(parcel, 1, this.d);
        com.google.android.gms.common.internal.z.c.F(parcel, 2, this.e);
        com.google.android.gms.common.internal.z.c.X(parcel, 3, this.f, false);
        com.google.android.gms.common.internal.z.c.K(parcel, 4, this.g);
        com.google.android.gms.common.internal.z.c.b(parcel, r52);
    }
}
