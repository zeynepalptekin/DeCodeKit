package com.google.android.gms.ads.d0;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.i0;
import com.google.android.gms.common.internal.z.d;
import com.google.android.gms.internal.ads.e5;
import com.google.android.gms.internal.ads.f5;
import com.google.android.gms.internal.ads.py2;
import com.google.android.gms.internal.ads.sy2;
import com.google.android.gms.internal.ads.ww2;

@d.a(creator = "PublisherAdViewOptionsCreator")
/* loaded from: classes.dex */
public final class m extends com.google.android.gms.common.internal.z.a {
    public static final Parcelable.Creator<m> CREATOR = new t();

    @d.c(getter = "getManualImpressionsEnabled", id = 1)
    private final boolean d;

    @i0
    @d.c(getter = "getAppEventListenerBinder", id = 2, type = "android.os.IBinder")
    private final py2 e;

    @i0
    private com.google.android.gms.ads.c0.a f;

    @i0
    @d.c(getter = "getDelayedBannerAdListenerBinder", id = 3)
    private final IBinder g;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f2372a = false;

        /* renamed from: b, reason: collision with root package name */
        @i0
        private com.google.android.gms.ads.c0.a f2373b;

        /* renamed from: c, reason: collision with root package name */
        @i0
        private n f2374c;

        public final m a() {
            return new m(this);
        }

        public final a b(com.google.android.gms.ads.c0.a aVar) {
            this.f2373b = aVar;
            return this;
        }

        public final a c(boolean z) {
            this.f2372a = z;
            return this;
        }

        @com.google.android.gms.common.annotation.a
        public final a d(n nVar) {
            this.f2374c = nVar;
            return this;
        }
    }

    private m(a aVar) {
        this.d = aVar.f2372a;
        com.google.android.gms.ads.c0.a aVar2 = aVar.f2373b;
        this.f = aVar2;
        this.e = aVar2 != null ? new ww2(this.f) : null;
        this.g = aVar.f2374c != null ? new com.google.android.gms.internal.ads.k(aVar.f2374c) : null;
    }

    @d.b
    m(@d.e(id = 1) boolean z, @i0 @d.e(id = 2) IBinder iBinder, @i0 @d.e(id = 3) IBinder iBinder2) {
        this.d = z;
        this.e = iBinder != null ? sy2.y8(iBinder) : null;
        this.g = iBinder2;
    }

    @i0
    public final com.google.android.gms.ads.c0.a h() {
        return this.f;
    }

    public final boolean i() {
        return this.d;
    }

    @i0
    public final py2 j() {
        return this.e;
    }

    @i0
    public final f5 l() {
        return e5.y8(this.g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int r52 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.g(parcel, 1, i());
        py2 py2Var = this.e;
        com.google.android.gms.common.internal.z.c.B(parcel, 2, py2Var == null ? null : py2Var.asBinder(), false);
        com.google.android.gms.common.internal.z.c.B(parcel, 3, this.g, false);
        com.google.android.gms.common.internal.z.c.b(parcel, r52);
    }
}
