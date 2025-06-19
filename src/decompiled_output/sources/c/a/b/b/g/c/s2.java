package c.a.b.b.g.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class s2 implements a2 {

    @androidx.annotation.u("SharedPreferencesLoader.class")
    private static final Map<String, s2> f = new b.f.a();

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f1815a;
    private volatile Map<String, ?> d;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences.OnSharedPreferenceChangeListener f1816b = new SharedPreferences.OnSharedPreferenceChangeListener(this) { // from class: c.a.b.b.g.c.v2

        /* renamed from: a, reason: collision with root package name */
        private final s2 f1840a;

        {
            this.f1840a = this;
        }

        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            this.f1840a.c(sharedPreferences, str);
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private final Object f1817c = new Object();

    @androidx.annotation.u("this")
    private final List<x1> e = new ArrayList();

    private s2(SharedPreferences sharedPreferences) {
        this.f1815a = sharedPreferences;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this.f1816b);
    }

    static s2 a(Context context, String str) {
        s2 s2Var;
        String str2 = null;
        if (!((!u1.a() || str2.startsWith("direct_boot:")) ? true : u1.b(context))) {
            return null;
        }
        synchronized (s2.class) {
            s2Var = f.get(null);
            if (s2Var == null) {
                s2Var = new s2(d(context, null));
                f.put(null, s2Var);
            }
        }
        return s2Var;
    }

    static synchronized void b() {
        for (s2 s2Var : f.values()) {
            s2Var.f1815a.unregisterOnSharedPreferenceChangeListener(s2Var.f1816b);
        }
        f.clear();
    }

    private static SharedPreferences d(Context context, String str) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (!str.startsWith("direct_boot:")) {
                return context.getSharedPreferences(str, 0);
            }
            if (u1.a()) {
                context = context.createDeviceProtectedStorageContext();
            }
            return context.getSharedPreferences(str.substring(12), 0);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    final /* synthetic */ void c(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f1817c) {
            this.d = null;
            l2.g();
        }
        synchronized (this) {
            Iterator<x1> it = this.e.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    @Override // c.a.b.b.g.c.a2
    public final Object i(String str) {
        Map<String, ?> map = this.d;
        if (map == null) {
            synchronized (this.f1817c) {
                map = this.d;
                if (map == null) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        Map<String, ?> all = this.f1815a.getAll();
                        this.d = all;
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        map = all;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th;
                    }
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
