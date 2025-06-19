package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class lm {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference<ExecutorService> f4268a = new AtomicReference<>(null);

    /* renamed from: b, reason: collision with root package name */
    private final Object f4269b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.i0
    @GuardedBy("gmpAppIdLock")
    private String f4270c = null;

    @androidx.annotation.i0
    @GuardedBy("gmpAppIdLock")
    private String d = null;

    @com.google.android.gms.common.util.d0
    private final AtomicBoolean e = new AtomicBoolean(false);
    private final AtomicInteger f = new AtomicInteger(-1);
    private final AtomicReference<Object> g = new AtomicReference<>(null);
    private final AtomicReference<Object> h = new AtomicReference<>(null);
    private final ConcurrentMap<String, Method> i = new ConcurrentHashMap(9);
    private final AtomicReference<az> j = new AtomicReference<>(null);

    @GuardedBy("proxyReference")
    private final BlockingQueue<FutureTask<?>> k = new ArrayBlockingQueue(20);
    private final Object l = new Object();

    private static Bundle A(String str, String str2) {
        Bundle bundle = new Bundle();
        try {
            bundle.putLong("_aeid", Long.parseLong(str));
        } catch (NullPointerException | NumberFormatException e) {
            String strValueOf = String.valueOf(str);
            tr.c(strValueOf.length() != 0 ? "Invalid event ID: ".concat(strValueOf) : new String("Invalid event ID: "), e);
        }
        if ("_ac".equals(str2)) {
            bundle.putInt("_r", 1);
        }
        return bundle;
    }

    @androidx.annotation.i0
    private final Method C(Context context, String str) throws NoSuchMethodException, SecurityException {
        Method method = this.i.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, String.class);
            this.i.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            w(str, false);
            return null;
        }
    }

    @androidx.annotation.i0
    private final Method D(Context context, String str) throws NoSuchMethodException, SecurityException {
        Method method = this.i.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            this.i.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            w(str, false);
            return null;
        }
    }

    private final Method E(Context context, String str) throws NoSuchMethodException, SecurityException {
        Method method = this.i.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod(str, Activity.class, String.class, String.class);
            this.i.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            w(str, false);
            return null;
        }
    }

    private final ExecutorService F() {
        ExecutorService threadPoolExecutor;
        if (this.f4268a.get() == null) {
            if (com.google.android.gms.common.util.e.b()) {
                threadPoolExecutor = du1.a().d(((Integer) qx2.e().c(e0.Z)).intValue(), G(), iu1.f3869b);
            } else {
                threadPoolExecutor = new ThreadPoolExecutor(((Integer) qx2.e().c(e0.Z)).intValue(), ((Integer) qx2.e().c(e0.Z)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), G());
            }
            this.f4268a.compareAndSet(null, threadPoolExecutor);
        }
        return this.f4268a.get();
    }

    private final ThreadFactory G() {
        return new an(this);
    }

    private final Object a(String str, Context context) throws NoSuchMethodException, SecurityException {
        if (!j(context, "com.google.android.gms.measurement.AppMeasurement", this.g, true)) {
            return null;
        }
        try {
            return D(context, str).invoke(this.g.get(), new Object[0]);
        } catch (Exception unused) {
            w(str, true);
            return null;
        }
    }

    private final <T> T b(String str, @androidx.annotation.i0 T t, dn<T> dnVar) {
        synchronized (this.j) {
            if (this.j.get() != null) {
                try {
                    return dnVar.a(this.j.get());
                } catch (Exception unused) {
                    w(str, false);
                }
            }
            return t;
        }
    }

    private final void e(Context context, String str, String str2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (j(context, "com.google.android.gms.measurement.AppMeasurement", this.g, true)) {
            try {
                C(context, str2).invoke(this.g.get(), str);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 37 + String.valueOf(str).length());
                sb.append("Invoke Firebase method ");
                sb.append(str2);
                sb.append(", Ad Unit Id: ");
                sb.append(str);
                oo.m(sb.toString());
            } catch (Exception unused) {
                w(str2, false);
            }
        }
    }

    private final void f(Context context, final String str, String str2, @androidx.annotation.i0 Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (k(context)) {
            final Bundle bundleA = A(str2, str);
            if (bundle != null) {
                bundleA.putAll(bundle);
            }
            if (l(context)) {
                i("logEventInternal", new cn(str, bundleA) { // from class: com.google.android.gms.internal.ads.qm

                    /* renamed from: a, reason: collision with root package name */
                    private final String f5036a;

                    /* renamed from: b, reason: collision with root package name */
                    private final Bundle f5037b;

                    {
                        this.f5036a = str;
                        this.f5037b = bundleA;
                    }

                    @Override // com.google.android.gms.internal.ads.cn
                    public final void a(az azVar) throws RemoteException {
                        azVar.y1("am", this.f5036a, this.f5037b);
                    }
                });
            } else if (j(context, "com.google.android.gms.measurement.AppMeasurement", this.g, true)) {
                try {
                    r(context).invoke(this.g.get(), "am", str, bundleA);
                } catch (Exception unused) {
                    w("logEventInternal", true);
                }
            }
        }
    }

    private final void i(final String str, final cn cnVar) {
        synchronized (this.j) {
            FutureTask<?> futureTask = new FutureTask<>(new Runnable(this, cnVar, str) { // from class: com.google.android.gms.internal.ads.pm
                private final lm d;
                private final cn e;
                private final String f;

                {
                    this.d = this;
                    this.e = cnVar;
                    this.f = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.d.h(this.e, this.f);
                }
            }, null);
            if (this.j.get() != null) {
                futureTask.run();
            } else {
                this.k.offer(futureTask);
            }
        }
    }

    private final boolean j(Context context, String str, AtomicReference<Object> atomicReference, boolean z) {
        if (atomicReference.get() == null) {
            try {
                atomicReference.compareAndSet(null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context));
            } catch (Exception unused) {
                w("getInstance", z);
                return false;
            }
        }
        return true;
    }

    @com.google.android.gms.common.util.d0
    private static boolean l(Context context) throws ClassNotFoundException {
        if (!((Boolean) qx2.e().c(e0.a0)).booleanValue()) {
            return false;
        }
        if (DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) < ((Integer) qx2.e().c(e0.b0)).intValue()) {
            return false;
        }
        if (((Boolean) qx2.e().c(e0.c0)).booleanValue()) {
            try {
                context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            } catch (ClassNotFoundException unused) {
            }
        }
        return true;
    }

    @androidx.annotation.i0
    private final Method r(Context context) throws NoSuchMethodException, SecurityException {
        Method method = this.i.get("logEventInternal");
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
            this.i.put("logEventInternal", declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            w("logEventInternal", true);
            return null;
        }
    }

    private final void w(String str, boolean z) {
        if (this.e.get()) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30);
        sb.append("Invoke Firebase method ");
        sb.append(str);
        sb.append(" error.");
        tr.i(sb.toString());
        if (z) {
            tr.i("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            this.e.set(true);
        }
    }

    public final void B(Context context, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        f(context, "_aa", str, null);
    }

    final /* synthetic */ String H() throws Exception {
        return (String) b("getAppInstanceId", null, sm.f5276a);
    }

    public final void c(Context context, g gVar) {
        if (((Boolean) qx2.e().c(e0.g0)).booleanValue() && k(context) && l(context)) {
            synchronized (this.l) {
            }
        }
    }

    public final void d(Context context, jw2 jw2Var) {
        if (((Boolean) qx2.e().c(e0.g0)).booleanValue() && k(context) && l(context)) {
            synchronized (this.l) {
            }
        }
    }

    public final void g(Context context, String str, String str2, String str3, int r7) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (k(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", r7);
            f(context, "_ar", str, bundle);
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 75);
            sb.append("Log a Firebase reward video event, reward type: ");
            sb.append(str3);
            sb.append(", reward value: ");
            sb.append(r7);
            oo.m(sb.toString());
        }
    }

    final /* synthetic */ void h(cn cnVar, String str) {
        if (this.j.get() != null) {
            try {
                cnVar.a(this.j.get());
            } catch (Exception unused) {
                w(str, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k(android.content.Context r5) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.s<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.e0.T
            com.google.android.gms.internal.ads.z r1 = com.google.android.gms.internal.ads.qx2.e()
            java.lang.Object r0 = r1.c(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L67
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.e
            boolean r0 = r0.get()
            if (r0 == 0) goto L1c
            goto L67
        L1c:
            com.google.android.gms.internal.ads.s<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.e0.d0
            com.google.android.gms.internal.ads.z r2 = com.google.android.gms.internal.ads.qx2.e()
            java.lang.Object r0 = r2.c(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 1
            if (r0 == 0) goto L30
            return r2
        L30:
            java.util.concurrent.atomic.AtomicInteger r0 = r4.f
            int r0 = r0.get()
            r3 = -1
            if (r0 != r3) goto L5e
            com.google.android.gms.internal.ads.qx2.a()
            r0 = 12451000(0xbdfcb8, float:1.7447567E-38)
            boolean r0 = com.google.android.gms.internal.ads.jr.t(r5, r0)
            if (r0 != 0) goto L59
            com.google.android.gms.internal.ads.qx2.a()
            boolean r5 = com.google.android.gms.internal.ads.jr.n(r5)
            if (r5 == 0) goto L59
            java.lang.String r5 = "Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service."
            com.google.android.gms.internal.ads.tr.i(r5)
            java.util.concurrent.atomic.AtomicInteger r5 = r4.f
            r5.set(r1)
            goto L5e
        L59:
            java.util.concurrent.atomic.AtomicInteger r5 = r4.f
            r5.set(r2)
        L5e:
            java.util.concurrent.atomic.AtomicInteger r5 = r4.f
            int r5 = r5.get()
            if (r5 != r2) goto L67
            return r2
        L67:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.lm.k(android.content.Context):boolean");
    }

    public final String m(Context context) {
        if (!k(context)) {
            return "";
        }
        if (l(context)) {
            return (String) b("getCurrentScreenNameOrScreenClass", "", um.f5548a);
        }
        if (!j(context, "com.google.android.gms.measurement.AppMeasurement", this.g, true)) {
            return "";
        }
        try {
            String str = (String) D(context, "getCurrentScreenName").invoke(this.g.get(), new Object[0]);
            if (str == null) {
                str = (String) D(context, "getCurrentScreenClass").invoke(this.g.get(), new Object[0]);
            }
            return str != null ? str : "";
        } catch (Exception unused) {
            w("getCurrentScreenName", false);
            return "";
        }
    }

    @androidx.annotation.i0
    public final String n(Context context) {
        if (!k(context)) {
            return null;
        }
        synchronized (this.f4269b) {
            if (this.f4270c != null) {
                return this.f4270c;
            }
            this.f4270c = l(context) ? (String) b("getGmpAppId", this.f4270c, wm.f5855a) : (String) a("getGmpAppId", context);
            return this.f4270c;
        }
    }

    @androidx.annotation.i0
    public final String o(final Context context) {
        if (!k(context)) {
            return null;
        }
        long jLongValue = ((Long) qx2.e().c(e0.Y)).longValue();
        if (l(context)) {
            try {
                return jLongValue < 0 ? (String) b("getAppInstanceId", null, vm.f5708a) : (String) F().submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.zm

                    /* renamed from: a, reason: collision with root package name */
                    private final lm f6288a;

                    {
                        this.f6288a = this;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.f6288a.H();
                    }
                }).get(jLongValue, TimeUnit.MILLISECONDS);
            } catch (TimeoutException unused) {
                return "TIME_OUT";
            } catch (Exception unused2) {
                return null;
            }
        }
        if (jLongValue < 0) {
            return (String) a("getAppInstanceId", context);
        }
        try {
            return (String) F().submit(new Callable(this, context) { // from class: com.google.android.gms.internal.ads.ym

                /* renamed from: a, reason: collision with root package name */
                private final lm f6148a;

                /* renamed from: b, reason: collision with root package name */
                private final Context f6149b;

                {
                    this.f6148a = this;
                    this.f6149b = context;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f6148a.s(this.f6149b);
                }
            }).get(jLongValue, TimeUnit.MILLISECONDS);
        } catch (TimeoutException unused3) {
            return "TIME_OUT";
        } catch (Exception unused4) {
            return null;
        }
    }

    @androidx.annotation.i0
    public final String p(Context context) throws NoSuchMethodException, SecurityException {
        if (!k(context)) {
            return null;
        }
        if (l(context)) {
            Long l = (Long) b("getAdEventId", null, bn.f2850a);
            if (l != null) {
                return Long.toString(l.longValue());
            }
            return null;
        }
        Object objA = a("generateEventId", context);
        if (objA != null) {
            return objA.toString();
        }
        return null;
    }

    @androidx.annotation.i0
    public final String q(Context context) {
        if (!k(context)) {
            return null;
        }
        synchronized (this.f4269b) {
            if (this.d != null) {
                return this.d;
            }
            this.d = l(context) ? (String) b("getAppIdOrigin", this.d, nm.f4568a) : "fa";
            return this.d;
        }
    }

    final /* synthetic */ String s(Context context) throws Exception {
        return (String) a("getAppInstanceId", context);
    }

    public final void t(Context context, final String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (k(context)) {
            if (l(context)) {
                i("beginAdUnitExposure", new cn(str) { // from class: com.google.android.gms.internal.ads.om

                    /* renamed from: a, reason: collision with root package name */
                    private final String f4713a;

                    {
                        this.f4713a = str;
                    }

                    @Override // com.google.android.gms.internal.ads.cn
                    public final void a(az azVar) throws RemoteException {
                        azVar.e6(this.f4713a);
                    }
                });
            } else {
                e(context, str, "beginAdUnitExposure");
            }
        }
    }

    public final void u(Context context, final String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (k(context)) {
            if (l(context)) {
                i("endAdUnitExposure", new cn(str) { // from class: com.google.android.gms.internal.ads.rm

                    /* renamed from: a, reason: collision with root package name */
                    private final String f5159a;

                    {
                        this.f5159a = str;
                    }

                    @Override // com.google.android.gms.internal.ads.cn
                    public final void a(az azVar) throws RemoteException {
                        azVar.b8(this.f5159a);
                    }
                });
            } else {
                e(context, str, "endAdUnitExposure");
            }
        }
    }

    public final void v(final Context context, final String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (k(context) && (context instanceof Activity)) {
            if (l(context)) {
                i("setScreenName", new cn(context, str) { // from class: com.google.android.gms.internal.ads.tm

                    /* renamed from: a, reason: collision with root package name */
                    private final Context f5421a;

                    /* renamed from: b, reason: collision with root package name */
                    private final String f5422b;

                    {
                        this.f5421a = context;
                        this.f5422b = str;
                    }

                    @Override // com.google.android.gms.internal.ads.cn
                    public final void a(az azVar) throws RemoteException {
                        Context context2 = this.f5421a;
                        azVar.n3(c.a.b.b.e.e.i2(context2), this.f5422b, context2.getPackageName());
                    }
                });
            } else if (j(context, "com.google.firebase.analytics.FirebaseAnalytics", this.h, false)) {
                try {
                    E(context, "setCurrentScreen").invoke(this.h.get(), (Activity) context, str, context.getPackageName());
                } catch (Exception unused) {
                    w("setCurrentScreen", false);
                }
            }
        }
    }

    public final void x(Context context, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        f(context, "_ac", str, null);
    }

    public final void y(Context context, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        f(context, "_ai", str, null);
    }

    public final void z(Context context, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        f(context, "_aq", str, null);
    }
}
