package c.a.b.b.g.c;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class h {
    private static volatile h j = null;
    private static Boolean k = null;

    @com.google.android.gms.common.util.d0
    private static String l = "allow_remote_dynamite";
    private static boolean m = false;

    /* renamed from: a, reason: collision with root package name */
    private final String f1701a;

    /* renamed from: b, reason: collision with root package name */
    protected final com.google.android.gms.common.util.g f1702b;

    /* renamed from: c, reason: collision with root package name */
    private final ExecutorService f1703c;
    private final com.google.android.gms.measurement.c.a d;
    private List<Pair<com.google.android.gms.measurement.internal.d6, d>> e;
    private int f;
    private boolean g;
    private String h;
    private of i;

    static class a extends c.a.b.b.g.c.b {
        private final com.google.android.gms.measurement.internal.e6 e;

        a(com.google.android.gms.measurement.internal.e6 e6Var) {
            this.e = e6Var;
        }

        @Override // c.a.b.b.g.c.c
        public final void K0(String str, String str2, Bundle bundle, long j) {
            this.e.a(str, str2, bundle, j);
        }

        @Override // c.a.b.b.g.c.c
        public final int a() {
            return System.identityHashCode(this.e);
        }
    }

    abstract class b implements Runnable {
        final long d;
        final long e;
        private final boolean f;

        b(h hVar) {
            this(true);
        }

        b(boolean z) {
            this.d = h.this.f1702b.a();
            this.e = h.this.f1702b.c();
            this.f = z;
        }

        abstract void a() throws RemoteException;

        protected void b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (h.this.g) {
                b();
                return;
            }
            try {
                a();
            } catch (Exception e) {
                h.this.t(e, false, this.f);
                b();
            }
        }
    }

    class c implements Application.ActivityLifecycleCallbacks {
        c() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            h.this.n(new r0(this, bundle, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            h.this.n(new w0(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            h.this.n(new s0(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            h.this.n(new t0(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            mf mfVar = new mf();
            h.this.n(new u0(this, activity, mfVar));
            Bundle bundleI2 = mfVar.i2(50L);
            if (bundleI2 != null) {
                bundle.putAll(bundleI2);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            h.this.n(new q0(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            h.this.n(new v0(this, activity));
        }
    }

    static class d extends c.a.b.b.g.c.b {
        private final com.google.android.gms.measurement.internal.d6 e;

        d(com.google.android.gms.measurement.internal.d6 d6Var) {
            this.e = d6Var;
        }

        @Override // c.a.b.b.g.c.c
        public final void K0(String str, String str2, Bundle bundle, long j) {
            this.e.a(str, str2, bundle, j);
        }

        @Override // c.a.b.b.g.c.c
        public final int a() {
            return System.identityHashCode(this.e);
        }
    }

    private h(Context context, String str, String str2, String str3, Bundle bundle) {
        this.f1701a = (str == null || !U(str2, str3)) ? "FA" : str;
        this.f1702b = com.google.android.gms.common.util.k.e();
        this.f1703c = i7.a().a(new u(this), kf.f1749a);
        this.d = new com.google.android.gms.measurement.c.a(this);
        if (!(!a0(context) || j0())) {
            this.h = null;
            this.g = true;
            Log.w(this.f1701a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
            return;
        }
        if (U(str2, str3)) {
            this.h = str2;
        } else {
            this.h = "fa";
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 == null)) {
                    Log.w(this.f1701a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.f1701a, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
            }
        }
        n(new k(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f1701a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new c());
        }
    }

    private final void B(String str, String str2, Object obj, boolean z) {
        n(new o0(this, str, str2, obj, z));
    }

    private static boolean D(Context context, @androidx.annotation.q0(min = 1) String str) {
        com.google.android.gms.common.internal.r.g(str);
        try {
            ApplicationInfo applicationInfoC = c.a.b.b.d.s.c.a(context).c(context.getPackageName(), 128);
            if (applicationInfoC != null && applicationInfoC.metaData != null) {
                return applicationInfoC.metaData.getBoolean(str);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean U(String str, String str2) {
        return (str2 == null || str == null || j0()) ? false : true;
    }

    private static boolean a0(Context context) {
        return com.google.android.gms.measurement.internal.q7.b(context, "google_app_id") != null;
    }

    public static h b(@androidx.annotation.h0 Context context) {
        return c(context, null, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b0(Context context) {
        return DynamiteModule.c(context, ModuleDescriptor.MODULE_ID);
    }

    public static h c(Context context, String str, String str2, String str3, Bundle bundle) {
        com.google.android.gms.common.internal.r.k(context);
        if (j == null) {
            synchronized (h.class) {
                if (j == null) {
                    j = new h(context, str, str2, str3, bundle);
                }
            }
        }
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d0(Context context) {
        return DynamiteModule.a(context, ModuleDescriptor.MODULE_ID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g0(Context context) {
        synchronized (h.class) {
            try {
            } catch (Exception e) {
                Log.e("FA", "Exception reading flag from SharedPreferences.", e);
                k = Boolean.FALSE;
            }
            if (k != null) {
                return;
            }
            if (D(context, "app_measurement_internal_disable_startup_flags")) {
                k = Boolean.FALSE;
                return;
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
            k = Boolean.valueOf(sharedPreferences.getBoolean(l, false));
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.remove(l);
            editorEdit.apply();
        }
    }

    private static boolean j0() throws ClassNotFoundException {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(b bVar) {
        this.f1703c.execute(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(Exception exc, boolean z, boolean z2) {
        this.g |= z;
        if (z) {
            Log.w(this.f1701a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            j(5, "Error with data collection. Data lost.", exc, null, null);
        }
        Log.w(this.f1701a, "Error with data collection. Data lost.", exc);
    }

    private final void z(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l2) {
        n(new p0(this, l2, str, str2, bundle, z, z2));
    }

    public final void A(String str, String str2, Object obj) {
        B(str, str2, obj, true);
    }

    public final void C(boolean z) {
        n(new l0(this, z));
    }

    public final List<Bundle> H(String str, String str2) {
        mf mfVar = new mf();
        n(new l(this, str, str2, mfVar));
        List<Bundle> list = (List) mf.b2(mfVar.i2(5000L), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final void I() {
        n(new s(this));
    }

    public final void J(long j2) {
        n(new t(this, j2));
    }

    public final void L(Bundle bundle) {
        n(new p(this, bundle));
    }

    public final void M(com.google.android.gms.measurement.internal.d6 d6Var) {
        com.google.android.gms.common.internal.r.k(d6Var);
        n(new m0(this, d6Var));
    }

    public final void N(String str) {
        n(new w(this, str));
    }

    public final void O(String str, String str2, Bundle bundle) {
        n(new m(this, str, str2, bundle));
    }

    public final String R() {
        mf mfVar = new mf();
        n(new y(this, mfVar));
        return mfVar.e2(500L);
    }

    public final void S(Bundle bundle) {
        n(new k0(this, bundle));
    }

    public final void T(String str) {
        n(new v(this, str));
    }

    public final int W(String str) {
        mf mfVar = new mf();
        n(new g0(this, str, mfVar));
        Integer num = (Integer) mf.b2(mfVar.i2(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final String X() {
        mf mfVar = new mf();
        n(new x(this, mfVar));
        return mfVar.e2(50L);
    }

    public final long Z() {
        mf mfVar = new mf();
        n(new a0(this, mfVar));
        Long l2 = (Long) mf.b2(mfVar.i2(500L), Long.class);
        if (l2 != null) {
            return l2.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ this.f1702b.a()).nextLong();
        int r2 = this.f + 1;
        this.f = r2;
        return jNextLong + r2;
    }

    public final Bundle a(Bundle bundle, boolean z) {
        mf mfVar = new mf();
        n(new h0(this, bundle, mfVar));
        if (z) {
            return mfVar.i2(5000L);
        }
        return null;
    }

    public final String c0() {
        mf mfVar = new mf();
        n(new z(this, mfVar));
        return mfVar.e2(500L);
    }

    protected final of d(Context context, boolean z) {
        try {
            return nf.asInterface(DynamiteModule.e(context, z ? DynamiteModule.n : DynamiteModule.j, ModuleDescriptor.MODULE_ID).d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.a e) {
            t(e, true, false);
            return null;
        }
    }

    public final String e0() {
        mf mfVar = new mf();
        n(new d0(this, mfVar));
        return mfVar.e2(500L);
    }

    public final com.google.android.gms.measurement.c.a f() {
        return this.d;
    }

    @androidx.annotation.y0
    public final String f0() {
        mf mfVar = new mf();
        n(new j0(this, mfVar));
        return mfVar.e2(120000L);
    }

    public final Object g(int r4) {
        mf mfVar = new mf();
        n(new i0(this, mfVar, r4));
        return mf.b2(mfVar.i2(15000L), Object.class);
    }

    public final String h0() {
        return this.h;
    }

    public final Map<String, Object> i(String str, String str2, boolean z) {
        mf mfVar = new mf();
        n(new c0(this, str, str2, z, mfVar));
        Bundle bundleI2 = mfVar.i2(5000L);
        if (bundleI2 == null || bundleI2.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap map = new HashMap(bundleI2.size());
        for (String str3 : bundleI2.keySet()) {
            Object obj = bundleI2.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    public final void j(int r9, String str, Object obj, Object obj2, Object obj3) {
        n(new f0(this, false, 5, str, obj, null, null));
    }

    public final void k(long j2) {
        n(new r(this, j2));
    }

    public final void l(Activity activity, String str, String str2) {
        n(new n(this, activity, str, str2));
    }

    public final void m(Bundle bundle) {
        n(new j(this, bundle));
    }

    public final void q(com.google.android.gms.measurement.internal.d6 d6Var) {
        com.google.android.gms.common.internal.r.k(d6Var);
        n(new n0(this, d6Var));
    }

    public final void r(com.google.android.gms.measurement.internal.e6 e6Var) {
        n(new e0(this, e6Var));
    }

    public final void s(@androidx.annotation.i0 Boolean bool) {
        n(new q(this, bool));
    }

    public final void u(String str) {
        n(new o(this, str));
    }

    public final void v(@androidx.annotation.h0 String str, Bundle bundle) {
        z(null, str, bundle, false, true, null);
    }

    public final void w(String str, String str2) {
        B(null, str, str2, false);
    }

    public final void x(String str, String str2, Bundle bundle) {
        z(str, str2, bundle, true, true, null);
    }

    public final void y(String str, String str2, Bundle bundle, long j2) {
        z(str, str2, bundle, true, false, Long.valueOf(j2));
    }
}
