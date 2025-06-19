package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import androidx.annotation.i0;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.v;
import com.google.android.gms.common.internal.z.d;
import com.google.android.gms.common.util.d0;

@com.google.android.gms.common.annotation.a
@d.a(creator = "StatusCreator")
/* loaded from: classes.dex */
public final class Status extends com.google.android.gms.common.internal.z.a implements g, ReflectedParcelable {

    @d.g(id = 1000)
    private final int d;

    @d.c(getter = "getStatusCode", id = 1)
    private final int e;

    @i0
    @d.c(getter = "getStatusMessage", id = 2)
    private final String f;

    @i0
    @d.c(getter = "getPendingIntent", id = 3)
    private final PendingIntent g;

    @i0
    @d.c(getter = "getConnectionResult", id = 4)
    private final c.a.b.b.d.c h;

    @RecentlyNonNull
    @v
    @d0
    @com.google.android.gms.common.annotation.a
    public static final Status i = new Status(0);

    @RecentlyNonNull
    @v
    @com.google.android.gms.common.annotation.a
    public static final Status j = new Status(14);

    @RecentlyNonNull
    @v
    @com.google.android.gms.common.annotation.a
    public static final Status k = new Status(8);

    @RecentlyNonNull
    @v
    @com.google.android.gms.common.annotation.a
    public static final Status l = new Status(15);

    @RecentlyNonNull
    @v
    @com.google.android.gms.common.annotation.a
    public static final Status m = new Status(16);

    @v
    private static final Status n = new Status(17);

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static final Status o = new Status(18);

    @RecentlyNonNull
    public static final Parcelable.Creator<Status> CREATOR = new l();

    @com.google.android.gms.common.annotation.a
    public Status(@RecentlyNonNull int r2) {
        this(r2, (String) null);
    }

    @com.google.android.gms.common.annotation.a
    Status(int r7, int r8, @i0 String str, @i0 PendingIntent pendingIntent) {
        this(r7, r8, str, pendingIntent, null);
    }

    @d.b
    @com.google.android.gms.common.annotation.a
    Status(@d.e(id = 1000) int r1, @d.e(id = 1) int r2, @i0 @d.e(id = 2) String str, @i0 @d.e(id = 3) PendingIntent pendingIntent, @i0 @d.e(id = 4) c.a.b.b.d.c cVar) {
        this.d = r1;
        this.e = r2;
        this.f = str;
        this.g = pendingIntent;
        this.h = cVar;
    }

    @com.google.android.gms.common.annotation.a
    public Status(@RecentlyNonNull int r3, @i0 String str) {
        this(1, r3, str, null);
    }

    @com.google.android.gms.common.annotation.a
    public Status(@RecentlyNonNull int r2, @i0 String str, @i0 PendingIntent pendingIntent) {
        this(1, r2, str, pendingIntent);
    }

    public Status(@RecentlyNonNull c.a.b.b.d.c cVar, @RecentlyNonNull String str) {
        this(cVar, str, 17);
    }

    @com.google.android.gms.common.annotation.a
    @Deprecated
    public Status(@RecentlyNonNull c.a.b.b.d.c cVar, @RecentlyNonNull String str, @RecentlyNonNull int r9) {
        this(1, r9, str, cVar.j(), cVar);
    }

    @RecentlyNonNull
    public final boolean B() {
        return this.e <= 0;
    }

    public final void C(@RecentlyNonNull Activity activity, @RecentlyNonNull int r10) throws IntentSender.SendIntentException {
        if (t()) {
            activity.startIntentSenderForResult(((PendingIntent) r.k(this.g)).getIntentSender(), r10, null, 0, 0, 0);
        }
    }

    @RecentlyNonNull
    public final String D() {
        String str = this.f;
        return str != null ? str : b.a(this.e);
    }

    @Override // com.google.android.gms.common.api.g
    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public final Status c() {
        return this;
    }

    @RecentlyNonNull
    public final boolean equals(@i0 Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.d == status.d && this.e == status.e && q.b(this.f, status.f) && q.b(this.g, status.g) && q.b(this.h, status.h);
    }

    @RecentlyNullable
    public final c.a.b.b.d.c h() {
        return this.h;
    }

    @RecentlyNonNull
    public final int hashCode() {
        return q.c(Integer.valueOf(this.d), Integer.valueOf(this.e), this.f, this.g, this.h);
    }

    @RecentlyNullable
    public final PendingIntent i() {
        return this.g;
    }

    @RecentlyNonNull
    public final int j() {
        return this.e;
    }

    @RecentlyNullable
    public final String l() {
        return this.f;
    }

    @RecentlyNonNull
    @d0
    public final boolean t() {
        return this.g != null;
    }

    @RecentlyNonNull
    public final String toString() {
        return q.d(this).a("statusCode", D()).a("resolution", this.g).toString();
    }

    @RecentlyNonNull
    public final boolean u() {
        return this.e == 16;
    }

    @Override // android.os.Parcelable
    @com.google.android.gms.common.annotation.a
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r6) {
        int r0 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.F(parcel, 1, j());
        com.google.android.gms.common.internal.z.c.X(parcel, 2, l(), false);
        com.google.android.gms.common.internal.z.c.S(parcel, 3, this.g, r6, false);
        com.google.android.gms.common.internal.z.c.S(parcel, 4, h(), r6, false);
        com.google.android.gms.common.internal.z.c.F(parcel, 1000, this.d);
        com.google.android.gms.common.internal.z.c.b(parcel, r0);
    }

    @RecentlyNonNull
    public final boolean y() {
        return this.e == 14;
    }
}
