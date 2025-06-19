package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.h0;
import androidx.annotation.p0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

@p0({p0.a.LIBRARY})
/* loaded from: classes.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f264a = "ActivityRecreator";
    private static final Handler h = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    protected static final Class<?> f265b = a();

    /* renamed from: c, reason: collision with root package name */
    protected static final Field f266c = b();
    protected static final Field d = f();
    protected static final Method e = d(f265b);
    protected static final Method f = c(f265b);
    protected static final Method g = e(f265b);

    class a implements Runnable {
        final /* synthetic */ C0022d d;
        final /* synthetic */ Object e;

        a(C0022d c0022d, Object obj) {
            this.d = c0022d;
            this.e = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.d.d = this.e;
        }
    }

    class b implements Runnable {
        final /* synthetic */ Application d;
        final /* synthetic */ C0022d e;

        b(Application application, C0022d c0022d) {
            this.d = application;
            this.e = c0022d;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.d.unregisterActivityLifecycleCallbacks(this.e);
        }
    }

    class c implements Runnable {
        final /* synthetic */ Object d;
        final /* synthetic */ Object e;

        c(Object obj, Object obj2) {
            this.d = obj;
            this.e = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (d.e != null) {
                    d.e.invoke(this.d, this.e, Boolean.FALSE, "AppCompat recreation");
                } else {
                    d.f.invoke(this.d, this.e, Boolean.FALSE);
                }
            } catch (RuntimeException e) {
                if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                    throw e;
                }
            } catch (Throwable th) {
                Log.e(d.f264a, "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* renamed from: androidx.core.app.d$d, reason: collision with other inner class name */
    private static final class C0022d implements Application.ActivityLifecycleCallbacks {
        Object d;
        private Activity e;
        private boolean f = false;
        private boolean g = false;
        private boolean h = false;

        C0022d(@h0 Activity activity) {
            this.e = activity;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.e == activity) {
                this.e = null;
                this.g = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.g || this.h || this.f || !d.h(this.d, activity)) {
                return;
            }
            this.h = true;
            this.d = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.e == activity) {
                this.f = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    private d() {
    }

    private static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Class<?> cls) {
        if (g() && cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, Boolean.TYPE, Configuration.class, Configuration.class, Boolean.TYPE, Boolean.TYPE);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int r0 = Build.VERSION.SDK_INT;
        return r0 == 26 || r0 == 27;
    }

    protected static boolean h(Object obj, Activity activity) {
        try {
            Object obj2 = d.get(activity);
            if (obj2 != obj) {
                return false;
            }
            h.postAtFrontOfQueue(new c(f266c.get(activity), obj2));
            return true;
        } catch (Throwable th) {
            Log.e(f264a, "Exception while fetching field values", th);
            return false;
        }
    }

    static boolean i(@h0 Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (g() && g == null) {
            return false;
        }
        if (f == null && e == null) {
            return false;
        }
        try {
            Object obj2 = d.get(activity);
            if (obj2 == null || (obj = f266c.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            C0022d c0022d = new C0022d(activity);
            application.registerActivityLifecycleCallbacks(c0022d);
            h.post(new a(c0022d, obj2));
            try {
                if (g()) {
                    g.invoke(obj, obj2, null, null, 0, Boolean.FALSE, null, null, Boolean.FALSE, Boolean.FALSE);
                } else {
                    activity.recreate();
                }
                return true;
            } finally {
                h.post(new b(application, c0022d));
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}
