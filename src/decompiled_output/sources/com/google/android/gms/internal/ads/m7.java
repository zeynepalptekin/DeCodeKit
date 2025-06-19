package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.z.d;
import java.util.Map;

@d.a(creator = "HttpRequestParcelCreator")
/* loaded from: classes.dex */
public final class m7 extends com.google.android.gms.common.internal.z.a {
    public static final Parcelable.Creator<m7> CREATOR = new l7();

    @d.c(id = 1)
    private final String d;

    @d.c(id = 2)
    private final String[] e;

    @d.c(id = 3)
    private final String[] f;

    @d.b
    m7(@d.e(id = 1) String str, @d.e(id = 2) String[] strArr, @d.e(id = 3) String[] strArr2) {
        this.d = str;
        this.e = strArr;
        this.f = strArr2;
    }

    public static m7 h(b<?> bVar) throws sl2 {
        Map<String, String> mapE = bVar.e();
        int size = mapE.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int r3 = 0;
        for (Map.Entry<String, String> entry : mapE.entrySet()) {
            strArr[r3] = entry.getKey();
            strArr2[r3] = entry.getValue();
            r3++;
        }
        return new m7(bVar.i(), strArr, strArr2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int r52 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.X(parcel, 1, this.d, false);
        com.google.android.gms.common.internal.z.c.Y(parcel, 2, this.e, false);
        com.google.android.gms.common.internal.z.c.Y(parcel, 3, this.f, false);
        com.google.android.gms.common.internal.z.c.b(parcel, r52);
    }
}
