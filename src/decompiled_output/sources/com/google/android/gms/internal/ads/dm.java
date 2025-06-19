package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.z.d;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@d.f({1})
@d.a(creator = "SafeBrowsingConfigParcelCreator")
/* loaded from: classes.dex */
public final class dm extends com.google.android.gms.common.internal.z.a {
    public static final Parcelable.Creator<dm> CREATOR = new gm();

    @d.c(id = 2)
    public final String d;

    @d.c(id = 3)
    public final String e;

    @d.c(id = 4)
    public final boolean f;

    @d.c(id = 5)
    public final boolean g;

    @d.c(id = 6)
    public final List<String> h;

    @d.c(id = 7)
    public final boolean i;

    @d.c(id = 8)
    public final boolean j;

    @d.c(id = 9)
    public final List<String> k;

    @d.b
    public dm(@d.e(id = 2) String str, @d.e(id = 3) String str2, @d.e(id = 4) boolean z, @d.e(id = 5) boolean z2, @d.e(id = 6) List<String> list, @d.e(id = 7) boolean z3, @d.e(id = 8) boolean z4, @d.e(id = 9) List<String> list2) {
        this.d = str;
        this.e = str2;
        this.f = z;
        this.g = z2;
        this.h = list;
        this.i = z3;
        this.j = z4;
        this.k = list2 == null ? new ArrayList<>() : list2;
    }

    @androidx.annotation.i0
    public static dm h(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        return new dm(jSONObject.optString("click_string", ""), jSONObject.optString("report_url", ""), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), qq.c(jSONObject.optJSONArray("allowed_headers"), null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), qq.c(jSONObject.optJSONArray("webview_permissions"), null));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int r52 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.X(parcel, 2, this.d, false);
        com.google.android.gms.common.internal.z.c.X(parcel, 3, this.e, false);
        com.google.android.gms.common.internal.z.c.g(parcel, 4, this.f);
        com.google.android.gms.common.internal.z.c.g(parcel, 5, this.g);
        com.google.android.gms.common.internal.z.c.Z(parcel, 6, this.h, false);
        com.google.android.gms.common.internal.z.c.g(parcel, 7, this.i);
        com.google.android.gms.common.internal.z.c.g(parcel, 8, this.j);
        com.google.android.gms.common.internal.z.c.Z(parcel, 9, this.k, false);
        com.google.android.gms.common.internal.z.c.b(parcel, r52);
    }
}
