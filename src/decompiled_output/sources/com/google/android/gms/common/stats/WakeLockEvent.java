package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.z.d;
import java.util.List;
import javax.annotation.Nullable;

@com.google.android.gms.common.annotation.a
@d.a(creator = "WakeLockEventCreator")
@Deprecated
/* loaded from: classes.dex */
public final class WakeLockEvent extends StatsEvent {

    @RecentlyNonNull
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new e();

    @d.g(id = 1)
    private final int d;

    @d.c(getter = "getTimeMillis", id = 2)
    private final long e;

    @d.c(getter = "getEventType", id = 11)
    private int f;

    @d.c(getter = "getWakeLockName", id = 4)
    private final String g;

    @d.c(getter = "getSecondaryWakeLockName", id = 10)
    private final String h;

    @d.c(getter = "getCodePackage", id = 17)
    private final String i;

    @d.c(getter = "getWakeLockType", id = 5)
    private final int j;

    @d.c(getter = "getCallingPackages", id = 6)
    @Nullable
    private final List<String> k;

    @d.c(getter = "getEventKey", id = 12)
    private final String l;

    @d.c(getter = "getElapsedRealtime", id = 8)
    private final long m;

    @d.c(getter = "getDeviceState", id = 14)
    private int n;

    @d.c(getter = "getHostPackage", id = 13)
    private final String o;

    @d.c(getter = "getBeginPowerPercentage", id = 15)
    private final float p;

    @d.c(getter = "getTimeout", id = 16)
    private final long q;

    @d.c(getter = "getAcquiredWithTimeout", id = 18)
    private final boolean r;
    private long s = -1;

    @d.b
    WakeLockEvent(@d.e(id = 1) int r4, @d.e(id = 2) long j, @d.e(id = 11) int r7, @d.e(id = 4) String str, @d.e(id = 5) int r9, @Nullable @d.e(id = 6) List<String> list, @d.e(id = 12) String str2, @d.e(id = 8) long j2, @d.e(id = 14) int r14, @d.e(id = 10) String str3, @d.e(id = 13) String str4, @d.e(id = 15) float f, @d.e(id = 16) long j3, @d.e(id = 17) String str5, @d.e(id = 18) boolean z) {
        this.d = r4;
        this.e = j;
        this.f = r7;
        this.g = str;
        this.h = str3;
        this.i = str5;
        this.j = r9;
        this.k = list;
        this.l = str2;
        this.m = j2;
        this.n = r14;
        this.o = str4;
        this.p = f;
        this.q = j3;
        this.r = z;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    @RecentlyNonNull
    public final long h() {
        return this.e;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    @RecentlyNonNull
    public final int i() {
        return this.f;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    @RecentlyNonNull
    public final long j() {
        return this.s;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    @RecentlyNonNull
    public final String l() {
        List<String> list = this.k;
        String str = this.g;
        int r2 = this.j;
        String strJoin = list == null ? "" : TextUtils.join(",", list);
        int r4 = this.n;
        String str2 = this.h;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = this.o;
        if (str3 == null) {
            str3 = "";
        }
        float f = this.p;
        String str4 = this.i;
        String str5 = str4 != null ? str4 : "";
        boolean z = this.r;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(strJoin).length() + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str5).length());
        sb.append("\t");
        sb.append(str);
        sb.append("\t");
        sb.append(r2);
        sb.append("\t");
        sb.append(strJoin);
        sb.append("\t");
        sb.append(r4);
        sb.append("\t");
        sb.append(str2);
        sb.append("\t");
        sb.append(str3);
        sb.append("\t");
        sb.append(f);
        sb.append("\t");
        sb.append(str5);
        sb.append("\t");
        sb.append(z);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r6) {
        int r62 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.F(parcel, 1, this.d);
        com.google.android.gms.common.internal.z.c.K(parcel, 2, h());
        com.google.android.gms.common.internal.z.c.X(parcel, 4, this.g, false);
        com.google.android.gms.common.internal.z.c.F(parcel, 5, this.j);
        com.google.android.gms.common.internal.z.c.Z(parcel, 6, this.k, false);
        com.google.android.gms.common.internal.z.c.K(parcel, 8, this.m);
        com.google.android.gms.common.internal.z.c.X(parcel, 10, this.h, false);
        com.google.android.gms.common.internal.z.c.F(parcel, 11, i());
        com.google.android.gms.common.internal.z.c.X(parcel, 12, this.l, false);
        com.google.android.gms.common.internal.z.c.X(parcel, 13, this.o, false);
        com.google.android.gms.common.internal.z.c.F(parcel, 14, this.n);
        com.google.android.gms.common.internal.z.c.w(parcel, 15, this.p);
        com.google.android.gms.common.internal.z.c.K(parcel, 16, this.q);
        com.google.android.gms.common.internal.z.c.X(parcel, 17, this.i, false);
        com.google.android.gms.common.internal.z.c.g(parcel, 18, this.r);
        com.google.android.gms.common.internal.z.c.b(parcel, r62);
    }
}
