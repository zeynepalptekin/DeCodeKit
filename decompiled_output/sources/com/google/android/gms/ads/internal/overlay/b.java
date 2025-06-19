package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.z.d;

@d.f({1})
@d.a(creator = "AdLauncherIntentInfoCreator")
/* loaded from: classes.dex */
public final class b extends com.google.android.gms.common.internal.z.a {
    public static final Parcelable.Creator<b> CREATOR = new c();

    @d.c(id = 2)
    private final String d;

    @d.c(id = 3)
    public final String e;

    @d.c(id = 4)
    public final String f;

    @d.c(id = 5)
    public final String g;

    @d.c(id = 6)
    public final String h;

    @d.c(id = 7)
    public final String i;

    @d.c(id = 8)
    private final String j;

    @d.c(id = 9)
    public final Intent k;

    public b(Intent intent) {
        this(null, null, null, null, null, null, null, intent);
    }

    public b(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this(str, str2, str3, str4, str5, str6, str7, null);
    }

    @d.b
    public b(@d.e(id = 2) String str, @d.e(id = 3) String str2, @d.e(id = 4) String str3, @d.e(id = 5) String str4, @d.e(id = 6) String str5, @d.e(id = 7) String str6, @d.e(id = 8) String str7, @d.e(id = 9) Intent intent) {
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int r0 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.X(parcel, 2, this.d, false);
        com.google.android.gms.common.internal.z.c.X(parcel, 3, this.e, false);
        com.google.android.gms.common.internal.z.c.X(parcel, 4, this.f, false);
        com.google.android.gms.common.internal.z.c.X(parcel, 5, this.g, false);
        com.google.android.gms.common.internal.z.c.X(parcel, 6, this.h, false);
        com.google.android.gms.common.internal.z.c.X(parcel, 7, this.i, false);
        com.google.android.gms.common.internal.z.c.X(parcel, 8, this.j, false);
        com.google.android.gms.common.internal.z.c.S(parcel, 9, this.k, r6, false);
        com.google.android.gms.common.internal.z.c.b(parcel, r0);
    }
}
