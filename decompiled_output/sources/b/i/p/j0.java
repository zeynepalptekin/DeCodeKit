package b.i.p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class j0 {
    static final int e = 2113929216;

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<View> f1210a;

    /* renamed from: b, reason: collision with root package name */
    Runnable f1211b = null;

    /* renamed from: c, reason: collision with root package name */
    Runnable f1212c = null;
    int d = -1;

    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k0 f1213a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f1214b;

        a(k0 k0Var, View view) {
            this.f1213a = k0Var;
            this.f1214b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f1213a.a(this.f1214b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1213a.b(this.f1214b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f1213a.c(this.f1214b);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ m0 f1216a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f1217b;

        b(m0 m0Var, View view) {
            this.f1216a = m0Var;
            this.f1217b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f1216a.a(this.f1217b);
        }
    }

    static class c implements k0 {

        /* renamed from: a, reason: collision with root package name */
        j0 f1219a;

        /* renamed from: b, reason: collision with root package name */
        boolean f1220b;

        c(j0 j0Var) {
            this.f1219a = j0Var;
        }

        @Override // b.i.p.k0
        public void a(View view) {
            Object tag = view.getTag(j0.e);
            k0 k0Var = tag instanceof k0 ? (k0) tag : null;
            if (k0Var != null) {
                k0Var.a(view);
            }
        }

        @Override // b.i.p.k0
        @SuppressLint({"WrongConstant"})
        public void b(View view) {
            int r0 = this.f1219a.d;
            if (r0 > -1) {
                view.setLayerType(r0, null);
                this.f1219a.d = -1;
            }
            if (Build.VERSION.SDK_INT >= 16 || !this.f1220b) {
                j0 j0Var = this.f1219a;
                Runnable runnable = j0Var.f1212c;
                if (runnable != null) {
                    j0Var.f1212c = null;
                    runnable.run();
                }
                Object tag = view.getTag(j0.e);
                k0 k0Var = tag instanceof k0 ? (k0) tag : null;
                if (k0Var != null) {
                    k0Var.b(view);
                }
                this.f1220b = true;
            }
        }

        @Override // b.i.p.k0
        public void c(View view) {
            this.f1220b = false;
            if (this.f1219a.d > -1) {
                view.setLayerType(2, null);
            }
            j0 j0Var = this.f1219a;
            Runnable runnable = j0Var.f1211b;
            if (runnable != null) {
                j0Var.f1211b = null;
                runnable.run();
            }
            Object tag = view.getTag(j0.e);
            k0 k0Var = tag instanceof k0 ? (k0) tag : null;
            if (k0Var != null) {
                k0Var.c(view);
            }
        }
    }

    j0(View view) {
        this.f1210a = new WeakReference<>(view);
    }

    private void t(View view, k0 k0Var) {
        if (k0Var != null) {
            view.animate().setListener(new a(k0Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public j0 A(float f) {
        View view = this.f1210a.get();
        if (view != null) {
            view.animate().translationYBy(f);
        }
        return this;
    }

    public j0 B(float f) {
        View view = this.f1210a.get();
        if (view != null && Build.VERSION.SDK_INT >= 21) {
            view.animate().translationZ(f);
        }
        return this;
    }

    public j0 C(float f) {
        View view = this.f1210a.get();
        if (view != null && Build.VERSION.SDK_INT >= 21) {
            view.animate().translationZBy(f);
        }
        return this;
    }

    public j0 D(Runnable runnable) {
        View view = this.f1210a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT >= 16) {
                view.animate().withEndAction(runnable);
            } else {
                t(view, new c(this));
                this.f1212c = runnable;
            }
        }
        return this;
    }

    @SuppressLint({"WrongConstant"})
    public j0 E() {
        View view = this.f1210a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT >= 16) {
                view.animate().withLayer();
            } else {
                this.d = view.getLayerType();
                t(view, new c(this));
            }
        }
        return this;
    }

    public j0 F(Runnable runnable) {
        View view = this.f1210a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT >= 16) {
                view.animate().withStartAction(runnable);
            } else {
                t(view, new c(this));
                this.f1211b = runnable;
            }
        }
        return this;
    }

    public j0 G(float f) {
        View view = this.f1210a.get();
        if (view != null) {
            view.animate().x(f);
        }
        return this;
    }

    public j0 H(float f) {
        View view = this.f1210a.get();
        if (view != null) {
            view.animate().xBy(f);
        }
        return this;
    }

    public j0 I(float f) {
        View view = this.f1210a.get();
        if (view != null) {
            view.animate().y(f);
        }
        return this;
    }

    public j0 J(float f) {
        View view = this.f1210a.get();
        if (view != null) {
            view.animate().yBy(f);
        }
        return this;
    }

    public j0 K(float f) {
        View view = this.f1210a.get();
        if (view != null && Build.VERSION.SDK_INT >= 21) {
            view.animate().z(f);
        }
        return this;
    }

    public j0 L(float f) {
        View view = this.f1210a.get();
        if (view != null && Build.VERSION.SDK_INT >= 21) {
            view.animate().zBy(f);
        }
        return this;
    }

    public j0 a(float f) {
        View view = this.f1210a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    public j0 b(float f) {
        View view = this.f1210a.get();
        if (view != null) {
            view.animate().alphaBy(f);
        }
        return this;
    }

    public void c() {
        View view = this.f1210a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = this.f1210a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public Interpolator e() {
        View view = this.f1210a.get();
        if (view == null || Build.VERSION.SDK_INT < 18) {
            return null;
        }
        return (Interpolator) view.animate().getInterpolator();
    }

    public long f() {
        View view = this.f1210a.get();
        if (view != null) {
            return view.animate().getStartDelay();
        }
        return 0L;
    }

    public j0 g(float f) {
        View view = this.f1210a.get();
        if (view != null) {
            view.animate().rotation(f);
        }
        return this;
    }

    public j0 h(float f) {
        View view = this.f1210a.get();
        if (view != null) {
            view.animate().rotationBy(f);
        }
        return this;
    }

    public j0 i(float f) {
        View view = this.f1210a.get();
        if (view != null) {
            view.animate().rotationX(f);
        }
        return this;
    }

    public j0 j(float f) {
        View view = this.f1210a.get();
        if (view != null) {
            view.animate().rotationXBy(f);
        }
        return this;
    }

    public j0 k(float f) {
        View view = this.f1210a.get();
        if (view != null) {
            view.animate().rotationY(f);
        }
        return this;
    }

    public j0 l(float f) {
        View view = this.f1210a.get();
        if (view != null) {
            view.animate().rotationYBy(f);
        }
        return this;
    }

    public j0 m(float f) {
        View view = this.f1210a.get();
        if (view != null) {
            view.animate().scaleX(f);
        }
        return this;
    }

    public j0 n(float f) {
        View view = this.f1210a.get();
        if (view != null) {
            view.animate().scaleXBy(f);
        }
        return this;
    }

    public j0 o(float f) {
        View view = this.f1210a.get();
        if (view != null) {
            view.animate().scaleY(f);
        }
        return this;
    }

    public j0 p(float f) {
        View view = this.f1210a.get();
        if (view != null) {
            view.animate().scaleYBy(f);
        }
        return this;
    }

    public j0 q(long j) {
        View view = this.f1210a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public j0 r(Interpolator interpolator) {
        View view = this.f1210a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public j0 s(k0 k0Var) {
        View view = this.f1210a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT < 16) {
                view.setTag(e, k0Var);
                k0Var = new c(this);
            }
            t(view, k0Var);
        }
        return this;
    }

    public j0 u(long j) {
        View view = this.f1210a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    public j0 v(m0 m0Var) {
        View view = this.f1210a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            view.animate().setUpdateListener(m0Var != null ? new b(m0Var, view) : null);
        }
        return this;
    }

    public void w() {
        View view = this.f1210a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public j0 x(float f) {
        View view = this.f1210a.get();
        if (view != null) {
            view.animate().translationX(f);
        }
        return this;
    }

    public j0 y(float f) {
        View view = this.f1210a.get();
        if (view != null) {
            view.animate().translationXBy(f);
        }
        return this;
    }

    public j0 z(float f) {
        View view = this.f1210a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }
}
