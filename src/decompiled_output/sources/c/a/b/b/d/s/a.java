package c.a.b.b.d.s;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.i0;
import com.google.android.gms.common.util.v;

@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static Context f1628a;

    /* renamed from: b, reason: collision with root package name */
    @i0
    private static Boolean f1629b;

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static synchronized boolean a(@RecentlyNonNull Context context) {
        Boolean boolValueOf;
        Context applicationContext = context.getApplicationContext();
        if (f1628a != null && f1629b != null && f1628a == applicationContext) {
            return f1629b.booleanValue();
        }
        f1629b = null;
        if (!v.n()) {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f1629b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                boolValueOf = Boolean.FALSE;
            }
            f1628a = applicationContext;
            return f1629b.booleanValue();
        }
        boolValueOf = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        f1629b = boolValueOf;
        f1628a = applicationContext;
        return f1629b.booleanValue();
    }
}
