package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class l82 implements Application.ActivityLifecycleCallbacks {
    private final Application d;
    private final WeakReference<Application.ActivityLifecycleCallbacks> e;
    private boolean f = false;

    public l82(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.e = new WeakReference<>(activityLifecycleCallbacks);
        this.d = application;
    }

    private final void a(df2 df2Var) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.e.get();
            if (activityLifecycleCallbacks != null) {
                df2Var.a(activityLifecycleCallbacks);
            } else {
                if (this.f) {
                    return;
                }
                this.d.unregisterActivityLifecycleCallbacks(this);
                this.f = true;
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(new ob2(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        a(new ef2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(new pc2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(new qd2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(new re2(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(new na2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        a(new cf2(this, activity));
    }
}
