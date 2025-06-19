package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class fs2 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f3456a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @GuardedBy("activityTrackerLock")
    private es2 f3457b = null;

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("activityTrackerLock")
    private boolean f3458c = false;

    @androidx.annotation.i0
    public final Activity a() {
        synchronized (this.f3456a) {
            if (this.f3457b == null) {
                return null;
            }
            return this.f3457b.a();
        }
    }

    @androidx.annotation.i0
    public final Context b() {
        synchronized (this.f3456a) {
            if (this.f3457b == null) {
                return null;
            }
            return this.f3457b.b();
        }
    }

    public final void c(Context context) {
        synchronized (this.f3456a) {
            if (!this.f3458c) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                if (application == null) {
                    tr.i("Can not cast Context to Application");
                    return;
                }
                if (this.f3457b == null) {
                    this.f3457b = new es2();
                }
                this.f3457b.e(application, context);
                this.f3458c = true;
            }
        }
    }

    public final void d(gs2 gs2Var) {
        synchronized (this.f3456a) {
            if (this.f3457b == null) {
                this.f3457b = new es2();
            }
            this.f3457b.f(gs2Var);
        }
    }

    public final void e(gs2 gs2Var) {
        synchronized (this.f3456a) {
            if (this.f3457b == null) {
                return;
            }
            this.f3457b.h(gs2Var);
        }
    }
}
