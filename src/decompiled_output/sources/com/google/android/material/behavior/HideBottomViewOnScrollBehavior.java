package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {
    protected static final int e = 225;
    protected static final int f = 175;
    private static final int g = 1;
    private static final int h = 2;

    /* renamed from: a, reason: collision with root package name */
    private int f6612a;

    /* renamed from: b, reason: collision with root package name */
    private int f6613b;

    /* renamed from: c, reason: collision with root package name */
    private int f6614c;

    @i0
    private ViewPropertyAnimator d;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f6612a = 0;
        this.f6613b = 2;
        this.f6614c = 0;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6612a = 0;
        this.f6613b = 2;
        this.f6614c = 0;
    }

    private void H(@h0 V v, int r2, long j, TimeInterpolator timeInterpolator) {
        this.d = v.animate().translationY(r2).setInterpolator(timeInterpolator).setDuration(j).setListener(new a());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean B(@h0 CoordinatorLayout coordinatorLayout, @h0 V v, @h0 View view, @h0 View view2, int r5, int r6) {
        return r5 == 2;
    }

    public void I(@h0 V v, @p int r4) {
        this.f6614c = r4;
        if (this.f6613b == 1) {
            v.setTranslationY(this.f6612a + r4);
        }
    }

    public void J(@h0 V v) {
        if (this.f6613b == 1) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.f6613b = 1;
        H(v, this.f6612a + this.f6614c, 175L, c.a.b.c.b.a.f1937c);
    }

    public void K(@h0 V v) {
        if (this.f6613b == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        this.f6613b = 2;
        H(v, 0, 225L, c.a.b.c.b.a.d);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(@h0 CoordinatorLayout coordinatorLayout, @h0 V v, int r5) {
        this.f6612a = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return super.m(coordinatorLayout, v, r5);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void u(CoordinatorLayout coordinatorLayout, @h0 V v, @h0 View view, int r4, int r5, int r6, int r7, int r8, @h0 int[] r9) {
        if (r5 > 0) {
            J(v);
        } else if (r5 < 0) {
            K(v);
        }
    }
}
