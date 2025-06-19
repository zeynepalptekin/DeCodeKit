package b.w;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;
import b.w.a0;
import b.w.g0;

/* loaded from: classes.dex */
class p0 {

    private static class a extends AnimatorListenerAdapter implements g0.h {

        /* renamed from: a, reason: collision with root package name */
        private final View f1499a;

        /* renamed from: b, reason: collision with root package name */
        private final View f1500b;

        /* renamed from: c, reason: collision with root package name */
        private final int f1501c;
        private final int d;
        private int[] e;
        private float f;
        private float g;
        private final float h;
        private final float i;

        a(View view, View view2, int r3, int r4, float f, float f2) {
            this.f1500b = view;
            this.f1499a = view2;
            this.f1501c = r3 - Math.round(view.getTranslationX());
            this.d = r4 - Math.round(this.f1500b.getTranslationY());
            this.h = f;
            this.i = f2;
            int[] r1 = (int[]) this.f1499a.getTag(a0.e.transition_position);
            this.e = r1;
            if (r1 != null) {
                this.f1499a.setTag(a0.e.transition_position, null);
            }
        }

        @Override // b.w.g0.h
        public void a(@androidx.annotation.h0 g0 g0Var) {
        }

        @Override // b.w.g0.h
        public void b(@androidx.annotation.h0 g0 g0Var) {
        }

        @Override // b.w.g0.h
        public void c(@androidx.annotation.h0 g0 g0Var) {
        }

        @Override // b.w.g0.h
        public void d(@androidx.annotation.h0 g0 g0Var) {
        }

        @Override // b.w.g0.h
        public void e(@androidx.annotation.h0 g0 g0Var) {
            this.f1500b.setTranslationX(this.h);
            this.f1500b.setTranslationY(this.i);
            g0Var.s0(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.e == null) {
                this.e = new int[2];
            }
            this.e[0] = Math.round(this.f1501c + this.f1500b.getTranslationX());
            this.e[1] = Math.round(this.d + this.f1500b.getTranslationY());
            this.f1499a.setTag(a0.e.transition_position, this.e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f = this.f1500b.getTranslationX();
            this.g = this.f1500b.getTranslationY();
            this.f1500b.setTranslationX(this.h);
            this.f1500b.setTranslationY(this.i);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            this.f1500b.setTranslationX(this.f);
            this.f1500b.setTranslationY(this.g);
        }
    }

    private p0() {
    }

    @androidx.annotation.i0
    static Animator a(@androidx.annotation.h0 View view, @androidx.annotation.h0 n0 n0Var, int r16, int r17, float f, float f2, float f3, float f4, @androidx.annotation.i0 TimeInterpolator timeInterpolator, @androidx.annotation.h0 g0 g0Var) {
        float f5;
        float f6;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        if (((int[]) n0Var.f1494b.getTag(a0.e.transition_position)) != null) {
            f5 = (r4[0] - r16) + translationX;
            f6 = (r4[1] - r17) + translationY;
        } else {
            f5 = f;
            f6 = f2;
        }
        int r8 = r16 + Math.round(f5 - translationX);
        int r9 = r17 + Math.round(f6 - translationY);
        view.setTranslationX(f5);
        view.setTranslationY(f6);
        if (f5 == f3 && f6 == f4) {
            return null;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f5, f3), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f6, f4));
        a aVar = new a(view, n0Var.f1494b, r8, r9, translationX, translationY);
        g0Var.b(aVar);
        objectAnimatorOfPropertyValuesHolder.addListener(aVar);
        b.w.a.a(objectAnimatorOfPropertyValuesHolder, aVar);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(timeInterpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }
}
