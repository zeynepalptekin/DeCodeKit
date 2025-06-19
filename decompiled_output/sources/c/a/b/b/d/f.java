package c.a.b.b.d;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import androidx.annotation.i0;
import com.google.android.gms.common.internal.j0;

@com.google.android.gms.common.internal.v
@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static final String f1609b = "com.google.android.gms";

    /* renamed from: c, reason: collision with root package name */
    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static final String f1610c = "com.android.vending";

    @com.google.android.gms.common.annotation.a
    static final String d = "d";

    @com.google.android.gms.common.annotation.a
    static final String e = "n";

    /* renamed from: a, reason: collision with root package name */
    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static final int f1608a = i.f1611a;
    private static final f f = new f();

    @com.google.android.gms.common.annotation.a
    f() {
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static f i() {
        return f;
    }

    @com.google.android.gms.common.util.d0
    private static String q(@i0 Context context, @i0 String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(f1608a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(c.a.b.b.d.s.c.a(context).e(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return sb.toString();
    }

    @com.google.android.gms.common.annotation.a
    public void a(@RecentlyNonNull Context context) {
        i.a(context);
    }

    @RecentlyNonNull
    @com.google.android.gms.common.internal.v
    @com.google.android.gms.common.annotation.a
    public int b(@RecentlyNonNull Context context) {
        return i.d(context);
    }

    @RecentlyNonNull
    @com.google.android.gms.common.internal.v
    @com.google.android.gms.common.annotation.a
    public int c(@RecentlyNonNull Context context) {
        return i.e(context);
    }

    @RecentlyNullable
    @com.google.android.gms.common.internal.v
    @com.google.android.gms.common.annotation.a
    @Deprecated
    public Intent d(@RecentlyNonNull int r2) {
        return e(null, r2, null);
    }

    @RecentlyNullable
    @com.google.android.gms.common.internal.v
    @com.google.android.gms.common.annotation.a
    public Intent e(@i0 Context context, @RecentlyNonNull int r4, @i0 String str) {
        if (r4 == 1 || r4 == 2) {
            return (context == null || !com.google.android.gms.common.util.l.l(context)) ? j0.c("com.google.android.gms", q(context, str)) : j0.a();
        }
        if (r4 != 3) {
            return null;
        }
        return j0.b("com.google.android.gms");
    }

    @RecentlyNullable
    @com.google.android.gms.common.annotation.a
    public PendingIntent f(@RecentlyNonNull Context context, @RecentlyNonNull int r3, @RecentlyNonNull int r4) {
        return g(context, r3, r4, null);
    }

    @RecentlyNullable
    @com.google.android.gms.common.internal.v
    @com.google.android.gms.common.annotation.a
    public PendingIntent g(@RecentlyNonNull Context context, @RecentlyNonNull int r2, @RecentlyNonNull int r3, @i0 String str) {
        Intent intentE = e(context, r2, str);
        if (intentE == null) {
            return null;
        }
        return PendingIntent.getActivity(context, r3, intentE, 134217728);
    }

    @androidx.annotation.h0
    @com.google.android.gms.common.annotation.a
    public String h(@RecentlyNonNull int r1) {
        return i.g(r1);
    }

    @RecentlyNonNull
    @com.google.android.gms.common.internal.j
    @com.google.android.gms.common.annotation.a
    public int j(@RecentlyNonNull Context context) {
        return k(context, f1608a);
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public int k(@RecentlyNonNull Context context, @RecentlyNonNull int r2) {
        int r22 = i.m(context, r2);
        if (i.o(context, r22)) {
            return 18;
        }
        return r22;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.internal.v
    @com.google.android.gms.common.annotation.a
    public boolean l(@RecentlyNonNull Context context, @RecentlyNonNull int r2) {
        return i.o(context, r2);
    }

    @RecentlyNonNull
    @com.google.android.gms.common.internal.v
    @com.google.android.gms.common.annotation.a
    public boolean m(@RecentlyNonNull Context context, @RecentlyNonNull int r2) {
        return i.p(context, r2);
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public boolean n(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
        return i.v(context, str);
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public boolean o(@RecentlyNonNull int r1) {
        return i.s(r1);
    }

    @com.google.android.gms.common.annotation.a
    public void p(@RecentlyNonNull Context context, @RecentlyNonNull int r2) throws g, h {
        i.c(context, r2);
    }
}
