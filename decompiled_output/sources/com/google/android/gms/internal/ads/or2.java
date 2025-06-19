package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

@TargetApi(14)
/* loaded from: classes.dex */
public final class or2 implements Application.ActivityLifecycleCallbacks, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    private static final long s = ((Long) qx2.e().c(e0.c1)).longValue();
    private final Context d;
    private Application e;
    private final WindowManager f;
    private final PowerManager g;
    private final KeyguardManager h;

    @androidx.annotation.i0
    @com.google.android.gms.common.util.d0
    private BroadcastReceiver i;
    private WeakReference<ViewTreeObserver> j;
    private WeakReference<View> k;
    private rr2 l;
    private yq m = new yq(s);
    private boolean n = false;
    private int o = -1;
    private final HashSet<sr2> p = new HashSet<>();
    private final DisplayMetrics q;
    private final Rect r;

    public or2(Context context, View view) {
        this.d = context.getApplicationContext();
        this.f = (WindowManager) context.getSystemService("window");
        this.g = (PowerManager) this.d.getSystemService("power");
        this.h = (KeyguardManager) context.getSystemService("keyguard");
        Context context2 = this.d;
        if (context2 instanceof Application) {
            this.e = (Application) context2;
            this.l = new rr2((Application) context2, this);
        }
        this.q = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.r = rect;
        rect.right = this.f.getDefaultDisplay().getWidth();
        this.r.bottom = this.f.getDefaultDisplay().getHeight();
        WeakReference<View> weakReference = this.k;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            k(view2);
        }
        this.k = new WeakReference<>(view);
        if (view != null) {
            if (com.google.android.gms.ads.internal.p.e().b(view)) {
                j(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    private final Rect a(Rect rect) {
        return new Rect(g(rect.left), g(rect.top), g(rect.right), g(rect.bottom));
    }

    private final void b(Activity activity, int r3) {
        Window window;
        if (this.k == null || (window = activity.getWindow()) == null) {
            return;
        }
        View viewPeekDecorView = window.peekDecorView();
        View view = this.k.get();
        if (view == null || viewPeekDecorView == null || view.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.o = r3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(int r32) {
        WeakReference<View> weakReference;
        boolean z;
        boolean z2;
        if (this.p.size() == 0 || (weakReference = this.k) == null) {
            return;
        }
        View view = weakReference.get();
        boolean z3 = r32 == 1;
        boolean z4 = view == null;
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        Rect rect3 = new Rect();
        Rect rect4 = new Rect();
        int[] r12 = new int[2];
        int[] r0 = new int[2];
        if (view != null) {
            boolean globalVisibleRect = view.getGlobalVisibleRect(rect2);
            boolean localVisibleRect = view.getLocalVisibleRect(rect3);
            view.getHitRect(rect4);
            try {
                view.getLocationOnScreen(r12);
                view.getLocationInWindow(r0);
            } catch (Exception e) {
                tr.c("Failure getting view location.", e);
            }
            int r02 = r12[0];
            rect.left = r02;
            rect.top = r12[1];
            rect.right = r02 + view.getWidth();
            rect.bottom = rect.top + view.getHeight();
            z = globalVisibleRect;
            z2 = localVisibleRect;
        } else {
            z = false;
            z2 = false;
        }
        List<Rect> listEmptyList = (!((Boolean) qx2.e().c(e0.f1)).booleanValue() || view == null) ? Collections.emptyList() : l(view);
        int windowVisibility = view != null ? view.getWindowVisibility() : 8;
        int r13 = this.o;
        if (r13 != -1) {
            windowVisibility = r13;
        }
        boolean z5 = !z4 && com.google.android.gms.ads.internal.p.c().r(view, this.g, this.h) && z && z2 && windowVisibility == 0;
        if (z3 && !this.m.a() && z5 == this.n) {
            return;
        }
        if (z5 || this.n || r32 != 1) {
            pr2 pr2Var = new pr2(com.google.android.gms.ads.internal.p.j().c(), this.g.isScreenOn(), view != null && com.google.android.gms.ads.internal.p.e().b(view), view != null ? view.getWindowVisibility() : 8, a(this.r), a(rect), a(rect2), z, a(rect3), z2, a(rect4), this.q.density, z5, listEmptyList);
            Iterator<sr2> it = this.p.iterator();
            while (it.hasNext()) {
                it.next().K(pr2Var);
            }
            this.n = z5;
        }
    }

    private final int g(int r2) {
        return (int) (r2 / this.q.density);
    }

    private final void h() {
        to.h.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.nr2
            private final or2 d;

            {
                this.d = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.d.n();
            }
        });
    }

    private final void j(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.j = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.i == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.i = new qr2(this);
            com.google.android.gms.ads.internal.p.x().c(this.d, this.i, intentFilter);
        }
        Application application = this.e;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.l);
            } catch (Exception e) {
                tr.c("Error registering activity lifecycle callbacks.", e);
            }
        }
    }

    private final void k(View view) {
        try {
            if (this.j != null) {
                ViewTreeObserver viewTreeObserver = this.j.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.j = null;
            }
        } catch (Exception e) {
            tr.c("Error while unregistering listeners from the last ViewTreeObserver.", e);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e2) {
            tr.c("Error while unregistering listeners from the ViewTreeObserver.", e2);
        }
        if (this.i != null) {
            try {
                com.google.android.gms.ads.internal.p.x().b(this.d, this.i);
            } catch (IllegalStateException e3) {
                tr.c("Failed trying to unregister the receiver", e3);
            } catch (Exception e4) {
                com.google.android.gms.ads.internal.p.g().e(e4, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.i = null;
        }
        Application application = this.e;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.l);
            } catch (Exception e5) {
                tr.c("Error registering activity lifecycle callbacks.", e5);
            }
        }
    }

    private final List<Rect> l(View view) {
        try {
            ArrayList arrayList = new ArrayList();
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                View view2 = (View) parent;
                Rect rect = new Rect();
                if (view2.isScrollContainer() && view2.getGlobalVisibleRect(rect)) {
                    arrayList.add(a(rect));
                }
            }
            return arrayList;
        } catch (Exception e) {
            com.google.android.gms.ads.internal.p.g().e(e, "PositionWatcher.getParentScrollViewRects");
            return Collections.emptyList();
        }
    }

    public final void d(sr2 sr2Var) {
        this.p.add(sr2Var);
        f(3);
    }

    public final void e(sr2 sr2Var) {
        this.p.remove(sr2Var);
    }

    public final void i(long j) {
        this.m.b(j);
    }

    public final void m() {
        this.m.b(s);
    }

    final /* synthetic */ void n() {
        f(3);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        b(activity, 0);
        f(3);
        h();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        f(3);
        h();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        b(activity, 4);
        f(3);
        h();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        b(activity, 0);
        f(3);
        h();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        f(3);
        h();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        b(activity, 0);
        f(3);
        h();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        f(3);
        h();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        f(2);
        h();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        f(1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.o = -1;
        j(view);
        f(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.o = -1;
        f(3);
        h();
        k(view);
    }
}
