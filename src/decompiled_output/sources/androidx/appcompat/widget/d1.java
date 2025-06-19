package androidx.appcompat.widget;

import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.p0;
import androidx.appcompat.widget.ActivityChooserView;

@androidx.annotation.p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
class d1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    private static final String m = "TooltipCompatHandler";
    private static final long n = 2500;
    private static final long o = 15000;
    private static final long p = 3000;
    private static d1 q;
    private static d1 r;
    private final View d;
    private final CharSequence e;
    private final int f;
    private final Runnable g = new a();
    private final Runnable h = new b();
    private int i;
    private int j;
    private e1 k;
    private boolean l;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() throws Resources.NotFoundException {
            d1.this.g(false);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d1.this.c();
        }
    }

    private d1(View view, CharSequence charSequence) {
        this.d = view;
        this.e = charSequence;
        this.f = b.i.p.g0.c(ViewConfiguration.get(view.getContext()));
        b();
        this.d.setOnLongClickListener(this);
        this.d.setOnHoverListener(this);
    }

    private void a() {
        this.d.removeCallbacks(this.g);
    }

    private void b() {
        this.i = ActivityChooserView.f.j;
        this.j = ActivityChooserView.f.j;
    }

    private void d() {
        this.d.postDelayed(this.g, ViewConfiguration.getLongPressTimeout());
    }

    private static void e(d1 d1Var) {
        d1 d1Var2 = q;
        if (d1Var2 != null) {
            d1Var2.a();
        }
        q = d1Var;
        if (d1Var != null) {
            d1Var.d();
        }
    }

    public static void f(View view, CharSequence charSequence) {
        d1 d1Var = q;
        if (d1Var != null && d1Var.d == view) {
            e(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new d1(view, charSequence);
            return;
        }
        d1 d1Var2 = r;
        if (d1Var2 != null && d1Var2.d == view) {
            d1Var2.c();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    private boolean h(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.i) <= this.f && Math.abs(y - this.j) <= this.f) {
            return false;
        }
        this.i = x;
        this.j = y;
        return true;
    }

    void c() {
        if (r == this) {
            r = null;
            e1 e1Var = this.k;
            if (e1Var != null) {
                e1Var.c();
                this.k = null;
                b();
                this.d.removeOnAttachStateChangeListener(this);
            } else {
                Log.e(m, "sActiveHandler.mPopup == null");
            }
        }
        if (q == this) {
            e(null);
        }
        this.d.removeCallbacks(this.h);
    }

    void g(boolean z) throws Resources.NotFoundException {
        long longPressTimeout;
        if (b.i.p.f0.J0(this.d)) {
            e(null);
            d1 d1Var = r;
            if (d1Var != null) {
                d1Var.c();
            }
            r = this;
            this.l = z;
            e1 e1Var = new e1(this.d.getContext());
            this.k = e1Var;
            e1Var.e(this.d, this.i, this.j, this.l, this.e);
            this.d.addOnAttachStateChangeListener(this);
            if (this.l) {
                longPressTimeout = n;
            } else {
                longPressTimeout = ((b.i.p.f0.x0(this.d) & 1) == 1 ? p : o) - ViewConfiguration.getLongPressTimeout();
            }
            this.d.removeCallbacks(this.h);
            this.d.postDelayed(this.h, longPressTimeout);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.k != null && this.l) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.d.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                b();
                c();
            }
        } else if (this.d.isEnabled() && this.k == null && h(motionEvent)) {
            e(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) throws Resources.NotFoundException {
        this.i = view.getWidth() / 2;
        this.j = view.getHeight() / 2;
        g(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        c();
    }
}
