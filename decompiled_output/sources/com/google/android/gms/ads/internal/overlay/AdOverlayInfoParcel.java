package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import c.a.b.b.e.c;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.z.d;
import com.google.android.gms.internal.ads.as;
import com.google.android.gms.internal.ads.b6;
import com.google.android.gms.internal.ads.d6;
import com.google.android.gms.internal.ads.rw;
import com.google.android.gms.internal.ads.zv2;

@d.f({1})
@d.a(creator = "AdOverlayInfoCreator")
/* loaded from: classes.dex */
public final class AdOverlayInfoParcel extends com.google.android.gms.common.internal.z.a implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new n();

    @d.c(id = 2)
    public final b d;

    @d.c(getter = "getAdClickListenerAsBinder", id = 3, type = "android.os.IBinder")
    public final zv2 e;

    @d.c(getter = "getAdOverlayListenerAsBinder", id = 4, type = "android.os.IBinder")
    public final p f;

    @d.c(getter = "getAdWebViewAsBinder", id = 5, type = "android.os.IBinder")
    public final rw g;

    @d.c(getter = "getAppEventGmsgListenerAsBinder", id = 6, type = "android.os.IBinder")
    public final d6 h;

    @d.c(id = 7)
    public final String i;

    @d.c(id = 8)
    public final boolean j;

    @d.c(id = 9)
    public final String k;

    @d.c(getter = "getLeaveApplicationListenerAsBinder", id = 10, type = "android.os.IBinder")
    public final v l;

    @d.c(id = 11)
    public final int m;

    @d.c(id = 12)
    public final int n;

    @d.c(id = 13)
    public final String o;

    @d.c(id = 14)
    public final as p;

    @d.c(id = 16)
    public final String q;

    @d.c(id = 17)
    public final com.google.android.gms.ads.internal.i r;

    @d.c(getter = "getAdMetadataGmsgListenerAsBinder", id = 18, type = "android.os.IBinder")
    public final b6 s;

    @d.b
    AdOverlayInfoParcel(@d.e(id = 2) b bVar, @d.e(id = 3) IBinder iBinder, @d.e(id = 4) IBinder iBinder2, @d.e(id = 5) IBinder iBinder3, @d.e(id = 6) IBinder iBinder4, @d.e(id = 7) String str, @d.e(id = 8) boolean z, @d.e(id = 9) String str2, @d.e(id = 10) IBinder iBinder5, @d.e(id = 11) int r12, @d.e(id = 12) int r13, @d.e(id = 13) String str3, @d.e(id = 14) as asVar, @d.e(id = 16) String str4, @d.e(id = 17) com.google.android.gms.ads.internal.i iVar, @d.e(id = 18) IBinder iBinder6) {
        this.d = bVar;
        this.e = (zv2) c.a.b.b.e.e.e2(c.a.b2(iBinder));
        this.f = (p) c.a.b.b.e.e.e2(c.a.b2(iBinder2));
        this.g = (rw) c.a.b.b.e.e.e2(c.a.b2(iBinder3));
        this.s = (b6) c.a.b.b.e.e.e2(c.a.b2(iBinder6));
        this.h = (d6) c.a.b.b.e.e.e2(c.a.b2(iBinder4));
        this.i = str;
        this.j = z;
        this.k = str2;
        this.l = (v) c.a.b.b.e.e.e2(c.a.b2(iBinder5));
        this.m = r12;
        this.n = r13;
        this.o = str3;
        this.p = asVar;
        this.q = str4;
        this.r = iVar;
    }

    public AdOverlayInfoParcel(b bVar, zv2 zv2Var, p pVar, v vVar, as asVar) {
        this.d = bVar;
        this.e = zv2Var;
        this.f = pVar;
        this.g = null;
        this.s = null;
        this.h = null;
        this.i = null;
        this.j = false;
        this.k = null;
        this.l = vVar;
        this.m = -1;
        this.n = 4;
        this.o = null;
        this.p = asVar;
        this.q = null;
        this.r = null;
    }

    public AdOverlayInfoParcel(zv2 zv2Var, p pVar, v vVar, rw rwVar, int r5, as asVar, String str, com.google.android.gms.ads.internal.i iVar, String str2, String str3) {
        this.d = null;
        this.e = null;
        this.f = pVar;
        this.g = rwVar;
        this.s = null;
        this.h = null;
        this.i = str2;
        this.j = false;
        this.k = str3;
        this.l = null;
        this.m = r5;
        this.n = 1;
        this.o = null;
        this.p = asVar;
        this.q = str;
        this.r = iVar;
    }

    public AdOverlayInfoParcel(zv2 zv2Var, p pVar, v vVar, rw rwVar, boolean z, int r7, as asVar) {
        this.d = null;
        this.e = zv2Var;
        this.f = pVar;
        this.g = rwVar;
        this.s = null;
        this.h = null;
        this.i = null;
        this.j = z;
        this.k = null;
        this.l = vVar;
        this.m = r7;
        this.n = 2;
        this.o = null;
        this.p = asVar;
        this.q = null;
        this.r = null;
    }

    public AdOverlayInfoParcel(zv2 zv2Var, p pVar, b6 b6Var, d6 d6Var, v vVar, rw rwVar, boolean z, int r9, String str, as asVar) {
        this.d = null;
        this.e = zv2Var;
        this.f = pVar;
        this.g = rwVar;
        this.s = b6Var;
        this.h = d6Var;
        this.i = null;
        this.j = z;
        this.k = null;
        this.l = vVar;
        this.m = r9;
        this.n = 3;
        this.o = str;
        this.p = asVar;
        this.q = null;
        this.r = null;
    }

    public AdOverlayInfoParcel(zv2 zv2Var, p pVar, b6 b6Var, d6 d6Var, v vVar, rw rwVar, boolean z, int r9, String str, String str2, as asVar) {
        this.d = null;
        this.e = zv2Var;
        this.f = pVar;
        this.g = rwVar;
        this.s = b6Var;
        this.h = d6Var;
        this.i = str2;
        this.j = z;
        this.k = str;
        this.l = vVar;
        this.m = r9;
        this.n = 3;
        this.o = null;
        this.p = asVar;
        this.q = null;
        this.r = null;
    }

    public static void h(Intent intent, AdOverlayInfoParcel adOverlayInfoParcel) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
    }

    public static AdOverlayInfoParcel i(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int r0 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.S(parcel, 2, this.d, r6, false);
        com.google.android.gms.common.internal.z.c.B(parcel, 3, c.a.b.b.e.e.i2(this.e).asBinder(), false);
        com.google.android.gms.common.internal.z.c.B(parcel, 4, c.a.b.b.e.e.i2(this.f).asBinder(), false);
        com.google.android.gms.common.internal.z.c.B(parcel, 5, c.a.b.b.e.e.i2(this.g).asBinder(), false);
        com.google.android.gms.common.internal.z.c.B(parcel, 6, c.a.b.b.e.e.i2(this.h).asBinder(), false);
        com.google.android.gms.common.internal.z.c.X(parcel, 7, this.i, false);
        com.google.android.gms.common.internal.z.c.g(parcel, 8, this.j);
        com.google.android.gms.common.internal.z.c.X(parcel, 9, this.k, false);
        com.google.android.gms.common.internal.z.c.B(parcel, 10, c.a.b.b.e.e.i2(this.l).asBinder(), false);
        com.google.android.gms.common.internal.z.c.F(parcel, 11, this.m);
        com.google.android.gms.common.internal.z.c.F(parcel, 12, this.n);
        com.google.android.gms.common.internal.z.c.X(parcel, 13, this.o, false);
        com.google.android.gms.common.internal.z.c.S(parcel, 14, this.p, r6, false);
        com.google.android.gms.common.internal.z.c.X(parcel, 16, this.q, false);
        com.google.android.gms.common.internal.z.c.S(parcel, 17, this.r, r6, false);
        com.google.android.gms.common.internal.z.c.B(parcel, 18, c.a.b.b.e.e.i2(this.s).asBinder(), false);
        com.google.android.gms.common.internal.z.c.b(parcel, r0);
    }
}
