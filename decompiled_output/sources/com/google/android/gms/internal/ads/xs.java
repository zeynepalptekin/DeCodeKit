package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
abstract class xs {
    private final WeakReference<View> d;

    public xs(View view) {
        this.d = new WeakReference<>(view);
    }

    private final ViewTreeObserver c() {
        ViewTreeObserver viewTreeObserver;
        View view = this.d.get();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            return null;
        }
        return viewTreeObserver;
    }

    public final void a() {
        ViewTreeObserver viewTreeObserverC = c();
        if (viewTreeObserverC != null) {
            d(viewTreeObserverC);
        }
    }

    public final void b() {
        ViewTreeObserver viewTreeObserverC = c();
        if (viewTreeObserverC != null) {
            e(viewTreeObserverC);
        }
    }

    protected abstract void d(ViewTreeObserver viewTreeObserver);

    protected abstract void e(ViewTreeObserver viewTreeObserver);
}
