package b.i.p;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class z implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    private final View d;
    private ViewTreeObserver e;
    private final Runnable f;

    private z(View view, Runnable runnable) {
        this.d = view;
        this.e = view.getViewTreeObserver();
        this.f = runnable;
    }

    @androidx.annotation.h0
    public static z a(@androidx.annotation.h0 View view, @androidx.annotation.h0 Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        z zVar = new z(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(zVar);
        view.addOnAttachStateChangeListener(zVar);
        return zVar;
    }

    public void b() {
        (this.e.isAlive() ? this.e : this.d.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.d.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.e = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
