package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

@TargetApi(14)
/* loaded from: classes.dex */
final class es2 implements Application.ActivityLifecycleCallbacks {

    @androidx.annotation.i0
    private Activity d;
    private Context e;
    private Runnable k;
    private long m;
    private final Object f = new Object();
    private boolean g = true;
    private boolean h = false;

    @GuardedBy("lock")
    private final List<gs2> i = new ArrayList();

    @GuardedBy("lock")
    private final List<vs2> j = new ArrayList();
    private boolean l = false;

    es2() {
    }

    private final void c(Activity activity) {
        synchronized (this.f) {
            if (!activity.getClass().getName().startsWith(com.google.android.gms.ads.q.f2483a)) {
                this.d = activity;
            }
        }
    }

    static /* synthetic */ boolean g(es2 es2Var, boolean z) {
        es2Var.g = false;
        return false;
    }

    @androidx.annotation.i0
    public final Activity a() {
        return this.d;
    }

    @androidx.annotation.i0
    public final Context b() {
        return this.e;
    }

    public final void e(Application application, Context context) {
        if (this.l) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
        if (context instanceof Activity) {
            c((Activity) context);
        }
        this.e = application;
        this.m = ((Long) qx2.e().c(e0.w0)).longValue();
        this.l = true;
    }

    public final void f(gs2 gs2Var) {
        synchronized (this.f) {
            this.i.add(gs2Var);
        }
    }

    public final void h(gs2 gs2Var) {
        synchronized (this.f) {
            this.i.remove(gs2Var);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f) {
            if (this.d == null) {
                return;
            }
            if (this.d.equals(activity)) {
                this.d = null;
            }
            Iterator<vs2> it = this.j.iterator();
            while (it.hasNext()) {
                try {
                    if (it.next().a(activity)) {
                        it.remove();
                    }
                } catch (Exception e) {
                    com.google.android.gms.ads.internal.p.g().e(e, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                    tr.c("", e);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        c(activity);
        synchronized (this.f) {
            Iterator<vs2> it = this.j.iterator();
            while (it.hasNext()) {
                try {
                    it.next().onActivityPaused(activity);
                } catch (Exception e) {
                    com.google.android.gms.ads.internal.p.g().e(e, "AppActivityTracker.ActivityListener.onActivityPaused");
                    tr.c("", e);
                }
            }
        }
        this.h = true;
        Runnable runnable = this.k;
        if (runnable != null) {
            to.h.removeCallbacks(runnable);
        }
        lu1 lu1Var = to.h;
        hs2 hs2Var = new hs2(this);
        this.k = hs2Var;
        lu1Var.postDelayed(hs2Var, this.m);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        c(activity);
        this.h = false;
        boolean z = !this.g;
        this.g = true;
        Runnable runnable = this.k;
        if (runnable != null) {
            to.h.removeCallbacks(runnable);
        }
        synchronized (this.f) {
            Iterator<vs2> it = this.j.iterator();
            while (it.hasNext()) {
                try {
                    it.next().onActivityResumed(activity);
                } catch (Exception e) {
                    com.google.android.gms.ads.internal.p.g().e(e, "AppActivityTracker.ActivityListener.onActivityResumed");
                    tr.c("", e);
                }
            }
            if (z) {
                Iterator<gs2> it2 = this.i.iterator();
                while (it2.hasNext()) {
                    try {
                        it2.next().a(true);
                    } catch (Exception e2) {
                        tr.c("", e2);
                    }
                }
            } else {
                tr.f("App is still foreground.");
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        c(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
