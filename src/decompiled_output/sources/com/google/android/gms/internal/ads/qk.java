package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.z.d;
import org.json.JSONArray;
import org.json.JSONException;

@d.f({1})
@d.a(creator = "RewardItemParcelCreator")
/* loaded from: classes.dex */
public final class qk extends com.google.android.gms.common.internal.z.a {
    public static final Parcelable.Creator<qk> CREATOR = new pk();

    @d.c(id = 2)
    public final String d;

    @d.c(id = 3)
    public final int e;

    public qk(com.google.android.gms.ads.k0.b bVar) {
        this(bVar.q(), bVar.R());
    }

    @d.b
    public qk(@d.e(id = 2) String str, @d.e(id = 3) int r2) {
        this.d = str;
        this.e = r2;
    }

    @androidx.annotation.i0
    public static qk h(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new qk(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof qk)) {
            qk qkVar = (qk) obj;
            if (com.google.android.gms.common.internal.q.b(this.d, qkVar.d) && com.google.android.gms.common.internal.q.b(Integer.valueOf(this.e), Integer.valueOf(qkVar.e))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.q.c(this.d, Integer.valueOf(this.e));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int r52 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.X(parcel, 2, this.d, false);
        com.google.android.gms.common.internal.z.c.F(parcel, 3, this.e);
        com.google.android.gms.common.internal.z.c.b(parcel, r52);
    }
}
