package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.z.d;
import com.google.android.gms.internal.ads.fm0;

@d.a(creator = "GassResponseParcelCreator")
/* loaded from: classes.dex */
public final class ht1 extends com.google.android.gms.common.internal.z.a {
    public static final Parcelable.Creator<ht1> CREATOR = new kt1();

    @d.g(id = 1)
    private final int d;

    @d.c(getter = "getAfmaSignalsAsBytes", id = 2, type = "byte[]")
    private fm0.a e = null;
    private byte[] f;

    @d.b
    ht1(@d.e(id = 1) int r1, @d.e(id = 2) byte[] bArr) {
        this.d = r1;
        this.f = bArr;
        i();
    }

    private final void i() {
        if (this.e != null || this.f == null) {
            if (this.e == null || this.f != null) {
                if (this.e != null && this.f != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (this.e != null || this.f != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    public final fm0.a h() {
        if (!(this.e != null)) {
            try {
                this.e = fm0.a.H(this.f, y82.c());
                this.f = null;
            } catch (w92 e) {
                throw new IllegalStateException(e);
            }
        }
        i();
        return this.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int r52 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.F(parcel, 1, this.d);
        byte[] bArrF = this.f;
        if (bArrF == null) {
            bArrF = this.e.f();
        }
        com.google.android.gms.common.internal.z.c.m(parcel, 2, bArrF, false);
        com.google.android.gms.common.internal.z.c.b(parcel, r52);
    }
}
