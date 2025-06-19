package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.i0;
import com.google.android.gms.common.util.v;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;

@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public final class a implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    private static final a h = new a();
    private final AtomicBoolean d = new AtomicBoolean();
    private final AtomicBoolean e = new AtomicBoolean();

    @GuardedBy("sInstance")
    private final ArrayList<InterfaceC0165a> f = new ArrayList<>();

    @GuardedBy("sInstance")
    private boolean g = false;

    @com.google.android.gms.common.annotation.a
    /* renamed from: com.google.android.gms.common.api.internal.a$a, reason: collision with other inner class name */
    public interface InterfaceC0165a {
        @com.google.android.gms.common.annotation.a
        void a(@RecentlyNonNull boolean z);
    }

    @com.google.android.gms.common.annotation.a
    private a() {
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static a b() {
        return h;
    }

    @com.google.android.gms.common.annotation.a
    public static void c(@RecentlyNonNull Application application) {
        synchronized (h) {
            if (!h.g) {
                application.registerActivityLifecycleCallbacks(h);
                application.registerComponentCallbacks(h);
                h.g = true;
            }
        }
    }

    private final void f(boolean z) {
        synchronized (h) {
            ArrayList<InterfaceC0165a> arrayList = this.f;
            int size = arrayList.size();
            int r3 = 0;
            while (r3 < size) {
                InterfaceC0165a interfaceC0165a = arrayList.get(r3);
                r3++;
                interfaceC0165a.a(z);
            }
        }
    }

    @com.google.android.gms.common.annotation.a
    public final void a(@RecentlyNonNull InterfaceC0165a interfaceC0165a) {
        synchronized (h) {
            this.f.add(interfaceC0165a);
        }
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public final boolean d() {
        return this.d.get();
    }

    @RecentlyNonNull
    @TargetApi(16)
    @com.google.android.gms.common.annotation.a
    public final boolean e(@RecentlyNonNull boolean z) {
        if (!this.e.get()) {
            if (!v.e()) {
                return z;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.e.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.d.set(true);
            }
        }
        return d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@RecentlyNonNull Activity activity, @i0 Bundle bundle) {
        boolean zCompareAndSet = this.d.compareAndSet(true, false);
        this.e.set(true);
        if (zCompareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@RecentlyNonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@RecentlyNonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@RecentlyNonNull Activity activity) {
        boolean zCompareAndSet = this.d.compareAndSet(true, false);
        this.e.set(true);
        if (zCompareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@RecentlyNonNull Activity activity, @RecentlyNonNull Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@RecentlyNonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@RecentlyNonNull Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(@RecentlyNonNull Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(@RecentlyNonNull int r3) {
        if (r3 == 20 && this.d.compareAndSet(false, true)) {
            this.e.set(true);
            f(true);
        }
    }
}
