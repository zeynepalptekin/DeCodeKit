package c.a.b.b.d;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import androidx.annotation.i0;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.z.d;

@d.a(creator = "ConnectionResultCreator")
/* loaded from: classes.dex */
public final class c extends com.google.android.gms.common.internal.z.a {

    @RecentlyNonNull
    public static final int A = 19;

    @RecentlyNonNull
    public static final int B = 20;

    @RecentlyNonNull
    public static final int C = 22;

    @RecentlyNonNull
    @Deprecated
    public static final int D = 1500;

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static final int h = -1;

    @RecentlyNonNull
    public static final int i = 0;

    @RecentlyNonNull
    public static final int j = 1;

    @RecentlyNonNull
    public static final int k = 2;

    @RecentlyNonNull
    public static final int l = 3;

    @RecentlyNonNull
    public static final int m = 4;

    @RecentlyNonNull
    public static final int n = 5;

    @RecentlyNonNull
    public static final int o = 6;

    @RecentlyNonNull
    public static final int p = 7;

    @RecentlyNonNull
    public static final int q = 8;

    @RecentlyNonNull
    public static final int r = 9;

    @RecentlyNonNull
    public static final int s = 10;

    @RecentlyNonNull
    public static final int t = 11;

    @RecentlyNonNull
    public static final int u = 13;

    @RecentlyNonNull
    public static final int v = 14;

    @RecentlyNonNull
    public static final int w = 15;

    @RecentlyNonNull
    public static final int x = 16;

    @RecentlyNonNull
    public static final int y = 17;

    @RecentlyNonNull
    public static final int z = 18;

    @d.g(id = 1)
    private final int d;

    @d.c(getter = "getErrorCode", id = 2)
    private final int e;

    @i0
    @d.c(getter = "getResolution", id = 3)
    private final PendingIntent f;

    @i0
    @d.c(getter = "getErrorMessage", id = 4)
    private final String g;

    @RecentlyNonNull
    @com.google.android.gms.common.internal.v
    @com.google.android.gms.common.annotation.a
    public static final c E = new c(0);

    @RecentlyNonNull
    public static final Parcelable.Creator<c> CREATOR = new t();

    public c(@RecentlyNonNull int r2) {
        this(r2, null, null);
    }

    @d.b
    c(@d.e(id = 1) int r1, @d.e(id = 2) int r2, @i0 @d.e(id = 3) PendingIntent pendingIntent, @i0 @d.e(id = 4) String str) {
        this.d = r1;
        this.e = r2;
        this.f = pendingIntent;
        this.g = str;
    }

    public c(@RecentlyNonNull int r2, @i0 PendingIntent pendingIntent) {
        this(r2, pendingIntent, null);
    }

    public c(@RecentlyNonNull int r2, @i0 PendingIntent pendingIntent, @i0 String str) {
        this(1, r2, pendingIntent, str);
    }

    @androidx.annotation.h0
    static String y(int r2) {
        if (r2 == 99) {
            return "UNFINISHED";
        }
        if (r2 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (r2) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (r2) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(r2);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    @RecentlyNonNull
    public final boolean equals(@i0 Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.e == cVar.e && q.b(this.f, cVar.f) && q.b(this.g, cVar.g);
    }

    @RecentlyNonNull
    public final int h() {
        return this.e;
    }

    @RecentlyNonNull
    public final int hashCode() {
        return q.c(Integer.valueOf(this.e), this.f, this.g);
    }

    @RecentlyNullable
    public final String i() {
        return this.g;
    }

    @RecentlyNullable
    public final PendingIntent j() {
        return this.f;
    }

    @RecentlyNonNull
    public final boolean l() {
        return (this.e == 0 || this.f == null) ? false : true;
    }

    @RecentlyNonNull
    public final boolean t() {
        return this.e == 0;
    }

    @RecentlyNonNull
    public final String toString() {
        return q.d(this).a("statusCode", y(this.e)).a("resolution", this.f).a("message", this.g).toString();
    }

    public final void u(@RecentlyNonNull Activity activity, @RecentlyNonNull int r10) throws IntentSender.SendIntentException {
        if (l()) {
            activity.startIntentSenderForResult(((PendingIntent) r.k(this.f)).getIntentSender(), r10, null, 0, 0, 0);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, @RecentlyNonNull int r6) {
        int r0 = com.google.android.gms.common.internal.z.c.a(parcel);
        com.google.android.gms.common.internal.z.c.F(parcel, 1, this.d);
        com.google.android.gms.common.internal.z.c.F(parcel, 2, h());
        com.google.android.gms.common.internal.z.c.S(parcel, 3, j(), r6, false);
        com.google.android.gms.common.internal.z.c.X(parcel, 4, i(), false);
        com.google.android.gms.common.internal.z.c.b(parcel, r0);
    }
}
