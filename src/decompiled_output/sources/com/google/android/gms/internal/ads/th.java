package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import c.a.b.b.e.c;
import com.google.android.gms.common.internal.z.d;
import java.lang.ref.WeakReference;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@d.a(creator = "NativeAdLayoutInfoParcelCreator")
/* loaded from: classes.dex */
public final class th extends com.google.android.gms.common.internal.z.a {
    public static final Parcelable.Creator<th> CREATOR = new wh();

    @d.c(getter = "getAdViewAsBinder", id = 1, type = "android.os.IBinder")
    public final View d;

    @d.c(getter = "getAssetViewMapAsBinder", id = 2, type = "android.os.IBinder")
    public final Map<String, WeakReference<View>> e;

    @d.b
    public th(@d.e(id = 1) IBinder iBinder, @d.e(id = 2) IBinder iBinder2) {
        this.d = (View) c.a.b.b.e.e.e2(c.a.b2(iBinder));
        this.e = (Map) c.a.b.b.e.e.e2(c.a.b2(iBinder2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int r52 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.B(parcel, 1, c.a.b.b.e.e.i2(this.d).asBinder(), false);
        com.google.android.gms.common.internal.z.c.B(parcel, 2, c.a.b.b.e.e.i2(this.e).asBinder(), false);
        com.google.android.gms.common.internal.z.c.b(parcel, r52);
    }
}
