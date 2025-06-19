package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.z.d;
import java.io.InputStream;
import javax.annotation.concurrent.GuardedBy;

@d.f({1})
@d.a(creator = "CacheEntryParcelCreator")
/* loaded from: classes.dex */
public final class zt2 extends com.google.android.gms.common.internal.z.a {
    public static final Parcelable.Creator<zt2> CREATOR = new du2();

    @androidx.annotation.i0
    @d.c(getter = "getContentFileDescriptor", id = 2)
    @GuardedBy("this")
    private ParcelFileDescriptor d;

    public zt2() {
        this(null);
    }

    @d.b
    public zt2(@androidx.annotation.i0 @d.e(id = 2) ParcelFileDescriptor parcelFileDescriptor) {
        this.d = parcelFileDescriptor;
    }

    private final synchronized ParcelFileDescriptor j() {
        return this.d;
    }

    public final synchronized boolean h() {
        return this.d != null;
    }

    @androidx.annotation.i0
    public final synchronized InputStream i() {
        if (this.d == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.d);
        this.d = null;
        return autoCloseInputStream;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int r0 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.S(parcel, 2, j(), r6, false);
        com.google.android.gms.common.internal.z.c.b(parcel, r0);
    }
}
