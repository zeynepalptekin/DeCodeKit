package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.z.d;
import java.util.List;

@d.f({1})
@d.a(creator = "CacheOfferingCreator")
/* loaded from: classes.dex */
public final class fu2 extends com.google.android.gms.common.internal.z.a {
    public static final Parcelable.Creator<fu2> CREATOR = new eu2();

    @androidx.annotation.i0
    @d.c(id = 2)
    public final String d;

    @d.c(id = 3)
    private final long e;

    @d.c(id = 4)
    private final String f;

    @d.c(id = 5)
    private final String g;

    @d.c(id = 6)
    private final String h;

    @d.c(id = 7)
    private final Bundle i;

    @d.c(id = 8)
    public final boolean j;

    @d.c(id = 9)
    public long k;

    @d.b
    fu2(@androidx.annotation.i0 @d.e(id = 2) String str, @d.e(id = 3) long j, @d.e(id = 4) String str2, @d.e(id = 5) String str3, @d.e(id = 6) String str4, @d.e(id = 7) Bundle bundle, @d.e(id = 8) boolean z, @d.e(id = 9) long j2) {
        this.d = str;
        this.e = j;
        this.f = str2 == null ? "" : str2;
        this.g = str3 == null ? "" : str3;
        this.h = str4 == null ? "" : str4;
        this.i = bundle == null ? new Bundle() : bundle;
        this.j = z;
        this.k = j2;
    }

    @androidx.annotation.i0
    public static fu2 h(String str) {
        return i(Uri.parse(str));
    }

    @androidx.annotation.i0
    public static fu2 i(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                StringBuilder sb = new StringBuilder(62);
                sb.append("Expected 2 path parts for namespace and id, found :");
                sb.append(size);
                tr.i(sb.toString());
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter(com.google.android.gms.common.internal.o.f2536a);
            boolean zEquals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long j = queryParameter2 == null ? 0L : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            com.google.android.gms.ads.internal.p.e();
            for (String str3 : uri.getQueryParameterNames()) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            return new fu2(queryParameter, j, host, str, str2, bundle, zEquals, 0L);
        } catch (NullPointerException | NumberFormatException e) {
            tr.d("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int r62 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.X(parcel, 2, this.d, false);
        com.google.android.gms.common.internal.z.c.K(parcel, 3, this.e);
        com.google.android.gms.common.internal.z.c.X(parcel, 4, this.f, false);
        com.google.android.gms.common.internal.z.c.X(parcel, 5, this.g, false);
        com.google.android.gms.common.internal.z.c.X(parcel, 6, this.h, false);
        com.google.android.gms.common.internal.z.c.k(parcel, 7, this.i, false);
        com.google.android.gms.common.internal.z.c.g(parcel, 8, this.j);
        com.google.android.gms.common.internal.z.c.K(parcel, 9, this.k);
        com.google.android.gms.common.internal.z.c.b(parcel, r62);
    }
}
