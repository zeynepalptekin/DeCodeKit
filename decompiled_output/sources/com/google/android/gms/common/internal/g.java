package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.k;
import com.google.android.gms.common.internal.z.d;

@d.f({9})
@com.google.android.gms.common.annotation.a
@d.a(creator = "GetServiceRequestCreator")
/* loaded from: classes.dex */
public class g extends com.google.android.gms.common.internal.z.a {

    @RecentlyNonNull
    public static final Parcelable.Creator<g> CREATOR = new e0();

    @d.g(id = 1)
    private final int d;

    @d.c(id = 2)
    private final int e;

    @d.c(id = 3)
    private int f;

    @d.c(id = 4)
    String g;

    @d.c(id = 5)
    IBinder h;

    @d.c(id = 6)
    Scope[] i;

    @d.c(id = 7)
    Bundle j;

    @androidx.annotation.i0
    @d.c(id = 8)
    Account k;

    @d.c(id = 10)
    c.a.b.b.d.d[] l;

    @d.c(id = 11)
    c.a.b.b.d.d[] m;

    @d.c(id = 12)
    private boolean n;

    @d.c(defaultValue = "0", id = 13)
    private int o;

    @d.c(getter = "isRequestingTelemetryConfiguration", id = 14)
    boolean p;

    public g(@RecentlyNonNull int r2) {
        this.d = 5;
        this.f = c.a.b.b.d.f.f1608a;
        this.e = r2;
        this.n = true;
    }

    @d.b
    g(@d.e(id = 1) int r1, @d.e(id = 2) int r2, @d.e(id = 3) int r3, @d.e(id = 4) String str, @d.e(id = 5) IBinder iBinder, @d.e(id = 6) Scope[] scopeArr, @d.e(id = 7) Bundle bundle, @d.e(id = 8) Account account, @d.e(id = 10) c.a.b.b.d.d[] dVarArr, @d.e(id = 11) c.a.b.b.d.d[] dVarArr2, @d.e(id = 12) boolean z, @d.e(id = 13) int r12, @d.e(id = 14) boolean z2) {
        this.d = r1;
        this.e = r2;
        this.f = r3;
        if ("com.google.android.gms".equals(str)) {
            this.g = "com.google.android.gms";
        } else {
            this.g = str;
        }
        if (r1 < 2) {
            this.k = iBinder != null ? a.e2(k.a.b2(iBinder)) : null;
        } else {
            this.h = iBinder;
            this.k = account;
        }
        this.i = scopeArr;
        this.j = bundle;
        this.l = dVarArr;
        this.m = dVarArr2;
        this.n = z;
        this.o = r12;
        this.p = z2;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public Bundle h() {
        return this.j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r6) {
        int r0 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.F(parcel, 1, this.d);
        com.google.android.gms.common.internal.z.c.F(parcel, 2, this.e);
        com.google.android.gms.common.internal.z.c.F(parcel, 3, this.f);
        com.google.android.gms.common.internal.z.c.X(parcel, 4, this.g, false);
        com.google.android.gms.common.internal.z.c.B(parcel, 5, this.h, false);
        com.google.android.gms.common.internal.z.c.b0(parcel, 6, this.i, r6, false);
        com.google.android.gms.common.internal.z.c.k(parcel, 7, this.j, false);
        com.google.android.gms.common.internal.z.c.S(parcel, 8, this.k, r6, false);
        com.google.android.gms.common.internal.z.c.b0(parcel, 10, this.l, r6, false);
        com.google.android.gms.common.internal.z.c.b0(parcel, 11, this.m, r6, false);
        com.google.android.gms.common.internal.z.c.g(parcel, 12, this.n);
        com.google.android.gms.common.internal.z.c.F(parcel, 13, this.o);
        com.google.android.gms.common.internal.z.c.g(parcel, 14, this.p);
        com.google.android.gms.common.internal.z.c.b(parcel, r0);
    }
}
