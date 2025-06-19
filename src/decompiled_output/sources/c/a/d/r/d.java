package c.a.d.r;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.p0;
import androidx.annotation.x0;

/* loaded from: classes.dex */
class d {

    /* renamed from: b, reason: collision with root package name */
    private static d f2192b = null;

    /* renamed from: c, reason: collision with root package name */
    private static final String f2193c = "fire-global";
    private static final String d = "FirebaseAppHeartBeat";

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f2194a;

    private d(Context context) {
        this.f2194a = context.getSharedPreferences(d, 0);
    }

    @p0({p0.a.TESTS})
    @x0
    d(SharedPreferences sharedPreferences) {
        this.f2194a = sharedPreferences;
    }

    static synchronized d a(Context context) {
        if (f2192b == null) {
            f2192b = new d(context);
        }
        return f2192b;
    }

    synchronized boolean b(long j) {
        return c(f2193c, j);
    }

    synchronized boolean c(String str, long j) {
        if (!this.f2194a.contains(str)) {
            this.f2194a.edit().putLong(str, j).apply();
            return true;
        }
        if (j - this.f2194a.getLong(str, -1L) < 86400000) {
            return false;
        }
        this.f2194a.edit().putLong(str, j).apply();
        return true;
    }
}
