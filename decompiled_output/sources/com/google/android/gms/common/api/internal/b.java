package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import androidx.annotation.i0;
import c.a.b.b.d.l;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.t0;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.common.util.d0;
import javax.annotation.concurrent.GuardedBy;

@com.google.android.gms.common.annotation.a
@Deprecated
/* loaded from: classes.dex */
public final class b {
    private static final Object e = new Object();

    @i0
    @GuardedBy("sLock")
    private static b f;

    /* renamed from: a, reason: collision with root package name */
    @i0
    private final String f2503a;

    /* renamed from: b, reason: collision with root package name */
    private final Status f2504b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f2505c;
    private final boolean d;

    @d0
    @com.google.android.gms.common.annotation.a
    b(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(l.b.common_google_play_services_unknown_issue));
        boolean z = true;
        if (identifier != 0) {
            boolean z2 = resources.getInteger(identifier) != 0;
            this.d = !z2;
            z = z2;
        } else {
            this.d = false;
        }
        this.f2505c = z;
        String strA = t0.a(context);
        strA = strA == null ? new w(context).a("google_app_id") : strA;
        if (TextUtils.isEmpty(strA)) {
            this.f2504b = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.f2503a = null;
        } else {
            this.f2503a = strA;
            this.f2504b = Status.i;
        }
    }

    @d0
    @com.google.android.gms.common.annotation.a
    b(String str, boolean z) {
        this.f2503a = str;
        this.f2504b = Status.i;
        this.f2505c = z;
        this.d = !z;
    }

    @com.google.android.gms.common.annotation.a
    private static b b(String str) {
        b bVar;
        synchronized (e) {
            if (f == null) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
                sb.append("Initialize must be called before ");
                sb.append(str);
                sb.append(".");
                throw new IllegalStateException(sb.toString());
            }
            bVar = f;
        }
        return bVar;
    }

    @d0
    @com.google.android.gms.common.annotation.a
    static void c() {
        synchronized (e) {
            f = null;
        }
    }

    @RecentlyNullable
    @com.google.android.gms.common.annotation.a
    public static String d() {
        return b("getGoogleAppId").f2503a;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static Status e(@RecentlyNonNull Context context) {
        Status status;
        r.l(context, "Context must not be null.");
        synchronized (e) {
            if (f == null) {
                f = new b(context);
            }
            status = f.f2504b;
        }
        return status;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static Status f(@RecentlyNonNull Context context, @RecentlyNonNull String str, @RecentlyNonNull boolean z) {
        r.l(context, "Context must not be null.");
        r.h(str, "App ID must be nonempty.");
        synchronized (e) {
            if (f != null) {
                return f.a(str);
            }
            b bVar = new b(str, z);
            f = bVar;
            return bVar.f2504b;
        }
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static boolean g() {
        b bVarB = b("isMeasurementEnabled");
        return bVarB.f2504b.B() && bVarB.f2505c;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static boolean h() {
        return b("isMeasurementExplicitlyDisabled").d;
    }

    @d0
    @com.google.android.gms.common.annotation.a
    final Status a(String str) {
        String str2 = this.f2503a;
        if (str2 == null || str2.equals(str)) {
            return Status.i;
        }
        String str3 = this.f2503a;
        StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 97);
        sb.append("Initialize was called with two different Google App IDs.  Only the first app ID will be used: '");
        sb.append(str3);
        sb.append("'.");
        return new Status(10, sb.toString());
    }
}
