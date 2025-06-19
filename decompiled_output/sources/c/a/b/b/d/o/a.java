package c.a.b.b.d.o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Binder;
import android.os.StrictMode;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.i0;
import com.google.android.gms.common.util.d0;
import java.util.Set;
import javax.annotation.concurrent.GuardedBy;

@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public abstract class a<T> {
    private static final Object d = new Object();

    @i0
    private static InterfaceC0122a e;
    private static int f;

    @i0
    @SuppressLint({"StaticFieldLeak"})
    private static Context g;

    @i0
    @GuardedBy("lock")
    private static Set<String> h;

    /* renamed from: a, reason: collision with root package name */
    @RecentlyNonNull
    protected final String f1621a;

    /* renamed from: b, reason: collision with root package name */
    @RecentlyNonNull
    protected final T f1622b;

    /* renamed from: c, reason: collision with root package name */
    @i0
    private T f1623c = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c.a.b.b.d.o.a$a, reason: collision with other inner class name */
    interface InterfaceC0122a {
        String g(String str, String str2);

        Integer h(String str, Integer num);

        Float i(String str, Float f);

        Boolean j(String str, Boolean bool);

        Long k(String str, Long l);
    }

    protected a(@RecentlyNonNull String str, @RecentlyNonNull T t) {
        this.f1621a = str;
        this.f1622b = t;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static boolean c() {
        synchronized (d) {
        }
        return false;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static a<Float> f(@RecentlyNonNull String str, @RecentlyNonNull Float f2) {
        return new d(str, f2);
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static a<Integer> g(@RecentlyNonNull String str, @RecentlyNonNull Integer num) {
        return new e(str, num);
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static a<Long> h(@RecentlyNonNull String str, @RecentlyNonNull Long l) {
        return new b(str, l);
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static a<String> i(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
        return new f(str, str2);
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static a<Boolean> j(@RecentlyNonNull String str, @RecentlyNonNull boolean z) {
        return new c(str, Boolean.valueOf(z));
    }

    private static boolean l() {
        synchronized (d) {
        }
        return false;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public final T a() {
        T t = this.f1623c;
        if (t != null) {
            return t;
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        synchronized (d) {
        }
        synchronized (d) {
            h = null;
            g = null;
        }
        try {
            try {
                T tK = k(this.f1621a);
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                return tK;
            } catch (SecurityException unused) {
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    T tK2 = k(this.f1621a);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    return tK2;
                } finally {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                }
            }
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th;
        }
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    @Deprecated
    public final T b() {
        return a();
    }

    @d0
    @com.google.android.gms.common.annotation.a
    public void d(@RecentlyNonNull T t) {
        Log.w("GservicesValue", "GservicesValue.override(): test should probably call initForTests() first");
        this.f1623c = t;
        synchronized (d) {
            l();
        }
    }

    @d0
    @com.google.android.gms.common.annotation.a
    public void e() {
        this.f1623c = null;
    }

    @RecentlyNonNull
    protected abstract T k(@RecentlyNonNull String str);
}
