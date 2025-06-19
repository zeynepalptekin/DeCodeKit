package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class rr2 implements Application.ActivityLifecycleCallbacks {
    private final Application d;
    private final WeakReference<Application.ActivityLifecycleCallbacks> e;
    private boolean f = false;

    public rr2(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.e = new WeakReference<>(activityLifecycleCallbacks);
        this.d = application;
    }

    private final void a(as2 as2Var) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.e.get();
            if (activityLifecycleCallbacks != null) {
                as2Var.a(activityLifecycleCallbacks);
            } else {
                if (this.f) {
                    return;
                }
                this.d.unregisterActivityLifecycleCallbacks(this);
                this.f = true;
            }
        } catch (Exception e) {
            tr.c("Error while dispatching lifecycle callback.", e);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(new ur2(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        a(new bs2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(new vr2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(new wr2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(new xr2(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(new tr2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        a(new zr2(this, activity));
    }
}
