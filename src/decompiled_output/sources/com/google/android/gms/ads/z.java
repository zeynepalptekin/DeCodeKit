package com.google.android.gms.ads;

import android.os.RemoteException;
import androidx.annotation.i0;
import com.google.android.gms.internal.ads.tr;
import com.google.android.gms.internal.ads.uz2;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class z {

    @com.google.android.gms.common.annotation.a
    public static final int d = 0;

    @com.google.android.gms.common.annotation.a
    public static final int e = 1;

    @com.google.android.gms.common.annotation.a
    public static final int f = 2;

    @com.google.android.gms.common.annotation.a
    public static final int g = 3;

    @com.google.android.gms.common.annotation.a
    public static final int h = 5;

    /* renamed from: a, reason: collision with root package name */
    private final Object f2493a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @i0
    @GuardedBy("lock")
    private uz2 f2494b;

    /* renamed from: c, reason: collision with root package name */
    @i0
    @GuardedBy("lock")
    private a f2495c;

    public static abstract class a {
        public void a() {
        }

        public void b(boolean z) {
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
        }
    }

    @Deprecated
    public final float a() {
        synchronized (this.f2493a) {
            if (this.f2494b == null) {
                return 0.0f;
            }
            try {
                return this.f2494b.d0();
            } catch (RemoteException e2) {
                tr.c("Unable to call getAspectRatio on video controller.", e2);
                return 0.0f;
            }
        }
    }

    @com.google.android.gms.common.annotation.a
    public final int b() {
        synchronized (this.f2493a) {
            if (this.f2494b == null) {
                return 0;
            }
            try {
                return this.f2494b.M0();
            } catch (RemoteException e2) {
                tr.c("Unable to call getPlaybackState on video controller.", e2);
                return 0;
            }
        }
    }

    public final float c() {
        synchronized (this.f2493a) {
            if (this.f2494b == null) {
                return 0.0f;
            }
            try {
                return this.f2494b.X();
            } catch (RemoteException e2) {
                tr.c("Unable to call getCurrentTime on video controller.", e2);
                return 0.0f;
            }
        }
    }

    public final float d() {
        synchronized (this.f2493a) {
            if (this.f2494b == null) {
                return 0.0f;
            }
            try {
                return this.f2494b.M();
            } catch (RemoteException e2) {
                tr.c("Unable to call getDuration on video controller.", e2);
                return 0.0f;
            }
        }
    }

    @i0
    public final a e() {
        a aVar;
        synchronized (this.f2493a) {
            aVar = this.f2495c;
        }
        return aVar;
    }

    public final boolean f() {
        boolean z;
        synchronized (this.f2493a) {
            z = this.f2494b != null;
        }
        return z;
    }

    public final boolean g() {
        synchronized (this.f2493a) {
            if (this.f2494b == null) {
                return false;
            }
            try {
                return this.f2494b.A2();
            } catch (RemoteException e2) {
                tr.c("Unable to call isClickToExpandEnabled.", e2);
                return false;
            }
        }
    }

    public final boolean h() {
        synchronized (this.f2493a) {
            if (this.f2494b == null) {
                return false;
            }
            try {
                return this.f2494b.M4();
            } catch (RemoteException e2) {
                tr.c("Unable to call isUsingCustomPlayerControls.", e2);
                return false;
            }
        }
    }

    public final boolean i() {
        synchronized (this.f2493a) {
            if (this.f2494b == null) {
                return true;
            }
            try {
                return this.f2494b.M3();
            } catch (RemoteException e2) {
                tr.c("Unable to call isMuted on video controller.", e2);
                return true;
            }
        }
    }

    public final void j(boolean z) {
        synchronized (this.f2493a) {
            if (this.f2494b == null) {
                return;
            }
            try {
                this.f2494b.B5(z);
            } catch (RemoteException e2) {
                tr.c("Unable to call mute on video controller.", e2);
            }
        }
    }

    public final void k() {
        synchronized (this.f2493a) {
            if (this.f2494b == null) {
                return;
            }
            try {
                this.f2494b.t();
            } catch (RemoteException e2) {
                tr.c("Unable to call pause on video controller.", e2);
            }
        }
    }

    public final void l() {
        synchronized (this.f2493a) {
            if (this.f2494b == null) {
                return;
            }
            try {
                this.f2494b.J4();
            } catch (RemoteException e2) {
                tr.c("Unable to call play on video controller.", e2);
            }
        }
    }

    public final void m(a aVar) {
        com.google.android.gms.common.internal.r.l(aVar, "VideoLifecycleCallbacks may not be null.");
        synchronized (this.f2493a) {
            this.f2495c = aVar;
            if (this.f2494b == null) {
                return;
            }
            try {
                this.f2494b.P7(new com.google.android.gms.internal.ads.j(aVar));
            } catch (RemoteException e2) {
                tr.c("Unable to call setVideoLifecycleCallbacks on video controller.", e2);
            }
        }
    }

    public final void n() {
        synchronized (this.f2493a) {
            if (this.f2494b == null) {
                return;
            }
            try {
                this.f2494b.stop();
            } catch (RemoteException e2) {
                tr.c("Unable to call stop on video controller.", e2);
            }
        }
    }

    public final void o(uz2 uz2Var) {
        synchronized (this.f2493a) {
            this.f2494b = uz2Var;
            if (this.f2495c != null) {
                m(this.f2495c);
            }
        }
    }

    public final uz2 p() {
        uz2 uz2Var;
        synchronized (this.f2493a) {
            uz2Var = this.f2494b;
        }
        return uz2Var;
    }
}
