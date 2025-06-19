package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class vf2 implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    private static final Handler p = new Handler(Looper.getMainLooper());
    private final Context d;
    private Application e;

    @androidx.annotation.i0
    private final PowerManager f;

    @androidx.annotation.i0
    private final KeyguardManager g;
    private BroadcastReceiver h;
    private final hf2 i;
    private WeakReference<ViewTreeObserver> j;

    @androidx.annotation.i0
    private WeakReference<View> k;
    private l82 l;
    private byte m = -1;
    private int n = -1;
    private long o = -3;

    public vf2(Context context, hf2 hf2Var) {
        Context applicationContext = context.getApplicationContext();
        this.d = applicationContext;
        this.i = hf2Var;
        this.f = (PowerManager) applicationContext.getSystemService("power");
        this.g = (KeyguardManager) this.d.getSystemService("keyguard");
        Context context2 = this.d;
        if (context2 instanceof Application) {
            this.e = (Application) context2;
            this.l = new l82((Application) context2, this);
        }
        g(null);
    }

    @androidx.annotation.i0
    private final View a() {
        WeakReference<View> weakReference = this.k;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private final void b(Activity activity, int r3) {
        Window window;
        if (this.k == null || (window = activity.getWindow()) == null) {
            return;
        }
        View viewPeekDecorView = window.peekDecorView();
        View viewA = a();
        if (viewA == null || viewPeekDecorView == null || viewA.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.n = r3;
    }

    private final void d() {
        p.post(new uf2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            r9 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r9.k
            if (r0 != 0) goto L5
            return
        L5:
            android.view.View r0 = r9.a()
            r1 = -1
            r2 = -3
            if (r0 != 0) goto L13
            r9.o = r2
            r9.m = r1
            return
        L13:
            int r4 = r0.getVisibility()
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L1d
            r4 = 1
            goto L1e
        L1d:
            r4 = 0
        L1e:
            boolean r7 = r0.isShown()
            if (r7 != 0) goto L27
            r4 = r4 | 2
            byte r4 = (byte) r4
        L27:
            android.os.PowerManager r7 = r9.f
            if (r7 == 0) goto L34
            boolean r7 = r7.isScreenOn()
            if (r7 != 0) goto L34
            r4 = r4 | 4
            byte r4 = (byte) r4
        L34:
            com.google.android.gms.internal.ads.hf2 r7 = r9.i
            boolean r7 = r7.a()
            if (r7 != 0) goto L68
            android.app.KeyguardManager r7 = r9.g
            if (r7 == 0) goto L67
            boolean r7 = r7.inKeyguardRestrictedInputMode()
            if (r7 == 0) goto L67
            android.app.Activity r7 = com.google.android.gms.internal.ads.tf2.g(r0)
            if (r7 == 0) goto L63
            android.view.Window r7 = r7.getWindow()
            if (r7 != 0) goto L54
            r7 = 0
            goto L58
        L54:
            android.view.WindowManager$LayoutParams r7 = r7.getAttributes()
        L58:
            if (r7 == 0) goto L63
            int r7 = r7.flags
            r8 = 524288(0x80000, float:7.34684E-40)
            r7 = r7 & r8
            if (r7 == 0) goto L63
            r7 = 1
            goto L64
        L63:
            r7 = 0
        L64:
            if (r7 == 0) goto L67
            goto L68
        L67:
            r5 = 0
        L68:
            if (r5 != 0) goto L6d
            r4 = r4 | 8
            byte r4 = (byte) r4
        L6d:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r0.getGlobalVisibleRect(r5)
            if (r5 != 0) goto L7b
            r4 = r4 | 16
            byte r4 = (byte) r4
        L7b:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r0.getLocalVisibleRect(r5)
            if (r5 != 0) goto L89
            r4 = r4 | 32
            byte r4 = (byte) r4
        L89:
            int r0 = r0.getWindowVisibility()
            int r5 = r9.n
            if (r5 == r1) goto L92
            r0 = r5
        L92:
            if (r0 == 0) goto L97
            r0 = r4 | 64
            byte r4 = (byte) r0
        L97:
            byte r0 = r9.m
            if (r0 == r4) goto La9
            r9.m = r4
            if (r4 != 0) goto La4
            long r0 = android.os.SystemClock.elapsedRealtime()
            goto La7
        La4:
            long r0 = (long) r4
            long r0 = r2 - r0
        La7:
            r9.o = r0
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vf2.f():void");
    }

    private final void h(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.j = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.h == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            xf2 xf2Var = new xf2(this);
            this.h = xf2Var;
            this.d.registerReceiver(xf2Var, intentFilter);
        }
        Application application = this.e;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.l);
            } catch (Exception unused) {
            }
        }
    }

    private final void i(View view) {
        try {
            if (this.j != null) {
                ViewTreeObserver viewTreeObserver = this.j.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.j = null;
            }
        } catch (Exception unused) {
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception unused2) {
        }
        BroadcastReceiver broadcastReceiver = this.h;
        if (broadcastReceiver != null) {
            try {
                this.d.unregisterReceiver(broadcastReceiver);
            } catch (Exception unused3) {
            }
            this.h = null;
        }
        Application application = this.e;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.l);
            } catch (Exception unused4) {
            }
        }
    }

    public final long e() {
        if (this.o <= -2 && a() == null) {
            this.o = -3L;
        }
        return this.o;
    }

    final void g(View view) {
        long j;
        View viewA = a();
        if (viewA != null) {
            viewA.removeOnAttachStateChangeListener(this);
            i(viewA);
        }
        this.k = new WeakReference<>(view);
        if (view != null) {
            if ((view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true) {
                h(view);
            }
            view.addOnAttachStateChangeListener(this);
            j = -2;
        } else {
            j = -3;
        }
        this.o = j;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        b(activity, 0);
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        b(activity, 4);
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        b(activity, 0);
        f();
        d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        b(activity, 0);
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        f();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        f();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        f();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.n = -1;
        h(view);
        f();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.n = -1;
        f();
        d();
        i(view);
    }
}
