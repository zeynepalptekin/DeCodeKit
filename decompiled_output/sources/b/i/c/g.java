package b.i.c;

import android.content.Context;
import android.os.Binder;
import android.os.Process;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final int f972a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f973b = -1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f974c = -2;

    @Retention(RetentionPolicy.SOURCE)
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public @interface a {
    }

    private g() {
    }

    public static int a(@h0 Context context, @h0 String str) {
        return c(context, str, Binder.getCallingPid(), Binder.getCallingUid(), Binder.getCallingPid() == Process.myPid() ? context.getPackageName() : null);
    }

    public static int b(@h0 Context context, @h0 String str, @i0 String str2) {
        if (Binder.getCallingPid() == Process.myPid()) {
            return -1;
        }
        return c(context, str, Binder.getCallingPid(), Binder.getCallingUid(), str2);
    }

    public static int c(@h0 Context context, @h0 String str, int r3, int r4, @i0 String str2) {
        if (context.checkPermission(str, r3, r4) == -1) {
            return -1;
        }
        String strE = androidx.core.app.h.e(str);
        if (strE == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(r4);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return androidx.core.app.h.d(context, strE, str2) != 0 ? -2 : 0;
    }

    public static int d(@h0 Context context, @h0 String str) {
        return c(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
